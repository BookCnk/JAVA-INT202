package com.example.sit_management.models;

import java.util.HashMap;
import java.util.Map;

public class AllStudent {
    private Map<Integer,Student> studentMap = new HashMap<>();

    public void addStudent(int id,String name,double score){
        studentMap.put( id, new Student(id,name,score,calculateGrade(score)));
    }

    private String calculateGrade(double score){
        if(score >= 80){
            return "A";
        }if(score >= 70){
            return "B";
        }if(score >= 60){
            return "C";
        }if(score >= 50){
            return "D";
        }else {
            return "F";
        }
    }

    public void removeStudent(int id){
        studentMap.remove(id);
    }
    public  Map<Integer,Student> findAll() {
        return studentMap;
    }
    public Boolean findID(int id){
        if(studentMap.get(id) == null){
            return false;
        }return true;
    }
}
