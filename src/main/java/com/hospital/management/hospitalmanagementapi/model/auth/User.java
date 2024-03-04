package com.hospital.management.hospitalmanagementapi.model.auth;

import com.hospital.management.hospitalmanagementapi.dto.auth.UserDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "login cannot be blank")
    @Column(unique = true)
    private String login;
    @NotBlank(message = "password cannot be blank")
    private String password;

    /**
     * Constructor for class User
     * @param userDto :  Data transfer object containing User entity information
     * @see UserDto
     */

    public User(UserDto userDto) {
        this.login = userDto.login();
        this.password = userDto.password();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    /**
     * Returns the password
     * @return a string representing the user's system password
     */

    @Override
    public String getPassword() {
        return password;
    }

    /**
     * Returns the username
     * @return a string containing the user's system login
     */

    @Override
    public String getUsername() {
        return login;
    }

    /**
     * Check if the account is non-expired
     * @return true
     */

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * Checks if the account is non-locked
     * @return true
     */

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * Checks if the account credentials are non-expired
     * @return true
     */

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * Checks if the entity is enabled
     * @return true
     */

    @Override
    public boolean isEnabled() {
        return true;
    }
}
