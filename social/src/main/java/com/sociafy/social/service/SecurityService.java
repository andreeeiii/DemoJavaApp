package com.sociafy.social.service;

public interface SecurityService {

        String findLoggedInUsername();

        void autologin(String username, String password);
}
