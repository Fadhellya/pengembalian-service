/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pengembalian.controller;

import com.fadhel.pengembalian.entity.Pengembalian;
import com.fadhel.pengembalian.service.PengembalianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {
    @Autowired
    private PengembalianService pengembalianService;
    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian){
        return pengembalianService.savePengembalian(pengembalian);
    }
    @GetMapping("{id}")
    public Pengembalian findPengembalianById(@PathVariable("id")Long pengembalianId){
        return pengembalianService.findPengembalianById(pengembalianId);
    }
    
    
}
