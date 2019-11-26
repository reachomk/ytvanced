package com.google.android.libraries.youtube.upload.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import defpackage.alyz;
import defpackage.amae;
import defpackage.amce;
import defpackage.amch;
import defpackage.amcj;
import defpackage.amcm;
import defpackage.amcq;
import defpackage.amcu;
import defpackage.amcx;
import defpackage.amcy;
import defpackage.amda;
import defpackage.amdb;
import defpackage.amdc;
import defpackage.amde;
import defpackage.xse;
import java.util.concurrent.Executor;

public class UploadService extends Service implements amcm {
    public amcq a;
    public Executor b;
    public alyz c;
    public amch d;
    public amce e;
    public amae f;
    public amcu g;
    private final amde h = new amde(this);
    private amda i;
    private Boolean j = null;

    public final void onCreate() {
        this.i = ((amdc) xse.a(getApplication())).pc().a();
        this.i.a(this);
        this.a = new amcq(this, this.h, this.g);
        this.f.a(this.a);
        this.d.a(this);
        this.e.a(this);
        this.b.execute(new amcx(this));
        super.onCreate();
    }

    public final void onDestroy() {
        this.d.b(this);
        this.e.b(this);
        this.f.b(this.a);
        super.onDestroy();
    }

    public final IBinder onBind(Intent intent) {
        return this.h;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        a();
        return 1;
    }

    public final synchronized void a() {
        this.b.execute(new amcy(this));
    }

    public final void a(amcj amcj) {
        this.b.execute(new amdb(this));
    }

    public final synchronized void b() {
        Boolean bool = this.j;
        if (bool == null || !bool.booleanValue()) {
            startService(new Intent(getApplication(), getClass()));
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, UploadsBootReceiver.class), 1, 1);
            this.j = Boolean.valueOf(true);
        }
    }

    public final synchronized void c() {
        Boolean bool = this.j;
        if (bool == null || bool.booleanValue()) {
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, UploadsBootReceiver.class), 2, 1);
            stopSelf();
            this.j = Boolean.valueOf(false);
        }
    }
}
