package com.example.tvchannel.dao;

import com.example.tvchannel.Model.News;
import org.springframework.stereotype.Service;

@Service
public interface NewsDAO {
    News create (News name, News dow, News airtime);
    News update (News id, News name, News dow, News airtime);
}
