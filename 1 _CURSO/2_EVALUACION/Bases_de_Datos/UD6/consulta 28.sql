


select e.nom from equips e
where not exists (select c.dorsal from ciclistes c where c.equip = e.nom 
and not exists (select c.dorsal from portar po where c.dorsal = po.ciclista) 
and not exists (select c.dorsal from ports p where c.dorsal = p.ciclista))
and exists (select * from ciclistes c where c.equip = e.nom);


