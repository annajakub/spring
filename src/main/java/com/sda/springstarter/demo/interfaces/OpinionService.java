package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Opinion;

import java.util.List;

public interface OpinionService {

    List<Opinion> getAllOpinion();
    void addOpinion(Opinion opinion);
}
