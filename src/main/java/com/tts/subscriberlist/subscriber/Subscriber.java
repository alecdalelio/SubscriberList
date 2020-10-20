package com.tts.subscriberlist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

// properties or fields
private Long id;
private String firstName;
private String lastName;
private String username;

@Column
@CreationTimestamp
private Date signedUp;

public Subscriber(){}

public Subscriber(String firstName, String lastName, String username, Date signedUp) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.signedUp = signedUp;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public Date getSignedUp() {
    return signedUp;
}

public void setSignedUp(Date signedUp) {
    this.signedUp = signedUp;
}

@Override
public String toString() {
    return "Subscriber [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", signedUp=" + signedUp
            + ", username=" + username + "]";
}

}


