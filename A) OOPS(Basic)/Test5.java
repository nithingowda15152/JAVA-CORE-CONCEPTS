//(ACCESING NON-STATIC VARIABLE FROM STATIC METHOD)

class account{
    double bal;

    static void displayBal(account a1){
        System.out.println(a1.bal);
}
}

class Test5 {
    public static void main(String[] args) {
        account a1=new account();
        a1.bal=10;
        
        account a2=new account();
        a2.bal=20;

        account.displayBal(a1);//to call 1st refernce of object
        account.displayBal(a2);//to call 2nd refernce of object
    }
    
}

//(ACCESING NON-STATIC VARIABLE FROM NON STATIC METHOD)
/* 
class account{
    double bal;

    void displayBal( ){
        System.out.println(bal);
}
}

class Test5 {
    public static void main(String[] args) {
        account a1=new account();
        a1.bal=10;
        
        account a2=new account();
        a2.bal=20;

        a1.displayBal();
        a2.displayBal();

    }
    
}
/*
//METHODS AND REFRENCES
/*
*Here 1st static method is created
    --Belongs to the class,not any single 
    --Needs an object to be passed as an argument (account.displayBal(a1))
    --LIKE->Hey class, please display the balance of this object I’m giving you

In Non-static method
    --Belongs to each object (instance).
    Can use this.bal (implicitly uses the calling object)
    --LIKE->Hey object, display your own balance

BOTH IS POSSIBLE,BUT NON STATIC IS BETTER
 */
