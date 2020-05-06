package com.jb

class Nurse {
 
    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    int nursePhone

    static hasMany=[doctor:Doctor]
    static tobelongsTo=[Doctor]

    static constraints = {
    nurseName size: 2..30, blank: false
    qualifications blank: false
    nurseEmail email: true, blank: false
    nurseOffice size: 2..20, blank: false
    nursePhone size: 7..15, blank: false
    }
}
