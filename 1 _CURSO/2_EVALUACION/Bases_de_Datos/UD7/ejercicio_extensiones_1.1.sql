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

drop view if exists vi_ranking;
create view vi_ranking as select id, nombre, precio, f_ranking_por_precio(id) as ranking from productos order by ranking;

select * from vi_ranking;