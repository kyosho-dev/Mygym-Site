const dadosArmazenados = localStorage.getItem("dados");
const dados = JSON.parse(dadosArmazenados);

if (dadosArmazenados) {
    console.log(dados.password, dados.username);
    console.log(dados);
    changeText()
}


function changeText() {
    document.getElementById("text1").innerHTML = "Seja bem vindo " + dados.username;
    document.getElementById("text2").innerHTML = "O seu plano atual é de " + dados.plan;
    document.getElementById("text3").innerHTML = "O seu instrutor é " + dados.instructor;
}

