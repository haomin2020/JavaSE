import java.util.Comparator;
import java.util.TreeSet;

public class Test1 implements Comparator<Person1> {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet(new Test1());
        treeSet.add(new Person1("zhangsan",12));
        treeSet.add(new Person1("wangwu",15));
        treeSet.add(new Person1("lisi",13));
        System.out.println(treeSet);
    }

    @Override
    public int compare(Person1 t1, Person1 t2) {
        if(t1.getAge()>t2.getAge()){
            return 1;
        }else if(t1.getAge()<t2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
