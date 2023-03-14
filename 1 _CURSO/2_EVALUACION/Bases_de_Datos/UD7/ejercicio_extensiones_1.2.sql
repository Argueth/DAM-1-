drop procedure if exists p_ranking_por_precio;
delimiter ||
create procedure p_ranking_por_precio(in nombre_producto varchar(50))
begin
	case
		when 1 < (select count(*) from productos where nombre = nombre_producto) then select 'ERROR. Hay más de un producto con ese nombre.' as 'ERROR';
        when 1 > (select count(*) from productos where nombre = nombre_producto) then select 'ERROR. No hay ningún producto con ese nombre.' as 'ERROR';
        when 1 = (select count(*) from productos where nombre = nombre_producto) then
			select nombre_producto as producto, count(*)+1 as posicion_por_precio from productos where 
				precio > (select precio from productos where nombre = nombre_producto and id = id_producto);
	end case;
end||
delimiter ;

call p_ranking_por_precio('Moras');

select * from productos;

select 'gilipollas' as 'subnormal';

	