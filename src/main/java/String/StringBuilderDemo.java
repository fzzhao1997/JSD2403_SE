package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //基于给字符串创建StringBuilder
        // 此时StringBuilder会将给点字符串内容复制到自身的char数组,准备修改
//        StringBuilder builder = new StringBuilder(str);
//        System.out.println(builder.length());
//        builder.append("为了找个好工作");
//        System.out.println(builder.length());
//        String str2 = builder.toString();
//        System.out.println(str2);
//        builder.replace(8,16,",就是为了改变世界");
//        System.out.println(builder);
//        //删除builder中下标0-9之间的元素
//        builder.delete(0, 9);
//        System.out.println(builder);
//        builder.insert(0,"活着,");
//        System.out.println(builder);
//        builder.reverse();
//        System.out.println(builder);
//        StringBuilder s = new StringBuilder("八级大狂风");
//        System.out.println(s.reverse());
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.append("为了找个好工作")
                .replace(8, 16, ",就是为了改变世界")
                .delete(0, 9)
                .insert(0, "活着,")
                .reverse());
        String email= "fzz1997@163.com";
        String regex ="[\\w^_]+@[\\w^_]+(\\.[\\w^_^\\d]+)+";
        System.out.println(email.matches(regex)?"正确":"错误");
    }
}
