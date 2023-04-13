SELECT LastName, FirstName,DateOfBirth, DateOfAdmission, DataOfDischarch
FROM Patients
WHERE Department = 'кардиология' 
ORDER BY DateOfAdmission DESC, LastName ASC; 