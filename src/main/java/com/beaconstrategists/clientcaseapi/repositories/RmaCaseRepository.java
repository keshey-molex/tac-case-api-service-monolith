package com.beaconstrategists.clientcaseapi.repositories;

import com.beaconstrategists.clientcaseapi.model.entities.RmaCaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface RmaCaseRepository extends JpaRepository<RmaCaseEntity, Long>, JpaSpecificationExecutor<RmaCaseEntity> {

    Optional<RmaCaseEntity> findByCaseNumber(String caseNumber);

    boolean existsByCaseNumber(String caseNumber);

    void deleteByCaseNumber(String caseNumber);
}
