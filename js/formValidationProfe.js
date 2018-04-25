document.getElementById('btn_form').addEventListener('click', function (event) {
    event.preventDefault();


    let form_code = document.getElementById('code_modulo');
    let name_modulo = document.getElementById('nombre_modulo');

    if (!form_code.checkValidity() && !name_modulo.checkValidity()) {

        document.getElementById("error").innerHTML = 'datos incorrectos';
        document.getElementById('ok').innerHTML = '';
        document.getElementById("error1").innerHTML = 'datos incorrectos';
        document.getElementById('ok1').innerHTML = '';
    } else{
        document.getElementById('ok1').innerHTML = '<img id="check" src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
        document.getElementById("error1").innerHTML = '';
        document.getElementById('ok').innerHTML = '<img id="check" src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
        document.getElementById("error").innerHTML = '';
    }

});  

    //            <img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">                 //



    // ==================================================!!!FORM VALIDATION PROFESSOR!!!!==========================================================================================






    document.getElementById('btn_form').onclick = (function(){
        localStorage.setItem('professor', [document.getElementById('code_modulo').value, document.getElementById('nombre_modulo').value]);
    });
    
    // ==================================================!!!!!!!!!API LOCAL STORAGE PROFESSOR!!!!!!!==========================================================//







    let getFormData = function () {
        let data_to_send = {};
        let form_valid = true;
    
        $('form #error').remove();
    
        $('.form-inline input').each(function () {
            console.log(this.checkValidity())
            if (this.checkValidity()) {
                data_to_send[this.name] = this.value;
            } else {
                $(this).before('<div class="error">Error!!</div>');
                form_valid = false;
            }
        })
    
        console.log(data_to_send);
        return { valid: form_valid, data: data_to_send };
    }
    
    let enviarDatos = function (data_to_send) {
        console.log('enviando....', data_to_send);
    
        $.ajax({
            url: 'http://www.mocky.io/v2/5ae0e6ff3200007600510d6a',
            
            method: 'POST',
            data: data_to_send
        })
            .done(function (response_data) {
                console.log(response_data);
                //cuando hay exito
                if (response_data.result) {
                    location.href = '/';
                } else {
                    $('#error').html('Se ha producido un error');
                }
            })
            .fail(function (err) {
                //cuando hay error
                $('#error').html('Error ');
            });
    
    }
    
    $('#btn_form').click(function (evnt) {
        evnt.preventDefault();
        let form_data = getFormData();
    
        if (form_data.valid) {
            enviarDatos(form_data.data);
        }
    
    });