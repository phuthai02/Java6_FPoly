package com.asm.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.DonHang;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Long>{

}
