package builderPattern;

public class TestBuilder {
    public static void main(String[] args) {
        User user = new User.UserBuilder().name("Vinit", "Dixit")
                .age(30).id(1111L).gender("Male").build();
        System.out.println(user.toString());
    }
}
