package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: aepu */
public final class aepu extends afgu implements affb, afnh {
    public static final aeqj a = new aeqj(0);
    public final Handler b = new Handler(Looper.getMainLooper());
    public final aeqk c;
    public final affx d;
    public volatile afne e;
    private final afez i;

    public aepu(affx affx, afez afez, afjc afjc) {
        boolean z = false;
        this.c = new aeqk();
        this.d = (affx) amqw.a((Object) affx);
        this.i = (afez) amqw.a((Object) afez);
        aeqk aeqk = this.c;
        arvt b = afjc.d.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            aorz aorz = auuo.i;
            if (aorz == null) {
                aorz = aorz.j;
            }
            if (aorz.g) {
                z = true;
            }
        }
        aeqk.a = z;
    }

    public static void a(String str) {
        new Object[1][0] = str;
    }

    public final long a(long j) {
        throw null;
    }

    public final void a(float f) {
        throw null;
    }

    public final void a(String str, aajf aajf) {
        throw null;
    }

    public final void b(float f) {
        throw null;
    }

    public final aahr e() {
        throw null;
    }

    public final boolean g() {
        throw null;
    }

    public final int i() {
        throw null;
    }

    public final int j() {
        throw null;
    }

    public final aerm k() {
        throw null;
    }

    public final float s() {
        throw null;
    }

    public final void a(aaje aaje, aevc aevc) {
        this.d.a((aaje) amqw.a((Object) aaje), new aeqm(new aeqk(), (aevc) amqw.a((Object) aevc), this.i));
    }

    public final void a(aajs aajs, affa affa, String str, aajj aajj, afjt afjt, aevc aevc, float f, float f2, boolean z, int i) {
        afjt afjt2 = afjt;
        float f3 = f;
        amqw.a((Object) aajs);
        amqw.a((Object) affa);
        amqw.a((Object) str);
        boolean z2 = afjt2 == null || (afjt2 instanceof afkh);
        amqw.a(z2);
        amqw.a((Object) aevc);
        z2 = f3 >= 0.0f && ((double) f3) <= 1.0d;
        amqw.a(z2);
        double d = (double) f2;
        z2 = d >= 0.25d && d <= 2.0d;
        amqw.a(z2);
        amqw.a((Object) aajj);
        if (this.c.a()) {
            aepu.a("loadVideo");
            this.b.post(new aept(this, aajs, affa, str, aajj, afjt, aevc, f, f2, z, i));
            return;
        }
        aeuy aeqm = new aeqm(this.c, aevc, this.i);
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(z);
        objArr[2] = affa;
        objArr[3] = Integer.valueOf(aepu.a(aeqm));
        aajs aajs2 = aajs;
        objArr[4] = aajs2.c;
        aeqm.b();
        this.e = this.d.a(aajs2, affa, str, aajj, (afkh) afjt2, aeqm, f, f2, z, i);
    }

    public final void a(aajs aajs, affa affa, String str, aajj aajj, aevc aevc, amro amro, amro amro2, long j) {
        amqw.a((Object) aajs);
        amqw.a((Object) affa);
        amqw.a((Object) str);
        amqw.a((Object) aajj);
        amqw.a((Object) aevc);
        amqw.a((Object) amro);
        amqw.a((Object) amro2);
        boolean z = j > 0 || j == -1;
        amqw.a(z);
        if (this.c.a()) {
            aepu.a("queueVideo");
            this.b.post(new aepw(this, aajs, affa, str, aajj, aevc, amro, amro2, j));
            return;
        }
        Object[] objArr = new Object[]{str, Long.valueOf(j), affa, Integer.valueOf(aepu.a(new affw(aajs, affa, str, aajj, new aeqm(this.c, aevc, this.i), amro, amro2, j).e)), aajs.c};
        this.d.a(r0);
    }

    public final void bx_() {
        if (this.c.a()) {
            aepu.a("playNextInQueue");
            this.b.post(new aeqc(this));
            return;
        }
        this.d.bx_();
    }

    public final void b() {
        if (this.c.a()) {
            aepu.a("clearQueue");
            Handler handler = this.b;
            affx affx = this.d;
            affx.getClass();
            handler.post(new aeqb(affx));
            return;
        }
        this.d.b();
    }

    public final void c() {
        if (this.c.a()) {
            aepu.a("reselectStreams");
            Handler handler = this.b;
            affx affx = this.d;
            affx.getClass();
            handler.post(new aeqe(affx));
            return;
        }
        this.d.c();
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return this.d.a((aajs) amqw.a((Object) aajs), (aajj) amqw.a((Object) aajj), z, afgt, i);
    }

    public final aahr d() {
        xak.a();
        return this.d.d();
    }

    public final boolean f() {
        xak.a();
        return this.d.f();
    }

    public final aeql h() {
        xak.a();
        return aeql.a(this.d.o(), this.d.t(), this.d.u(), this.d.v(), this.d.w());
    }

    public final String l() {
        xak.a();
        return this.d.l();
    }

    public final void m() {
        if (this.c.a()) {
            aepu.a("playVideo");
            this.b.post(new aeqd(this));
            return;
        }
        this.d.m();
    }

    public final void n() {
        if (this.c.a()) {
            aepu.a("pauseVideo");
            this.b.post(new aeqg(this));
            return;
        }
        this.d.n();
    }

    public final void b(long j) {
        if (this.c.a()) {
            aepu.a("seekTo");
            this.b.post(new aeqf(this, j));
            return;
        }
        new Object[1][0] = Long.valueOf(j);
        this.d.b(j);
    }

    public final void o() {
        if (this.c.a()) {
            aepu.a("stopVideo");
            this.b.post(new aeqi(this));
            return;
        }
        this.d.a(true);
    }

    public final void p() {
        if (this.c.a()) {
            aepu.a("blockingStopVideo");
            this.b.post(new aeqh(this));
            return;
        }
        this.d.p();
    }

    public final void q() {
        if (this.c.a()) {
            aepu.a("clearVideoFrame");
            Handler handler = this.b;
            affx affx = this.d;
            affx.getClass();
            handler.post(new aepv(affx));
            return;
        }
        this.d.q();
    }

    public final void a(afjt afjt) {
        amqw.a(afjt instanceof afkh);
        if (this.c.a()) {
            aepu.a("attachMediaView");
            this.b.post(new aepy(this, afjt));
            return;
        }
        new Object[1][0] = afjt;
        this.d.a((afkh) afjt);
    }

    public final void r() {
        if (this.c.a()) {
            aepu.a("detachMediaView");
            this.b.post(new aepx(this));
            return;
        }
        this.d.r();
    }

    public final afne t() {
        return this.e;
    }

    public static affa c(long j) {
        return new affa(j);
    }

    public static affa a(long j, long j2, long j3) {
        return new affa(j, j2, j3);
    }

    public static int a(aeuy aeuy) {
        return System.identityHashCode(aeuy) % 100;
    }
}
