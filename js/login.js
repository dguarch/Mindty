
/* 
let valida_form = function () {

    let _formValue = {};
    let _invalido = {}
    let _VVV = true;

    $('form .error').remove();

    $('input[name=usuario]').each(function () {

        let exp = /^([A-Z][a-z]{1}[a-zñáéíóú]+[\s]*)+$/;

        if (!exp.test(this.value)) $('input[name=usuario]').before('<div class="error">incorrecto!</div>') 
        _VVV = false; 
        ;

        _formValue[this.name] = this.value;
    });


    $('input[name=contaseña]').each(function () {

        let exp = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;

        if (!exp.test(this.value)) $('input[name=contaseña]').before('<div class="error">incorrecto!</div>');

        _formValue[this.name] = this.value;
    });
    console.log(_formValue);

    let enviarDatos = function (data_to_send) {
        console.log('Enviando.....', data_to_send)

        $.ajax({
            url: 'http://www.mocky.io/v2/5ad78b273000006600e584d4',
            method: 'POST',
            data: data_to_send
        })
            .done(function (data) {
                //location.href='/';
                //cuando hay exito
                if (data.result) {
                    location.href = './index.html';
                } else {
                    $('#enviado').html(`usuario o contraseña incorecta`);
                }
            })
            .fail(function (err) {
                //cuando hay error
                $('#mensajes').html(`oooooops.... ha habido un error....:-p`);
            })


    }
};



$('#bton').click(function (evnt) {
    evnt.preventDefault();
    let form_data = valida_form ();

    if (form_data.valid) {
        enviarDatos(form_data.data);
    }
});
 */
/* let validez = function () {
    let data_to_send = {};
    let form_valid = true;
    $('form .error').remove();
    $('form div input').each(function () {

        if (this.checkValidity()) { 
            data_to_send[this.name] = this.value;
        } else {
            $(this).before('<div class="error">Error!!</div>')
            form_valid = false;
        }
    })
    console.log(data_to_send)
    return { valid: form_valid, data: data_to_send };
}
let enviarDatos = function (data_to_send) {
    console.log('Enviando.....', data_to_send)

    $.ajax({
        url: 'http://www.mocky.io/v2/5ae0c3733200008800510d22',
        method: 'POST',
        data: data_to_send
    })
        .done(function (data) {
            //location.href='/';
            console.log(data);
            if (data.result) {
                location.href = '/';
            } else {
                $('#enviado').html(`email o contraseña incorecta`);
            }
        })
        .fail(function (err) {
            //cuando hay error
            $('#mensajes').html(`oooooops.... ha habido un error....:-p`);
        })


}

$('#bton').click(function (evnt) {
    evnt.preventDefault();
    let form_data = validez();

    if (form_data.valid) {
        enviarDatos(form_data.data);
    }

}); */

let getFormData = function () {
    let data_to_send = {};
    let form_valid = true;

    $('form .error').remove();

    $('form div input').each(function () {
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
        url: 'http://www.mocky.io/v2/5ad782bd3000005600e5849d',
        
        method: 'POST',
        data: data_to_send
    })
        .done(function (response_data) {
            console.log(response_data);
            //cuando hay exito
            if (response_data.result) {
                location.href = '/';
            } else {
                $('#mesajes').html('Email o contraseña incorrectas');
            }
        })
        .fail(function (err) {
            //cuando hay error
            $('#mesajes').html('Oooopss...ha habido un errorcito...:-p');
        });

}

$('#bton').click(function (evnt) {
    evnt.preventDefault();
    let form_data = getFormData();

    if (form_data.valid) {
        enviarDatos(form_data.data);
    }

});