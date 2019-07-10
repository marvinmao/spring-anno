package com.llnqdx.spring.anno.cap1;
/**
 *
 */

/**
 * @Description:
 * @author: marvin
 * @Date: 2019-7-10
 */
public class Marvin {

    private String name;
    private Integer age;
    private String phone;

    @Override
    public String toString() {
        return "Marvin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Marvin() {
    }

    public Marvin(String name, Integer age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
