package com.jb

class Receptionist {

    String recepName
    String recepEmail
    String recepUsername
    String recepPassword
    int recepPhone

    static constraints = { 
    recepName size: 2..30, blank: false
    recepEmail email: true, blank: false
    recepUsername size: 6..30, blank: false
    recepPassword size: 6..30, blank: false
    recepPhone size: 7..15, blank: false
    }
}
