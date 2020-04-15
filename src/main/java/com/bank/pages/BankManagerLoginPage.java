package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerLink = By.xpath("//button[contains(text(),'Add Customer')]");
    By clickOnCustomerFeature = By.xpath("//button[contains(text(),'Customers')]");
    By searchCustomer = By.xpath("//input[@placeholder='Search Customer']");
    By enterCustomer = By.xpath("//input[@placeholder='Search Customer']");
    By deleteCustomer = By.xpath("//button[contains(text(),'Delete')]");

    public void clickOnAddCustomerFeature() {
        clickOnElement(addCustomerLink);
    }public void clickOnCustomerButton(){
        clickOnElement(clickOnCustomerFeature);
    }public void clickOnSearchCustomer(){
        clickOnElement(searchCustomer);
    }public void enterCustomerName(String customerName){
        sendTextToElement(enterCustomer,customerName );
    }public void ClickToDeleteCustomer(){
        clickOnElement(deleteCustomer);
    }
}