//#include<iostream>
//#include<math.h>
//using namespace std;
//
//void towersOfHANOI(int number, char from, char toFrom,char auxiliary) {
//	if (number==1){
//		cout << "move " << from << " to " << toFrom << endl;
//		return;
//	}
//	towersOfHANOI((number - 1), from, auxiliary, toFrom);
//	cout << "move " << from << " to " << toFrom << endl;
//	towersOfHANOI((number - 1), auxiliary, toFrom,from);
//}
//
//
//
//
//
//int main() {
//	int number = 3;
//	char a = 'A';
//	char b = 'B';
//	char c = 'C';
//	towersOfHANOI(number, a, c, b);
//	return 0;
//}