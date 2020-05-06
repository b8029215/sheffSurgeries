package com.jb

class Prescription {

    String pharmacyName
    int prescripNumber
    String medicine
    String totalCost
    Date dateIssued
    Boolean patientPaying

    static constraints = {
    pharmacyName size: 2..30, blank: false
    prescripNumber size: 1..8, blank: false
    medicine size: 2..60, blank: false
    totalCost size: 2..7, blank: false
    dateIssued blank: false 
    patientPaying blank: false
    }
}
