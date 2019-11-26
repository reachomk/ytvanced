package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: brj */
public class brj extends cfy implements Cloneable {
    private final Context A;
    private final Class B;
    private final brb C;
    private brp D;
    private Object E;
    private List F;
    private boolean G = true;
    private boolean H;
    private boolean I;
    public final brl a;
    public brj b;
    public brj c;

    protected brj(bqy bqy, brl brl, Class cls, Context context) {
        this.a = brl;
        this.B = cls;
        this.A = context;
        brb brb = brl.a.b;
        brp brp = (brp) brb.f.get(cls);
        if (brp == null) {
            for (Entry entry : brb.f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    brp = (brp) entry.getValue();
                }
            }
        }
        if (brp == null) {
            brp = brb.a;
        }
        this.D = brp;
        this.C = bqy.b;
        for (cgd b : brl.d) {
            b(b);
        }
        b(brl.f());
    }

    /* renamed from: a */
    public brj b(cfy cfy) {
        chw.a((Object) cfy);
        return (brj) super.b(cfy);
    }

    public brj a(brp brp) {
        this.D = (brp) chw.a((Object) brp);
        this.G = false;
        return this;
    }

    public brj a(cgd cgd) {
        this.F = null;
        return b(cgd);
    }

    public brj b(cgd cgd) {
        if (cgd != null) {
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(cgd);
        }
        return this;
    }

    public brj a(brj brj) {
        this.c = brj;
        return this;
    }

    public brj b(brj brj) {
        this.b = brj;
        return this;
    }

    public brj a(Object obj) {
        return b(obj);
    }

    public final brj b(Object obj) {
        this.E = obj;
        this.H = true;
        return this;
    }

    public brj a(String str) {
        return b((Object) str);
    }

    public brj a(Uri uri) {
        return b((Object) uri);
    }

    public brj a(Integer num) {
        return (brj) b((Object) num).b(cgg.b(chg.a(this.A)));
    }

    /* renamed from: a */
    public brj clone() {
        brj brj = (brj) super.clone();
        brj.D = (brp) brj.D.clone();
        return brj;
    }

    public final cgu a(cgu cgu) {
        return a(cgu, null, this, chn.a);
    }

    private final cgu a(cgu cgu, cgd cgd, cfy cfy, Executor executor) {
        chw.a((Object) cgu);
        if (this.H) {
            cfz a = a(cgu, cgd, null, this.D, cfy.f, cfy.m, cfy.l, cfy, executor);
            Object d = cgu.d();
            if (a.a(d) && (cfy.k || !d.d())) {
                a.h();
                if (!((cfz) chw.a(d)).c()) {
                    d.a();
                }
                return cgu;
            }
            this.a.a(cgu);
            cgu.a(a);
            this.a.a(cgu, a);
            return cgu;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final cgt a(ImageView imageView) {
        cfy e;
        cgu cgm;
        chv.a();
        chw.a((Object) imageView);
        if (!(b(2048) || !this.p || imageView.getScaleType() == null)) {
            switch (brm.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    e = ((cfy) clone()).e();
                    break;
                case 2:
                    e = ((cfy) clone()).g();
                    break;
                case 3:
                case 4:
                case 5:
                    e = ((cfy) clone()).f();
                    break;
                case 6:
                    e = ((cfy) clone()).g();
                    break;
            }
        }
        e = this;
        brb brb = this.C;
        Class cls = this.B;
        cgn cgn = brb.d;
        if (Bitmap.class.equals(cls)) {
            cgm = new cgm(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            cgm = new cgl(imageView);
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 64);
            stringBuilder.append("Unhandled class: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (cgt) a(cgm, null, e, chn.a);
    }

    public final cga a(int i, int i2) {
        cgb cgb = new cgb(i, i2);
        return (cga) a(cgb, cgb, this, chn.b);
    }

    private final cfz a(cgu cgu, cgd cgd, cgc cgc, brp brp, bre bre, int i, int i2, cfy cfy, Executor executor) {
        cgc cfx;
        cgc cgc2;
        cgk a;
        int i3;
        cfy cfy2;
        cfz a2;
        cfy cfy3 = cfy;
        if (this.c != null) {
            cfx = new cfx(cgc);
            cgc2 = cfx;
        } else {
            cgc2 = null;
            cfx = cgc;
        }
        brj brj = this.b;
        if (brj == null) {
            a = a(cgu, cgd, cfy, cfx, brp, bre, i, i2, executor);
        } else if (this.I) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else {
            bre bre2;
            int i4;
            int i5;
            int i6;
            brp brp2 = !brj.G ? brj.D : brp;
            if (brj.b(8)) {
                bre2 = this.b.f;
            } else {
                i4 = brm.b[bre.ordinal()];
                if (i4 == 1) {
                    bre2 = bre.NORMAL;
                } else if (i4 == 2) {
                    bre2 = bre.HIGH;
                } else if (i4 == 3 || i4 == 4) {
                    bre2 = bre.IMMEDIATE;
                } else {
                    String valueOf = String.valueOf(this.f);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
                    stringBuilder.append("unknown priority: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            bre bre3 = bre2;
            brj = this.b;
            i3 = brj.m;
            i4 = brj.l;
            if (!chv.a(i, i2) || this.b.l()) {
                i5 = i4;
                i6 = i3;
            } else {
                i6 = cfy3.m;
                i5 = cfy3.l;
            }
            a = new cgk(cfx);
            cfz a3 = a(cgu, cgd, cfy, (cgc) a, brp, bre, i, i2, executor);
            this.I = true;
            cfy2 = this.b;
            a2 = cfy2.a(cgu, cgd, (cgc) a, brp2, bre3, i6, i5, cfy2, executor);
            this.I = false;
            a.a = a3;
            a.b = a2;
        }
        cgk cgk = a;
        if (cgc2 == null) {
            return cgk;
        }
        int i7;
        int i8;
        brj brj2 = this.c;
        int i9 = brj2.m;
        i3 = brj2.l;
        if (!chv.a(i, i2) || this.c.l()) {
            i7 = i3;
            i8 = i9;
        } else {
            i8 = cfy3.m;
            i7 = cfy3.l;
        }
        cfy2 = this.c;
        cfx = cgc2;
        a2 = cfy2.a(cgu, cgd, cgc2, cfy2.D, cfy2.f, i8, i7, cfy2, executor);
        cfx.a = cgk;
        cfx.b = a2;
        return cfx;
    }

    private final cfz a(cgu cgu, cgd cgd, cfy cfy, cgc cgc, brp brp, bre bre, int i, int i2, Executor executor) {
        Context context = this.A;
        brb brb = this.C;
        Object obj = this.E;
        Class cls = this.B;
        List list = this.F;
        buv buv = brb.g;
        chd chd = brp.a;
        cgi cgi = (cgi) cgi.a.a();
        if (cgi == null) {
            cgi = new cgi();
        }
        cgi cgi2 = cgi;
        cgi2.a(context, brb, obj, cls, cfy, i, i2, bre, cgu, cgd, list, cgc, buv, chd, executor);
        return cgi2;
    }

    public /* synthetic */ cfy b() {
        return (brj) clone();
    }

    static {
        ((cgg) ((cgg) new cgg().a(bup.b)).a(bre.LOW)).d();
    }
}
