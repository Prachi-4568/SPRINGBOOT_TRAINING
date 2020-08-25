package com.example.demo.controller;

import com.example.demo.model.Scholar;
import com.example.demo.service.ScholarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("api/v1")
public class ControllerScholar {
@Autowired
ScholarService ss;
    @GetMapping(value="/scholar")
    public List<Scholar> getAllScholars()
    {
       return ss.getAllScholars();
    }


    @GetMapping("scholar")
    public Scholar getScholar(@RequestParam String id)
    {
       return ss.getScholar(id);
    }

    @PostMapping("scholar")
    public void addScholar(@RequestBody Scholar scholar)

    {
        ss.addScholar(scholar);


    }

}
