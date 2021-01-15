#include <bits/stdc++.h>
using namespace std;

vector<string> split_string(string);

// Complete the minimumSwaps function below.
int minimumSwaps(vector<int> arr) {
    int i,c=0,n=arr.size();
    for(i=0;i<n;i++)
    {
        if(arr[i]==(i+1))
            continue;
        
        swap(arr[i],arr[arr[i]-1]);
        c++;
        i--;
    }
    return c;
}

int main()
{
    int n;
    cin >> n;

    vector<int> arr(n);

    for (int i = 0; i < arr.size(); i++) {
        cin>>arr[i];
    }

    int res = minimumSwaps(arr);

    cout << res << "\n";

    return 0;
}