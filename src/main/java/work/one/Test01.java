package work.one;

/**
 * @autor FangzhouZhao
 *
 * @fileName Test01
 *
 * @ext class
 *
 * @logo TeDu
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String fileName1 = "long.png";
        String fileName2 = "jquery.1.2.2.js";
        System.out.println(getExtByName(fileName1));
        System.out.println(getExtByName(fileName2));
    }

    /**
     *
     * @param name
     * @return ext
     */
    public static  String getExtByName(String name){
        int index = name.lastIndexOf(".")+1;
        String ext = name.substring(index);
        return ext;
    }
}
