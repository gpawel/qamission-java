package org.qamission;

public class FibNumbers {
    public static void main(String [] args) {
        if (args.length != 1) {
            System.err.println("Usage: java org.qamission.FibNumbers 50");
            System.exit(-1);
        }
        int limit = Integer.parseInt(args[0]);
        int a, b;
        a = 0; b = 1;
        while (a < limit) {
            System.out.print(a+" ");
            int next = a + b;
            a = b; b = next;
        }
        System.out.println();
    }
}
