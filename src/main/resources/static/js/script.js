let role = document.getElementById("role");
let discipline = document.getElementById("discipline_container");

role.addEventListener("change", function(){
    toggleHide();
});

function toggleHide() {
    if(role.value == "teacher") {
        discipline.classList.remove("hide");
    } else{
        discipline.classList.add("hide");
    }

}