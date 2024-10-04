import LoginPage from "./page_objects/loginPage";
import SearchPage from "./page_objects/searchPage";
import CartPage from "./page_objects/cartPage";
import CheckoutPage from  "./page_objects/checkoutPage";
import AddressBookPage from "./page_objects/addressBookPage";



   describe('Tutorialsninja', () => {
    const loginPage = new LoginPage();
    const searchPage = new SearchPage();
    const cartPage = new CartPage();
    const checkoutPage = new CheckoutPage();
    const addressBookPage = new AddressBookPage();
    
    
    it('should search and add product to cart', () => {
        loginPage.Enterurl();

        loginPage.login();
        searchPage.searchProduct('iPhone');
        searchPage.addToCart();
        cartPage.goToCart();
        cartPage.proceedToCheckout();
        checkoutPage.completeCheckout();
        addressBookPage.goToAddressBook();
        addressBookPage.editAddress();
        addressBookPage.updateAddress('John', 'Doe', 'New Company', '123 Street', 'Apt 4', 'New City', '10001', 'United States', 'New York');
        
    });
    
        
        

        
    });
