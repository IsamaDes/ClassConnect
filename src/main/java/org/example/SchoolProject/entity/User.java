package org.example.SchoolProject.entity;

import java.util.Objects;

public abstract class User{
        String name;
        int age;
        String weight;
        String gender;
        private String phoneNumber;
        static String nameOfSchool;
        static String religion;

        public User() {
        }

        public User(String name, int age, String weight, String gender, String phoneNumber) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.gender = gender;
                this.phoneNumber = phoneNumber;
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

        public String getWeight() {
                return weight;
        }

        public void setWeight(String weight) {
                this.weight = weight;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

        public static String getNameOfSchool() {
                return nameOfSchool;
        }

        public static void setNameOfSchool(String nameOfSchool) {
                User.nameOfSchool = nameOfSchool;
        }

        public static String getReligion() {
                return religion;
        }

        public static void setReligion(String religion) {
                User.religion = religion;
        }

        @Override
        public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", weight='" + weight + '\'' +
                        ", gender='" + gender + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                User user = (User) o;
                return age == user.age && Objects.equals(name, user.name) && Objects.equals(weight, user.weight) && Objects.equals(gender, user.gender) && Objects.equals(phoneNumber, user.phoneNumber);
        }

        @Override
        public int hashCode() {
                return Objects.hash(name, age, weight, gender, phoneNumber);
        }
}
