#include<iostream>
using namespace std;

void leftRotation(int *arr, int n, int d) {
    int temp[n-d];
    int j = 0;
    for(int i=d;i<n;i++){
        temp[j] = arr[i];
        j++;
    }
    int last = n-1;
    for(int i=d-1;i>=0;i--){
        arr[last] = arr[i];
        last--;
    }
    for(int i=0;i<n-d;i++){
        arr[i] = temp[i];
    }
}

int main() {
    int n, d;
    cin>>n>>d;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin>>arr[i];
    }
    leftRotation(arr, n, d);
    for(int i=0;i<n;i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}