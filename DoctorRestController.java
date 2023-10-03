package com.example.restdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.modell.Doctor;

@RestController
public class DoctorRestController
{
   @PostMapping("/doctor")
     public String saveDoctor(@RequestBody Doctor d)
     {
	   System.out.println(d);
	   return "Doctor saved";
     }
   
   @GetMapping("/doctor/{did}")
   public Doctor getDoctor(@PathVariable Integer did )
   {
	   Doctor d = null;
	   if(did == 101)
	   {
		   d=new Doctor("vishal","Dentist",101,"Mon-sat","3pm-7pm");
	   }else if(did==102){
		   d=new Doctor("vamshi","pyscitheropist",102,"Mon-sat","3pm-7pm");
	   }else if(did== 103) {
		  d=new Doctor("sravani","gynicolohist",103,"Mon-sat","3pm-7pm");
	   }
	  return d;
   }
   
   @GetMapping("/doctors")
   public List<Doctor> getDoctors()
   {
	   Doctor d1=new Doctor("vishal","Dentist",101,"Mon-sat","3pm-7pm");
	   Doctor d2=new Doctor("vamshi","pyscitheropist",102,"Mon-sat","3pm-7pm");
	   Doctor d3=new Doctor("sravani","gynicolohist",103,"Mon-sat","3pm-7pm");
      
	   List<Doctor> doctors = Arrays.asList(d1,d2,d3);
       return doctors;
   
   }
   
   
   
   
   
}




