public class Main {
    public static void main(String[] args){
        try {
            String str = "百二十三";
            int value = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("NumberFormat例外がおきたよ");
        }
    }
}
