package kotli.isoftstone.com;

/**
 * 创建者：liby
 * 创建时间：2017/12/11 5:44
 * 工程名：KotlinDemo
 * 描述：
 */
public class Demo {

    public static void main(String[] args){
        int a = 16,b = 4,c =2;
        int temp = a + b / (c + 1) * 2;
        System.out.println(temp);
        System.out.println((c + 1) * 2);
    }

    private static void method() {
        String str = "hello world";
//        System.out.println(str.substring(-1));
        String s = "ccc\naaa";
        System.out.println(s);
        System.out.println("~~~~~~~~~~~~~~~~~~~~分割线~~~~~~~~~~~~~~~~~~~~~~");
        boolean isInstanceOf = new String() instanceof Object;
        System.out.println(isInstanceOf);
    }
}

