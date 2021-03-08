import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add(new Person("zhangsan",12));
        treeSet.add(new Person("zhangsan",12));
        treeSet.add(new Person("lisi",13));
        System.out.println(treeSet);
    }
}
