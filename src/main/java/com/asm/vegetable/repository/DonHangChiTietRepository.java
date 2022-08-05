package com.asm.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.DonHangChiTiet;
import com.asm.vegetable.entity.DonHangPK;

@Repository
public interface DonHangChiTietRepository extends JpaRepository<DonHangChiTiet, DonHangPK>{

}
