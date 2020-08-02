#!/bin/bash
# Script para aprender shell
#source inicio.sh

# criar diretorio com os seguintes nomes rc0.d rc1.d ...4
# usando laço de repetição 'FOR'
: <<'comando1'
for runlevel in 0 1 2 3 4; do
    mkdir rc${runlevel}.d
    echo $runlevel
done
comando1
echo

: <<'comando2'
_Input_String="Olá"
while [[ "$_Input_String" != "tchau" ]]; do
    echo "Você deseja fica aqui ?"
    read _Input_String

    if [[ $_Input_String == 'tchau' ]]; then
        echo "você disse Tchau"
    else
        echo "você ainda deseja ficar aqui? "
    fi

done
comando2

_Input_String="Olá"
while :; do
    echo "Você deseja fica aqui ?"
    read _Input_String

    if [[ $_Input_String != 'tchau' ]]; then
        continue
    else
    # a diferença do 'break' para o 'exit 0'
        break # exibe os comando apos o "done"
        #exit 0 # finalizar a sessão aqui e não continua;
    fi
done
echo "FIM"
