package com.exittest.Course.Feedback.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Feedback_table")
public class Feedback {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long course_id;

@Column(name = "course_name")
    private String course_name;
@Column(name = "ou")
    private String ou;
@Column(name = "training_type")
    private String training_type;
@Column(name = "start_date")
    private Date start_date;
@Column(name = "end_date")
    private Date end_date;
@Column(name = "batch_count")
    private int batch_count;
@Column(name = "trainer_name")
    private String trainer_name;
@Column(name = "status")
private String status;
@Column(name = "final_feedback")
    private String final_feedback;

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getOu() {
        return ou;
    }

    public void setOu(String ou) {
        this.ou = ou;
    }

    public String getTraining_type() {
        return training_type;
    }

    public void setTraining_type(String training_type) {
        this.training_type = training_type;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getBatch_count() {
        return batch_count;
    }

    public void setBatch_count(int batch_count) {
        this.batch_count = batch_count;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFinal_feedback() {
        return final_feedback;
    }

    public void setFinal_feedback(String final_feedback) {
        this.final_feedback = final_feedback;
    }
}
