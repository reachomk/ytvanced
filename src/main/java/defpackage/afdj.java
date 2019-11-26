package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afdj */
public final class afdj implements affx, Observer {
    private final afgz A;
    private final afjc B;
    private final afjv C;
    private final aepn D;
    private final aema E;
    private final afdi F;
    private final afdk G;
    private aajs H;
    private String I;
    private boolean J;
    private afjs K;
    private aahr L;
    private int M = 0;
    public final Context a;
    public final xhv b;
    public final String c;
    public final affj d;
    public final AtomicReference e;
    public final Handler f;
    public final afdn g;
    public aeuy h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile boolean l;
    public volatile boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public aajj r;
    public aahr s;
    public aahr t;
    public afkh u;
    public long v;
    public int w;
    public int x;
    public float y;
    private final afjj z;

    public afdj(Context context, afjj afjj, xhv xhv, afgz afgz, String str, afjc afjc, afjv afjv, aepn aepn, affj affj, aema aema) {
        this.a = (Context) amqw.a((Object) context);
        this.z = (afjj) amqw.a((Object) afjj);
        this.b = (xhv) amqw.a((Object) xhv);
        this.A = (afgz) amqw.a((Object) afgz);
        this.c = (String) amqw.a((Object) str);
        this.B = (afjc) amqw.a((Object) afjc);
        this.C = (afjv) amqw.a((Object) afjv);
        this.D = (aepn) amqw.a((Object) aepn);
        this.d = affj;
        this.E = (aema) amqw.a((Object) aema);
        this.e = new AtomicReference();
        this.F = new afdi(this);
        this.G = new afdk(this);
        this.G.start();
        this.f = new Handler(context.getMainLooper());
        this.g = new afdn(this);
        this.g.start();
        this.h = aeuy.e;
    }

    private static String a(boolean z, String str) {
        return !z ? "net.unavailable" : str;
    }

    public final long a(long j) {
        return -1;
    }

    public final void a(String str, aajf aajf) {
    }

    public final boolean a(affw affw) {
        return false;
    }

    public final void b() {
    }

    public final void b(float f) {
    }

    public final void bx_() {
    }

    public final int i() {
        return -1;
    }

    public final int j() {
        return -1;
    }

    public final float s() {
        return 1.0f;
    }

    public final long t() {
        return -1;
    }

    public final int w() {
        return -1;
    }

    public final void a(aaje aaje, aeuy aeuy) {
        if (this.E.c()) {
            try {
                this.E.a(aaje, aemt.a, aeuy);
                return;
            } catch (afgr unused) {
                aepe.a("MissingStreamException in sendOnesieRequest (MediaPlayerWrapper)");
                return;
            }
        }
        aaje.i.a(null);
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        aajs aajs2 = aajs;
        aeuy aeuy2 = aeuy;
        this.d.c(afne.NATIVE_MEDIA_PLAYER);
        this.E.a(aajs2);
        this.u = (afkh) amqw.a((Object) afkh);
        this.H = aajs2;
        this.r = aajj;
        this.I = str;
        this.y = f;
        this.h = new aeux(new aevd(aeuy2));
        this.C.deleteObserver(this);
        try {
            afgv a = a(aajs, aajj, false, null, Integer.MAX_VALUE, str);
            afgq afgq = a.f;
            if (afgq.c()) {
                aeuy2.a("sc", (aevf) new aetw(Integer.toString(afgq.b)));
            }
            int i2 = a.h;
            if (i2 != Integer.MAX_VALUE) {
                aeuy2.a("lmdu", (aevf) new aetw(Integer.toString(i2)));
            }
            if (a.f.a()) {
                aeuy2.a("pmqs", (aevf) new aetw(a.c()));
            }
            aahr aahr = a.a[0];
            aahr aahr2 = a.c;
            this.L = aahr2;
            aeuy2.a(new aetv(aahr, aahr, aahr2, a.d, a.e, a.f, 1, -1, 0));
            aeuy.j();
            if (afkh instanceof afjw) {
                this.d.a(afkn.SURFACE, afne.NATIVE_MEDIA_PLAYER);
                this.u.a(afkn.SURFACE);
            } else {
                this.d.a(6, afne.NATIVE_MEDIA_PLAYER);
                this.u.e();
            }
            this.q = z;
            this.M = i;
            if (aajs.a()) {
                a(aahr);
            } else {
                a(aahr, affa.a);
            }
            this.C.addObserver(this);
            return null;
        } catch (afgr e) {
            aeuy2.a(new afif("fmt.noneavailable", 0, e.getMessage()));
            return null;
        }
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return a(aajs, aajj, z, afgt, i, afgs.c);
    }

