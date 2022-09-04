package com.arch.tvchannel.dao.monday;

import com.arch.tvchannel.model.Monday;
import org.springframework.stereotype.Service;

@Service
public interface IMondayDAO {

    Monday create (Monday day);
    Monday update (Monday day);
}
