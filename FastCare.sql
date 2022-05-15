create database FastCare
use FastCare


create table Patient(
	name_ nvarchar(30),
	pateintID nvarchar(30),
	password_ nvarchar(30),
	emailAddress nvarchar(30),
	location_ nvarchar(30)

);

Select* from Patient

create table Doctor(
	name_ nvarchar(30),
	doctorID nvarchar(30),
	password_ nvarchar(30),
	emailAddress nvarchar(30),
	clinicLocation_ nvarchar(30)
);

Select* from Doctor

create table Pharmacy(
	pharmacyID nvarchar(30),
	pharmacyName_ nvarchar(30),
	emailAddress nvarchar(30),
	password_ nvarchar(30),
	pharmacyLocation_ nvarchar(30),
	timings nvarchar(30)
);

select* from Pharmacy

create table Lab(
	_name nvarchar(30),
	_labID nvarchar(30),
	_emailAddress nvarchar(30),
	_password nvarchar(30),
	_lablocation nvarchar(30)
);

select* from Lab

create table Appointment(
	patientID nvarchar(30),
	doctorID nvarchar(30),
	appointmentID nvarchar(30),
	[date] nvarchar(30),
	[status] nvarchar(30),
	[time] nvarchar(30)
);

create table Medicine(
	medicineID nvarchar(30),
	medicineName nvarchar(30),
	ExpiryDate nvarchar(30),
	Price nvarchar(30),
	Dosage nvarchar(30),
	stockLeft int
);

create table Prescription(
	doctorID nvarchar(30),
	patientID nvarchar(30),
	prescriptionID nvarchar(30),
	details nvarchar(30)
);

create table [Order](
	orderID nvarchar(30),
	customerID nvarchar(30),
	pharmacyID nvarchar(30),
	price float,
	quantity int
);

create table Test(
	ID nvarchar(30),
	price float,
	testName nvarchar(30)
);

create table TestResult(
	TestID nvarchar(30),
	PatientID nvarchar(30),
	PatientName nvarchar(30),
	TestName nvarchar(30),
	labID nvarchar(30),
	labName nvarchar(30),
	ResultDetails nvarchar(30),
	testDate date 
);


