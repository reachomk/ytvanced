package com.google.android.apps.youtube.app.application.system;

import android.content.SharedPreferences;
import defpackage.afxq;
import defpackage.bqa;
import defpackage.deq;
import defpackage.der;
import defpackage.duw;
import defpackage.xhv;
import defpackage.xse;

public class LocaleUpdatedJobService extends deq {
    public afxq d;
    public SharedPreferences e;
    public xhv f;
    public bqa g;

    public final boolean a() {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        ((duw) xse.a(getApplication())).a(this);
    }

    public final boolean a(der der) {
        if (this.f.c()) {
            this.d.b();
        } else {
            this.e.edit().putBoolean("pending_notification_registration", true).apply();
        }
        this.g.b();
        return false;
    }
}
