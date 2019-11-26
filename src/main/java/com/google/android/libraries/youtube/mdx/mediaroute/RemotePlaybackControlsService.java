package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.youtube.R;
import defpackage.adby;
import defpackage.adgw;
import defpackage.adha;
import defpackage.adhb;
import defpackage.adhc;
import defpackage.adhd;
import defpackage.adhe;
import defpackage.adhh;
import defpackage.adhi;
import defpackage.adhs;
import defpackage.adqf;
import defpackage.adqh;
import defpackage.aiss;
import defpackage.aisx;
import defpackage.aitf;
import defpackage.aitg;
import defpackage.aitk;
import defpackage.aitl;
import defpackage.ajam;
import defpackage.bcaa;
import defpackage.bdfu;
import defpackage.vpa;
import defpackage.vuf;
import defpackage.xci;
import defpackage.xcp;
import defpackage.xfc;
import defpackage.xtl;
import defpackage.yx;

public class RemotePlaybackControlsService extends Service implements xcp, xfc {
    public xci a;
    public ajam b;
    public aisx c;
    public aisx d;
    public vuf e;
    public aiss f;
    public bcaa g;
    public bcaa h;
    public adby i;
    public aitk j;
    private final adhd k = new adhd(this);
    private final bdfu l = new bdfu();
    private boolean m;
    private adhi n;
    private final adqh o = new adha(this);
    private final aitg p = new adhc(this);
    private final aitf q = new adhb(this);
    private final aitl r = new adhe(this);

    public final void onTaskRemoved(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        c().a(this);
        aisx aisx = this.c;
        aisx.g = this.q;
        aisx.a(this.r);
        this.c.f = this.p;
        this.d.a(this.e);
        this.f.c(this);
        this.l.a(this.k.a(this.b));
        this.a.a((Object) this);
        ((adqf) this.h.get()).a(this.o);
        ((adgw) this.g.get()).d();
    }

    public final IBinder onBind(Intent intent) {
        a();
        return new Binder();
    }

    public final void a() {
        boolean g = ((adqf) this.h.get()).g();
        adhs adhs = ((adgw) this.g.get()).b;
        if (g) {
            this.m = false;
            b();
            return;
        }
        if (adhs != null) {
            this.c.e = getString(R.string.now_playing_on_screen, new Object[]{yx.a().a(adhs.a)});
        }
    }

    public final void onDestroy() {
        this.m = false;
        this.c.f = null;
        ((adgw) this.g.get()).e();
        this.c.b(true);
        this.d.b(true);
        this.f.c(null);
        this.l.a();
        this.a.b(this);
        ((adqf) this.h.get()).b(this.o);
        super.onDestroy();
    }

    public final void b() {
        this.j.b();
        if (this.m && this.i.f()) {
            this.c.b(false);
            this.d.b();
            return;
        }
        this.d.b(false);
        this.c.b();
    }

    private final adhi c() {
        if (this.n == null) {
            this.n = ((adhh) ((xfc) getApplication()).n()).ps();
        }
        return this.n;
    }

    public final /* synthetic */ Object n() {
        return c();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = false;
        if (i == -1) {
            return new Class[]{vpa.class};
        } else if (i == 0) {
            vpa vpa = (vpa) obj;
            if (((adqf) this.h.get()).c() == null) {
                this.m = false;
                return null;
            }
            if (vpa.a.a() && VERSION.SDK_INT > 23) {
                z = true;
            }
            this.m = z;
            b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    static {
        xtl.b("MDX.RemoteService");
    }
}
