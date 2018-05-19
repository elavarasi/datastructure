package interviewcake;


/** 
 * You decide to test if your oddly-mathematical heating company is fulfilling its All-Time Max, Min, Mean and Mode Temperature Guarantee™.
Write a class TempTracker with these methods:

insert()—records a new temperature
getMax()—returns the highest temp we've seen so far
getMin()—returns the lowest temp we've seen so far
getMean()—returns the mean ↴ of all temps we've seen so far
getMode()—returns a mode ↴ of all temps we've seen so far
Optimize for space and time. Favor speeding up the getter functions (getMax(), getMin(), getMean(), and getMode()) over speeding up the insert() function.

getMean() should return a double, but the rest of the getter functions can return integers. Temperatures will all be inserted as integers. We'll record our temperatures in Fahrenheit, so we can assume they'll all be in the range 0..1100..110.

If there is more than one mode, return any of the modes.
 *
 */

public class cake7 {
	 
	public static void main(String args[]){
	
		Temperature.insert(45);
		Temperature.insert(75);
		Temperature.insert(22);
		Temperature.insert(100);
		Temperature.insert(45);
		System.out.println(Temperature.getMax());
		System.out.println(Temperature.getMin());
		System.out.println(Temperature.getMean());
		System.out.println(Temperature.getMode());
		
		 
	}
}

class Temperature {
	static int[] modecounter = new int[110];
	static int maximumTemp = 0;
	static int minimumTemp = 110;
	static int mean = 0;
	static int sum = 0;
	static int mode = 0;
	static int counter = 0;
	
	static void insert(int newtemp){
		counter ++;
		
		sum = sum + newtemp;
		mean = sum / counter;
			
		if (newtemp > maximumTemp){
			maximumTemp = newtemp;
		} else if(newtemp < minimumTemp){
			minimumTemp = newtemp;
		}
		
		modecounter[newtemp] ++;
		
				
	}
	
	static Integer getMin(){
		return minimumTemp;			
	}
	 
	static Integer getMax(){
		return maximumTemp;	
		
	}
	
	static Integer getMode(){
		int max = 0;
		int j=0;
		for(int i=0;i<modecounter.length;i++){
			if(modecounter[i] > max){
				max = modecounter[i];
				j = i;
			}
		}
		return j;		
	}
	
	static Integer getMean(){
		return mean;
	}


	
	

}




