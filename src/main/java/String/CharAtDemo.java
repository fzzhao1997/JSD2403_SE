package String;

public class CharAtDemo {
    public static void main(String[] args) {
        String line = "www.tedu.cn";
        char c = line.charAt(4);
        System.out.println(c);
        for (int i = 0; i < line.length(); i++) {
            char ci = line.charAt(i);
            System.out.println(ci);
        }
        String str ="上海自来水来自海上";
        boolean check = true;
        for (int i = 0,j = str.length()-1; i < str.length()/2; j = str.length()- 1-++i) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1!=c2){
                System.out.println("不是回文");
                check = false;
                break;
            }
        }
        if(check = true){
            System.out.println("是回文");
        }
    }
}
