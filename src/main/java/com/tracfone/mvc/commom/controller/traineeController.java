package com.tracfone.mvc.commom.controller;

import com.tracfone.mvc.commom.model.Trainees;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class traineeController {

    @RequestMapping(value="/Trainees",method = RequestMethod.GET)
    @ResponseBody
    public List <Trainees> getTrainees(){
        List<Trainees> traineesList= new ArrayList<Trainees>();
        traineesList.add(new Trainees("ash","ase",12));
        traineesList.add(new Trainees("sand","lead",13));

        return traineesList;

    }

//    @RequestMapping( value="/da" , method=RequestMethod.POST ,produces = "application/json")
//    @ResponseBody
//    public String postTrainees(@RequestBody Trainees T ){
//
////        Trainees trainee = new Trainees(name, role, emp_id);
//        System.out.println(T.toString());
//
//        return "success";

//    }


}
