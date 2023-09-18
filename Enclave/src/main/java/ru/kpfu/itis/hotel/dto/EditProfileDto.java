package ru.kpfu.itis.hotel.dto;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
/*// Аннотация ValidNames нужна для проверки сразу двух полей.
// Выводится сообщение errors.invalid.names, если валидация не пройдена.
@ValidNames(
        message = "{errors.invalid.names}",
        name = "firstName",
        surname = "lastName"
)*/
public class EditProfileDto {
    private String firstName;
    private String lastName;
}
