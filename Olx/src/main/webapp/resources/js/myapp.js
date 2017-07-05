$(function(){
	
	switch(menu){
	case 'about-us':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
		default:
			$('#Home').addClass('active');
		   break;
	}
});