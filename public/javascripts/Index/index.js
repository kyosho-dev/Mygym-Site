const hamburger = document.querySelector(".hamburger");
const nav = document.querySelector(".nav");

const button6 = document.querySelector(".button6");
const button7 = document.querySelector(".button7");

const slide = document.querySelector(".boxSlide1Slide");

var cont = 1


/* Codigo do menu hamburger do celular  */

hamburger.addEventListener("click", () => nav.classList.toggle("active") );


/* Codigo do slide da lista  */

button6.addEventListener("click", () => antImg());

button7.addEventListener("click", () => proxImg());


function proxImg(){
    cont++

    if (cont > 3){
        cont = 1
    }

    if (cont == 1){
        slide.style.marginLeft = "0%";
    }

    if (cont == 2){
        slide.style.marginLeft = "-50%";   
    }

    if (cont == 3){
        slide.style.marginLeft = "-100%";
    }
}


function antImg(){
    cont--

    if (cont < 1){
        cont = 3
    }

    if (cont == 1){
        slide.style.marginLeft = "0%";
    }

    if (cont == 2){
        slide.style.marginLeft = "-50%";   
    }

    if (cont == 3){
        slide.style.marginLeft = "-100%";
    }
}


/* Codigo da lista do celular  */

$(document).ready(function(){
    $('.part3-1').slick({
      dots: true,
      infinite: true,
      speed: 300,
      slidesToShow: 1,
      slidesToScroll: 1,
    });
  });