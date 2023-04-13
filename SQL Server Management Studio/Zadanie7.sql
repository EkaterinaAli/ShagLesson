SELECT LastName, FirstName, DateOfBirth, DateOfAdmission, DataOfDischarch
FROM Patients
WHERE Department IN ('кардиология', 'хирургия', 'неврология' )
ORDER BY LastName