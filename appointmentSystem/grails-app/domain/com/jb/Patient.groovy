package com.jb

class Patient {
    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    String patientPhone
    Appointment appointment

    static hasMany=[prescription:Prescription, doctor:Doctor, surgery:Surgery]
    static belongsTo=[Doctor]

    String toString(){
    return appointment
}

    static constraints = {
    patientName size: 2..30, blank: false
    patientAddress size: 2..100, blank: false
    patientResidence size: 2..100, blank: false
    patientDob blank: false
    patientID size: 2..5, blank: false
    dateRegistered blank: false
    patientPhone size: 7..15, blank: false
    }
}
