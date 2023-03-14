drop function if exists f_ranking_por_precio;
delimiter ||
create function f_ranking_por_precio(producto int)
returns int
deterministic
begin
	declare contador int default 0;
    select count(*) into contador from productos 
		where precio > (select precio from productos 
						where id = producto limit 1);
	return contador+1;
end||
delimiter ;

drop function if exists f_ranking_por_coste;
delimiter ||
create function f_ranking_por_coste(producto int)
returns int
deterministic
begin
	declare contador int default 0;
    select count(*) into contador from productos 
		where coste > (select coste from productos 
						where id = producto);
	return contador+1;
end||
delimiter ;


drop function if exists f_ranking_por_beneficio;
delimiter ||
create function f_ranking_por_beneficio(producto int)
returns int
deterministic
begin
	declare contador int default 0;
    select count(*) into contador from productos 
		where precio-coste > (select precio-coste as beneficio from productos 
						where id = producto);
	return contador+1;
end||
delimiter ;

drop view if exists vi_ranking_completo;
create view vi_ranking_completo as select id, nombre, concat(precio, ' (ranking: ', f_ranking_por_precio(id), ')'), 
														concat(coste, ' (ranking: ', f_ranking_por_coste(id), ')') as 'Coste', 
														concat(precio-coste, ' (ranking: ', f_ranking_por_beneficio(id), ')') as 'Beneficio' from productos order by f_ranking_por_precio(id);
                                                        
select * from vi_ranking_completo;
                                                        
