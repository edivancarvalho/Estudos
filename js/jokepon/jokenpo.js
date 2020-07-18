/**
 * JS - Aula12: Jokenpô
 * @author Edivan carvalho
 */

function jogar() {
    if(document.getElementById("pedra").checked == false && document.getElementById("papel").checked == false && document.getElementById("tesoura").checked == false) {
        alert("Selecione um opção");
    } else {
        // lógica principal
    }
}

function resetar() {
    document.getElementById("pc").src="pc.png";
    document.getElementById("placar").innerHTML="";

}
