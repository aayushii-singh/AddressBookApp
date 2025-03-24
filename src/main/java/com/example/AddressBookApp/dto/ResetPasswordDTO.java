package com.example.AddressBookApp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetPasswordDTO {
    private String token; // ✅ Add this field
    private String newPassword;
}
