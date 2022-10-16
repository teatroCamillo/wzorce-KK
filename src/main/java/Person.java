public class Person {

    private String firstName;
    private String lastName;
    private char gender;
    private Adress adress;
    private Integer age;


    private Person(String firstName, String lastName, char gender, Adress adress, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.adress = adress;
        this.age = age;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder{

        private String firstName;
        private  String lastName;
        private  Gender gender;
        private  Adress adress;
        private  Integer age;



        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder adress(Adress adress) {
            this.adress = adress;
            return this;
        }

//        public Person build(){
//            return new Person();
//        }
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", adress=" + adress +
                ", age=" + age +
                '}';
    }
}
