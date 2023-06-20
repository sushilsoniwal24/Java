public class T_14_StringBuffer {

    // Todo:- StringBuffer Introduction.
    public static void SBI() {
        /* StringBuffer Constructors :- There are 3 constructors. */

        // (1):- It creates an empty String builder with the initial capacity of 16.
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1);

        // (2):- It creates a String builder with the specified string.
        StringBuffer sb2 = new StringBuffer("Sushil");
        System.out.println(sb2);

        // (3):- It creates an empty String builder with the specified capacity.
        StringBuffer sb3 = new StringBuffer(10);
        System.out.println(sb3);
    }

    // Todo:- StringBuffer Methods.
    public static void SBM() {
        StringBuffer sb = new StringBuffer("Sushil");

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
