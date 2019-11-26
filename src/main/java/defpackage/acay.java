package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: acay */
public final class acay implements acaq {
    public final Runnable A;
    public final acho B;
    private final Handler C;
    private final HandlerThread D;
    private abyz E;
    private final achp F;
    public final boolean a;
    public final Context b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public final xsc e;
    public final abza f;
    public final acax g;
    public boolean h;
    public boolean i;
    public achm j;
    public achm k;
    public acgy l;
    public achn m;
    public acat n;
    public achr o;
    public boolean p;
    public acic q;
    public final boolean r;
    public volatile acaj s;
    public abyr t;
    public abzt u;
    public abyt v;
    public int w;
    public boolean x;
    public acau y;
    public final Runnable z;

    public acay(boolean z, Context context, xsc xsc, abza abza, acax acax) {
        if (acbz.a == null) {
            acbz.a = new acbz();
        }
        Object obj = acbz.a;
        if (achd.a == null) {
            achd.a = new achd();
        }
        if (acgz.a == null) {
            acgz.a = new acgz();
        }
        if (acii.a == null) {
            acii.a = new acii();
        }
        if (achk.a == null) {
            achk.a = new achk();
        }
        if (acak.a == null) {
            acak.a = new acak();
        }
        this.C = new Handler(Looper.getMainLooper());
        this.w = 0;
        this.F = new acbt(this);
        this.z = new acbb(this);
        this.A = new acba(this);
        this.B = new acbu(this);
        this.a = z;
        this.b = context.getApplicationContext();
        this.e = xsc;
        this.f = abza;
        this.g = acax;
        amqw.a(obj);
        this.r = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        this.D = new HandlerThread("CodecThread", 0);
        this.D.setUncaughtExceptionHandler(new acbi(this));
        this.D.start();
        this.c = new Handler(this.D.getLooper());
        if (xsc != null) {
            this.d = Executors.newSingleThreadScheduledExecutor(new xaf(0, "AbrThread"));
        } else {
            this.d = null;
        }
        if (z) {
            this.u = new abzt();
            this.v = new abyt(this.u);
            this.E = new abyz(this.v);
        }
    }

    public final accy b() {
        return null;
    }

    public final void c() {
    }

    public final void d() {
    }

    public final synchronized void a(boolean z, acas acas) {
        this.c.post(new acbl(this, z, acas));
    }

    public final void a(int i, acas acas) {
        this.C.post(new acbk(this, acas, i));
    }

    public final void g() {
        acgy acgy = this.l;
        if (acgy != null) {
            boolean z = false;
            if (this.h && !this.i) {
                z = true;
            }
            acgy.a(z);
        }
    }

    public final synchronized void a(boolean z, MediaFormat mediaFormat, MediaFormat mediaFormat2, String str, String str2, acic acic, Bundle bundle, acav acav) {
        synchronized (this) {
            this.c.post(new acbn(this, z, mediaFormat, mediaFormat2, str, str2, acic, bundle, acav));
        }
    }

    public final acaj a() {
        return this.s;
    }

    public final synchronized void a(acat acat, acav acav) {
        this.c.post(new acbo(this, acat, acav));
        acef.a().a(auhl.class, acbw.class, new acbw(this));
    }

    public final synchronized void a(acav acav) {
        this.c.post(new acbr(this, acav));
    }

    public final void a(int i, acav acav) {
        boolean z = i != 0;
        xak.b();
        amqw.b(z);
        i();
        b(i, acav);
    }

    public final void b(int i, acav acav) {
        this.C.post(new acbd(acav, i));
    }

    public final void a(acau acau) {
        this.n = null;
        this.c.post(new acbc(this, acau));
        acef.a().a(auhl.class, acbw.class, null);
    }

    public final void a(boolean z) {
        xak.b();
        (z ? "and drained " : "without draining ").length();
        this.c.removeCallbacks(this.z);
        this.c.removeCallbacks(this.A);
        if (!this.p) {
            xtl.a("MediaMuxCapturePipelineMgr", "Re-entered codec pipeline stop handler.  Skipping");
            a(2, null);
        } else if (k()) {
            this.p = false;
            this.o.a(this.b, new acbs(this));
        } else {
            int j = j();
            i();
            this.p = false;
            a(j, null);
        }
    }

    public final void a(int i, Uri uri) {
        this.w = 0;
        this.C.post(new acbf(this, i));
    }

    public final synchronized void b(acav acav) {
        this.c.post(new acbe(this, acav));
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        HandlerThread handlerThread = this.D;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.finalize();
    }

    public final abyz e() {
        return this.E;
    }

    public final abzo f() {
        return this.u;
    }

    public final void h() {
        if (this.s != null) {
            this.s.a(false);
        }
        achm achm = this.j;
        if (achm != null) {
            achm.a(this.F);
        }
        achm = this.k;
        if (achm != null) {
            achm.a(this.F);
        }
        if (this.s != null) {
            this.s.a(false);
            this.s = null;
        }
        acic acic = this.q;
        if (acic != null) {
            acic.a(null, null);
            this.q.a(null, null);
            this.q.e();
            this.q.f();
            this.q = null;
        }
    }

    public final void i() {
        xak.b();
        h();
        k();
        if (this.p) {
            achr achr = this.o;
            if (achr != null) {
                achr.i();
            }
        }
        if (this.o != null) {
            k();
            this.o.b();
            this.o = null;
        }
        achm achm = this.j;
        if (achm != null) {
            achm.a(null);
            this.j.c();
            this.j.d();
            this.j = null;
        }
        achm = this.k;
        if (achm != null) {
            achm.a(null);
            this.k.c();
            this.k.d();
            this.k = null;
        }
        this.w = 0;
        this.x = false;
    }

    public final void a(int i) {
        this.C.post(new acbh(this, i));
        if (acej.a(i)) {
            this.c.post(new acbg(this));
        }
    }

    public final boolean j() {
        return (this.q == null || this.j == null || this.k == null || this.l == null || this.o == null) ? false : true;
    }

    private final boolean k() {
        achr achr = this.o;
        return achr != null && achr.e();
    }
}
