function eliminar(id){
	Swal.fire({
	  title: 'Eliminar registro?',
	  text: "Esta seguro de eliminar el registro!",
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  confirmButtonText: 'SI, eliminar esto!'
	}).then((result) => {
	  if (result.isConfirmed) {
		$.ajax({
		  url: "/eliminar/"+id,
		}).done(function(res) {
		  console.log(res);
		});
	    Swal.fire(
	      'Eliminado!',
	      'El registro a sido eliminado.',
	      'success'
	    ).then((ok)=>{
			location.href="/listar";		
		})
	  }
	})
}