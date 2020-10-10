-- DDL linguagem de definição de dados;
CREATE TABLE usuario (
    usu_id SERIAL PRIMARY KEY,
    usu_nome VARCHAR(100),
    usu_sobrenome VARCHAR(100),
    usu_telefone VARCHAR(20),
    usu_login VARCHAR(10),
    usu_senha VARCHAR(10),
    usu_perfil VARCHAR(20)
);
SELECT * FROM usuario;

CREATE TABLE tminiaturas(
    min_iden SERIAL PRIMARY KEY,
    min_modelo VARCHAR(70),
    min_ano INTEGER (5),
    min_observacoes VARCHAR(100),
    min_edicao VARCHAR(100),
    min_escala VARCHAR(20),
    min_valor DECIMAL(10,2),
    min_fab_iden INTEGER NOT NULL,
    min_tmin_iden INTEGER NOT NULL,
    min_tem_iden INTEGER NOT NULL,
    min_fot_iden INTEGER NOT NULL,

    -- criando chave estrageira 
    FOREIGN KEY (min_fab_ide) REFERENCES fabricantes(fab_iden),
    FOREIGN KEY (min_tmin_iden) REFERENCES tipo_miniaturas(fab_iden),
    FOREIGN KEY (min_tem_iden) REFERENCES temas(fab_iden),
    FOREIGN KEY (min_fot_iden) REFERENCES fotos(fab_iden)
)

    


  