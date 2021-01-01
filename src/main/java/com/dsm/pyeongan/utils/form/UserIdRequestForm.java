package com.dsm.pyeongan.utils.form;

public class UserIdRequestForm {
    private String userId;

    public UserIdRequestForm() {}
    public UserIdRequestForm(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
