(function($) {

$("select[name='type']").change( function() 
{  
      var valeurSelectionne=alert($("select[name='type'] > option:selected").val());
      if(valeurSelectionne.equals("livre")){
                $("#artiste").prop(disabled, true);
                $("#realisateur").prop(disabled, true);


			}
			else if (valeurSelectionne.equals("cd")) {
				$("#livre").prop(disabled, true);
                $("#realisateur").prop(disabled, true);



			} else {

               $("#artiste").prop(disabled, true);
                $("#livre").prop(disabled, true);


			}
});

});