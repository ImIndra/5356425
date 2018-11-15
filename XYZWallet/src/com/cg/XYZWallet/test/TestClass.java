package com.cg.XYZWallet.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cg.XYZWallet.exception.WalletException;
import com.cg.XYZWallet.service.WalletService;
import com.cg.XYZWallet.service.WalletServiceImpl;

public class TestClass {

	@Test(expected=WalletException.class)
    public void test_ValidateName_null() throws WalletException{
        WalletService walletSer=new WalletServiceImpl();
        walletSer.validateName(null);
    }
    
    @Test
    public void test_validateName_v1() throws WalletException{
    
        String name="Abhi121";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(false,result);
    }
    @Test
    public void test_validateName_v2() throws WalletException{
    
        String name="Abhi";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(true,result);
    }
    @Test
    public void test_validateName_v3() throws WalletException{
    
        String name="abhi";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(false,result);
    }
    //@Test(expected=WalletException.class)
    /*public void test_ValidateMobNo_null() throws WalletException{
    	
        WalletService walletSer=new WalletServiceImpl();
        walletSer.validateMobileNo(null);
    }
    
    @Test*/
    @Test//(expected=WalletException.class)
    public void test_validateMobNo_v1() throws WalletException{
    
        String mobNo="ABCXYZ8288";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(false,result);
    }
    @Test
    public void test_validateMobNo_v2() throws WalletException{
    
        String mobNo="6200955203";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(true,result);
    }
    @Test
    public void test_validateMobNo_v3() throws WalletException{
    
        String mobNo="620095";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(false,result);
    }
	
}
