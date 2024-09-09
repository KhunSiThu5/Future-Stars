const sidebarToggle = document.querySelector("#sidebar-toggle");
sidebarToggle.addEventListener("click",function(){
    document.querySelector("#sidebar").classList.toggle("collapsed");
});

// document.querySelector(".theme-toggle").addEventListener("click",() => {
//     toggleLocalStorage();
//     toggleRootClass();
// });

function toggleRootClass(){
    const current = document.documentElement.getAttribute('data-bs-theme');
    const inverted = current == 'dark' ? 'light' : 'dark';
    document.documentElement.setAttribute('data-bs-theme',inverted);
}

function toggleLocalStorage(){
    if(isLight()){
        localStorage.removeItem("light");
    }else{
        localStorage.setItem("light","set");
    }
}

function isLight(){
    return localStorage.getItem("light");
}

if(isLight()){
    toggleRootClass();
}


const link = document.querySelectorAll(".links");


let linkClick = localStorage.getItem("linkClicked");

if(linkClick!=null)
    { 
        link[linkClick].style.color = "#ff7b00";
    }

for(let i=0; i<link.length; i++)
{
    link[i].addEventListener("click", ()=> {
        link.forEach((e)=>{
            e.style.color = "";
        })

        link[i].style.color = "#ff7b00";
        localStorage.setItem("linkClicked", i);
    })
}

function n ()
{
    for(let i=0; i<link.length; i++)
        {
            link[i].addEventListener("click", ()=> {
                link.forEach((e)=>{
                    e.style.color = "";
                })
        
                link[i].style.color = "#ff7b00";
                localStorage.setItem("linkClicked", i);

            })
        }
}