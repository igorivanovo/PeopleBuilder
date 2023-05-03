public class Main {
    public static void main(String[] args) throws Exception {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(mom);
        mom.happyBirthday();
        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Кирюша")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        son.setAddress("Москва");
        System.out.println(son);

        Person person = new PersonBuilder()
                .setName("Антошка")
                .setSurname("Лопатов")
                .build();
        System.out.println(person);
        person.happyBirthday();

        Person person0 = new PersonBuilder()
                .setSurname("Mask")
                .setAge(-31)
                .setAddress("Сидней")
                .build(); // обработка исключений
        Person person1 = new PersonBuilder()
                .setName("Elon")
                .setSurname("Mask")
                .setAge(-31)
                .setAddress("Сидней")
                .build();// обработка исключений
        Person person50 = new PersonBuilder()
                .setName("Elon")
                .setAge(48)
                .setAddress("Сидней")
                .build();// обработка исключений

    }
}


