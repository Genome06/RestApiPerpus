package com.example.RestApiPerpus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.RestApiPerpus.model.Buku;
import com.example.RestApiPerpus.service.BukuService;

@RestController
@RequestMapping("/api/buku")
public class BukuController {

    @Autowired
    private BukuService bukuService;

    @GetMapping
    public List<Buku> getAllBukus() {
        return bukuService.getAllBukus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Buku> getBukuByid(@PathVariable Long id){
        Buku buku = bukuService.getBukuById(id);
        if(buku == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(buku);
    }

    @PostMapping
    public Buku createBuku(@RequestBody Buku buku) {
        return bukuService.createBuku(buku);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Buku> updateBuku(@PathVariable Long id, @RequestBody Buku bukuDetails) {
        Buku updatedBuku = bukuService.updateBuku(id, bukuDetails);
        if (updatedBuku == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedBuku);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBuku(@PathVariable Long id) {
        bukuService.deleteBuku(id);
        return ResponseEntity.ok("Data berhasil dihapus");
    }
}
