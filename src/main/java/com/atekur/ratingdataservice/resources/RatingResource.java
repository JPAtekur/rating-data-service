package com.atekur.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atekur.ratingdataservice.models.Rating;
import com.atekur.ratingdataservice.models.UserRatings;

@RestController
@RequestMapping("/rating")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("user/{userId}")
	public UserRatings getUserRating(@PathVariable("userId") String userId) {
		 List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));
		 UserRatings userRatings = new UserRatings();
		 userRatings.setUserRating(ratings);
		 return userRatings;
	}
}
