package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType1 userType;


}
