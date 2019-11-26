package com.google.android.libraries.youtube.common.gcm;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import defpackage.wxu;
import defpackage.wxw;
import defpackage.wxx;
import defpackage.xdk;
import defpackage.xdt;
import defpackage.xea;
import defpackage.xei;
import defpackage.xew;
import defpackage.xse;
import defpackage.xtl;
import java.util.Map;
import java.util.Map.Entry;

public class YouTubeGcmTaskService implements xdt {
    public wxw a;
    public Map b;
    public wxu c;
    private PowerManager d;

    public final void a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            this.d = (PowerManager) context.getSystemService(PowerManager.class);
        }
        ((xdk) xse.a(context)).pt().a(this);
        if (this.a.a.compareAndSet(false, true)) {
            for (Entry entry : this.b.entrySet()) {
                this.a.a((String) entry.getKey(), (wxx) entry.getValue());
            }
        }
    }

    public final int a(xea xea) {
        PowerManager powerManager = this.d;
        if (powerManager == null || !powerManager.isDeviceIdleMode()) {
            try {
                int a = this.c.a(((xei) xea).a.a, ((xew) xea).a.b);
                if (a == 0) {
                    return 0;
                }
                if (a != 2) {
                    return 2;
                }
                return 1;
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Error occurred processing task: ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
                return 2;
            }
        }
        xtl.d("Gcm tried to schedule us while in idle mode. Rescehudling Task.");
        return 1;
    }
}
