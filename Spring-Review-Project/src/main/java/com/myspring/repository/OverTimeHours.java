package com.myspring.repository;

import com.myspring.repository.HoursRespository;

public class OverTimeHours implements HoursRespository {
    @Override
    public int getHours() {
        return 15;
    }
}
