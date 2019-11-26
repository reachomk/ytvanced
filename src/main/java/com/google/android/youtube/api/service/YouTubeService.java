package com.google.android.youtube.api.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.amks;
import defpackage.amkt;
import defpackage.amku;
import defpackage.amla;
import defpackage.amlg;
import defpackage.mqt;
import java.util.HashSet;

public class YouTubeService extends Service {
    public amkt a;

    public final void onCreate() {
        super.onCreate();
        this.a = new amkt();
    }

    public final void onDestroy() {
        for (amks a : new HashSet(this.a.a)) {
            a.a();
        }
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.youtube.api.service.START".equals(intent.getAction())) {
            return null;
        }
        amku amku = new amku(this, new mqt());
        amku.asBinder();
        return amku;
    }

    public static void a(amlg amlg, int i) {
        try {
            String a = amla.a(i);
            if (i != 0) {
                amlg.a(a, null);
                return;
            }
            throw null;
        } catch (RemoteException unused) {
        }
    }
}
