package com.exittest.Course.Feedback.Repository;

import com.exittest.Course.Feedback.Models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
