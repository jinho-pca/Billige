package com.ssafy.billige.user.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserProfileResponse {

    String userEmail;

    String userName;

    String userImage;

    String userAddress;

    int userBli;

    boolean existWallet;
}
