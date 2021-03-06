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
		if(menu=="Home") break;
		$('#listproduct').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}
	
	//code for Jquery dataTable
	//create a dataset 
	/*var products=[
		['1','ABC'],
		['2','CYX'],
		['3','PQR'],
		['4','MNO'],
		['5','WVB'],
		['6','CFG'],
		['7','HIK'],
		['8','LMP'],
	];*/
	var $table=$('#productListTable');
	//execute the below code only where we have this table
	if($table.length){
		//console.log('Inside the table!');
		var jsonUrl='';
		if(window.categoryId==''){
			jsonUrl=window.contextRoot+'/json/data/all/products';
		}else{
			jsonUrl=window.contextRoot+'/json/data/category/'+ window.categoryId+'/products';
		}
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Record','5 Record','10 Record','ALL']],
			pageLength:5,
			/*data:products*/
			ajax:{
				url:jsonUrl,
				dataSrc:''
			},
			columns:[
				{
					data:'code',
					mRender:function(data,type,row){
						return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>';
					}
				},
				
				{
					data:'name'
					
				},
				{
					data:'brand'
					
				},
				{
					data:'unitPrice',
					mRender:function(data,type,row){
						return '&#8377;'+data
					}
				},
				{
					data:'quantity'
					
				},
				{
					data:'id',
					bSortable:false,
					mRender:function(data,type,row){
						var str='';
						
						str+='<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
						str+='<a href="'+window.contextRoot+'/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
						
						return str;
					}
				}
				
			]
			
		});
	}
});