    public final void c() {
        if (this.e.get() != null) {
            aajs aajs = this.H;
            if (!(aajs == null || aajs.c())) {
                try {
                    afgv a = a(this.H, this.r, false, null, Integer.MAX_VALUE);
                    if (a.a[0].equals(this.t)) {
                        a(a);
                        return;
                    }
                    a(a, 2);
                } catch (afgr unused) {
                }
            }
        }
    }

    private final void a(afgv afgv, int i) {
        afgv afgv2 = afgv;
        aahr aahr = afgv2.a[0];
        this.h.a(new aetv(aahr, aahr, afgv2.c, afgv2.d, afgv2.e, afgv2.f, i, -1, 0));
        this.L = afgv2.c;
        this.h.k();
        a(aahr, o());
    }

    public final aahr d() {
        return this.t;
    }

    public final aahr e() {
        return this.t;
    }

    public final void a(aahr aahr, long j) {
        amqw.a(this.u);
        boolean z = true;
        boolean z2 = this.i && aahr.equals(this.t);
        this.i = z2;
        this.j = false;
        this.t = aahr;
        this.v = j;
        if (aahr.b() != aahv.at) {
            z = false;
        }
        this.J = z;
        b(aahr);
    }

    public final void a(aahr aahr) {
        amqw.a(this.u);
        this.j = true;
        this.i = false;
        this.J = true;
        this.t = aahr;
        this.v = 0;
        b(aahr);
    }

    public final void b(aahr aahr) {
        boolean z = this.q;
        this.G.a(true);
        if (z) {
            this.G.a.sendEmptyMessage(7);
        }
        int i = (int) aahr.c;
        this.w = i;
        this.h.a(0, !this.J ? (long) i : 0);
        afkh afkh = this.u;
        if (afkh != null) {
            afkh.c();
            if (!this.u.n()) {
                this.s = aahr;
                this.u.d();
                return;
            }
        }
        try {
            aeps a = this.D.a(aahr, this.j);
            a.a((this.M & 1) == 0 ? 3 : 4);
            a.a(this.F);
            this.z.f();
            afdk afdk = this.G;
            aahs a2 = aahr.a();
            a2.a(this.I);
            a2.a(afix.a(aahr, this.r));
            Uri a3 = a2.a();
            Object[] objArr = new Object[]{a, a3};
            Handler handler = afdk.a;
            handler.sendMessage(Message.obtain(handler, 1, objArr));
            e(true);
        } catch (InstantiationException e) {
            xtl.c("Factory failed to create a MediaPlayer for the stream");
            this.h.a(new afif("android.fw.create", 0, e));
        }
    }

    public final void a(aeps aeps, afkh afkh) {
        amqw.a((Object) aeps);
        SurfaceHolder l = ((afkh) amqw.a((Object) afkh)).l();
        if (l != null) {
            try {
                this.d.a(9, afne.NATIVE_MEDIA_PLAYER);
                aeps.a(l);
            } catch (IllegalArgumentException e) {
                xtl.b("Error attaching SurfaceView. SurfaceView has been released.", (Throwable) e);
                this.h.a(new afif("player.fatalexception", o(), e));
            }
        } else if (afkh.n()) {
            Surface k = afkh.k();
            this.d.a(k, afne.NATIVE_MEDIA_PLAYER);
            aeps.a(k);
        }
    }

    public final boolean f() {
        return this.e.get() != null && this.l;
    }

    public final long o() {
        aeps aeps = (aeps) this.e.get();
        if (aeps != null && this.k) {
            this.v = (long) aeps.g();
        }
        return this.v;
    }

    public final long u() {
        return (long) this.w;
    }

    public final long v() {
        return (long) ((((float) this.x) / 100.0f) * ((float) this.w));
    }

    public final aerm k() {
        throw new UnsupportedOperationException();
    }

    public final void m() {
        this.G.a.sendEmptyMessage(2);
        e(true);
    }

    public final void n() {
        this.G.a.sendEmptyMessage(3);
        e(false);
    }

