package prog2.fingrp;
import java.io.*;
import java.util.*;

public class Course implements Serializable, Comparable<Course>{
    public enum CourseStatus{
        COMPLETE,
        INCOMPLETE,
        NO_FINAL_EXAM,
        WITHDRAWN,
        DROPPED
    }
    private String code;
    private String title;
    private int units;
    private float grade;
    private Course[] prereqs;
    private int term;
    private int year;
    private CourseStatus status;
    private boolean electiveStatus = false;
    private boolean additionalStatus = false;

    public Course(){
        this.code = "N/A";
        this.title = "N/A";
        this.units = 0;
        this.prereqs = new Course[1];
    }

    public Course(String code, String title, int year, int term, int units, boolean electiveStatus, boolean additionalStatus){
        this.code = code;
        this.title = title;
        this.units = units;
        this.year = year;
        this.term = term;
        this.electiveStatus = electiveStatus;
        this.additionalStatus = additionalStatus;
    }

    public Course(String code, String title, int year, int term, int units, boolean electiveStatus){
        this.code = code;
        this.title = title;
        this.units = units;
        this.year = year;
        this.term = term;
        this.electiveStatus = true;
    }

    public Course(String code, String title, int units, float grade, Course[] prereqs){
        this.code = code;
        this.title = title;
        this.units = units;
        this.grade = grade;
        this.prereqs = prereqs;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getUnits() {
        return units;
    }

    public float getGrade() {
        return grade;
    }

    public Course[] getPrereqs() {
        return prereqs;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUnits(short units) {
        this.units = units;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setPrereqs(Course[] prereqs) {
        this.prereqs = prereqs;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CourseStatus getStatus() {
        return status;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }

    public boolean isElectiveStatus() {
        return electiveStatus;
    }

    public void setElectiveStatus(boolean electiveStatus) {
        this.electiveStatus = electiveStatus;
    }

    public boolean isAdditionalStatus() {
        return additionalStatus;
    }

    public void setAdditionalStatus(boolean additionalStatus) {
        this.additionalStatus = additionalStatus;
    }

    public int compareTo(Course other){
        return this.code.compareTo(other.getCode());
    }

    public String toString(){
        return String.format("%s | %s",code,title);
    }
}
