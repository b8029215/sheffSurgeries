package com.jb

class BootStrap {

 def init = { servletContext ->
   def surgery1=new Surgery(
                 name: 'City Health Centre',
                 address: '21 Marble Street, Sheffield',
                 postcode: 'S11 5TY',
                 telephone: '0114 555 555',
                 numberOfPatients: '50',
                 description: "Placeholder",
                 openingTime: '09:00 - 17:00hrs').save()

   def surgery2=new Surgery(
                 name: 'Marathon Health Centre',
                 address: '431 Centre Street, Sheffield',
                 postcode: 'S1 2YT',
                 telephone: '0114 222 22',
                 numberOfPatients: '150',
                 description: "Placeholder",
                 openingTime: '08:00 - 18:00hrs').save()

   def doctor1=new Doctor(
                fullname: 'Dr James Shoes',
                qualification: 'MBChB(London)',
                position: 'GP, Pharmacist',
                doctorEmail: 'james.shoe@email.co.uk',
                password: 'secret111',
                doctorOffice: 'D3123',
                doctorPhone: '0773628348',
                bio: "Placeholder").save()

   def doctor2=new Doctor(
                fullname: 'Dr Sarah Macdonald',
                qualification: 'MBChB(Sheffield)',
                position: 'GP',
                doctorEmail: 's.macdonald@mail.co.uk',
                password: 'secret222',
                doctorOffice: 'D9888',
                doctorPhone: '01111777',
                bio: "Placeholder").save()

   def patient1=new Patient(
                patientName: 'Tom Rivers',
                patientAddress: '2 One Way Street, Eckington',
                patientResidence: 'Sheffield, Barnsley, Doncaster',
                patientDob: '1998-05-20',
                patientID: 'D-32',
                dateRegistered: '2018-09-26',
                patientPhone: '0114222444').save()

   def patient2=new Patient(
                patientName: 'Hannah Thomas',
                patientAddress: '43 Lap Street',
                patientResidence: 'Sheffield, Barnsley',
                patientDob: '1989-03-30',
                patientID: 'P-12',
                dateRegistered: '2019-11-16',
                patientPhone: '0114222564').save()

   def receptionist1=new Receptionist(
                recepName: 'Rob Kingston',
                recepEmail: 'r.kingston@email.com',
                recepUsername: 'rking',
                recepPassword: 'secret2019',
                recepPhone: '0114 222 4445').save()

   def receptionist2=new Receptionist(
                recepName: 'Jane Slime',
                recepEmail: 'j.slime@email.com',
                recepUsername: 'jslime',
                recepPassword: 'secret2020',
                recepPhone: '0114 222 4447').save()

   def nurse1=new Nurse(
                 nurseName: 'Susan Peters',
                 qualifications: 'Registered General Nurse',
                 nurseEmail: 's.peters@myemail.com',
                 nurseOffice: 'B-4555',
                 nursePhone: '01142224433').save()

   def nurse2=new Nurse(
                 nurseName: 'Samuel North',
                 qualifications: 'Registered General Nurse',
                 nurseEmail: 's.north@myemail.com',
                 nurseOffice: 'A-2325',
                 nursePhone: '01142224428').save()

   def appointment1=new Appointment(
                appDate: '2021-04-13',
                appTime: '3:00pm',
                appDuration: '30,45,60',
                roomNumber: 'D-3233' ).save()

   def appointment2=new Appointment(
                appDate: '2020-02-11',
                appTime: '5:45pm',
                appDuration: '30,45',
                roomNumber: 'D-3423' ).save()

   def prescription1=new Prescription(
                pharmacyName: 'City Health Centre',
                prescripNumber: '21',
                medicine: 'Paracetamol',
                totalCost: '£30.45',
                dateIssued: '2020-12-17', 
                patientPaying: 'no').save()

   def prescription2=new Prescription(
                pharmacyName: 'Marathon Health Centre',
                prescripNumber: '41',
                medicine: 'Ibuprophen',
                totalCost: '£1.45',
                dateIssued: '2021-12-17', 
                patientPaying: 'no').save()

}
def destroy = {
}

}

