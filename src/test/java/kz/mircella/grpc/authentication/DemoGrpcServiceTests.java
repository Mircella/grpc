package kz.mircella.grpc.authentication;

import io.grpc.*;
import kz.mircella.grpc.demo.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lognet.springboot.grpc.autoconfigure.GRpcServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {"grpc.port: 15001"})
public class DemoGrpcServiceTests {

    @MockBean
    private NumberService numberService;

    @Autowired
    private GRpcServerProperties grpcSettings;

    private ManagedChannel channel;

    private CallCredentials credentials;

    @Before
    public void setup() {
        channel = ManagedChannelBuilder.forAddress("localhost", grpcSettings.getPort())
                .usePlaintext()
                .build();
        credentials = new BasicAuthenticationCallCredentials("grpcspring", "grpcspring");
    }

    @After
    public void tearDown() {
        channel.shutdown();
    }

    @Test
    public void fibonacci_shouldReturnValue() {
        when(numberService.fibonacci(3)).thenReturn(2);

        DemoServiceGrpc.DemoServiceBlockingStub blockingStub = DemoServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
        FibonacciResponse response = blockingStub.fibonacci(FibonacciRequest.newBuilder().setValue(3).build());

        assertThat(response.getValue()).isEqualTo(2);
    }

    @Test
    public void factorial_shouldReturnValue() {
        when(numberService.factorial(3)).thenReturn(6);

        DemoServiceGrpc.DemoServiceBlockingStub blockingStub = DemoServiceGrpc.newBlockingStub(channel).withCallCredentials(credentials);
        FactorialResponse response = blockingStub.factorial(FactorialRequest.newBuilder().setValue(3).build());

        assertThat(response.getValue()).isEqualTo(6);
    }

    @Test
    public void fibonacci_shouldFailForUnauthenticatedCall() {
        DemoServiceGrpc.DemoServiceBlockingStub blockingStub = DemoServiceGrpc.newBlockingStub(channel);

        assertThatThrownBy(() -> blockingStub.fibonacci(FibonacciRequest.newBuilder().setValue(3).build()))
                .isInstanceOf(StatusRuntimeException.class)
                .satisfies(exception ->
                        assertThat(((StatusRuntimeException) exception).getStatus().getCode()).isEqualTo(Status.Code.UNAUTHENTICATED)
                );
    }
}
