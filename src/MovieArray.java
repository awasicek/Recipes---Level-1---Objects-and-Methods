//GOAL: teach arrays!
// An array is a collection of data. All the data has to be the same type (e.g., all strings or ints)
// Once we make our array, we can't change its size (the number of elements in it).

public class MovieArray {
	public static void main(String[] args) {
		// FIRST way to create an array
		String[] movieList = {"500 Days of Summer", "Ratatouille", "Star Wars", "The Godfather"};
		// Way to display a certain array element
		System.out.println("Two of my favorite movies are " + movieList[0] + " and " + movieList[3] + ".");
		
		// Method for the LENGTH of an array 
		System.out.println("I have " + movieList.length + " favorite movies.");
		
		// SECOND way to create an array
		String[] otherMovieList = new String[5];
		System.out.println("My other movie list contains " + otherMovieList.length + " movies.");
		// Now we have to tell that array what each element should be
		otherMovieList[0] = "Pulp Fiction";
		otherMovieList[1] = "La La Land";
		otherMovieList[2] = "WALL-E";
		otherMovieList[3] = "Children of Men";
		otherMovieList[4] = "The Fifth Element";
		
		// Show the next line to demonstrate an OUT OF BOUNDS EXCEPTION -- we can't change the size of an array once it has been made
		// otherMovieList[5] = "Another random movie!";
		
		// FOR LOOPS loops are a great way to do something with all the elements of an array
		// We can start our loop variable at 0 (which we can use for the first element of the array) and go to 1 less than the length of the array (so it will go
		// all the way to the end of the array)
		for(int i = 0; i < otherMovieList.length; i++){
			System.out.println(otherMovieList[i]);
		}
		
		// Another way to loop through arrays (we specify the data type of the array elements, give it a variable name, and then say which array we want to access)
		// In other words, for each String that we are going to refer to as movie (so for each element) in the movieList array, run the following code!
		System.out.println("This is the for-each way of looping through arrays:");
		for(String movie : movieList) {
			System.out.println(movie);
		}
	}
}
