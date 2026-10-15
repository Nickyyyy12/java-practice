package se08.string1;

public class Main {
    public static void main(String[] args) {
        String email = "wang@qq.com";
        System.out.println("邮箱："+email);
        System.out.println("长度："+email.length());
        System.out.println("第一个字符："+email.charAt(0));
        System.out.println("是否为空："+email.isEmpty());
        System.out.println("是否包含@："+email.contains("@"));
        System.out.println("是否以.com结尾："+email.endsWith(".com"));

    }
}
