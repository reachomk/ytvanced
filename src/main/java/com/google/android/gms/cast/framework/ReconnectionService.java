package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.pkp;
import defpackage.pkx;
import defpackage.plb;
import defpackage.pny;
import defpackage.poa;
import defpackage.poe;
import defpackage.pon;
import defpackage.pzr;
import defpackage.qcs;
import defpackage.qnh;

public class ReconnectionService extends Service {
    private static final pon a = new pon("ReconnectionService");
    private poa b;

    public final void onCreate() {
        qcs b;
        String str = "getWrappedThis";
        String str2 = "Unable to call %s on %s.";
        pkp a = pkp.a(this);
        qcs qcs = null;
        try {
            b = a.b().b.b();
        } catch (RemoteException unused) {
            plb.a.b(str2, str, poe.class.getSimpleName());
            b = null;
        }
        pzr.b("Must be called from the main thread.");
        try {
            qcs = a.c.b.a();
        } catch (RemoteException unused2) {
            pkx.a.b(str2, str, pny.class.getSimpleName());
        }
        this.b = qnh.a(this, b, qcs);
        try {
            this.b.a();
        } catch (RemoteException unused3) {
            a.b(str2, "onCreate", poa.class.getSimpleName());
        }
        super.onCreate();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.b.a(intent, i, i2);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onStartCommand", poa.class.getSimpleName());
            return 1;
        }
    }

    public final IBinder onBind(Intent intent) {
        try {
            return this.b.a(intent);
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onBind", poa.class.getSimpleName());
            return null;
        }
    }

    public final void onDestroy() {
        try {
            this.b.b();
        } catch (RemoteException unused) {
            a.b("Unable to call %s on %s.", "onDestroy", poa.class.getSimpleName());
        }
        super.onDestroy();
    }
}