    public final void b(long j) {
        if (!this.j && this.v != j) {
            this.p = true;
            this.v = j;
            afdk afdk = this.G;
            j = Math.max(0, Math.min(j, (long) this.w));
            Handler handler = afdk.a;
            handler.sendMessage(Message.obtain(handler, 4, Long.valueOf(j)));
        }
    }

    public final void a(boolean z) {
        this.d.d(afne.NATIVE_MEDIA_PLAYER);
        d(z);
    }

    private final void d(boolean z) {
        this.g.d();
        this.G.a(z);
        e(false);
        this.H = null;
        this.I = null;
    }

    public final String l() {
        return this.I;
    }

    public final void p() {
        this.d.e(afne.NATIVE_MEDIA_PLAYER);
        d(true);
    }

    public final void b(boolean z) {
        this.k = false;
        this.l = false;
        this.q = false;
        c(false);
        aeps aeps = (aeps) this.e.getAndSet(null);
        if (aeps != null) {
            this.h.c(aeps.f());
            if (!(!z || this.n || this.o)) {
                this.h.e();
            }
            aeps.e();
        }
    }

    public final void q() {
        afkh afkh = this.u;
        if (afkh != null) {
            afkh.c();
        }
    }

    public final void a(float f) {
        this.y = f;
        aeps aeps = (aeps) this.e.get();
        if (aeps != null) {
            aeps.a(f, f);
        }
    }

    public final boolean g() {
        return this.m;
    }

    public final void a(afkh afkh) {
        this.d.a(afne.NATIVE_MEDIA_PLAYER);
        this.u = afkh;
        afkh.a(this.F);
        this.d.a(this.F, afne.NATIVE_MEDIA_PLAYER);
        aeps aeps = (aeps) this.e.get();
        if (aeps != null) {
            a(aeps, afkh);
        }
        if (this.l) {
            afkh.c(500);
        }
        e(this.l);
    }

    public final void r() {
        this.d.b(afne.NATIVE_MEDIA_PLAYER);
        if (this.u != null) {
            e(false);
            this.u.c();
            aeps aeps = (aeps) this.e.get();
            if (aeps != null) {
                this.d.a(null, afne.NATIVE_MEDIA_PLAYER);
                aeps.a(null);
                aeps.a(null);
            }
            this.u.a(null);
            this.d.a(null, afne.NATIVE_MEDIA_PLAYER);
            a(true);
            this.u = null;
        }
    }

