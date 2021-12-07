package dzien9.regexy;

import dzien7.Dog;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ZadanieString {
    public static void main(String[] args) throws UnsupportedEncodingException {


        byte[] a = new byte[]{(byte) 0xF0, (byte) 0x9F, (byte) 0x90, (byte) 0xBB};
        String cos = new String(a, Charset.defaultCharset());
        System.out.println(cos);


        System.out.println(Charset.defaultCharset().displayName());
    }


    private static String loadTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    public static String append1080p(String toAppend) {

        StringBuilder sb = new StringBuilder(toAppend);

        for (int i = 0; i < 1080; i++) {
            sb.append("p");
        }
        return sb.toString();
    }


}
