package com.arch.tvchannel.dao.program;

import com.arch.tvchannel.model.Show;
import org.springframework.stereotype.Service;

@Service
public interface IProgramDAO {

    Show create (Show show);
    Show update (Show show);
}
