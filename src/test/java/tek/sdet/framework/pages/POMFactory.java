package tek.sdet.framework.pages;


	import tek.sdet.framework.base.BaseSetup;
// every time after homeSteps and RetailSingInPage you need to come here and create a constructor and a methode for them and follow the bellow Steps.
	// Capstone
	
	public class POMFactory extends BaseSetup {

		private RetailHomePage homePage;
		private RetailSignInPage signInPage;
		private RetailAccountPage accountpage;
		private RetailOrderPage orderpage;

		public POMFactory() {
			this.homePage = new RetailHomePage();
			this.signInPage = new RetailSignInPage();
			this.accountpage = new RetailAccountPage();
			this.orderpage = new RetailOrderPage();
		}

		public RetailHomePage homePage() {
			return this.homePage;

		}

		public RetailSignInPage signInPage() {
			return this.signInPage;
			
		}
		
		public RetailAccountPage accountpage() {
			return this.accountpage;
		}
		 
		public RetailOrderPage orderpage(){
			return this.orderpage;
			
		}

	}

