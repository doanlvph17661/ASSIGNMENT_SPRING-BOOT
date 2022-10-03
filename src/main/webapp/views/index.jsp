<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
body {
	background-image: url(/Assignment/image/theming_hhg_v2.jpeg);
	background-attachment: fixed;
	background-repeat: no-repeat;
	background-size: 100%;
}

* {
	box-sizing: border-box;
}

.row::after {
	content: "";
	clear: both;
	display: table;
}

[class*="col-"] {
	float: left;
	padding: 15px;
}

/* For mobile phones: */
[class*="col-"] {
	width: 100%;
}

@media only screen and (min-width: 600px) {
	/* For tablets: */
	.col-s-1 {
		width: 8.33%;
	}
	.col-s-2 {
		width: 16.66%;
	}
	.col-s-3 {
		width: 25%;
	}
	.col-s-4 {
		width: 33.33%;
	}
	.col-s-5 {
		width: 41.66%;
	}
	.col-s-6 {
		width: 50%;
	}
	.col-s-7 {
		width: 58.33%;
	}
	.col-s-8 {
		width: 66.66%;
	}
	.col-s-9 {
		width: 75%;
	}
	.col-s-10 {
		width: 83.33%;
	}
	.col-s-11 {
		width: 91.66%;
	}
	.col-s-12 {
		width: 100%;
	}
}

@media only screen and (min-width: 768px) {
	/* For desktop: */
	.col-1 {
		width: 8.33%;
	}
	.col-2 {
		width: 16.66%;
	}
	.col-3 {
		width: 25%;
	}
	.col-4 {
		width: 33.33%;
	}
	.col-5 {
		width: 41.66%;
	}
	.col-6 {
		width: 50%;
	}
	.col-7 {
		width: 58.33%;
	}
	.col-8 {
		width: 66.66%;
	}
	.col-9 {
		width: 75%;
	}
	.col-10 {
		width: 83.33%;
	}
	.col-11 {
		width: 91.66%;
	}
	.col-12 {
		width: 100%;
	}
}
</style>
<div class="container">
	<div class="row">
		<div class="col-1"></div>
		<div class="col-10  bg-light" style="margin-top: 75px;">
			<div class="row">
				<div id="carouselExampleFade"
					class="carousel slide carousel-fade mt-3" data-bs-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img
								src="/Assignment/image/8c96d2d2c0bff0404c1c3d7d964ba893-2765060028792350729.jpg"
								class="d-block w-100 rounded" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/Assignment/image/8f217cb7c403bd658c049e27c9c63569-2765649514302639582.png"
								class="d-block w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/Assignment/image/9410e858c11f20da1692377acdaa1763-2765651033707361710.jpg"
								class="d-block w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/Assignment/image/79024f5d9bc6cf5dd303eee4bc978fd1-2764932677869201420.png"
								class="d-block w-100" alt="...">
						</div>
						<div class="carousel-item">
							<img
								src="/Assignmet/image/67f6e0093db9ef6d00d1bd481be96b56-2767096055346483466.jpg"
								class="d-block w-100" alt="...">
						</div>
					</div>
					<button class="carousel-control-prev" type="button"
						data-bs-target="#carouselExampleFade" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button"
						data-bs-target="#carouselExampleFade" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Next</span>
					</button>
				</div>
			</div>
			<div class="row">
				<div class=" col-2 col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image.png" style="height: 40px;">
					<p>Đại hội đại hạ giá</p>
				</div>
				<div class="col-2  col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image (1).png"
						style="height: 40px;">
					<p>Ví bán hàng</p>
				</div>
				<div class="col-2 col-2  col-s-3 col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image (2).png"
						style="height: 40px;">
					<p>Đăng tin cho tặng</p>
				</div>
				<div class="col-2   col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image.webp"
						style="height: 40px;">
					<p>Nạp đồng tốt</p>
				</div>
				<div class="col-2  col-s-3  col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image (1).webp"
						style="height: 40px;">
					<p>Chợ tốt ưu đãi</p>
				</div>
				<div class="col-2 col-s-3 mt-2 text-center">
					<img alt="" src="/Assignment/image/image (2).webp"
						style="height: 40px;">
					<p>Tin đăng đã lưu</p>
				</div>
			</div>

		</div>
		<div class="col-1"></div>
	</div>

	<div class="row mt-4">
		<div class="col-1"></div>
		<div class="col-10  bg-light">
			<h4 class="mt-2 text-center fw-bold text-warning">KHÁM PHÁ DANH
				MỤC</h4>
			<div class="row">
				<c:forEach items="${product}" var="cate">
					<div class="col-2 mt-2 text-center">
						<img class="" src="/Assignment/image/image (3).png"
							style="height: 40px;"> <a
							href="/Assignmet/index?id=${cate.id}" class="fs-6 "
							style="text-decoration: none">${cate.name}</a>
					</div>
				</c:forEach>
			</div>
		</div>
		<div class="col-1"></div>
	</div>

	<div class="row mt-4">
		<div class="col-1"></div>
		<div class="col-10  bg-light">
			<h5 class="mt-2 fs-4 fw-bold text-warning text-center">SẢN PHẨM</h5>
			<div class="row">
				<c:forEach items="${product}" var="cate">
					<div class="col-3 col-s-6 danhmuc mt-2 ">
						<div class="card border border-warning">
							<div class="card-header text-center bg-white">
								<img class="" src="/Assignment/storage/${cate.image} "
									style="height: 210px; width: 150px">
							</div>
							<div class="card-body">
								<a href="/Assignment/detail/id=${cate.id}" class="fs-5 fw-bold"
									style="text-decoration: none">${cate.name}</a>
								<p class="text-danger">Đơn giá: ${cate.price} VND</p>
								<div class="row">
									<div class="col-5">
										<a class="btn btn-primary"
											href="/Assignment/detail/${cate.id}">Xem</a>
									</div>
									<div class="col-7">
										<!-- Button trigger modal -->
										<button type="button" class="btn btn-primary"
											data-bs-toggle="modal" data-bs-target="#exampleModal${cate.id}">
											Mua</button>

										<!-- Modal -->
										<div class="modal fade" id="exampleModal${cate.id}" tabindex="-1"
											aria-labelledby="exampleModalLabel" aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<h5 class="modal-title" id="exampleModalLabel">Modal
															title</h5>
														<button type="button" class="btn-close"
															data-bs-dismiss="modal" aria-label="Close"></button>
													</div>
													<div class="modal-body">
														<form action="/Assignment/order1/${cate.price }/${cate.id}">
															<div class="form-group">
																<label>Họ tên</label> <input class="form-control"
																	value="${account.fullname }" name="name" />

															</div>
															<div class="form-group">
																<label>SĐT</label> <input class="form-control" value="${account.sdt }" name="sdt"/>
															</div>
															<div class="form-group">
																<label>Địa chỉ</label> <input class="form-control" value="${account.address }" name="address" />
															</div>
															
															<div class="form-group">
															<label>Số lượng</label>
															
															<input type="number" name="quantity" class="form-control" value="1" min="1" >
															</div>
															<div class="form-group">
															<button class="btn btn-secondary mt-2" type="button" data-bs-dismiss="modal">Đóng</button>
															<button class="btn btn-primary mt-2">Đặt hàng</button>
															</div>
														</form>
													</div>
												
												</div>
											</div>
										</div>

									</div>

								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<div class="col-1"></div>
	</div>

</div>