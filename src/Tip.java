public class Tip {
    public static void main(String[] args) {
        String str = "룰룰 랄랄 일 이 삼 사";
        str = str.replace("일", String.valueOf(1));
        System.out.println(str);

        String str1 = "룰룰 랄랄 일 이 삼 사";
        str1 = str1.replace("일", String.valueOf(1));
        System.out.println(str);
    }
}
