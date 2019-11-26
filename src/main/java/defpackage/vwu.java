package defpackage;

import android.os.CountDownTimer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: vwu */
public final class vwu implements ajan, vdo {
    public final aaas a;
    public final vws b;
    public final waw c;
    public final zl d = new zl();
    public aagi e;
    public CountDownTimer f;
    public vtb g;
    private final vwq h;
    private final xsc i;
    private final bcud j;
    private aokk k;
    private CountDownTimer l;
    private vdp m;
    private boolean n;
    private boolean o;
    private boolean p;

    public vwu(aaas aaas, vws vws, xsc xsc, bcud bcud, waw waw) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (vws) amqw.a((Object) vws);
        this.i = (xsc) amqw.a((Object) xsc);
        this.j = (bcud) amqw.a((Object) bcud);
        this.c = (waw) amqw.a((Object) waw);
        vws.a(new vww(this));
        this.h = vws.g();
        vwq vwq = this.h;
        if (vwq != null) {
            vwq.a(new vwz(this));
        }
        b();
    }

    public final long e() {
        return 1;
    }

    public final void b() {
        vwu.a(this.l);
        vwu.a(this.f);
        this.b.f();
        vwq vwq = this.h;
        if (vwq != null) {
            vwq.a();
        }
        this.n = false;
        this.e = null;
        this.k = null;
        this.m = null;
        this.p = false;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(new vwx(this))};
    }

    public final boolean a(vdp vdp) {
        vso a = vdp.a();
        int i = 0;
        if (!(a instanceof vsu)) {
            return false;
        }
        b();
        this.m = vdp;
        this.e = (vsu) a;
        aokk aokk = a.i.c.E;
        if (aokk == null) {
            aokk = aokk.c;
        }
        this.k = aokk;
        aago ad = this.e.ad();
        this.n = false;
        if (ad == null || ad.g() == null || ad.i() == null || ad.i().size() == 0) {
            vdp.a(vra.SURVEY_ENDED);
            return true;
        }
        aybu Z = this.e.Z();
        boolean z = (Z == null || this.h == null) ? false : true;
        this.p = z;
        this.b.a(ad.g(), ad.i(), ad.a());
        this.b.a((int) TimeUnit.MILLISECONDS.convert((long) ad.b(), TimeUnit.SECONDS));
        if (this.e.Y() != null) {
            this.b.d();
        }
        z = a.W();
        this.o = z;
        if (z && this.e.ac()) {
            g();
        }
        if (this.p) {
            this.h.a(Z);
        }
        this.c.a();
        this.g = new vtb(this.k, this.i);
        this.b.a(true);
        while (true) {
            zl zlVar = this.d;
            if (i >= zlVar.b) {
                break;
            }
            ((vwy) zlVar.a(i)).a(true);
            i++;
        }
        if (this.p) {
            this.h.a(true);
            this.f = new vxa(this, (int) TimeUnit.MILLISECONDS.convert((long) Z.b, TimeUnit.SECONDS));
            this.f.start();
            this.a.a(Z.d, f());
        } else {
            d();
        }
        this.j.e_(aiui.ENABLE);
        return true;
    }

    public final void a() {
        b();
    }

    private final void g() {
        this.n = true;
        this.b.e();
        this.c.b();
    }

    public final void c() {
        vtb vtb = this.g;
        if (vtb != null) {
            vtb.a();
            this.c.a(this.g);
        }
        a(vra.SURVEY_ENDED);
    }

    public final void a(vra vra) {
        this.j.e_(aiui.DISABLE);
        vwu.a(this.l);
        this.b.a(false);
        this.c.a(vra);
        vdp vdp = this.m;
        if (vdp != null) {
            vdp.a(vra);
            this.m = null;
        }
        b();
        int i = 0;
        while (true) {
            zl zlVar = this.d;
            if (i < zlVar.b) {
                ((vwy) zlVar.a(i)).a(false);
                i++;
            } else {
                return;
            }
        }
    }

    public static void a(CountDownTimer countDownTimer) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void a(long j) {
        aagi aagi = this.e;
        if (!(aagi == null || aagi.X().size() == 0)) {
            long b = ((long) (((aago) this.e.X().get(0)).b() * 1000)) - j;
            waw waw = this.c;
            vqg vqg = new vqg(b);
            xak.a();
            if (waw.i != null) {
                waw.i.a(vqg);
            }
            if (j > 0) {
                this.b.a((int) j);
                if (this.o && b >= ((long) (this.e.ab() * 1000)) && !this.n) {
                    g();
                }
                return;
            }
            c();
        }
    }

    public final void d() {
        vwq vwq = this.h;
        if (vwq != null) {
            vwq.a(false);
        }
        this.a.a(this.e.aa(), f());
        this.l = new vxb(this, (int) TimeUnit.MILLISECONDS.convert((long) this.e.ad().b(), TimeUnit.SECONDS));
        this.l.start();
        vtb vtb = this.g;
        if (vtb != null) {
            vtb.d = vtb.a.a();
        }
    }

    public final Map f() {
        if (this.e == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
        return hashMap;
    }
}
