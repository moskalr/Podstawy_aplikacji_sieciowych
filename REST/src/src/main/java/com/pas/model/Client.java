package src.main.java.com.pas.model;

import java.util.UUID;

public class Client extends User {
    public Client(UUID id, String login, String password, String firstName, String lastName,
                  String personalId, float debt, int age, boolean isActive) {
        super(id, login, password, firstName, lastName, personalId, debt, age, isActive);
    }
}
