public class Mulitplication { //multiplication is misspelled in the assignment lol

    public Mulitplication() {
        }

    public static void xTable(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            String combined = "";
            for (int j = 0; j < b.length; j++) {
                combined = combined + " " + a[i]*b[j];

            }
            System.out.println(combined);
            
        }
    }

    }


