package com.sysco.onlineOrder.repository;

import com.sysco.onlineOrder.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Transactional
    @Modifying
    @Query("FROM Product")
    List<Product> findAll();

    @Transactional
    @Modifying
    @Query(value = " FROM Product WHERE productId =?1")
    List<Product> findById(int ProductId);

}
