drop procedure if exists p_informe;
delimiter ||
create procedure p_informe()
begin
	select id, nombre as 'Producto de precio máximo', precio from productos order by f_ranking_por_precio(id) limit 1;
    select id, nombre as 'Producto de coste mínimo', coste from productos order by f_ranking_por_coste(id) desc limit 1;
    select id, nombre as 'Prodcuto de beneficio máximo', precio-coste from productos order by f_ranking_por_beneficio(id) limit 1;
end||
delimiter ;

call p_informe();
    