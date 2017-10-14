<div class="container">
	<div class="row">
		<!-- would be display sidebar -->
		<div class="col-md-3">

			<%@include file="./share/sidevar.jsp"%>

		</div>
		<!-- to dispaly the actual products -->
		<div class="col-md-9">

			<!--Added breadcrumb component  -->
			<div class="row">
				<div class="col-lg-12">


					<c:if test="${userClickAllProducts==true}">

						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					<table id="productListTable"
						class="table table-striped table-borderd">

						<thead>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>price</th>
								<th>quantity-Available</th>
								<th></th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>price</th>
								<th>quantity-Available</th>
								<th></th>
							</tr>
						</tfoot>


					</table>
				</div>
			</div>





		</div>

	</div>

</div>