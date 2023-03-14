drop procedure if exists p_blackFriday;
delimiter ||
create procedure p_blackFriday (in onoff varchar(3))
begin
	if onoff = 'on' then
		update gaming set precio_copia = precio, precio = precio*1.15, estado = 'en oferta' where estado = 'disponible';
        select nombre, precio, precio_copia as nuevo_precio, estado from gaming where estado = 'en oferta';
	end if;
    if onoff = 'off' then
		update gaming set precio = precio_copia, estado = 'disponible' where estado = 'en oferta';
        select nombre, precio, estado from gaming where estado = 'disponible';
	end if;
end||
delimiter ;

call p_blackFriday("off");

show create table gaming;

-- Para desactivar el modo seguro de mysql
set sql_safe_updates = 0;
-- Para volver a activarlo
set sql_safe_updates = 1;