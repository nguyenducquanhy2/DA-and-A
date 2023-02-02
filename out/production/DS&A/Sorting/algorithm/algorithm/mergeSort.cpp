//#include<iostream>
//#include "mergeSort.h"
//using namespace std;
//void merge(int arr[], int left, int mid, int right);
//void mergeSort(int arr[], int left, int right) {
//	if (left<right)
//	{
//		int mid = (right + left) / 2;
//		mergeSort(arr, left, mid);
//		mergeSort(arr, mid+1, right);
//		merge(arr,left,mid,right);
//	}
//}
//
//void merge(int arr[],int left,int mid,int right) {
//	int i = left;
//	int j = mid + 1;
//	int* temp = new int[right - left + 1];
//	int p = 0;
//	while (!(i>mid&&j>right))
//	{
//		if ((i<=mid&&j<=right&&arr[i]<arr[j])||j>right)
//		{
//			temp[p++] = arr[i++];
//		}
//		else
//		{
//			temp[p++] = arr[j++];
//		}
//	}
//	for (int i = 0; i < p; i++)
//	{
//		arr[left + i] = temp[i];
//	}
//}
//
//
//void loadData(int arr[], int number)
//{
//	srand(time(NULL));
//	for (int i = 0; i < number; i++)
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
//	mergeSort(arr, 0, number-1);
//
//	write(arr, number);
//}