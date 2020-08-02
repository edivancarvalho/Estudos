#!/bin/bash
# Script para aprender shell
#source inicio.sh

: <<'comentario01'
MinhaFuncao() {
    VARIAVEL=$1
    if test "$VARIAVEL" -gt 10; then
        echo "é maior que 10"
    elif test "$VARIAVEL" -eq 10; then
        echo "é igual a 10"
    else
        echo "é menor que 10"
    fi
}

MinhaFuncao $1
comentario01

# mudando a funcao 'test' para [ ]  ficando da seguinte forma
MinhaFuncao1() {
    VARIAVEL=$1
    if [ "$VARIAVEL" -gt 10 ]; then
        echo "é maior que 10"
    elif [ "$VARIAVEL" -eq 10 ]; then
        echo "é igual a 10"
    else
        echo "é menor que 10"
    fi
}

MinhaFuncao1 $1

#---- usando o swich case;
FuncaoCase() {
    case $1 in
    10) echo "é 10" ;;
    9) echo "é 9" ;;
    7 | 8) echo "é 7 ou 8" ;;
    *) echo "é menor que 6 ou maior que 10" ;;
    esac
}
FuncaoCase $1
