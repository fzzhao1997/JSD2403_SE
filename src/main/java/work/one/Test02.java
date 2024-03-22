package work.one;

import java.util.Scanner;

/**
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String nameInput = sc.nextLine();
        userNameInput(nameInput);
    }

    /**
     *
     * @param nameInput
     */
    public static void userNameInput(String nameInput){
        String userName = nameInput.trim();
        if(userName.isEmpty()){
            System.out.println("您输入的用户名不能为空");
        } else if (userName.length()>20) {
            System.out.println("您输入的用户名必须在20个字以内");
        }else{
            System.out.println("您输入的用户名为:"+userName);
        }
    }
}
