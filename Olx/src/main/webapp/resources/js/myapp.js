$(function() {

	switch (menu) {
	case 'about-us':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'All products':
		$('#listproduct').addClass('active');
		break;
	default:
		$('#listproduct').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
});