public class Kadai1 {
    public static void main(String[] args) {
        try {
            int si = Integer.parseInt(args[0]);
            for (int i = 1; i <= 1000; i++)
                if ((i % si) == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
        }catch (NumberFormatException e) {
            System.out.println("era-");
            }
    }
}

