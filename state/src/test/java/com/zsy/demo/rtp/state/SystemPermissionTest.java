package com.zsy.demo.rtp.state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhuoshangyi on 2016/10/4.
 */
public class SystemPermissionTest {
    private SystemPermission permission;
    private SystemAdmin admin;

    @Before
    public void initPermission() {
        permission = new SystemPermission(new SystemUser(), new SystemProfile());
        admin = new SystemAdmin();
    }

    @Test
    public void testGrandedBy() throws Exception {
        permission.grantedBy(admin);
        Assert.assertEquals("requested", permission.REQUESTED, permission.getState());
        Assert.assertEquals("not granted", false, permission.isGranded());
        permission.claimedBy(admin);
        permission.grantedBy(admin);
        Assert.assertEquals("granted", permission.CRANTED, permission.getState());
        Assert.assertEquals("granted", true, permission.isGranded());
    }
}
