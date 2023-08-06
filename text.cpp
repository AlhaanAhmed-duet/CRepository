#include <iostream>

using namespace std;

int addNumbers(int a, int b) {
	int sum = a + b;
	std::cout<<"Sum of two numbers = "<<sum<<std::endl;
	return sum;
}
int main () {
	int a = 2;
	int b = 3;
	addNumbers(a, b);
	return 0;
}

