public class Main {
    public static void main(String[] args) {
        Person NingLong = new Person();
        NingLong.setName("谢宁龙"); // 设置name
        NingLong.setAge(26); // 设置age
        System.out.println(NingLong.getName() + ", " + NingLong.getAge());
        Person ming = new Person();
        ming.setBirth(1996);
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;
    private int age;
    private int birth;
    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();// 去掉首尾空格
    }

    public int getAge() {
        return calcAge(2022);// 调用private方法
    }
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
