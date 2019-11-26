package defpackage;

import android.app.AlertDialog;
import android.text.TextUtils;
import java.util.List;

/* renamed from: laz */
public final class laz extends kzo implements xcp {
    public final fkz e;
    public final aaas f;
    public final acvx g;
    public AlertDialog h;
    private final fiz i;
    private final xci j;
    private final imj k;
    private lbc l;
    private lbe m;
    private List n;

    public laz(fiz fiz, xci xci, fkz fkz, aaas aaas, acvx acvx, imj imj, ajxx ajxx) {
        super(ajxx);
        this.i = fiz;
        this.j = (xci) amqw.a((Object) xci);
        this.e = (fkz) amqw.a((Object) fkz);
        this.f = (aaas) amqw.a((Object) aaas);
        this.g = (acvx) amqw.a((Object) acvx);
        this.k = (imj) amqw.a((Object) imj);
        h();
    }

    public final void a() {
        this.j.a((Object) this);
    }

    public final void b() {
        this.k.a(((ajxx) this.a).a);
        this.j.b(this);
    }

    public final CharSequence e() {
        return ajqy.a(((ajxx) this.a).b);
    }

    public final amuw a(amuw amuw) {
        amuv i = amuw.i();
        i.b(amuw);
        lbc lbc = this.l;
        if (lbc != null) {
            i.c(lbc);
        }
        lbe lbe = this.m;
        if (lbe != null) {
            i.c(lbe);
        }
        i.b(this.n);
        return i.a();
    }

    public final boolean f() {
        atzm atzm = ((ajxx) this.a).y;
        if (atzm == null || (atzm.b >>> 24) >= 255) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return ((ajxx) this.a).D;
    }

    private final void a(ajxv ajxv) {
        kzp kzp = this.b;
        if (ajxv == null && kzp != null) {
            kzp.az();
        } else if (kzp != null) {
            ajxx ajxx = ajxv.a;
            this.d.a(this.a, ajxx);
            this.a = ajxx;
            h();
        }
    }

    private final void h() {
        lbc lbc;
        List g;
        awib awib = ((ajxx) this.a).l;
        lbe lbe = null;
        if (awib != null && awib.b) {
            lbc = new lbc(this);
        } else {
            lbc = null;
        }
        this.l = lbc;
        if (!TextUtils.isEmpty(((ajxx) this.a).o)) {
            lbe = new lbe(this);
        }
        this.m = lbe;
        awil awil = ((ajxx) this.a).x;
        if (awil == null) {
            g = amul.g();
        } else {
            auvn auvn;
            if (awil.a == 66439850) {
                auvn = (auvn) awil.b;
            } else {
                auvn = auvn.l;
            }
            amuo j = amul.j();
            int i = 0;
            for (auvj lbb : auvn.b) {
                int i2 = i + 1;
                j.c(new lbb(this, i, lbb));
                i = i2;
            }
            g = j.a();
        }
        this.n = g;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        Object obj2;
        if (i == -1) {
            clsArr = new Class[]{fie.class, fkw.class, abgn.class, abgm.class, abgo.class};
        } else if (i == 0) {
            fie fie = (fie) obj;
            atzt atzt = ((ajxx) this.a).i;
            if (atzt != null) {
                anxl anxl = atzt.b;
                if (anxl == null) {
                    anxl = atzr.p;
                }
                atzq atzq = (atzq) ((anxo) anxl.toBuilder());
                if (atzq != null && TextUtils.equals(((ajxx) this.a).a, fie.a)) {
                    ajxx ajxx = (ajxx) this.a;
                    atzs atzs = (atzs) ((anxo) ajxx.i.toBuilder());
                    atzq.a(fie.b);
                    atzs.a(atzq);
                    ajxx.i = (atzt) ((anxl) atzs.build());
                    return null;
                }
            }
        } else if (i == 1) {
            this.i.a(false);
        } else if (i == 2) {
            abgn abgn = (abgn) obj;
            obj2 = this.a;
            if (!(obj2 == null || this.b == null || !TextUtils.equals(((ajxx) obj2).a, abgn.a))) {
                a(abgn.c.a);
                return null;
            }
        } else if (i == 3) {
            abgm abgm = (abgm) obj;
            obj2 = this.a;
            if (!(obj2 == null || this.b == null || !TextUtils.equals(((ajxx) obj2).a, abgm.a))) {
                ajxv ajxv = abgm.b.a;
                if (ajxv != null) {
                    a(ajxv);
                    return null;
                }
            }
        } else if (i == 4) {
            abgo abgo = (abgo) obj;
            obj2 = this.a;
            if (!(obj2 == null || this.b == null || !TextUtils.equals(((ajxx) obj2).a, abgo.a))) {
                a(abgo.c.a);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
