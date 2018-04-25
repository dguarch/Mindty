document.getElementById('btn_form').addEventListener('click', function(){
         
    let form_code = document.getElementById('code_modulo');
    let name_modulo = document.getElementById('nombre_modulo');
        
        if (!form_code.checkValidity()) {
            document.getElementById("error").innerHTML = 'datos incorrectos'
            document.getElementById('ok').innerHTML ='';
        }else { 
            document.getElementById('ok').innerHTML ='<img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
            document.getElementById("error").innerHTML ='';
        }


        


    })







   //            <img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">                 //

   

