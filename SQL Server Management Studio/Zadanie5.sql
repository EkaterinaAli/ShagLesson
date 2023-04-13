SELECT LastName, FirstName, DateOfBirth,DataOfDischarch
FROM Patients
WHERE DATEDIFF(month, DataOfDischarch, GETDATE()) = 1
