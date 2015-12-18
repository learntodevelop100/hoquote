<%@include file="../includes/taglib.jsp"%>

<div class="pageContent">
	<h4 class="pageHeading">Payment Details</h4>
	<div class="container" style="margin: 50px;">
		<div class="row">
			<!-- Billing Address -->
			<div class="col-xs-12 col-md-4 billingAddress">
				<div class="panel panel-default credit-card-box">
					<div class="panel-heading display-table">
						<div class="row display-tr">
							<h3 class="panel-title ">Billing Address</h3>
						</div>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="addressLine1">Address Line 1</label>
									<input type="text" class="form-control" name="addressLine1" autofocus />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-5 col-md-5">
								<div class="form-group">
									<label for="apartmentNo">
										<span class="hidden-xs">Apartment</span><span class="visible-xs-inline">APT</span>
										No
									</label> 
									<input type="tel" class="form-control" name="apartmentNo" />
								</div>
							</div>
							<div class="col-xs-5 col-md-7 pull-right">
								<div class="form-group">
									<label for="billingCity">City</label> 
									<input type="text" class="form-control" name="billingCity" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-6 col-md-6">
								<div class="form-group">
									<label for="billingState">State</label> 
									<input type="text" class="form-control" name="billingState" />
								</div>
							</div>
							<div class="col-xs-6 col-md-6 pull-right">
								<div class="form-group">
									<label for="billingZipcode">Zip Code</label> 
									<input type="text" class="form-control" name="billingZipcode" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Card Details -->
			<div class="col-xs-12 col-md-4 cardDetails">
				<div class="panel panel-default credit-card-box">
					<div class="panel-heading display-table">
						<div class="row display-tr">
							<h3 class="panel-title display-td">Payment Method</h3>
							<div class="display-td">
								<img class="img-responsive pull-right" src="http://i76.imgup.net/accepted_c22e0.png">
							</div>
						</div>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="cardNumber">CARD NUMBER</label>
									<div class="input-group">
										<input type="text" class="form-control" name="cardNumber" placeholder="Valid Card Number"
											autocomplete="cc-number" autofocus /> <span class="input-group-addon"><i
											class="fa fa-credit-card"></i></span>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-7 col-md-7">
								<div class="form-group">
									<label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span>
										DATE</label> <input type="tel" class="form-control" name="cardExpiry" placeholder="MM / YY" />
								</div>
							</div>
							<div class="col-xs-5 col-md-5 pull-right">
								<div class="form-group">
									<label for="cardCVC">CV CODE</label> <input type="tel" class="form-control" name="cardCVC" placeholder="CVC" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="form-group">
									<label for="paymentAmount">Amount</label> <input type="text" class="form-control" name="paymentAmount" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

