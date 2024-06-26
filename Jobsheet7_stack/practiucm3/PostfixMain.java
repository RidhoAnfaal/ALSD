package practiucm3;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p, q;
        System.out.print("Insert mathematical expression (infix) : ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        Postfix post = new Postfix(total);
        p = post.convert(q);
        System.out.println("Postfix : " + p);

        sc.close();
    }
}
