
 package ua.nure.Skulinec.Practice1.Part7;

class Demo{
public static int chars2digits(String numeric) {
        int digit = 0;
        char [] tor3=numeric.toCharArray();
        for (int i = 0;i<tor3.length; i++) {
            digit += (int)(tor3[i] - 64)
                    * Math.pow(26, i);
        }
        return digit;
    }

    public static String digits2chars(int number) {
        String chars = "";
        String charsMirror = "";
        int modul;
        int divident = number;
        while (divident != 0) {
            modul = divident % 26;
            if (modul == 0) {
                chars += "Z";
                divident = (divident - 1) / 26;
            } else {
                chars += (char) (modul + 64);
                divident = (divident - modul) / 26;
            }
        }
        for (int i = 0; i < chars.length(); i++)
            charsMirror += chars.charAt(chars.length() - i - 1);
        return charsMirror;
    }

    public static String rightColumn(String number) {
        String chars = "";
        int num;
        num = chars2digits(number);
        num++;
        chars = digits2chars(num);
        return chars;
    }
        public static void main (String[] args){
            int d1 = Integer.parseInt(args[0]);
            String c1 = String.valueOf(args[1]);
            String c2 = String.valueOf(args[2]);
            System.out.println(char1 + " --> " + chars2digits(c1));
            System.out.println(digit1 + " --> " + digits2chars(d1));
            System.out.println(char2 + " --> " + rightColumn(c2));
        }
}