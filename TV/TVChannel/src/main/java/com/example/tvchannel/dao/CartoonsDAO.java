package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Cartoons;
import org.springframework.stereotype.Service;

@Service
public interface CartoonsDAO {
    Cartoons create (Cartoons name);
    Cartoons update(Cartoons id, Cartoons name);
}
