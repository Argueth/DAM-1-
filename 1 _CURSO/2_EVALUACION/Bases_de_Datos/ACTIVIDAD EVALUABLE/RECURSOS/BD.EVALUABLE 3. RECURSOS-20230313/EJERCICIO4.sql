select t.objetivo, c.concepto, c.importe from transporte t, coste c where c.codigo = t.codigo;


select t.objetivo, c.concepto, c.importe from transporte t, coste c where c.codigo = t.codigo and c.importe >= all(select importe from coste);