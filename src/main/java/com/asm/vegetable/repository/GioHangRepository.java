package com.asm.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.GioHang;
import com.asm.vegetable.entity.GioHangPK;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang, GioHangPK>{

}
