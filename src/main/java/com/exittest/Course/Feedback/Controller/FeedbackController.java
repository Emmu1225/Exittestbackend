package com.exittest.Course.Feedback.Controller;

import com.exittest.Course.Feedback.Models.Feedback;
import com.exittest.Course.Feedback.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/feedbacks")

public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;
    @PostMapping("/save")
    public Feedback addFeedback(@RequestBody Feedback feedback){
        return feedbackRepository.save(feedback);
    }



}