    private final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i, String str) {
        if (z) {
            throw afgr.a();
        }
        Set o;
        afgz afgz = this.A;
        if (this.B.a(aajj.ah())) {
            o = aahv.o();
            aajj aajj2 = aajj;
        } else {
            awdg awdg = aajj.c;
            boolean z2 = false;
            if ((awdg.a & 8192) != 0) {
                aosb aosb = awdg.i;
                if (aosb == null) {
                    aosb = aosb.n;
                }
                if (aosb.d) {
                    z2 = true;
                }
            }
            o = aahv.b(z2);
        }
        return afgz.a(aajj, aajs, afgt, o, afgz.c, true, false, i, str);
    }

    public final boolean h() {
        boolean z = false;
        if (this.k) {
            if (!this.J) {
                return !this.i ? z : true;
            } else {
                z = true;
            }
        }
    }

    public final void c(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (this.q) {
                    this.h.g();
                } else {
                    this.h.h();
                }
            } else if (this.q) {
                this.h.c();
            } else {
                this.h.d();
            }
        }
    }

    public final int a(aajs aajs, aajj aajj) {
        return this.B.i() ? 16 : 0;
    }

    private final void e(boolean z) {
        afkh afkh = this.u;
        if (afkh == null) {
            return;
        }
        if (z) {
            afkh.a(1);
        } else {
            afkh.b(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    static defpackage.afif[] a(int r4, int r5, boolean r6, boolean r7, long r8, defpackage.aahr r10) {
        /*
        r0 = "fmt.unplayable";
        r1 = 1;
        r2 = 0;
        if (r4 == r1) goto L_0x0026;
    L_0x0006:
        r3 = 261; // 0x105 float:3.66E-43 double:1.29E-321;
        if (r4 == r3) goto L_0x0026;
    L_0x000a:
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 != r7) goto L_0x0035;
    L_0x000e:
        r7 = r10.b();
        r10 = new java.lang.StringBuilder;
        r2 = 16;
        r10.<init>(r2);
        r2 = "itag.";
        r10.append(r2);
        r10.append(r7);
        r2 = r10.toString();
        goto L_0x006e;
    L_0x0026:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == r3) goto L_0x0064;
    L_0x002a:
        r3 = -1010; // 0xfffffffffffffc0e float:NaN double:NaN;
        if (r5 == r3) goto L_0x005f;
    L_0x002e:
        r0 = -1007; // 0xfffffffffffffc11 float:NaN double:NaN;
        if (r5 == r0) goto L_0x0058;
    L_0x0032:
        switch(r5) {
            case -1005: goto L_0x004d;
            case -1004: goto L_0x0064;
            case -1003: goto L_0x0042;
            case -1002: goto L_0x0037;
            default: goto L_0x0035;
        };
    L_0x0035:
        r0 = r2;
        goto L_0x006e;
    L_0x0037:
        r0 = "net.dns";
        r0 = defpackage.afdj.a(r7, r0);
        r2 = defpackage.afdj.c(r10);
        goto L_0x006e;
    L_0x0042:
        r0 = "net.connect";
        r0 = defpackage.afdj.a(r7, r0);
        r2 = defpackage.afdj.c(r10);
        goto L_0x006e;
    L_0x004d:
        r0 = "net.closed";
        r0 = defpackage.afdj.a(r7, r0);
        r2 = defpackage.afdj.c(r10);
        goto L_0x006e;
    L_0x0058:
        r2 = defpackage.afdj.d(r10);
        r0 = "fmt.decode";
        goto L_0x006e;
    L_0x005f:
        r2 = defpackage.afdj.d(r10);
        goto L_0x006e;
    L_0x0064:
        r0 = "net.timeout";
        r0 = defpackage.afdj.a(r7, r0);
        r2 = defpackage.afdj.c(r10);
    L_0x006e:
        if (r0 != 0) goto L_0x008d;
    L_0x0070:
        r7 = new java.lang.StringBuilder;
        r10 = 27;
        r7.<init>(r10);
        r10 = "w.";
        r7.append(r10);
        r7.append(r4);
        r4 = ";e.";
        r7.append(r4);
        r7.append(r5);
        r2 = r7.toString();
        r0 = "android.fw";
    L_0x008d:
        r4 = new afif;
        r4.<init>(r0, r8, r2);
        r5 = 0;
        if (r6 != 0) goto L_0x00ab;
    L_0x0095:
        r7 = r4.e();
        if (r7 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00ab;
    L_0x009c:
        r6 = 2;
        r6 = new defpackage.afif[r6];
        r6[r5] = r4;
        r4 = new afif;
        r5 = "net.retryexhausted";
        r4.<init>(r5, r8);
        r6[r1] = r4;
        return r6;
    L_0x00ab:
        r7 = new defpackage.afif[r1];
        if (r6 != 0) goto L_0x00b3;
    L_0x00af:
        r4 = r4.f();
    L_0x00b3:
        r7[r5] = r4;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdj.a(int, int, boolean, boolean, long, aahr):afif[]");
    }

    private static String c(aahr aahr) {
        if (aahr == null) {
            return "";
        }
        String valueOf = String.valueOf(aahr.d.getHost());
        String str = "shost.";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    private static String d(aahr aahr) {
        if (aahr == null) {
            return "";
        }
        int b = aahr.b();
        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append("itag.");
        stringBuilder.append(b);
        return stringBuilder.toString();
    }

    public final void update(Observable observable, Object obj) {
        if (observable == this.C) {
            x();
        }
    }

    public final void x() {
        afjs a = afdp.a(this.C, this.u);
        if (this.u != null && this.H != null && this.r != null && !a.equals(this.K)) {
            this.K = a;
            try {
                afgv a2 = a(this.H, this.r, false, null, Integer.MAX_VALUE, this.I);
                a(a2);
                if (!this.r.f()) {
                    return;
                }
                if (!a2.a[0].equals(this.t)) {
                    a(a2, 10001);
                }
            } catch (afgr unused) {
            }
        }
    }

    private final void a(afgv afgv) {
        aahr aahr = afgv.c;
        if (!(this.L == null || aahr.b() == this.L.b())) {
            aeuy aeuy = this.h;
            aahr aahr2 = this.t;
            aeuy.a(new aetv(aahr2, aahr2, aahr, afgv.d, afgv.e, afgv.f, 10001, -1, 0));
        }
        this.L = aahr;
    }
}
