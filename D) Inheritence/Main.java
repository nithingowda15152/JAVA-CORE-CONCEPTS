// Parent class
class Bank {
    String loc = "Marathahalli";
    String pincode = "560037";

    void displayBranchDetails() {
        System.out.println("Location: " + loc);
        System.out.println("Pincode: " + pincode);
    }
}

// Child class 1
class SBI extends Bank {
    double roi = 6.7;
    String ifsc = "SBI12345";

    void showDetails() {
        System.out.println("----- SBI Bank Details -----");
        displayBranchDetails();
        System.out.println("Rate of Interest: " + roi + "%");
        System.out.println("IFSC Code: " + ifsc);
        System.out.println();
    }
}

// Child class 2
class ICICI extends Bank {
    double roi = 8.0;
    String ifsc = "ICICI67890";

    void showDetails() {
        System.out.println("----- ICICI Bank Details -----");
        displayBranchDetails();
        System.out.println("Rate of Interest: " + roi + "%");
        System.out.println("IFSC Code: " + ifsc);
        System.out.println();
    }
}

// Child class 3
class HDFC extends Bank {
    double roi = 4.5;
    String ifsc = "HDFC11223";

    void showDetails() {
        System.out.println("----- HDFC Bank Details -----");
        displayBranchDetails();
        System.out.println("Rate of Interest: " + roi + "%");
        System.out.println("IFSC Code: " + ifsc);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.showDetails();

        ICICI icici = new ICICI();
        icici.showDetails();

        HDFC hdfc = new HDFC();
        hdfc.showDetails();
    }
}
//HIERARCHIAL-INHERITENCE