import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args)
    {
        System.out.println(convertString(args[0]));
    }

    private static long convertString(String a) {
        long answer = 0;
        String c = a.toUpperCase();
        char[] b = new char[c.length()];
        for (int i = 0; i < c.length(); i++) {
            b[i] = c.charAt(i);
        }

        for (int x = b.length-1; x >= 0; x--) {
            if(b[x] == 'X')
                break;
            answer += (long) (toNumber(b[x]) * Math.pow(16, (b.length-1) - x));
        }
        return answer;
    }

    private static long toNumber(char a) {
        long number;

        if (a < 58) {
            number = (long) a - (long) '0';
        } else {
            number = ((long) a - (long) 'A') + 10;
        }

        return number;
    }
}

