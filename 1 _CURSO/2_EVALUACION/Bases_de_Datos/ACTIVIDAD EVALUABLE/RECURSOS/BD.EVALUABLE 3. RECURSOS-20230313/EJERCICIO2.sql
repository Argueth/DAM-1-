SELECT * FROM COSTE;

SELECT c.concepto, sum(c.importe) AS ImporteTotal FROM coste c 
	WHERE concepto LIKE 'Reparaciones%' OR concepto LIKE 'Dietas%' 
    GROUP BY concepto 
    ORDER BY ImporteTotal DESC, concepto;


SELECT c.concepto, (select sum(importe) FROM coste where concepto = c.concepto) as ImporteTotal
FROM (SELECT DISTINCT concepto FROM coste WHERE concepto LIKE 'Reparaciones%' OR concepto LIKE 'Dietas%') AS c
    ORDER BY ImporteTotal DESC, concepto; 


select c.concepto, sum(c.importe) as ImporteTotal from coste c 
where exists(select co.concepto from coste co where co.concepto LIKE 'Reparaciones%' OR concepto LIKE 'Dietas%')
having ImporteTotal > 0
ORDER BY ImporteTotal DESC, concepto;