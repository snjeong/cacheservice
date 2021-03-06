package com.amore.api.cacheservice.repository;

import com.amore.api.cacheservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductsByCategoryNo(int catetoryNo);

    @Query(value = "SELECT count(productNo) FROM Product where categoryNo = :categoryNo")
    public Long count(@Param("categoryNo") int categoryNo);

}
