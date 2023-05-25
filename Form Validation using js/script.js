function validation() {

    var username = document.formBasic.username.value;
    var email = document.formBasic.email.value;
    var pass = document.formBasic.pass.value;
    var cpass = document.formBasic.cpass.value;

    if(username==""||email==""||pass==""||cpass==""){
        alert("Please enter the details");
    }
    else if(pass!=cpass){
        alert("The password is not matching");
    }
    else{
        alert("Thanks for registering!!");
    }
    
}