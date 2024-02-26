
/* pega a classe hamburger é nav do html  */
const hamburger = document.querySelector(".hamburger");
const nav = document.querySelector(".nav");
const SingIn = document.querySelector(".Sing-in");



/* Adiciona um evento que uando se clica em cima do objeto ele adiciona uma classe 'active' 
o toggle tira a classe 'active' se o objeto for pecionado novamente */
hamburger.addEventListener("click", () => nav.classList.toggle("active") );

SingIn.addEventListener("submit", () => enviarRequisicao("emailValue", "passwordValue") );







document.getElementById("Sing-in").addEventListener('click', function (event) {
  event.preventDefault();

  const emailValue = document.getElementById('Email').value;
  const passwordValue = document.getElementById('Password').value;

  if (emailValue && passwordValue) {
      enviarRequisicao(emailValue, passwordValue);
  } else {
      console.log('Por favor, preencha todos os campos.');
  }
});


// url com a requisição
function enviarRequisicao(email, password) {
    const url = "http://localhost:8080/users/login";

    fetch(url, {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            // Adicione outros cabeçalhos se necessário
        },
        // Adicione o corpo da requisição se necessário
        method: 'POST',
        body: JSON.stringify({
            email: email,
            password: password
        })
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);

        if(data.password){
            localStorage.setItem("dados", JSON.stringify(data));

            window.location.href = "profile";
        }
        else{
            console.log('Erro no login:', data.error);
        }
    })

    .catch(error => console.error('Erro:', error));
}





