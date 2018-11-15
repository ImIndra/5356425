package com.cg.XYZWalletJPA.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.cg.XYZWalletJPA.exception.WalletException;
import com.cg.XYZWalletJPA.service.WalletService;
import com.cg.XYZWalletJPA.service.WalletServiceImpl;

public class TestClassJPA {

	
    
    @Test
    public void test_validateName_v1() throws WalletException{
    
        String name="Akhi121";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(false,result);
    }
    @Test
    public void test_validateName_v2() throws WalletException{
    
        String name="Akhil";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(true,result);
    }
    @Test
    public void test_validateName_v3() throws WalletException{
    
        String name="akhil";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateName(name);
        Assert.assertEquals(false,result);
    }
    
    @Test
    public void test_validateMobNo_v1() throws WalletException{
    
        String mobNo="ABCD91828288";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(false,result);
    }
    @Test
    public void test_validateMobNo_v2() throws WalletException{
    
        String mobNo="9922974725";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(true,result);
    }
    @Test
    public void test_validateMobNo_v3() throws WalletException{
    
        String mobNo="992297";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(false,result);
    }
    @Test
    public void test_validateMobNo_v4() throws WalletException{
    
        String mobNo="012992297";
        WalletService walletSer=new WalletServiceImpl();
        boolean result= walletSer.validateMobileNo(mobNo);
        Assert.assertEquals(false,result);
    }

}
