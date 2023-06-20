public class T_12_Strings {

    // Todo:- String Introduction.
    public static void String_Intro() {
        // ? 2-Ways to create string objects.

        // * (1) Using String Literal:- Object will be created in string pool.
        String str1 = "Sushil";

        // * (2) Using New Keyword:- Object will be created outside string pool.
        String str2 = new String("Sushil");

        System.out.println(str1);
        System.out.println(str2);

        // String As A Character Array.
        char[] ch = { 'J', 'A', 'V', 'A' };
        String s = new String(ch);
        System.out.println(s);
    }

    // Todo:- String Methods.
    public static void String_Methods() {
        String str = "Sushil Soniwal";

        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf('S'));
        System.out.println(str.contains("iwal"));
        System.out.println(str.replace('S', 'R'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("Sus"));
        System.out.println(str.endsWith("wal"));
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.substring(4));
        System.out.println(str.substring(2, 9));
    }

    // Todo:- String Comparison.
    public static void String_Comparison() {
        // * (1) Method-01:- By Using (.equals()) => Compares Value.
        String s1 = "Sushil";
        String s2 = new String("Sushil");
        String s3 = "SUSHIL";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        // * (2) Method-02:- By Using (==) => Compares Reference Not Values.
        String s4 = "Sunil";
        String s5 = "Sunil";
        String s6 = new String("Sunil");

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
        System.out.println(s5 == s6);

        // * (3) Method-03:- By Using (.compareTo()) => Compares Values
        // Lexicographically.
        String s7 = "vivek";
        String s8 = "vanshiwal";
        String s9 = new String("Vivek");

        System.out.println(s7.compareTo(s8));
        System.out.println(s7.compareTo(s9));
        System.out.println(s8.compareTo(s9));
    }

    // Todo:- String Concatenation.
    public static void String_Concatenation() {
        // * (1) By using "Concatenation" (+) Operator.
        String s1 = "Sushil";
        String s2 = "Soniwal";
        System.out.println(s1 + s2); // SushilSoniwal

        // * (2) By using (.concat()) Method.
        String s3 = "Sunil";
        String s4 = "Bansiwal";
        System.out.println(s3.concat(s4)); // SunilBansiwal
    }

    // Todo:- String Immutability.
    public static void String_Immutability() {
        String name = "Sushil";
        name.concat("Soniwal");
        System.out.println(name);

        /*
         * Output => "Sushil";
         * A new object "SushilSoniwal" is created in pool but 'name' still refers to
         * old
         * one i.e. "Sushil".
         */

        String str = "Sunil";
        str = str.concat("Bansiwal");
        System.out.println(str);

        /*
         * Output => "SunilBansiwal";
         * A new object "SunilBansiwal" is created in pool and 'str' refer to new one
         * i.e. "SunilBansiwal".
         */
    }

    // Todo:- String Substring.
    public static void String_Substring() {
        String s = "Sushil Soniwal";

        // * (1) By using substring(int start).
        System.out.println(s.substring(4));

        // * (2) By using substring(int start, int end).
        System.out.println(s.substring(0, 9));
    }

    public static void main(String[] args) {
        String_Intro();
        String_Methods();
        String_Comparison();
        String_Concatenation();
        String_Immutability();
        String_Substring();
    }
}