package com.jb

class Doctor {
    String fullname
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    int doctorPhone
    String bio

    static constraints = {
    fullname size: 2..30, blank: false
    qualification blank: false
    position blank: false
    doctorEmail email: true, blank: false
    password size: 6..30, blank: false
    doctorOffice size: 1..10, blank: false
    doctorPhone size: 7..15, blank: false
    bio blank: false
    }

}
