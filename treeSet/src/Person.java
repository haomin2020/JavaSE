public class Person implements Comparable{

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 比较器按照name的长度来进行比较
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        if(p.name.length()>this.name.length()){
            return 1;
        }else if(p.name.length()<this.name.length()){
            return -1;
        }else{
            return 0;
        }
    }
}
