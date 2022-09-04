package com.example.tvchannel.dao;

import com.example.tvchannel.Model.DOW;
import org.springframework.stereotype.Service;

@Service
public interface DowDAO {
    DOW create(DOW name);
    DOW update(DOW id, DOW name);
}
