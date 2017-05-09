package com.acme.warehouse.domain.repository;

import com.acme.warehouse.domain.AcmeMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to store messages
 *
 * @author ajorritsma
 */
@Repository
public interface AcmeMessageRepository extends JpaRepository<AcmeMessage, Long> {

}
