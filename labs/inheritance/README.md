# Inheritance

## Lab 06 | Restaurants and Reviews
- Restaurants are objects that have a `name`, a `star` rating, and a `price` level.
- Reviews are objects that have an `author`, a `star` review, and a `body` of the review.
- Both objects have a `toString` override method that cleanly output the object and its related methods.
- Reviews can be added to Restaurants using the Restaurant's `addReview` method.

## Lab 07 | Restaurants, Shops, Theaters, and Reviews

### Business
Business is the parent (super) class for all of main types of reviewable entities. It holds gerneric methods for all of its children that can be overridden. It also implements from Reviewable to ensure that it has an `addReview` method.
- Restaurant: Has a `name`, `price`, and `star` rating. It also has a list for reviews.
- Shop: Has a `name`, `price`, and `star` rating. It also has a list for reviews.
- Theater: Has a `name` and `star` rating. It also has a list for reviews and a list of movies.

### Reviews
Reviews are objects that can be given to businesses. They affect the overall star rating of the business whenever they are added.
- Review: Has an `author`, `body`, and a `star` rating.
- MovieReview: Has an `author`, `body`, `star` rating, and `movie`. that references the movie being reviewed.
