package com.Patient_Management.billing_service.grpc;

import billings.BillingServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;


@GrpcService
public class BillingGrpcService extends BillingServiceGrpc.BillingServiceImplBase {
    @Override
    public void createBillingAccount(billings.BillingRequest billingRequest, StreamObserver<billings.BillingResponse> responseObserver) {

//       log.info("createBillingAccount request received {}",billingRequest.toString());

       billings.BillingResponse billingResponse = billings.BillingResponse.newBuilder()
               .setAccountId("12345")
               .setStatus("ACTIVE")
               .build();

       responseObserver.onNext(billingResponse);
       responseObserver.onCompleted();
    }
}
