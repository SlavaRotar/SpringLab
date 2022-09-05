package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Broadcast;
import org.springframework.stereotype.Service;

@Service
public interface BroadcastDAO {
    Broadcast create (Broadcast day_of_week, Broadcast content_name, Broadcast broadcast_time);
    Broadcast update (Broadcast id, Broadcast day_of_week, Broadcast content_name, Broadcast broadcast_time);
}
