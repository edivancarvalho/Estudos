#!/bin/bash
# 
OLA="Olá Brasil"
echo "Olá, Mundo!"
fim=$(echo "---- Fim do comando ----")
#--- Modelos de comentario;
echo "Edivan"
:<<'terminal'
echo "isso é"
echo " um modelo"
echo " de comentario"
terminal
echo "Carvalho"
echo $OLA

echo "Total de comandos executados: "$#
echo $fim

echo t{r,igr,rist}es

# ----- Criando array

mundo=("Shell Script" "Bash" " GNU" "Linux" "Debian")
echo $mundo
echo ${mundo[4]}
mundo[0]="Nada"
echo $mundo
# Conta quantos array tem a variavel mundo;
echo ${#mundo[@]}
# Mostra todos os array
echo ${mundo[*]}
# mostra um a parti do 1 array
echo ${mundo[@]:1}
# mostra um a parti do 1 array ate 3
echo ${mundo[@]:1:3}
echo "----------- saiba mais em:"
echo "http://terminalroot.com.br/2015/08/45-exemplos-de-variaveis-e-arrays-em_19.html"
