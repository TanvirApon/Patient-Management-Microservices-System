package com.Patient_Management.patient_service.grpc;

import com.google.api.Billing;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BillingServiceGrpcClient {
    private final billing.BillingServiceGrpc.BillingServiceBlockingStub blockingStub;

    public BillingServiceGrpcClient(
            @Value("${billing.service.address:localhost}") String serverAddress,
            @Value("${billing.service.grpc.port:9902}") int serverPort)
    {
        log.info("Connecting to Billing Service at Grpc Service at {} {}", serverAddress, serverPort);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(serverAddress, serverPort).usePlaintext().build();
        blockingStub = billing.BillingServiceGrpc.newBlockingStub(channel);
     }

     public billing.BillingResponse createBillingAccount(String patientId, String name, String email){

        billing.BillingRequest request = billing.BillingRequest.newBuilder().setName(name).setEmail(email).build();
         billing.BillingResponse response = blockingStub.createBillingAccount(request);
         log.info("Received response from billing service via GRPC: {}", response);
         return response;

     }
}
