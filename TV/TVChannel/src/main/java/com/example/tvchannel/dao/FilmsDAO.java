package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Films;
import org.springframework.stereotype.Service;

@Service
public interface FilmsDAO {
    Films create (Films name);
    Films update(Films id, Films name);
}
