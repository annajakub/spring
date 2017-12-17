package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.OpinionService;
import com.sda.springstarter.demo.model.Opinion;
import com.sda.springstarter.demo.repository.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionRepository opinionRepository;

    @Override
    public List<Opinion> getAllOpinion() {
        return opinionRepository.findAll();
    }

    @Override
    public void addOpinion(Opinion opinion) {
        opinionRepository.save(opinion);
    }

}
