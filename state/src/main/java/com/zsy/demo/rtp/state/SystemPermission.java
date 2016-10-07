package com.zsy.demo.rtp.state;

/**
 * Created by zhuoshangyi on 2016/10/4.
 * VERSION 1.0
 * simple state, do not need to refactor,but hard to expanded!
 */
public class SystemPermission {
    private SystemProfile profile;
    private SystemUser requestor;
    private SystemAdmin admin;
    private boolean isGranded;
    private String state;

    public static final String REQUESTED = "REQUESTED";
    public static final String CLAIMED = "CLAIMED";
    public static final String CRANTED = "CRANTED";
    public static final String DENIED = "DENIED";

    public SystemPermission(SystemUser requestor, SystemProfile profile) {
        this.requestor = requestor;
        this.profile = profile;
        state = REQUESTED;
        isGranded = false;
        notifyAdminOfPermissionRequest();
    }

    public void claimedBy(SystemAdmin admin) {
        if (!state.equals(REQUESTED))
            return;
        this.admin = admin;
        willBeHandleBy(admin);
        state = CLAIMED;
    }

    public void deniedBy(SystemAdmin admin) {
        if (!state.equals(CLAIMED)) {
            return;
        }
        if (!this.admin.equals(admin)) {
            return;
        }
        isGranded = false;
        state = DENIED;
        notifyAdminOfPermissionRequest();
    }

    public void grantedBy(SystemAdmin admin) {
        if (!state.equals(CLAIMED)) {
            return;
        }
        if (!this.admin.equals(admin)) {
            return;
        }
        state = CRANTED;
        isGranded = true;
        notifyAdminOfPermissionRequest();
    }

    /**
     * mock method
     *
     * @param admin
     */
    private void willBeHandleBy(SystemAdmin admin) {

    }

    /**
     * mock method
     */
    private void notifyAdminOfPermissionRequest() {

    }

    public boolean isGranded() {
        return isGranded;
    }

    public void setGranded(boolean granded) {
        isGranded = granded;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
