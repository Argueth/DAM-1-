SELECT DISTINCT concat(p.nombre, ' ', p.apellidos) as 'Nombre Completo', p.supervisor as 'Supervisor', p.fechalic as 'Fecha de Licencia' FROM piloto p, crucero c, realizar r, transporte t
	WHERE p.licencia = c.licencia AND c.matricula = r.matricula AND r.codigo = t.codigo ORDER BY p.fechalic desc;

SELECT DISTINCT concat(p.nombre, ' ', p.apellidos) as 'Nombre Completo', p.supervisor as 'Supervisor', p.fechalic as 'Fecha de Licencia' FROM piloto p 
JOIN crucero c ON p.licencia = c.licencia 
JOIN realizar r ON c.matricula = r.matricula
JOIN transporte t ON r.codigo = t.codigo
ORDER BY p.fechalic desc;