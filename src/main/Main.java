public class Main {
    public static void main(String[] args){
        try {
            String str;
            str = null;
            str.length();
        } catch(NullPointerException e){
            System.out.println("NullPointer例外起きちゃった");
            System.out.println(e.getMessage());
        }
    }
}
