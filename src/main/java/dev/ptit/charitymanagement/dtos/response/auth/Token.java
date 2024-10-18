package dev.ptit.charitymanagement.dtos.response.auth;

import dev.ptit.charitymanagement.dtos.response.user.UserResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Token {
    String accessToken;
    String refreshToken;
}
