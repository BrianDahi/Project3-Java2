# proj3F19
* DateTimeOne extends MesoDateTimeOneAbstract
- Objective
	-read in dates and different timezones
	-swap hashmap, populate array LocalDateTime
	-print both hashmaps sorted and print arraySorted
-first I used DateTimeFormatter a few times one for MM/DD/YY HH:mm, next for hour and min, and last with year first.
-I used the LocalDatetime now to call in my current timezone and time this is based on server time. next I used ZonedDateTime for my different timezones. Last I hard coded the zst and ast since they are given from main.
-first method I retrive the seconds in my first method so I can use it in my next method sleepForFiveSec(). This methods uses TimeUnit.Seconds.sleep().
-next method is DateTimeNow. I stored now into a String and printed it out.
-DateTimeOfOtherCity() I again store into String and print However this method only wants the time in other cities.
-DateTimedifferentZone() This methods stores the zones gmt,bst,cst,zst,ast into a first HashMap however only prints out gmt,bst,cst due to specs. 
-last Method timeZoneHashMap() 
-First we naviagte through our first HashMap to swap the key and value and store into our Second HashMap.
-Next we formate and store our first hashmap values into our LocalDate array.
-Then we sort our HashMaps using the new 
new TreeMap<>(HashMap_Name) after sort we print using a for- each loop. 
-Last sort our array using Arrays.sort and print out the output.
* DateTimeTwo
-Obejctive
	-get certain days and show the days name such as Monday ,Tuesday, etc.
	-take in any year and any month and return the 15th and last day of the month simialar to the first objective.
	-next compareYear find the difference between our current year,month and dates to the txt file.
	-Alsot print out unsorted and sorted from the readfile
-First I used the I made  hashMap to Read in the file Dates.txt and was formated to match.
-next I used the YearMonth class to getDaysOfWeek easier so I can get the tenth and eighteenthDay for daysOfCurrentMonth.
-DaysOfAnyMonmth(int month, int year) this method took in month and year from main class and needed to find the 15th day and last day same as with the last method made an object except this time it is made to take in variables.
-compareyear() this method would compare our current year,month,day to the given .txt file and find if those years are a leap year. 

* MesoAsciiCal
-Objective 
	-take in given String and make things happen
	-given Private String "NRMN" 
	-break the String down find ascii avg of both 
	-take the avg of both and return that avg
-int calAverage
	-This method takes the two String breaks them down to char and converts them to ascii. This time we are interested in the avg difference at .25 rather then .5 This gives the upper bounds a 25% more chance to be the avg. We then take the avg of both NRMN and given String and return the nartual avg .
* MesoEquivalent
-Objective
	-Read in Mesonet.txt
	-Take in given String
	-find all String in mesonet that have the avg from MesoAsciiCal.
-In the constructor we do a littler more we go ahead and pass the given String back to MesoAsciiCal to get the avg of 76.
-Next big thing is to read in the Mesonet.txt and store into arrayList.
-in the method HashMap<String,Integer> calAsciiEqual() we sort through the hashmap. For each of the Strings we pass to MesoAsciiCal and test to see if it mathes our given String avg. If it does we store it into our HashMap equalValues.

* MesoLexicographical
This class is pretty Straight forward we take in the 
HashMap from MesoEquivalent and print out the unsorted and sorted.

* DateSortingUsingAlgorithm

-In this class we read in SortingDates.txt. This file was interesting becauce it was inconsitent so I got to figure out different ways of formatting them. I used trim and replaceAll methods. the trim method took care of the whiteSpace before and after and replaceAll took care of the spcae inbetween chars.
I stored this file into a HashMap.
The goal of this class was to not use built in api for sorting. So my next step was to convert the hashMap into LocalDate array and then make seperate methods to convert to a String array and use bubble sort algorithm to sort ascending and decending.
-changeToArray()
	- This just takes the HashMap and stores into my LocalDate array.
-dateHashMapSortedDescending() 
	-This method is converting the localDate array to a String passing to my method for decending convert back to localDate and prints out the final output.
-dateHashMapSorted()
	- I convert to Stirng pass it to my ascend method and convert back to localDate and print.
- I have two method  one is for ascend and the other for decend.
	-I went with bubble sort becauce I've always found it was quicker to implement. 












