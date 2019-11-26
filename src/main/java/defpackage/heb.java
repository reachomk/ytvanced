package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: heb */
public final class heb extends aibc implements aecb, aiav, aifc, aigc, aihv {
    private final Runnable A = new hee(this);
    public final hdv a;
    public final bcaa b;
    public final acvx c;
    public final boolean d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public ImageView h;
    public ImageView i;
    public ProgressBar j;
    public TimeBar k;
    public final aihk l;
    public aibe m;
    public aiff n;
    public aich o;
    public boolean p;
    public aeby q;
    public amur r;
    public final adqf s;
    public Space t;
    public Space u;
    public Long v;
    private final Handler w;
    private aicd x;
    private boolean y;
    private boolean z;

    public heb(hdv hdv, bcaa bcaa, adqf adqf, acvx acvx, boolean z) {
        this.a = hdv;
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.s = (adqf) amqw.a((Object) adqf);
        this.c = (acvx) amqw.a((Object) acvx);
        this.x = aicd.a;
        this.l = new aihk();
        this.l.r = true;
        this.w = new Handler(Looper.getMainLooper());
        this.d = z;
    }

    public final void a(aiay aiay) {
    }

    public final void a(aigf aigf) {
    }

    public final void a(aihy aihy) {
    }

    public final void a(ajis ajis) {
    }

    public final void a(List list) {
    }

    public final void a(aahn[] aahnArr, int i) {
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
    }

    public final void d(boolean z) {
    }

    public final void e(boolean z) {
    }

    public final void f(boolean z) {
    }

    public final void g(boolean z) {
    }

    public final void b() {
        ((aeca) this.b.get()).b((aecb) this);
        this.t = null;
        this.u = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = null;
        this.k = null;
        this.p = false;
    }

    public final void a(aich aich) {
        amqw.a((Object) aich);
        if (!aich.equals(this.o)) {
            this.o = aich;
            j();
        }
    }

    public final void b(boolean z) {
        if (this.y != z) {
            this.y = z;
            j();
        }
    }

    public final void b_(boolean z) {
        if (this.z != z) {
            this.z = z;
            j();
        }
    }

    private final void j() {
        if (this.p) {
            this.a.a(this.o, this.q.a() == 4);
            xpr.a(this.j, this.o.b);
            xpr.a(this.e, this.o.b ^ 1);
            xpr.a(this.k, this.x.p);
            if (this.d) {
                xpr.a(this.h, this.x.p);
                xpr.a(this.i, this.x.p);
            }
            this.g.setEnabled(this.y);
            this.f.setEnabled(this.z);
        }
    }

    public final void au_() {
        if (this.p) {
            this.w.removeCallbacks(this.A);
            this.v = null;
            this.l.g();
            this.k.a(this.l);
        }
    }

    public final void c(boolean z) {
        if (this.p) {
            this.k.setEnabled(z);
        }
    }

    public final void a(long j, long j2, long j3, long j4) {
        if (this.p) {
            Long l = this.v;
            this.l.a(l != null ? l.longValue() : j, j2, j3, j4);
            this.k.a(this.l);
        }
    }

    public final void a(aicd aicd) {
        if (!amqq.a(this.x, aicd) && this.p) {
            this.x = aicd;
            aihq aihq = this.l;
            aihq.o = aicd.q;
            aihq.q = aicd.r;
            aihq.r = aicd.x;
            aihq.s = aicd.t;
            aihq.t = aicd.y;
            this.k.a(aihq);
        }
    }

    public final void a(aibe aibe) {
        amqw.b(this.m == null, (Object) "Must not override an existing listener.");
        this.m = aibe;
    }

    public final void a(aiff aiff) {
        this.n = aiff;
    }

    public final void a(int i) {
        long j;
        Long l = this.v;
        if (l == null) {
            j = this.l.k;
        } else {
            j = l.longValue();
        }
        if (i == 1) {
            j = Math.max(0, j - TimeUnit.SECONDS.toMillis(10));
        } else {
            j = Math.min(this.l.i, j + TimeUnit.SECONDS.toMillis(10));
        }
        a(j);
    }

    public final void a(long j) {
        this.v = Long.valueOf(j);
        aihq aihq = this.l;
        aihq.k = j;
        this.k.a(aihq);
        this.w.removeCallbacks(this.A);
        this.w.postDelayed(this.A, 1500);
        this.m.b(j);
    }

    public final void c() {
        int a = this.q.a();
        boolean z = false;
        boolean z2 = a != 2;
        if (a == 2) {
            z = true;
        }
        if (this.t != null) {
            xpr.a(this.f, z2);
            xpr.a(this.g, z2);
            if (this.d) {
                xpr.a(this.i, z2);
                xpr.a(this.h, z2);
            }
            xpr.a(this.t, z);
            xpr.a(this.u, z);
            return;
        }
        xpr.a(this.f, true);
        xpr.a(this.g, true);
        if (this.d) {
            xpr.a(this.i, true);
            xpr.a(this.h, true);
        }
    }

    public final void d() {
        j();
        c();
    }

    public final void a(int i, aeby aeby) {
        this.q = aeby;
        if (this.p && i == 0) {
            d();
        }
    }

    public final void a(View view) {
        acwc acwc = (acwc) this.r.get(view);
        if (acwc != null) {
            this.c.a(3, new acvs(acwc), null);
        }
    }

    static {
        xtl.b("MDX.PlayerControlsOverlay");
    }
}
