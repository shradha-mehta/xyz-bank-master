package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositLink = By.xpath("//button[contains(text(),'Deposit')]");
    By amountToBeDepositedLink = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@class='btn btn-default']");
    By getTextDepositSuccessful = By.xpath("//span[@class='error ng-binding']");
    By amountToBeWithdrawn = By.xpath("//input[@placeholder='amount']");
    By withdraw = By.xpath("//button[@class='btn btn-default']");
    By getTransactionText = By.xpath("//span[@class='error ng-binding']");
    By withdrawalLink = By.xpath("//button[contains(text(),'Withdrawl')]");



    public void clickOnDepositButton() {
        clickOnElement(depositLink);
    }

    public void enterAmountToDeposit(String amount) {

        sendTextToElement(amountToBeDepositedLink, amount);
    }

    public void clickDepositFeature() {
        clickOnElement(depositButton);
    }

    public String getTextDepositSuccessfulMessage() {
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithdrawal() {
        clickOnElement(withdrawalLink);
    }

    public void clickOnAmountWithdrawalButton(String withAmount) {

        sendTextToElement(amountToBeWithdrawn, withAmount);
    }

    public void clickOnWithdrawFeature() {
        clickOnElement(withdraw);
    }

    public String getTextTransaction() {
        return getTextFromElement(getTransactionText);
    }

}