package com.jb

class Appointment {

    Date appDate
    String appTime
    int appDuration
    String roomNumber

    static constraints = {
    appDate blank: false
    appTime size: 2..8, blank: false
    appDuration blank: false
    roomNumber blank: false
    }
}
