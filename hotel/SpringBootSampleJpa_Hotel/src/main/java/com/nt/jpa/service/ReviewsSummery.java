package com.nt.jpa.service;

import com.nt.jpa.domain.Rating;

public interface ReviewsSummery {

		long getNumberOfReviewsWithRating(Rating rating);

	}
