/*document.getElementById('btn_form').addEventListener('click', function (event) {
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

});  */

    //            <img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">                 //


   $('#btn_form').click(function (evnt) {
       // evnt.preventDefault();
       // let form_data = ValFormulario();
	   
       // if (form_data.vall) {
            enviarDatos(form_data.data)
        //}
    });




/*     función  validar */ 

let ValFormulario = function () {
    $('form .estamal').remove();
    let datos_envio = {};
    let formulario_correcto = true;
    $('form div input').each(function () {
        if (this.checkValidity()) {
            datos_envio[this.name] = this.value;
            $(this).before('<div class="estamal"> <img id="check" src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico" alt="ok"></div>');
        } else {
            $(this).before('<div class="estamal">¡¡Error!! Datos no válidos. </div>');
            formulario_correcto = false;/* no fun*/
        }
    })
    return { vall: formulario_correcto, data: datos_envio };
}



let enviarDatos = function (datos_envio) {
	
	let formdata = $('#form_data').serialize();

    $.ajax({
        // url: 'http://www.mocky.io/v2/5ae1d9932d000047009d7ef9asasas',  // SERVER WRONG
        //url: 'http://www.mocky.io/v2/5ad78aa33000004b00e584d0', // URL FALSE
        url: './profesor',  // SERVER OK  
        
        method: 'POST',
        accepts:"application/json",
        data: formdata
        
        
    })
        .done(function (responde_data) {
            console.log('recibido',responde_data);
            if (responde_data) {
                $('#ok').append(`<p>AJAX FUNCIONA!!!!!!!!</p>`);
            } else {
                $('#ok').html('Ha habido un error de conexión, inténtalo en unos minutos');
            }
            $('#ok').addClass('show');
        })
        .fail(function (err) {
            $('#ok').html('Ha habido un error de conexión, inténtalo en unos minutos.');
            $('#ok').addClass('show');
        });
}















    // ==================================================!!!FORM VALIDATION PROFESSOR!!!!==========================================================================================






    document.getElementById('btn_form').onclick = (function(){
        localStorage.setItem('professor', [document.getElementById('code_modulo').value, document.getElementById('nombre_modulo').value]);
    });
    
    // ==================================================!!!!!!!!!API LOCAL STORAGE PROFESSOR!!!!!!!==========================================================//







   /* let getFormData = function () {
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
        let form_code = document.getElementById('code_modulo').value;
        let data_to_send2 = JSON.stringify(form_code);
        console.log('enviando....', data_to_send);
    
        $.ajax({
            url: 'http://www.mocky.io/v2/5ae0e6ff3200007600510d6a',
            
            method: 'POST',
            data: data_to_send, data_to_send2
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
    
    });*/