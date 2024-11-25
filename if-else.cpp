# include<iostream>
# include<bits/stdc++.h>
using namespace std;

int main(){
    /*int age;
    cin>>age;*/
    // if(age>=18){
    //     cout<<"eligible for vote"<<endl;
    // }
    // else if (age <=9){
    //     cout<<"not eligible"<<endl;
    // }
    int marks;
    cin>>marks;
    if(marks< 25){
        cout<<"F";
    }
    else if (marks>=25 && marks<=44){
        cout<<"E";

    }
    else if (marks >=45 && marks <=59){
        cout<<"D";
    }
    else {
        cout<<"A";
    }

    return 0;

}