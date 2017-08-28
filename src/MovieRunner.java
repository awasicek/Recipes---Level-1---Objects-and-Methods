
public class MovieRunner {
	public static void main(String[] args) {
		//1. Instantiate some Movie objects (at least 5).
		Movie m1 = new Movie("Star Wars", 5);
		Movie m2 = new Movie("Shawshenk Redemption", 4);
		Movie m3 = new Movie("Despicable Me", 3);
		Movie m4 = new Movie("Smurfs", 1);
		Movie m5 = new Movie("Batman", 2);
		//2. Use the Movie class to get the ticket price of one of your movies.
		System.out.println(m1.getTicketPrice());
		//3. Instantiate a NetflixQueue.
		NetflixQueue nq = new NetflixQueue();
		//4. Add your movies to the Netflix queue.
		nq.addMovie(m1);
		nq.addMovie(m2);
		nq.addMovie(m3);
		nq.addMovie(m4);
		nq.addMovie(m5);
		//5. Print all the movies in your queue.
		nq.printMovies();
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		System.out.println("The best movie is " + nq.getMovie(0));

		//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
		nq.sortMoviesByRating();
		System.out.println("The second best movie is " + nq.getMovie(1));


	}
}
