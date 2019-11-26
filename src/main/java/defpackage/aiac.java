package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: aiac */
public final class aiac {
    private wxi A;
    private Vibrator B;
    private boolean C;
    private final aian D;
    public final aiaa a;
    public final aaas b;
    public final Handler c;
    public final acys d;
    public final aity e;
    public boolean f;
    public airc g;
    public wxi h;
    public aovw i;
    public boolean[] j;
    public boolean[] k;
    public int l = -1;
    public aovq m;
    public List n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public final aiaq s;
    public boolean t;
    public final aiai u;
    public final aiag v;
    private final Context w;
    private final akkq x;
    private final bcud y;
    private final acvx z;

    public aiac(Context context, aiaa aiaa, akkq akkq, aaas aaas, bcud bcud, afqv afqv, afti afti, acvx acvx, aity aity) {
        this.w = (Context) amqw.a((Object) context);
        this.a = (aiaa) amqw.a((Object) aiaa);
        this.x = (akkq) amqw.a((Object) akkq);
        this.b = (aaas) amqw.a((Object) aaas);
        this.y = bcud;
        this.c = new Handler(context.getMainLooper());
        this.d = new acys(afqv, afti, "iv");
        this.z = acvx;
        aiaa.a(new aiaf(this));
        this.e = (aity) amqw.a((Object) aity);
        this.D = new aian(this);
        this.s = new aiaq(this);
        this.u = new aiai(this);
        this.v = new aiag(this);
    }

    public final void a() {
        this.f = false;
        wxi wxi = this.A;
        if (wxi != null) {
            wxi.a();
            this.A = null;
        }
        wxi = this.h;
        if (wxi != null) {
            wxi.a();
            this.h = null;
        }
        this.a.e();
        this.C = false;
        this.o = false;
        this.p = false;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = null;
        this.i = null;
        this.r = -1;
    }

    public final void a(aovw aovw, String str) {
        if (this.f) {
            a();
        }
        this.f = true;
        this.i = aovw;
        if (aovw != null) {
            this.a.b(this.q);
            if (aovw.d.size() != 0) {
                this.n = aovw.d;
                int size = this.n.size();
                this.j = new boolean[size];
                this.k = new boolean[size];
            }
        }
        aovw = this.i;
        if (!(aovw == null || (aovw.a & 2) == 0)) {
            aovs aovs = aovw.c;
            if (aovs == null) {
                aovs = aovs.f;
            }
            aygk aygk = aovs.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygm a = aiac.a(aygk);
            this.A = a(a, new aiae(this, a));
        }
        this.d.a("CPN", str);
    }

    public static aygm a(aygk aygk) {
        return aklb.a(aygk, 40);
    }

    public final wxi a(aygm aygm, aiad aiad) {
        Uri uri;
        if (aygm == null) {
            uri = null;
        } else {
            uri = xvt.d(aygm.b);
        }
        if (uri == null) {
            return null;
        }
        wxi a = wxi.a(aiad);
        this.x.b(uri, wxl.a(this.c, a));
        return a;
    }

    public final boolean b() {
        boolean[] zArr = this.j;
        if (zArr != null) {
            int i = this.l;
            if (i >= 0 && i < zArr.length && zArr[i]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    public final boolean c() {
        /*
        r6 = this;
        r0 = r6.m;
        r1 = 0;
        if (r0 == 0) goto L_0x0063;
    L_0x0005:
        r0 = r0.i;
        if (r0 != 0) goto L_0x000b;
    L_0x0009:
        r0 = defpackage.awgs.c;
    L_0x000b:
        r0 = r0.a;
        r0 = r0.size();
        r2 = 1;
        if (r0 == 0) goto L_0x0062;
    L_0x0014:
        r0 = r6.g;
        if (r0 == 0) goto L_0x0061;
    L_0x0018:
        r0 = r0.ordinal();
        if (r0 == 0) goto L_0x0039;
    L_0x001e:
        if (r0 == r2) goto L_0x0036;
    L_0x0020:
        r3 = 2;
        if (r0 == r3) goto L_0x0033;
    L_0x0023:
        r3 = 3;
        if (r0 == r3) goto L_0x0030;
    L_0x0026:
        r3 = 4;
        if (r0 == r3) goto L_0x0039;
    L_0x0029:
        r0 = "Unhandled player visibility state.";
        defpackage.xtl.d(r0);
        r0 = 0;
        goto L_0x003b;
    L_0x0030:
        r0 = defpackage.awgx.BACKGROUND;
        goto L_0x003b;
    L_0x0033:
        r0 = defpackage.awgx.FULLSCREEN;
        goto L_0x003b;
    L_0x0036:
        r0 = defpackage.awgx.MINI;
        goto L_0x003b;
    L_0x0039:
        r0 = defpackage.awgx.STANDARD;
    L_0x003b:
        if (r0 == 0) goto L_0x0061;
    L_0x003d:
        r3 = r6.m;
        r3 = r3.i;
        if (r3 != 0) goto L_0x0045;
    L_0x0043:
        r3 = defpackage.awgs.c;
    L_0x0045:
        r4 = new anyc;
        r3 = r3.a;
        r5 = defpackage.awgs.b;
        r4.<init>(r3, r5);
        r3 = r4.iterator();
    L_0x0052:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0061;
    L_0x0058:
        r4 = r3.next();
        r4 = (defpackage.awgx) r4;
        if (r0 != r4) goto L_0x0052;
    L_0x0060:
        return r2;
    L_0x0061:
        return r1;
    L_0x0062:
        return r2;
    L_0x0063:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiac.c():boolean");
    }

    public final void a(boolean z, boolean z2, int i) {
        if (!this.o || this.p != z) {
            this.o = true;
            this.p = z;
            d();
            this.a.a(z, z2);
            if (xrn.c(this.w)) {
                if (this.B == null) {
                    this.B = (Vibrator) this.w.getSystemService("vibrator");
                }
                if (this.B.hasVibrator()) {
                    this.B.vibrate((long) this.w.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
                }
            }
            if (z && !this.k[this.l] && i > 0) {
                this.c.removeCallbacks(this.D);
                this.c.postDelayed(this.D, (long) i);
            }
        }
    }

    public final void a(boolean z) {
        if (this.o) {
            this.c.removeCallbacks(this.D);
            this.o = false;
            this.a.a(z);
            d();
        }
    }

    public final void d() {
        this.y.e_(aiui.a(this.o));
    }

    public final void e() {
        aovw aovw = this.i;
        if (!(aovw == null || (aovw.a & 2) == 0)) {
            aovs aovs;
            boolean z = false;
            if (this.g == airc.FULLSCREEN) {
                aovs = this.i.c;
                if (aovs == null) {
                    aovs = aovs.f;
                }
                long j = (long) this.r;
                if (aovs.b <= j) {
                    aovs = this.i.c;
                    if (aovs == null) {
                        aovs = aovs.f;
                    }
                    if (j < aovs.c && !this.t) {
                        z = true;
                    }
                }
            }
            if (z != this.C) {
                this.C = z;
                if (z) {
                    this.a.f();
                    aovs = this.i.c;
                    if (aovs == null) {
                        aovs = aovs.f;
                    }
                    byte[] d = aovs.e.d();
                    if (d != null) {
                        this.z.a(d, null);
                    }
                    return;
                }
                this.a.g();
            }
        }
    }

    public static final aovw a(aakj aakj) {
        for (aovo aovo : aakj.a.h) {
            if (aovo != null && aovo.a == 49483894) {
                return (aovw) aovo.b;
            }
        }
        return null;
    }
}
