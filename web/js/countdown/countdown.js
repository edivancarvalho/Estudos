/**
 * JS - Aula10: Countdown
 * @author Edivan Carvalho
 */

var check = false;

function xequeMate() {
    if (check == false) {
        var timer1 = setInterval(function(){start()}, 1000);
        var timer2 = setInterval(function(){end()}, 13200);
        var count = 10;
        // executar um determinado tempo
        function start() {
            soundBeep();
            // trocando um conteudo;
            document.getElementById("time").innerHTML = count;
            if (count == 0){
                clearInterval(timer1);
                soundThunder();
                document.getElementById("fire").src = "explosion.gif";
                document.getElementById("time").innerHTML = "GAME OVER";
            }
            count --;
        }
        check = true;
    }

}

function soundThunder() {
    var beep = new Audio();
    beep.src = "Thunder_Crack.mp3";
    beep.play();
    check = true;
}

function soundBeep() {
    // elemento audio
    var beep = new Audio();
    beep.src = "Beep_Short.mp3";
    beep.play();
    check = true;
}

function end(){
    document.getElementById("fire").src = "clean.png";
}
