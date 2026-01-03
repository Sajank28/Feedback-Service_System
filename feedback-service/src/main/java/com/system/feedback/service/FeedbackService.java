package com.system.feedback.service;

import com.system.feedback.model.Feedback;

import java.util.List;

public interface FeedbackService {

    Feedback saveFeedback(Feedback feedback);
    List<Feedback> viewAllFeedbacks();
    List<Feedback> getByRating(int rating);
    Feedback updateFeedback(Long id, Feedback updatedFeedback);
    String deleteFeedback(Long id);
}
