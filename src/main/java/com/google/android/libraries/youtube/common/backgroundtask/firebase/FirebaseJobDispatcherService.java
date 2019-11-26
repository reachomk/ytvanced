package com.google.android.libraries.youtube.common.backgroundtask.firebase;

import defpackage.deq;
import defpackage.der;
import defpackage.wxu;
import defpackage.wxw;
import defpackage.wxx;
import defpackage.wyh;
import defpackage.wyj;
import defpackage.xse;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;

public class FirebaseJobDispatcherService extends deq {
    public wxw d;
    public Map e;
    public wxu f;
    public ScheduledExecutorService g;

    public final boolean a() {
        return true;
    }

    public final void onCreate() {
        super.onCreate();
        ((wyj) xse.a(getApplicationContext())).po().a(this);
        if (this.d.a.compareAndSet(false, true)) {
            for (Entry entry : this.e.entrySet()) {
                this.d.a((String) entry.getKey(), (wxx) entry.getValue());
            }
        }
    }

    public final boolean a(der der) {
        this.g.execute(new wyh(this, der));
        return true;
    }
}
