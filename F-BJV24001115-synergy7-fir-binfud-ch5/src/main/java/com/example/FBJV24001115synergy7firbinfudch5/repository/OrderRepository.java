package com.example.FBJV24001115synergy7firbinfudch5.repository;

import com.example.FBJV24001115synergy7firbinfudch5.model.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Orders, UUID> {

}
