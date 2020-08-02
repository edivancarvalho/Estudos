#!/bin/bash

while true; do
    distros=$(
        dialog --stdout --title "Escola sua distro" --menu "Qual sua distro preferida? " 0 0 0 \
            1 "Debian" \
            2 "red Hat" \
            3 "Getoo" \
            4 "Slackware" \
            5 "fedora" \
            0 "Sair"
    )
    [ $? -ne 0 ] && echo "Cancelou ou apertou ESC. " && break

    case "$distros" in
    1)
        dialog --stdout --msgbox "Essa é a Melhor distro! :)" 5 30
        break
        ;;
    2)
        dialog --title 'Red Hat' --infobox 'Ela agora e ENTREPRISE. :)' 5 30
        break
        ;;
    3)
        dialog --title 'Getoo' --msgbox 'Voce e PSCOPATA!' 5 25
        break
        ;;
    4)
        dialog --title 'Slackware' --yesno 'Você e doido? ' 5 60

        if [ $? = 0 ]; then
            dialog --title 'slackware doido' --infobox '\nsabia' 0 0
        else
            dialog --title 'slakware não é doido' --infobox 'legal' 0 0
        fi

        break
        ;;

    5)
        dialog --title 'fedora' --timebox '\nVou grava a hora que vc escolheu' 0 0
        break
        ;;
    0)
        echo "Voce escolheru sair"
        break
        ;;
    esac
done

#  0 0 6 = [altura] [largura] [qtdn_intens] , o ultimo n° pode ser 0, pois será automatico, mais tem de passar
# atenção para o uso das quebras de barra, se houver espaço depois, haverá erro.
#para cada escolha uma forma diferente
# [ #? -ne 0 ] && break, ESC ou cancelar dentro do loop
# em --timebox se a resposta dor aceuta e a hora não for passa apos os zeros ( 0 0 12 24 25), mostra a hora atual no botão aceitar,
# mesmo que passe a hora;