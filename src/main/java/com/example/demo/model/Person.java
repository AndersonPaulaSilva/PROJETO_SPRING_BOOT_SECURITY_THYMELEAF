package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by Anderson on 23/06/2019.
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Serializable {
    public static final long serialVersionUID = 11234L;

    private String primeiroNome;
    private String segundoNome;
    private String email;
    private String userName;
    private String senha;

    public void setprimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setemail(String email) {
        this.email = email;
    }
}
