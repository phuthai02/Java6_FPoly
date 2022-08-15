package com.asm.vegetable.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.RauCuQua;

@Repository
public interface RauCuQuaRepository extends JpaRepository<RauCuQua, Long>{
	
	@Query("SELECT p FROM RauCuQua p WHERE p.trangthai='ACTV' and p.ten like ?1")
	Page<RauCuQua> search(String keyWord,Pageable page);
	
	@Query("SELECT p FROM RauCuQua p WHERE p.trangthai='ACTV' and p.theloai = ?1")
	Page<RauCuQua> findByTheLoai(String keyWord,Pageable page);
	
	@Query("SELECT p FROM RauCuQua p WHERE p.ten like ?1")
	Page<RauCuQua> adminSearch(String keyWord,Pageable page);
	
	@Query("SELECT p FROM RauCuQua p WHERE p.theloai = ?1")
	Page<RauCuQua> adminFindByTheLoai(String keyWord,Pageable page);
}
