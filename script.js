const umbrella = document.querySelector("#image");
const divForImage=document.querySelector('.umbrella');
// const maindiv=document.getElementsByClassName('container');
function yellowUmb() {
//   divForImage.innerHTML=`<img src="./image/Yello umbrella.png"/>`
 
    umbrella.src = "./image/Yello umbrella.png ";
}
function blueUmb() {
    // divForImage.innerHTML=`<img src="./image/Pink umbrella.png"/>`  
    umbrella.src = "./image/Pink umbrella.png ";
}
function pinkUmb() {
    // divForImage.innerHTML=`<img src="./image/Blue umbrella.png"/>`  
  umbrella.src = "./image/Blue umbrella.png ";
}

//  or we can also used addeventlisner on this function.
// this is for upload logo

const diplay = document.querySelector("#spanForLogo");
const input = document.querySelector("#inputBtn");
const lable=document.querySelector('#imageup');
input.addEventListener("change", () => {
  let reader = new FileReader();
  reader.readAsDataURL(input.files[0]);
//  lable.addEventListener('',function(){
  //  })
      lable.textContent=input.files[0].name;
      console.log(input.files[0].name);
 
  reader.addEventListener("load", () => {
    
    diplay.innerHTML = `<img src=${reader.result} alt=''/>`;
  });
});
