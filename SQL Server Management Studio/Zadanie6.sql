SELECT LastName, FirstName, DateOfBirth, DateOfAdmission, DataOfDischarch
FROM Patients
WHERE (YEAR(GETDATE()) - YEAR(DateOFAdmission) = 1 AND
YEAR(GETDATE()) - YEAR(DataOfDischarch) = 1) 
AND 
MONTH(DateOfAdmission) >= 10 
AND
MONTH(DataOfDischarch) BETWEEN  10 AND 12
