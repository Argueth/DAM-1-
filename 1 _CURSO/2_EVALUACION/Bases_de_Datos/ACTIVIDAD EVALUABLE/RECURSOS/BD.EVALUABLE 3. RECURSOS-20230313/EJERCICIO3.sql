SELECT DISTINCT t.codigo AS CODIGO FROM transporte t, realizar r 
WHERE t.codigo = r.codigo and r.matricula NOT IN (SELECT matricula FROM crucero WHERE matricula = r.matricula) 
ORDER BY t.codigo;

SELECT DISTINCT t.codigo AS CODIGO FROM transporte t WHERE
NOT EXISTS (SELECT c.matricula FROM crucero c, realizar r, transporte t 
				WHERE c.matricula = r.matricula AND r.codigo = t.codigo) 
ORDER BY t.codigo