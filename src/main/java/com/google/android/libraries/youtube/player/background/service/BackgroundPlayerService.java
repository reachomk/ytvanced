package com.google.android.libraries.youtube.player.background.service;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import defpackage.ahgy;
import defpackage.ahhe;
import defpackage.ahhf;
import defpackage.ahhg;
import defpackage.ahhh;
import defpackage.ahhi;
import defpackage.ahhj;
import defpackage.ahhk;
import defpackage.ahhl;
import defpackage.ahhm;
import defpackage.ahhn;
import defpackage.ahhp;
import defpackage.ahhq;
import defpackage.ahjc;
import defpackage.ahkd;
import defpackage.ahkn;
import defpackage.ahkr;
import defpackage.aipo;
import defpackage.aiqf;
import defpackage.airi;
import defpackage.aiss;
import defpackage.aisx;
import defpackage.aizy;
import defpackage.ajam;
import defpackage.ajan;
import defpackage.ajcg;
import defpackage.ajlg;
import defpackage.bapu;
import defpackage.bcud;
import defpackage.bcuo;
import defpackage.bdfu;
import defpackage.xci;
import defpackage.xcp;
import defpackage.xse;
import defpackage.zyw;
import defpackage.zzl;
import java.util.concurrent.Executor;

public class BackgroundPlayerService extends Service implements ajan, xcp {
    public bapu a;
    public aizy b;
    public ajam c;
    public aiss d;
    public ahhq e;
    public xci f;
    public Executor g;
    public aiqf h;
    public zzl i;
    public zyw j;
    public bcud k;
    public bcud l;
    public ajlg m;
    public volatile boolean n;
    private boolean o;
    private final bdfu p = new bdfu();
    private final IBinder q = new ahhm();

    public final long e() {
        return 137438953472L;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    private final void b() {
        if (this.e.f()) {
            a();
        }
    }

    public final void onCreate() {
        super.onCreate();
        ((ahhp) xse.a(getApplicationContext())).a(this);
        if (aipo.a(this.j, 137438953472L)) {
            this.p.a(a(this.c));
        } else {
            this.f.a((Object) this);
        }
        this.b.x();
        if (this.o) {
            this.n = true;
        }
        if (aipo.h(this.j)) {
            this.d.a((Service) this);
        } else {
            this.d.c(this);
        }
        if (!aipo.g(this.j)) {
            boolean z = false;
            if (VERSION.SDK_INT >= 26 && aipo.j(this.i)) {
                z = true;
            }
            ((aisx) this.a.get()).a(z);
        }
    }

    public final void onTaskRemoved(Intent intent) {
        this.l.e_(ahgy.b);
        this.b.i();
        this.m.d();
        c();
        if (!aipo.g(this.j)) {
            ((aisx) this.a.get()).b(true);
        }
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        if (aipo.h(this.j)) {
            return this.q;
        }
        return null;
    }

    private final void c() {
        if (aipo.a(this.j, 137438953472L)) {
            this.p.a();
        } else {
            this.f.b(this);
        }
    }

    public final void onDestroy() {
        c();
        this.k.e_(ahgy.a);
        boolean y = this.b.y();
        if (y) {
            this.b.i();
            this.m.d();
        }
        if (aipo.h(this.j)) {
            this.d.b(this);
        } else {
            this.d.a(y);
        }
        if (!aipo.g(this.j)) {
            ((aisx) this.a.get()).b(true);
            this.a = null;
        }
        this.h.b();
        super.onDestroy();
    }

    public final void a() {
        this.n = false;
        this.g.execute(new ahhf(this));
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 137438953472L)).a(ajcg.a(ajam.O(), 137438953472L)).a(new ahhe(this), ahhh.a), ajam.Q().d.a(ajcg.b(ajam.O(), 137438953472L)).a(ajcg.a(ajam.O(), 137438953472L, 1)).a(new ahhg(this), ahhj.a), ajam.Q().c.a(ajcg.b(ajam.O(), 137438953472L)).a(ajcg.a(ajam.O(), 137438953472L)).a(new ahhi(this), ahhl.a), ajam.n().a(ajcg.b(ajam.O(), 137438953472L)).a(ajcg.a(ajam.O(), 137438953472L)).a(new ahhk(this), ahhn.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a.a(airi.ENDED)) {
            b();
        }
    }

    public final void a(ahkr ahkr) {
        int i = ahkr.a;
        this.o = i == 2;
        if (i != 2) {
            if (i == 4) {
                b();
            }
        } else if (this.b.y()) {
            this.n = true;
            if (!aipo.g(this.j)) {
                ((aisx) this.a.get()).b();
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class, ahkd.class, ahkn.class, ahkr.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else if (i == 2) {
            a((ahkn) obj);
            return null;
        } else if (i == 3) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
