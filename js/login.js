$('#bton').click(function (evnt) {
evnt.preventDefault();


    let _formValue = {};
    let _formValueUsuario = {};
    let _formValueContraseña = {};

    let _invalido = {}

    $('form .error').remove();   

    $('input[name=usuario]').each(function () {

        let exp= /^([A-Z][a-z]{1}[a-zñáéíóú]+[\s]*)+$/;
        
        if(!exp.test(this.value)) $('input[name=usuario]').before('<div class="error">incorrecto!</div>' );
        
        _formValue[this.name] = this.value;
    });
    
      

    $('input[name=contaseña]').each(function () {

        let exp= /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;
       
        if(!exp.test(this.value)) $('input[name=contaseña]').before('<div class="error">incorrecto!</div>');

        _formValue[this.name] = this.value;
    });



    console.log(_formValue);
  




    });
   /*  $('input[name=usuario]').each(function () {
        _formValue[this.name] = this.value;
    }); */

   /*  console.log(_formValue); */

  /*   $('#entra').html(`
        <ul>
            <li>usuario: ${_formValue.usuario}</li>
            <li>Contraseña: ${_formValue.contraseña}</li>
            
        </ul>
    ` ); */
 