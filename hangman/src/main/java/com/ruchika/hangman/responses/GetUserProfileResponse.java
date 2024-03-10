package com.ruchika.hangman.responses;

import com.ruchika.hangman.model.Role;

public class GetUserProfileResponse {

    private String userId;

    private String email;

    private String displayName;

    private Role role;

    public GetUserProfileResponse(String userId, String email, String displayName, Role role) {
        this.userId = userId;
        this.email = email;
        this.displayName = displayName;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Role getRole() {
        return role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}