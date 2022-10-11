public class Main {
    public static void main(String[] args) {
        System.out.println(remainder(2,2));
        System.out.println(treArea(10,5));
        System.out.println((animals(2, 2, 4)));
        System.out.println(profitableGamble(0.9,1,2));
        System.out.println(operation(24,26,2));
        System.out.println(ctoa('['));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(5,7));
        System.out.println(sumOfCubes(new int[] {2, 2, 2}));
        System.out.println(abcmath(5, 2, 1));
    }

    public static int remainder(int a ,int b){
        return a % b;
    }
    public static double treArea(int a ,int b){
        return 0.5*a*b;
    }

    public static int animals(int a, int b, int c){
        return (a*2) + (b*4) + (c*4);
    }
    public static boolean profitableGamble(double prob, int prize, int pay){
        return prob * prize > pay;
    }
    public static String operation(int n, int a, int b){
        if (a - b == n) return "subtracted";
        else if (a + b == n) return "added";
        else if (a / b == n) return "divided";
        else if (a * b == n) return "multiplied";
        else return "none";
    }
    public static int ctoa(char a){
        return a;
    }
    public static int addUpTo(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }
    public static int nextEdge(int a, int b){
        return a + b - 1;
    }
    public static int sumOfCubes(int[] a){
        int sum = 0;
        for (int i = 0; i< a.length; i++){
            sum += Math.pow(a[i],3);
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c){

        return (a *(Math.pow(2, b)))%c == 0;
    }
}
