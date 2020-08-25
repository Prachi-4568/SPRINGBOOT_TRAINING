package com.example.demo.service;

import com.example.demo.ScholarRepo.ScholarRepo;
import com.example.demo.model.Scholar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


    @Service
    public class ScholarService {
        @Autowired
        ScholarRepo sr;
        public List<Scholar> getAllScholars()
        {
            List<Scholar> scholars =new ArrayList<>();

            Scholar scholar =new Scholar();
            scholar.setiNumber("i524925");
            scholar.setBatch("2020");
            scholar.setName("Prachi ");

            Scholar scholar1 =new Scholar();
            scholar1.setiNumber("i52451");
            scholar1.setBatch("2020");
            scholar1.setName("Nitin ");

            scholars.add(scholar);
            scholars.add(scholar1);

            return scholars;
        }
        public Scholar getScholar(String id)
        {
            Scholar scholar1 =new Scholar();
            scholar1.setiNumber(id);
            scholar1.setBatch("2020");
            scholar1.setName("Prachi");
            return scholar1;
        }

        public void addScholar(Scholar scholar) {
            System.out.println(scholar.getiNumber()+"  "+ scholar.getName()+"  "+scholar.getBatch());
        }
    }

