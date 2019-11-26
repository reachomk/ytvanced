package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: afbf */
public final class afbf implements afdr {
    private static final aerm m;
    private static final Set n = Collections.singleton(Integer.valueOf(aaho.RAW.ax));
    public final xhv a;
    public aeuy b = aeuy.e;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public aahr h;
    public long i;
    public int j;
    public int k;
    public float l;
    private final Context o;
    private final afjj p;
    private final afgz q;
    private final aepn r;
    private final afjc s;
    private final AtomicReference t = new AtomicReference();
    private final afbe u = new afbe(this);
    private String v;
    private int w = 0;

    public afbf(Context context, afjj afjj, xhv xhv, afgz afgz, aepn aepn, afjc afjc) {
        this.o = context;
        this.p = afjj;
        this.a = xhv;
        this.q = afgz;
        this.r = aepn;
        this.s = afjc;
    }

    public final long a(long j) {
        return -1;
    }

    public final void a(afkh afkh) {
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

    public final void c() {
    }

    public final aahr d() {
        return null;
    }

    public final int i() {
        return -1;
    }

    public final int j() {
        return -1;
    }

    public final void q() {
    }

    public final void r() {
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
        aaje.i.a(null);
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        this.l = f;
        aevd aevd = new aevd(aeuy);
        this.b = aevd;
        this.v = str;
        try {
            afgv a = a(aajs, aajj, null, Integer.MAX_VALUE, str);
            int i2 = a.h;
            if (i2 != Integer.MAX_VALUE) {
                aevd.a("lmdu", (aevf) new aetw(Integer.toString(i2)));
            }
            aahr aahr = a.b[0];
            aevd.a(new aetv(null, aahr, null, a.d, a.e, a.f, 1, -1, 0));
            aevd.j();
            this.g = z;
            this.w = i;
            a(aahr, affa.a);
            return afne.NATIVE_MEDIA_PLAYER;
        } catch (afgr e) {
            aevd.a(new afif("fmt.noneavailable", 0, e));
            return afne.NATIVE_MEDIA_PLAYER;
        }
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return a(aajs, aajj, afgt, i, afgs.c);
    }

    public final aahr e() {
        return this.h;
    }

    private final void a(aahr aahr, long j) {
        String str = "Media Player error preparing video";
        this.h = aahr;
        this.i = j;
        b(true);
        this.g = true;
        int i = (int) aahr.c;
        this.j = i;
        this.b.a(0, (long) i);
        try {
            aeps a = this.r.a(aahr, false);
            a.a((1 & this.w) == 0 ? 3 : 4);
            a.a(this.u);
            this.p.f();
            Uri uri = aahr.d;
            this.t.set(a);
            if (uri != null) {
                try {
                    this.b.a();
                    a.a(this.o, uri, null);
                    a.a();
                    this.b.b(a.f());
                    c(false);
                    return;
                } catch (IOException e) {
                    xtl.b(str, (Throwable) e);
                    this.b.a(new afif("android.fw.prepare", 0, e));
                    return;
                } catch (IllegalArgumentException e2) {
                    xtl.b(str, (Throwable) e2);
                    this.b.a(new afif("android.fw.ise", 0, e2));
                    return;
                } catch (IllegalStateException e3) {
                    xtl.b("Error calling mediaPlayer", e3);
                    return;
                }
            }
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 43) + valueOf2.length());
            stringBuilder.append("Media Player null pointer preparing video ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf2);
            xtl.d(stringBuilder.toString());
            this.b.a(new afif("android.fw.npe", 0, new NullPointerException()));
        } catch (InstantiationException e22) {
            xtl.c("Factory failed to create a MediaPlayer for the stream");
            this.b.a(new afif("android.fw.create", 0, e22));
        }
    }

    public final boolean f() {
        return this.t.get() != null && this.d;
    }

    public final long o() {
        aeps aeps = (aeps) this.t.get();
        if (aeps != null && this.c) {
            this.i = (long) aeps.g();
        }
        return this.i;
    }

    public final long u() {
        return (long) this.j;
    }

    public final long v() {
        return (long) ((((float) this.k) / 100.0f) * ((float) this.j));
    }

    public final aerm k() {
        return m;
    }

    public final void m() {
        h();
    }

    public final void h() {
        this.g = true;
        aeps aeps = (aeps) this.t.get();
        if (aeps != null) {
            try {
                if (this.c) {
                    aeps.c();
                    this.d = true;
                    this.b.c();
                }
            } catch (IllegalStateException e) {
                xtl.b("Error calling mediaPlayer", e);
            }
        }
    }

    public final void n() {
        aeps aeps = (aeps) this.t.get();
        if (aeps != null && this.c) {
            try {
                aeps.d();
                this.d = false;
                this.g = false;
                this.b.d();
                c(false);
                return;
            } catch (IllegalStateException e) {
                xtl.b("Error calling mediaPlayer", e);
                return;
            }
        }
        if (this.g) {
            this.g = false;
            this.b.d();
        }
    }

    public final void b(long j) {
        if (this.i != j) {
            this.f = true;
            this.i = j;
            aeps aeps = (aeps) this.t.get();
            if (this.g) {
                this.b.a(j);
            } else {
                this.b.b(j);
            }
            if (aeps != null && this.c) {
                try {
                    aeps.a(j);
                    if (!this.d && this.g) {
                        h();
                        return;
                    }
                } catch (IllegalStateException e) {
                    xtl.b("Error calling mediaPlayer", e);
                    return;
                }
            }
            a(this.h, j);
        }
    }

    public final void a(boolean z) {
        b(z);
    }

    public final String l() {
        return this.v;
    }

    public final void p() {
        b(true);
    }

    public final void b(boolean z) {
        this.c = false;
        this.d = false;
        this.g = false;
        this.v = null;
        c(false);
        aeps aeps = (aeps) this.t.getAndSet(null);
        if (aeps != null) {
            this.b.c(aeps.f());
            if (z) {
                this.b.e();
            }
            aeps.e();
        }
    }

    public final void a(float f) {
        this.l = f;
        aeps aeps = (aeps) this.t.get();
        if (aeps != null) {
            aeps.a(f, f);
        }
    }

    public final boolean g() {
        return this.e;
    }

    private final afgv a(aajs aajs, aajj aajj, afgt afgt, int i, String str) {
        return this.q.a(aajj, aajs, afgt, afgz.b, n, false, true, i, str);
    }

    public final void c(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (z) {
                if (this.g) {
                    this.b.g();
                } else {
                    this.b.h();
                }
            } else if (this.g) {
                this.b.c();
            } else {
                this.b.d();
            }
        }
    }

    public final int a(aajs aajs, aajj aajj) {
        return this.s.i() ? 16 : 0;
    }

    public final boolean b(aajs aajs, aajj aajj) {
        return aajs.o();
    }

    static {
        aerl aerl = new aerl();
        aerl.a = afne.NATIVE_MEDIA_PLAYER;
        m = aerl.a();
    }
}
