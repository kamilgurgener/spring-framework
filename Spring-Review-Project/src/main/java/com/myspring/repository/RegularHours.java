package com.myspring.repository;

import org.springframework.stereotype.Component;

@Component
public class RegularHours implements HoursRespository{
    @Override
    public int getHours() {
        return 40;
    }
}
