/*
"""
    @author - Waruna Nissanka
    @email - warunanissanka44@gmail.com
    @project - JWT Spring Security
    @Description - Authentication Response Model
"""
*/
package io.wnm.springsecurityjwt.models;

public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
