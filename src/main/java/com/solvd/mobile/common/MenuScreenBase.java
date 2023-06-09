package com.solvd.mobile.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends AbstractPage {
    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }
    public abstract AboutAppScreenBase clickOnAboutButton();
    public abstract QRCodeScreenBase clickOnQRCodeButton();
    public abstract GeoLocationScreenBase clickOnGeoLocationButton();
    public abstract BiometricAlertScreenBase clickOnFingerPrintButton();
    public abstract WebViewScreenBase clickOnWebViewButton();
    public abstract DrawingScreenBase clickOnDrawingButton();
    public abstract ResetAppScreenBase clickOnResetAppButton();
    public abstract LoginScreenBase clickOnLoginButton();
    public abstract FaceIdScreenBase clickOnFaceIDButton();
    public abstract LoginScreenBase clickOnLogout();
}
