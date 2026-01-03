package com.system.feedback.controller;

import com.system.feedback.model.Feedback;
import com.system.feedback.service.FeedbackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService){
        this.feedbackService = feedbackService;
    }


    @PostMapping()
    public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback){
        return new ResponseEntity<>(feedbackService.saveFeedback(feedback), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Feedback>> viewAllFeedbacks(){
        return ResponseEntity.ok(feedbackService.viewAllFeedbacks());
    }

    @GetMapping("/rating/{rating}")
    public ResponseEntity<List<Feedback>> getByRating(@PathVariable int rating){
        return ResponseEntity.ok(feedbackService.getByRating(rating));
    }

    @PutMapping("{id}")
    public ResponseEntity<Feedback> updateFeedback(@PathVariable Long id,@RequestBody Feedback feedback){
        return ResponseEntity.ok(feedbackService.updateFeedback(id, feedback));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteFeedback(@PathVariable Long id){
        return new ResponseEntity<>(feedbackService.deleteFeedback(id), HttpStatus.NO_CONTENT);
    }
}
