package org.chromium.base;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.bchn;
import defpackage.bcia;

public class PowerMonitor {
    private static PowerMonitor a;
    private boolean b;

    private PowerMonitor() {
    }

    private static native void nativeOnBatteryChargingChanged();

    public static void a(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        PowerMonitor powerMonitor = a;
        boolean z = false;
        if (!(intExtra == 2 || intExtra == 1)) {
            z = true;
        }
        powerMonitor.b = z;
        nativeOnBatteryChargingChanged();
    }

    private static boolean isBatteryPower() {
        PowerMonitor powerMonitor = a;
        if (powerMonitor == null && powerMonitor == null) {
            Context context = bchn.a;
            a = new PowerMonitor();
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                a(registerReceiver);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context.registerReceiver(new bcia(), intentFilter);
        }
        return a.b;
    }
}
