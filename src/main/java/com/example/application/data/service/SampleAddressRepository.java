package com.example.application.data.service;

import com.example.application.data.entity.SampleAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SampleAddressRepository
        extends
            JpaRepository<SampleAddress, Long>,
            JpaSpecificationExecutor<SampleAddress> {

}
