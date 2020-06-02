package com.kumar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.model.Rating;
import com.kumar.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingRestService {

	
    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) throws InterruptedException {
    	UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;

    }
}
