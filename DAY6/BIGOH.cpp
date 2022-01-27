//#include<bits/stdc++.h>
using namespace std;

class Person{
    public:
    string name;
    string designation;

    Person(string name, string designation){
        this.name  = name;
        this.designation = designation;
    }

};

class Driver: public Person{
    public: 
    Driver(string name){
        this.name = name;
    }
    string getDriver(){
        return name;
    }
};

class MemberParliament: public Person{
    public:
    string winningConstituency;
    string vehicle;
    int spendingLimit;
    
    MemberParliament(string winningConstituency, string name, string vehicle, int spendingLimit){
        this.winningConstituency = winningConstituency;
        this.vehicle = vehicle;
        this.name = name;
        this.spendingLimit = spendingLimit;
    }
};

class Minister: public MemberParliament, public Person{

    minister(string spendingLimit, string vehicle, string name, string winningConstituency){
        this.spendingLimit = spendingLimit;
        this.vehicle = vehicle;
        this.name = name;
        this.winningConstituency = winningConstituency;
    }

};

class PrimeMinister: public MemberParliament, public Person{
    public:
    vector<string>vehicle {"Car", "Aircraft"};
    primeMinister(int spendingLimit, string name, string winningConstituency){
        this.spendingLimit = spendingLimit;
        this.name = name;
        this.winningConstituency = winningConstituency;
    }

};

class Commissioner: public Person{
    public:
    bool permission;

    bool canArrest(string designation, bool permission, int spendingLimit){
        if(designation == "PM"){
            return false;
        }
        else if(designation == "Minister" && permission == true && spendingLimit > 10,00,000){
            return true;
        }
        else if(designation == "MP" && spendingLimit > 1,00,000){
            return true;
        }
    } 
};

