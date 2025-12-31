
/*create table agendamento (
	id_agendamento int primary key not null auto_increment,
    data_entrada date not null,
    data_saida date 
);
*/
/*
create table paciente(
id_paciente int primary key auto_increment,
nome_paciente varchar(50) not null,
idade_paciente int,
cpf_paciente varchar(20),
email_paciente varchar(30),
numero_paciente varchar(20));

create table medico (
id_medico int primary key auto_increment,
nome_medico varchar(80) not null,
especializacao varchar(30),
cpf_medico varchar(30),
email_medico varchar(50),
numero_medico varchar(20) 
)
;
*/
/*
create table agendamento (
	id_agendamento int primary key not null auto_increment,
    data_entrada date not null,
    data_saida date not null,
    id_medico int,
    id_paciente int,
    constraint id_medico_agendamento foreign key (id_medico) references medico (id_medico),
    constraint id_paciente_agendamento foreign key (id_paciente) references paciente (id_paciente)
);
*/
select * from medico;
SELECT * FROM paciente;