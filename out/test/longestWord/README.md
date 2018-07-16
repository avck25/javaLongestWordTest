Using Java to find the longest word of a given input sentence.
Utilized Junit 4 testing.
To run the tests git clone the repository cd into javaLongestWordTest
and then enter this command in the command prompt for Windows:

java -classpath  out\test\longestWord;out\test\longestWord\lib\junit-4.12.jar;out\test\longestWord\lib\hamcrest-core-1.3.jar org.junit.runner.JUnitCore EvaluateLongestWordTest

For Mac insert colon instead of semi colon and for relative paths I think it needs a slash so the command looks like this :

java -classpath  /out/test/longestWord:/out/test/longestWord/lib/junit-4.12.jar:/out/test/longestWord/lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EvaluateLongestWordTest

But I was unable to test on a mac

