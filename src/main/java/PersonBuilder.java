public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws Exception {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        String s = "";
        if (age < 0) {
            s = ", возраст не корректен" + age;
        }
        if (name == null || surname == null || age < 0) {
            try {
                if (name == null) {
                    throw new IllegalStateException(" у человека c фамилией " + surname + " нет  имя" + s);
                } else if (surname == null) {
                    throw new IllegalStateException(" у человека по имени " + name + " нет фамилии" + s);
                } else if (age < 0) {
                    throw new IllegalArgumentException("у человека " + name + " " + surname + " недопустимый возраст " + age);
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else return new Person(name, surname, age, city);
        return null;
    }
}
