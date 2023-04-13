SELECT LastName, FirstName, DateOfBirth,Department
FROM Patients
WHERE DATEDIFF(day, DateOfAdmission,DataOfDischarch ) >30 OR 
DATEDIFF(day, DateOfAdmission, GETDATE()) > 30 AND DataOfDischarch IS NULL