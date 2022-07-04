@Test
double calculateAddition(int a, int b){
	double result = a + b;
	return result;
}

@Test
public void testCalculateAddition(){
	int a = 2;
	int b = 2;
	assertEquals(4, calculateAddition(a,b));
}



Benefits of Adopting Test Driven Development (TDD)
Development expenses are reduced
Improved Code Quality
Quality is enhanced
Shortened Time to Market
What are the Benefits of Test Driven Development?
It gives a way to think through one's requirements or design before the developer writes functional code.
TDD is a programming technique that enables the developer to take a small step during building software.
It is more productive as compared to attempting to code in giant steps.
Consider an example, developer write some code, then compile it, and then test it. Maybe there are chances of failure. In this case, it becomes easy to find and fix those defects if a developer had written two new lines of code than a thousand.
A Test Driven Development is the most efficient and attractive way to proceed in smaller and smaller steps.

Following Test Driven Development means -

Fewer Bugs.
Higher quality software.
Focus on single functionality at a given point in time.