/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pengembalian.repository;

import com.fadhel.pengembalian.entity.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface PengembalianRepository extends JpaRepository<Pengembalian, Long>{
    public Pengembalian findByPengembalianId(Long kembaliId);
}
