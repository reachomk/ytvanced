package org.chromium.net;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.aocf;
import defpackage.bciq;

public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength b = new AndroidCellularSignalStrength();
    public volatile int a = aocf.UNSET_ENUM_VALUE;

    private AndroidCellularSignalStrength() {
        if (VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new bciq(this));
        }
    }

    private static int getSignalStrengthLevel() {
        return b.a;
    }
}
