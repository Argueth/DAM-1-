drop function if exists partrue;
delimiter ||
create function partrue(n int)
returns boolean
deterministic
begin
	declare verdad boolean default false;
    if mod(n, 2)=0 then set verdad = true;
    end if;
	return verdad;
end||
delimiter ;

select partrue(6);


drop function if exists dias;
delimiter ||
create function dias(n int)
returns varchar(20)
deterministic
begin
	declare dia varchar(20) default ' ';
    case
		when n = 1 then set dia = 'Lunes';
        when n = 2 then set dia = 'Martes';
		when n = 3 then set dia = 'Miercoles';
        when n = 4 then set dia = 'Jueves';
        when n = 5 then set dia = 'Viernes';
        when n = 6 then set dia = 'Sábado';
        when n = 7 then set dia = 'Domingo';
        else set dia = 'Día incorrecto';
	end case;
    return dia;
end||
delimiter ;

select dias(10);


drop function if exists mayorque;
delimiter ||
create function mayorque (a int, b int, c int)
returns int
deterministic
begin
	declare mayor int default 0;
	if	a<b then set mayor = b;
    else set mayor = a;
    end if;
    if	mayor < c then set mayor = c;
    end if;
	return mayor;
end||
delimiter ;

select mayorque(5,2,9) as 'El mayor';


drop function if exists sintildes;
delimiter ||
create function sintildes(cadena varchar(255))
returns varchar(255)
deterministic
begin 
	declare resultado varchar(255) default ' ';
    declare caracter char(1);
    declare i int default 1;
    while i <= char_length(cadena) do
		set caracter = substring(cadena, i, 1);
	
		case caracter
			when 'á' then set resultado = concat(resultado, 'a');
			when 'é' then set resultado = concat(resultado, 'e');
			when 'í' then set resultado = concat(resultado, 'i');
			when 'ó' then set resultado = concat(resultado, 'o');
			when 'ú' then set resultado = concat(resultado, 'u');
			when 'Á' then set resultado = concat(resultado, 'A');
			when 'É' then set resultado = concat(resultado, 'E');
			when 'Í' then set resultado = concat(resultado, 'I');
			when 'Ó' then set resultado = concat(resultado, 'O');
			when 'Ú' then set resultado = concat(resultado, 'U');
            else set resultado = concat(resultado, caracter);
		end case;
        set i = i + 1;
	end while;
    return resultado;
end||
delimiter ;

select sintildes('Conduciendo un camión me volví loco un día') as 'Texto sin tildes';
    
    