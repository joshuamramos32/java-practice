public class JavaInterviewQuestions {

        public static void main(String[] args) {
            String str = "123";
            System.out.println(reverse(str));
            int a = 10;
            int b = 20;
            System.out.println("a is " + a + " ,b is " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Now a is " + a + " and b is now " + b + " .");
        }
        public static String reverse(String in){
            if (in == null)
                throw new IllegalArgumentException("Null is not a valid input");
            StringBuilder out = new StringBuilder();
            char [] chars = in.toCharArray();
            for (int i = chars.length-1; i >=0; i--)
                out.append(chars[i]);
            return out.toString();
        }
}
