-- procedimiento para ver is un número es par o impar
drop procedure if exists pareando;
delimiter ||
create procedure pareando (in num int)
begin
	if mod(num, 2) = 0 then
		set @comoes = 'par';
    else
		set @comoes = 'impar';
	end if;
    select @comoes as 'par o impar';
end||
delimiter ;

call pareando(15);

-- Lo mismo pero con en forma de función
drop function if exists pareando;
delimiter ||
create function pareando (num int)
returns varchar(20)
deterministic
begin
declare comoes varchar(20);
	if mod(num, 2) = 0 then
		set comoes = 'par';
    else
		set comoes = 'impar';
	end if;
    return comoes;
end||
delimiter ;

select pareando(20);

-- función para ver si una nora es insuficiente, suficiente, bien, notable o sobresaliente
drop function if exists nota;
delimiter ||
create function nota (nota_num int)
returns varchar(20)
deterministic
begin
	declare nota_texto varchar(20);
    case
		when nota_num between 0 and 4 then set nota_texto = 'insuficiente';
        when nota_num = 5 then set nota_texto = 'suficiente';
        when nota_num = 6 then set nota_texto = 'bien';
        when nota_num between 7 and 8 then set nota_texto = 'notable';
        when nota_num between 9 and 10 then set nota_texto = 'sobresaliente';
        else set nota_texto = 'nota no válida';
	end case;
    return nota_texto;
end||
delimiter ;

set @a = 8;
select nota(@a);

-- Lo mismo pero en forma de procedimiento
drop procedure if exists nota;
delimiter ||
create procedure nota (in nota_num int)
begin
	case
		when nota_num between 0 and 4 then set @nota_texto = 'insuficiente';
        when nota_num = 5 then set @nota_texto = 'suficiente';
        when nota_num = 6 then set @nota_texto = 'bien';
        when nota_num between 7 and 8 then set @nota_texto = 'notable';
        when nota_num between 9 and 10 then set @nota_texto = 'sobresaliente';
        else set @nota_texto = 'nota no válida';
	end case;
select @nota_texto as calificación;
end||
delimiter ;

call nota(10);

-- Procedimiento para mostrar por pantalla los numeros de 1 a n siendo n un número introducido por el usuario
drop procedure if exists numeros;
delimiter ||
create procedure numeros (in n int)
begin
	set @temp = 1;
    while @temp <= n do
        select @temp as valor;
        set @temp = @temp + 1;
	end while;
end||
delimiter ;

call numeros(10);

-- Lo mismo pero con una función
drop function if exists numeros;
delimiter ||
create function numeros (n int)
returns varchar(1000)
deterministic
begin
	declare temp int default 1;
    declare resultado varchar(1000) default ' ';
    while temp <= n do
		set resultado = concat(resultado, temp, ' ');
        set temp = temp + 1;
	end while;
    return resultado;
end||
delimiter ;

select numeros(10) as secuencia;

-- Procedimiento que muestra los números impares entre el 1 y un numero introducido por el usuario de un modo direfente a como se hace en los apuntes.
drop procedure if exists impares;
delimiter ||
create procedure impares (in n int)
begin
	declare init int default 1;
    while init <=n do
		if mod(init,2)<>0 then
			select init;
            set init = init + 1;
		else
			set init = init + 1;
        end if;
        set init = init + 1;
	end while;
end||
delimiter ;

call impares(9);

-- Lo mismo pero como una función
drop function if exists impares;
delimiter ||
create function impares (n int)
returns varchar(1000)
deterministic
begin
	declare init int default 1;
    declare resultado varchar(1000) default ' ';
    while init <= n do
		if mod(init, 2) <> 0 then
			set resultado = concat(resultado, init, ' ');
            set init = init + 1;
		else 
			set init = init + 1;
		end if;
	end while;
    return resultado;
end||
delimiter ;

select impares(9);
			
