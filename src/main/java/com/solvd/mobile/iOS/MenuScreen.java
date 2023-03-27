package com.solvd.mobile.iOS;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.solvd.mobile.common.*;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase{
    @ExtendedFindBy(iosPredicate = "name == \"QrCodeScanner-menu-item\"")
    private ExtendedWebElement qrCodeBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"About-menu-item\"`]")
    private ExtendedWebElement aboutButton;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"GeoLocation-menu-item\"`]")
    private ExtendedWebElement geoLocationBtn;
    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Webview-menu-item\"`]")
    private ExtendedWebElement webViewBtn;

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == \"Drawing-menu-item\"`]")
    private ExtendedWebElement drawingBtn;
    @ExtendedFindBy(iosPredicate = "name == \"ResetAppState-menu-item\"")
    private ExtendedWebElement resetAppBtn;

    public MenuScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public AboutAppScreenBase clickOnAboutButton() {
       aboutButton.click();
        return initPage(getDriver(), AboutAppScreenBase.class);
    }

    @Override
    public QRCodeScreenBase clickOnQRCodeButton() {
        qrCodeBtn.click();
        return initPage(getDriver(), QRCodeScreenBase.class);
    }

    @Override
    public GeoLocationScreenBase clickOnGeoLocationButton() {
        geoLocationBtn.click();
        return initPage(getDriver(), GeoLocationScreenBase.class);
    }

    @Override
    public BiometricAlertScreenBase clickOnFingerPrintButton() {
        return null;
    }
    
    @Override
    public WebViewScreenBase clickOnWebViewButton() {
        webViewBtn.click();
        return initPage(getDriver(), WebViewScreenBase.class);
    }

    @Override
    public DrawingScreenBase clickOnDrawingButton() {
        drawingBtn.click();
        return initPage(getDriver(), DrawingScreenBase.class);
    }

    @Override
    public ResetAppScreenBase clickOnResetAppButton() {
        resetAppBtn.click();
        return initPage(getDriver(), ResetAppScreenBase.class);
    }
}
