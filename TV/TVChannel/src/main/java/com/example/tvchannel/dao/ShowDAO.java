package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Show;
import org.springframework.stereotype.Service;

@Service
public interface ShowDAO {
    Show create (Show name);
    Show update(Show id, Show name);
}
