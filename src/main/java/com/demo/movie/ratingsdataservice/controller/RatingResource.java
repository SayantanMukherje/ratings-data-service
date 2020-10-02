package com.demo.movie.ratingsdataservice.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movie.ratingsdataservice.model.Rating;
import com.demo.movie.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@Autowired
	private UserRating userRating;

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@GetMapping("user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		userRating.setUserRating(Arrays.asList(new Rating("12", 4), new Rating("14", 4)));
		return userRating;
	}
}
