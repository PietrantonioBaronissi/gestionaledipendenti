package com.pietrantoniobaronissi.gestionaledipendenti.model;

import java.io.Serializable;

// "serializable" indica che questa classe può essere serializzata,  sta dicendo a Java che gli oggetti di quella classe
// possono essere trasformati in un formato speciale (una sequenza di byte). Questo formato consente di "salvare" l'oggetto
// su un file o inviarlo attraverso la rete.
public class Employee implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;
}
