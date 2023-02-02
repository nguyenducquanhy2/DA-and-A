//#include<iostream>
//using namespace std;
//int divide(int arr[], int left, int right);
//void quickSort(int arr[], int left, int right) {
//	if (left<right)
//	{
//		int ipivot = divide(arr, left, right);
//		quickSort(arr, left, ipivot - 1);
//		quickSort(arr, ipivot + 1, right);
//	}
//}
//
//int divide(int arr[], int left, int right) {
//	int pos = left - 1;
//	int pivot = arr[right];
//	for (int i = left; i < right; i++)
//	{
//		if (arr[i]<pivot)
//		{
//			pos++;
//			swap(arr[i], arr[pos]);
//		}
//	}
//	pos++;
//	swap(arr[pos], arr[right]);
//	return pos;
//}
//
//void swap(int& a, int& b) {
//	int temp = a;
//	a = b;
//	b = temp;
//}
//
//void loadData(int arr[],int number)
//{
//	srand(time(NULL));
//	for (int i = 0; i < number ; i++)
//	{
//		arr[i] = rand();
//	}
//}
//
//void write(int arr[], int number) {
//	for (int i = 0; i < number; i++)
//	{
//		cout << arr[i] << " ";
//	}
//}
//void main() {
//	int number = 10;
//	int* arr = new int[number];
//	loadData(arr, number);
//	quickSort(arr, 0, number - 1);
//	write(arr, number);
//}//