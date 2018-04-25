


document.getElementById('btn_form').addEventListener('click', function(event){
    event.preventDefault();

         
    let form_code = document.getElementById('code_modulo');
    let name_modulo = document.getElementById('nombre_modulo');
        
        if (!form_code.checkValidity() && !name_modulo.checkValidity()) {
           
            document.getElementById("error").innerHTML = 'datos incorrectos';
            document.getElementById('ok').innerHTML ='';
            document.getElementById("error1").innerHTML = 'datos incorrectos';
            document.getElementById('ok1').innerHTML ='';
        }else {
            document.getElementById('ok1').innerHTML ='<img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
            document.getElementById("error1").innerHTML =''; 
            document.getElementById('ok').innerHTML ='<img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
            document.getElementById("error").innerHTML ='';
        }

    });    

    //            <img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">                 //



    // ==================================================!!!FORM VALIDATION PROFESSOR!!!!==========================================================================================
    
    
    
   
   
   
   
   
   
   
   

   

