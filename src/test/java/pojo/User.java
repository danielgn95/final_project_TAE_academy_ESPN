package pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class User {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

}