/**
 * 
 * You decide to test if your oddly-mathematical heating company is fulfilling its All-Time Max, Min, Mean and Mode Temperature Guarantee™.
Write a class TempTracker with these methods:

insert()—records a new temperature
getMax()—returns the highest temp we've seen so far
getMin()—returns the lowest temp we've seen so far
getMean()—returns the mean ↴ of all temps we've seen so far
getMode()—returns a mode ↴ of all temps we've seen so far
Optimize for space and time. Favor speeding up the getter functions (getMax(), getMin(), getMean(), and getMode()) over speeding up the insert() function.

getMean() should return a double, but the rest of the getter functions can return integers. Temperatures will all be inserted as integers. We'll record our temperatures in Fahrenheit, so we can assume they'll all be in the range 0..1100..110.

If there is more than one mode, return any of the modes.

Gotchas
We can get O(1)O(1) time for all functions.

We can get away with only using O(1)O(1) additional space. If you're storing each temperature as it comes in, be careful! You might be taking up O(n)O(n) space, where nn is the number of temperatures we insert!

Are you trying to be fancy about returning multiple modes if there's a tie? Good idea, but read the problem statement carefully! Check out that last sentence!

Failing to carefully read or listen to the problem statement is a very common mistake, and it always looks bad. Don't let it happen to you.

Breakdown
The first thing we want to optimize is our getter functions (per the instructions).

Our first thought might be to throw our temperatures into an array or linked list as they come in. With this method, getting the maxTemp and minTemp would take O(n)O(n) time. It would also cost us O(n)O(n) space. But we can do better.

What if we kept track of the maxTemp and minTemp as each new number was inserted?

That's easy enough:

  class TempTracker {

    Integer minTemp;
    Integer maxTemp;

    public boolean insert(int temperature) {
        if (maxTemp == null || temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (minTemp == null || temperature < minTemp) {
            minTemp = temperature;
        }
        return true;
    }

    public Integer getMax() {
        return maxTemp;
    }

    public Integer getMin() {
        return minTemp;
    }
}

This wins us O(1)O(1) time for getMax() and getMin(), while keeping O(1)O(1) time for insert() and removing the need to store all the values.

Can we do something similar for getMean()?

Unlike with minTemp and maxTemp, the new temp and the previous mean won't give us enough information to calculate the new mean. What other information will we need to track?

To calculate the mean of a list of values, we need to know:

the sum of all the values
the total number of values
So we can augment our class to keep track of the totalNumbers and totalSum. Then we can compute the mean as values are inserted:

  class TempTracker {

    // for mean
    int totalNumbers = 0;
    double totalSum = 0.0; // mean should be double
    Double mean;

    // for min and max
    Integer minTemp;
    Integer maxTemp;

    public boolean insert(int temperature) {

        // for mean
        totalNumbers++;
        totalSum += temperature;
        mean = totalSum / totalNumbers;

        // for min and max
        if (maxTemp == null || temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (minTemp == null || temperature < minTemp) {
            minTemp = temperature;
        }

        return true;
    }

    public Integer getMax() {
        return maxTemp;
    }

    public Integer getMin() {
        return minTemp;
    }

    public Double getMean() {
        return mean;
    }
}

Can we do something similar for the mode? What other information will we need to track to compute the mode?

To calculate the mode, we need to know how many times each value has been inserted.

How can we track this? What data structures should we use?

Solution
We maintain the maxTemp, minTemp, mean, and mode as temperatures are inserted, so that each getter function simply returns an instance variable.

To maintain the mean at each insert, we track the totalNumbers and the totalSum of numbers inserted so far.

To maintain the mode at each insert, we track the total occurrences of each number, as well as the maxOccurrences we've seen so far.

  class TempTracker {

    // for mode
    int[] occurrences = new int[111]; // array of 0s at indices 0..110
    int maxOccurrences = 0;
    Integer mode;

    // for mean
    int totalNumbers = 0;
    double totalSum = 0.0; // mean should be double
    Double mean;

    // for min and max
    Integer minTemp;
    Integer maxTemp;

    public boolean insert(int temperature) {

        // for mode
        occurrences[temperature]++;
        if (occurrences[temperature] > maxOccurrences) {
            mode = temperature;
            maxOccurrences = occurrences[temperature];
        }

        // for mean
        totalNumbers++;
        totalSum += temperature;
        mean = totalSum / totalNumbers;

        // for min and max
        if (maxTemp == null || temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (minTemp == null || temperature < minTemp) {
            minTemp = temperature;
        }

        return true;
    }

    public Integer getMax() {
        return maxTemp;
    }

    public Integer getMin() {
        return minTemp;
    }

    public Double getMean() {
        return mean;
    }

    public Integer getMode() {
        return mode;
    }
}

We don't really need the getter functions since they all return instance variables. We could directly access the instance variables!

   // function
tempTracker.getMean();

// variable
tempTracker.mean;
Java
But we should leave the getter functions because the question specifically asked for them.

And we usually use getters and setters in Java anyway because they give us flexibility—if we wanted to change how we calculate values (for example, we might want to calculate a value just-in-time), it won't change how other people interact with our class—they wouldn't have to switch from using an instance variable to using a getter method. But in other languages like Python and JavaScript, we would usually access the instance variables directly, to avoid adding an unnecessary layer of abstraction. Different languages, different conventions.

Complexity
O(1)O(1) time for each function, and O(1)O(1) space related to input! (Our occurrences array's size is bounded by our range of possible temps, in this case 0-110)

What We Learned
This question deals a lot with just-in-time vs ahead-of-time. Or lazy vs eager. Or on-line vs off-line. There are a few names for this.

Our first thought for this question might have been to use a just-in-time approach: have our insert() function simply put the temperature in a list, and then have our getters compute e.g. the mode just-in-time, at the moment the getter is called.

Instead, we used an ahead-of-time approach: have our insert function compute and store our mean, mode, max, and min ahead of time (that is, before they're asked for). So our getter just returns the pre-computed value in O(1)O(1) time.

In this case, the ahead-of-time approach doesn't just speed up our getters...it also reduces our space cost. If we tried to compute each metric just-in-time, we'd need to store all of the temperatures as they come in, taking O(n)O(n) space for nn insert()s.

As an added bonus, the ahead-of-time approach didn't increase our asymptotic time cost for inserts, even though we added more work. With some cleverness (channeling some greedy ↴ thinking to figure out what we needed to store in order to update the answer in O(1)O(1) time), we were able to keep it at O(1)O(1) time.

It doesn't always happen this way. Sometimes there are trade-offs between just-in-time and ahead-of-time. Sometimes to save time in our getters, we have to spend more time in our insert.

In those cases, whether we should prefer a just-in-time approach or an ahead-of-time approach is a nuanced question. Ultimately it comes down to your usage patterns. Do you expect to get more inserts than gets? Do slow inserts have a stronger negative effect on users than slow gets?

We have some more questions dealing with this stuff coming up later.

Whenever you're designing a data structure with inserts and getters, think about the advantages and disadvantages of a just-in-time approach vs an ahead-of-time approach.
 * 
 * 
 * 
 */
