drop procedure if exists p_nota;
delimiter ##
create procedure p_nota(in nota decimal(10,2))
begin
	case
		when nota < 5 then set @nota_texto = 'Insuficiente';
        when nota < 6 then set @nota_texto = 'Suficiente';
        when nota < 7 then set @nota_texto = 'Bien';
        when nota < 9 then set @nota_texto = 'Notable';
        when nota <= 10 then set @nota_texto = 'Sobresaliente';
        else set @nota_texto = 'Nota incorrecta';
	end case;
    select @nota_texto as calificación;
end##
delimiter ;

call p_nota(4.9);