package com.example.RestApiPerpus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiPerpus.model.Buku;
import com.example.RestApiPerpus.repo.PerpusRepository;

@Service
public class BukuService {
    
    @Autowired
    private PerpusRepository bukuRepository;

    public List<Buku> getAllBukus() {
        return bukuRepository.findAll();
    }

    public Buku getBukuById(Long id) {
        return bukuRepository.findById(id).orElse(null);
    }

    public Buku createBuku(Buku buku) {
        return bukuRepository.save(buku);
    }

    public Buku updateBuku(Long id, Buku bukuDetails) {
        Buku buku = bukuRepository.findById(id).orElse(null);
        if (buku != null) {
            buku.setJudul(bukuDetails.getJudul());
            buku.setJumlahTersedia(bukuDetails.getJumlahTersedia());
            buku.setPengarang(bukuDetails.getPengarang());
            buku.setPenerbit(bukuDetails.getPenerbit());
            return bukuRepository.save(buku);
        }
        return null;
    }

    public void deleteBuku(Long id) {
        bukuRepository.deleteById(id);
    }
}
