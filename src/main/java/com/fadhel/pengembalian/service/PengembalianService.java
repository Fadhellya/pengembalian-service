/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pengembalian.service;

import com.fadhel.pengembalian.entity.Pengembalian;
import com.fadhel.pengembalian.repository.PengembalianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PengembalianService {
    @Autowired
    private PengembalianRepository pengembalianRepository;
    
    public Pengembalian savePengembalian(Pengembalian pengembalian){
        return pengembalianRepository.save(pengembalian);
    }
    public Pengembalian findPengembalianById(Long pengembalianId){
        return pengembalianRepository.findByPengembalianId(pengembalianId);
    }
    
}
