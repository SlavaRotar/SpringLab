package com.arch.tvchannel.dao.friday;

import com.arch.tvchannel.model.Dow;
import org.springframework.stereotype.Service;

@Service
public interface IFridayDAO {

    Dow create (Dow day);
    Dow update (Dow day);
}
