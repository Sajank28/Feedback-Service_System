package com.system.feedback.service.impl;

import com.system.feedback.exception.InvalidInputException;
import com.system.feedback.exception.NoMatchingIdException;
import com.system.feedback.model.Feedback;
import com.system.feedback.repository.FeedbackRepository;
import com.system.feedback.service.FeedbackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackServiceImpl(FeedbackRepository feedbackRepository){
        this.feedbackRepository = feedbackRepository;
    }


    @Override
    public Feedback saveFeedback(Feedback feedback) {
        if(feedback.getRating() < 1 || feedback.getRating() > 5){
            throw new InvalidInputException("Rating must be between 1 and 5");
        }
        return feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> viewAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public List<Feedback> getByRating(int rating) {
        return feedbackRepository.findByRating(rating);
    }

    @Override
    public Feedback updateFeedback(Long id, Feedback updatedFeedback) {
        Feedback findById = feedbackRepository.findById(id).orElseThrow(() -> new NoMatchingIdException("Id not found"));

        if (updatedFeedback.getRating() < 1 || updatedFeedback.getRating() > 5) {
            throw new InvalidInputException("Rating must be between 1 and 5");
        }
        findById.setRating(updatedFeedback.getRating());

        if (updatedFeedback.getName() != null) {
            findById.setName(updatedFeedback.getName());
        }

        if (updatedFeedback.getComment() != null) {
            findById.setComment(updatedFeedback.getComment());
        }

        return feedbackRepository.save(findById);
    }

    @Override
    public String deleteFeedback(Long id) {
        Feedback findById = feedbackRepository.findById(id).orElseThrow(() -> new NoMatchingIdException("Id not found"));
        feedbackRepository.delete(findById);
        return "Feedback deleted Successfully!!";
    }
}
