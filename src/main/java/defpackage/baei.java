package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.vr.audio.DeviceInfo;

/* renamed from: baei */
public final class baei extends BroadcastReceiver {
    private final /* synthetic */ DeviceInfo a;

    public baei(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", -1);
            DeviceInfo deviceInfo;
            if (intExtra == 0) {
                deviceInfo = this.a;
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 2);
            } else if (intExtra != 1) {
                deviceInfo = this.a;
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 0);
            } else {
                deviceInfo = this.a;
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 1);
            }
        }
    }
}