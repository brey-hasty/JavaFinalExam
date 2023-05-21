package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //First check to see if a student is enrolled in the course

          if(isAttendingCourse(course.getCode())){
              return;

            } //If not enrolled, enroll the student in the course
                else {
                    courses.add(course);
            }


    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
       //Check if student is attending course via course code
        for(Course course : courses){
         if(course.getCode().equals(courseCode){
             return true;
            }  //Return false is student isn't attending the course
            else {
                return false;
            }
        }
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() +","+ courses+ "}";
    }
}
