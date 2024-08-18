package com.app.form.account;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResetPasswordForm {
    @NotBlank(message = "otp is required")
    String otp;
    @NotBlank(message = "userId is required")
    String userId;
    @Size(min = 6, message = "newPassword must be at least 6 characters long.")
    String newPassword;
}
