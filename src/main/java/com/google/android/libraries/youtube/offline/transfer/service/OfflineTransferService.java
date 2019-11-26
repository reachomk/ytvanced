package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import defpackage.aeex;
import defpackage.ageo;
import defpackage.agpl;
import defpackage.agqf;
import defpackage.agqz;
import defpackage.agrc;
import defpackage.agrq;
import defpackage.agvs;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.agxj;
import defpackage.agxk;
import defpackage.agxl;
import defpackage.agxz;
import defpackage.agya;
import defpackage.agyd;
import defpackage.agyg;
import defpackage.agyk;
import defpackage.agzf;
import defpackage.agzg;
import defpackage.agzh;
import defpackage.agzi;
import defpackage.agzl;
import defpackage.agzo;
import defpackage.ahaa;
import defpackage.ahap;
import defpackage.amqp;
import defpackage.amro;
import defpackage.avqk;
import defpackage.bcaa;
import defpackage.ozb;
import defpackage.xah;
import defpackage.xfc;
import defpackage.xhv;
import defpackage.xsc;
import defpackage.xtl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class OfflineTransferService extends agxl {
    private static final Object u = new Object();
    public xsc g;
    public SharedPreferences h;
    public Executor i;
    public amro j;
    public bcaa k;
    public xah l;
    public bcaa m;
    public bcaa n;
    public bcaa o;
    public agpl p;
    public xhv q;
    public ozb r;
    public Map s;
    public amqp t;
    private Set v = Collections.synchronizedSet(new HashSet());
    private agyk w;
    private volatile String x;
    private Notification y;

    /* Access modifiers changed, original: protected|final */
    public final String c() {
        return ageo.WIFI_POLICY_STRING;
    }

    public final Runnable f() {
        return null;
    }

    public final void onCreate() {
        xtl.e("Creating OfflineTransferService...");
        ((agzi) ((xfc) getApplication()).n()).pr().a(this);
        super.onCreate();
        a(this.p);
        a(new agzl(getApplicationContext(), this.l));
        this.a = this.i;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        xtl.e("OfflineTransferService onStartCommand");
        if (VERSION.SDK_INT >= 26) {
            this.y = ((agrq) this.m.get()).b();
            Notification notification = this.y;
            if (notification != null) {
                startForeground(13, notification);
            }
        }
        this.e.a(intent);
        return 1;
    }

    public final void b() {
        Notification notification = this.y;
        if (notification != null) {
            startForeground(13, notification);
        } else {
            stopForeground(true);
        }
    }

    public final void onDestroy() {
        xtl.e("Destroying OfflineTransferService...");
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected|final */
    public final agyd a(agyg agyg) {
        if (this.w == null) {
            this.w = new agyk(getApplicationContext(), agyg, getClass().getCanonicalName(), this);
        }
        return this.w;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        String c = ((agwc) this.o.get()).c();
        if ("NO_OP_STORE_TAG".equals(c)) {
            return 0;
        }
        return this.e.a(c);
    }

    public final agya a(agqz agqz, agxz agxz) {
        agwc agwc = (agwc) this.o.get();
        String c = agwc.c();
        if ("NO_OP_STORE_TAG".equals(c) || !TextUtils.equals(c, agqz.h)) {
            return null;
        }
        agvz b = agwc.b();
        agzo agzo = new agzo(this.j, b.j().b(), this.g, u, (aeex) this.k.get(), this.r, this.t);
        int a = agxj.a(agqz.f);
        bcaa bcaa = (bcaa) this.s.get(Integer.valueOf(a));
        if (bcaa != null) {
            return ((ahaa) bcaa.get()).a(agqz, agxz, agzo, b);
        }
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("Unrecognized transfer type: ");
        stringBuilder.append(a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return ((agvs) this.n.get()).j();
    }

    public final void a(agqz agqz, boolean z) {
        this.b.put(agqz.a, agqz);
        for (agxk d : this.d) {
            d.d(agqz);
        }
        this.a.execute(new agzf(this, agqz, z));
    }

    public final void b(agqz agqz, boolean z) {
        agrq agrq = (agrq) this.m.get();
        agrq.a(agqz, z);
        if (agxj.i(agqz.f)) {
            agrq.d();
        }
    }

    public final void a(agqz agqz) {
        this.b.put(agqz.a, agqz);
        for (agxk a : this.d) {
            a.a(agqz);
        }
        g();
        if (agxj.g(agqz.f) && agxj.a(agqz) && agxj.i(agqz.f)) {
            this.v.add(agqz.a);
        }
    }

    public final void b(agqz agqz) {
        this.b.remove(agqz.a);
        for (agxk agxk : this.d) {
            agxk.e(agqz);
            if ((agqz.c & 512) != 0) {
                agxk.f(agqz);
            }
        }
        if (agxj.a(agqz) && agqz.a.equals(this.x)) {
            this.x = null;
        }
        this.a.execute(new agzh(this, agqz));
    }

    public final void c(agqz agqz) {
        if (agqz != null && agxj.a(agqz)) {
            int i = agqz.c & 512;
            if (i == 0) {
                if (this.v.contains(agqz.a)) {
                    this.v.remove(agqz.a);
                } else {
                    return;
                }
            }
            avqk avqk = this.w.q.a.b;
            if (ahap.b(this.q) && agxj.i(agqz.f) && avqk != null && !avqk.b) {
                agrq agrq = (agrq) this.m.get();
                if (i != 0) {
                    agqz = null;
                }
                agrq.a(agqz, avqk);
            }
        }
    }

    public final void a(Map map) {
        this.b = map;
        this.c = true;
        for (agxk a : this.d) {
            a.a();
        }
        for (agqz b : map.values()) {
            if (b.b()) {
                g();
                return;
            }
        }
    }

    public final void a(int i, boolean z) {
        if (i >= this.f) {
            for (agxk b : this.d) {
                b.b();
            }
            stopSelf();
        }
        if (z) {
            agxj.a(this.h, ((agwc) this.o.get()).c(), false);
        }
    }

    private final void g() {
        agxj.a(this.h, ((agwc) this.o.get()).c(), true);
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        this.b.put(agqz.a, agqz);
        for (agxk a : this.d) {
            a.a(agqz, i, agqf);
        }
        if (agxj.a(agqz)) {
            if (agqz.b == agrc.COMPLETED) {
                if (agqz.a.equals(this.x)) {
                    this.x = null;
                }
            } else if (agqz.b == agrc.RUNNING) {
                this.x = agqz.a;
            }
        }
        this.a.execute(new agzg(this, agqz));
    }
}
