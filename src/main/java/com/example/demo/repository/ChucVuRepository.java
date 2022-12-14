package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ChucVu;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, Long>{    
    ChucVu findBymaCV(Long maCV); //Tim kiem Chucvu co ton tai trong DB khong?
    Boolean existsBytenCV(String tenCV);
    ChucVu findBytenCV(String maCV); 
    @Query(value = "SELECT * FROM chucvu cv WHERE cv.trang_thaicv=1", nativeQuery=true)
    List<ChucVu> ListAll();
}
