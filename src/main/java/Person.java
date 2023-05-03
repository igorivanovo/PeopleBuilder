import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if (age > 0) {
            return true;
        } else return false;
    }

    public boolean hasAddress() {
        if (city != null) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        String s;
        if (hasAge() == true) {
            return s = String.valueOf(age);
        } else {
            s = "- нет данных";
            return s;
        }
    }

    public String getAddress() {
        if (hasAddress() == true) {
            return city;
        } else {
            String s = "- нет данных";
            return s;
        }
    }

    public void setAddress(String address) {
        if (hasAddress() == true) {
            this.city = address;
        } else this.city = "";
    }

    public void happyBirthday() {
        Person person = this;
        if (hasAge() == true) {
            age++;
        } else
            System.out.println("У " + person.getName() + " " + person.getSurname() + " 'ДР невозможен возраст неизвестен'");
    }

    public PersonBuilder newChildBuilder() {
        Person person = this;
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAddress(person.getAddress());
        personBuilder.setSurname(person.surname);
        return personBuilder;
    }

    @Override
    public String toString() {
        return "Человек{" +
                "имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", возраст='" + getAge() + '\'' +
                ", город=" + "'" + getAddress() + "'" +
                '}';

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}


