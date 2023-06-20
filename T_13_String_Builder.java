public class T_13_String_Builder {

    // Todo:- StringBuilder Introduction.
    public static void SBI() {
        /* StringBuilder Constructors :- There are 3 constructors. */

        // (1):- It creates an empty String builder with the initial capacity of 16.
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // (2):- It creates a String builder with the specified string.
        StringBuilder sb2 = new StringBuilder("Sushil");
        System.out.println(sb2);

        // (3):- It creates an empty String builder with the specified capacity.
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println(sb3);
    }

    // Todo:- StringBuilder Methods.
    public static void SBM() {
        StringBuilder sb = new StringBuilder("Sushil");

        System.out.println(sb); // Sushil
        System.out.println(sb.append("JAVA")); // SushilJAVA
        System.out.println(sb.insert(2, "CPP")); // SuCPPshilJAVA
        System.out.println(sb.replace(1, 3, "Python")); // SPythonPPshilJAVA
        System.out.println(sb.delete(1, 4)); // ShonPPshilJAVA
        System.out.println(sb.reverse()); // AVAJlihsPPnohS
    }

    public static void main(String[] args) {
        SBI();
        SBM();
    }
}
