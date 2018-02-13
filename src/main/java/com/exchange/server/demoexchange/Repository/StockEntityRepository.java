package com.exchange.server.demoexchange.Repository;

import com.exchange.server.demoexchange.entity.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StockEntityRepository extends CrudRepository<StockEntity, String> {
    List<StockEntity> findByCompanyName(@Param("companyName") String companyName);
}
