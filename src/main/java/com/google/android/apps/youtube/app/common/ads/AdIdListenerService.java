package com.google.android.apps.youtube.app.common.ads;

import defpackage.dvq;
import defpackage.pda;
import defpackage.vmn;
import defpackage.vmp;
import defpackage.xse;
import java.util.concurrent.Executor;

public class AdIdListenerService extends pda {
    public vmn a;
    public Executor b;

    public final void a() {
    }

    public final void onCreate() {
        super.onCreate();
        ((dvq) xse.a(getApplicationContext())).a(this);
        this.b.execute(new vmp(this.a));
    }
}
