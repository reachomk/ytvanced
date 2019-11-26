package defpackage;

import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: ubq */
public final class ubq {
    public static boolean a(Application application) {
        if (VERSION.SDK_INT >= 23) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) application.getSystemService("device_policy");
            int storageEncryptionStatus = devicePolicyManager != null ? devicePolicyManager.getStorageEncryptionStatus() : 0;
            if ((storageEncryptionStatus == 3 || storageEncryptionStatus == 4 || storageEncryptionStatus == 5) && Build.FINGERPRINT.contains("userdebug")) {
                return true;
            }
        }
        return false;
    }
}
