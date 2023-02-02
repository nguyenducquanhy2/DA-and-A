#include <iostream>
#include <string>
#include "radixSort.h"
#include<hash_map>
using namespace std;
void sort_counting(int arr[], int size, int place);


int get_max_element(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++)
        if (arr[i] > max)
            max = arr[i];
    return max;
}

void print(int arr[], int size) {
    for (int i = 0; i < size; ++i) {
        printf("%d  ", arr[i]);
    }
    printf("\n");
}

void sort_radix(int arr[], int size) {

    int max = get_max_element(arr, size);
    string s_max=to_string(max);
    int digit = s_max.max_size();
    int place = 1;

    for (int i = 0; i < digit; i++) {        
        place *= 10;
        sort_counting(arr, size, place);
    }



}
void sort_counting(int arr[], int size,int place) {
    
    hash_map a=new 


}


int main() {
    int n = 9;
    int *arr =new int[n] { 143, 654, 786, 45, 3, 78, 900, 156, 13 };
    print(arr, n);
    sort_radix(arr, n);
    print(arr, n);

    //cout << 45 % 100 << endl;

}