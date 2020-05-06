package com.jb

class Surgery {
    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime

    static hasMany=[receptionist:Receptionist, nurse:Nurse, patient:Patient]
    static tobelongsTo=[Patient]


    static constraints = {
    name size: 2..30, blank: false
    address size: 5..75, blank: false
    postcode size: 2..10, blank: false
    telephone size: 7..15, blank: false
    numberOfPatients size: 0..1000, blank: false
    description blank: false
    openingTime blank: false
    }
}
