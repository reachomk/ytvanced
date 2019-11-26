package defpackage;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/* renamed from: lbw */
public final class lbw implements afwz, fao, xsu {
    public final fmx a;
    public final List b = new ArrayList();
    public final akvp c;
    public final afwx d;
    public final akpi e;
    public final acvx f;
    public fal g;
    public boolean h;
    private final String i;
    private final zzl j;

    public lbw(fmx fmx, akvp akvp, afwx afwx, akpi akpi, zzl zzl, acvx acvx, String str) {
        this.a = fmx;
        this.c = akvp;
        this.d = afwx;
        this.e = akpi;
        this.f = (acvx) amqw.a((Object) acvx);
        this.i = (String) amqw.a((Object) str);
        this.j = zzl;
    }

    public final void a(float f) {
    }

    public final void a(String str) {
    }

    public final void b(int i) {
    }

    public final int a() {
        fal fal = this.g;
        return fal != null ? fal.b() : -1;
    }

    public final void a(String str, boolean z, int i, long j, boolean z2) {
        int a = a();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lbt lbt = (lbt) this.b.get(i2);
            if (str.equals(lbt.a.j)) {
                if (str.equals("FEnotifications_inbox") && i > 0) {
                    lbt.c.e();
                }
                if (i2 != a) {
                    if (z) {
                        xpp.a(this.g.a(i2), true, 0, null);
                        zzl zzl = this.j;
                        if (zzl != null && zzl.b() != null) {
                            avmc avmc = zzl.b().q;
                            if (avmc == null) {
                                avmc = avmc.m;
                            }
                            if (avmc.l && !this.h && z2) {
                                this.g.a(i2, false, true);
                                this.h = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void b() {
        for (lbt lbt : this.b) {
            lbt.c.c();
        }
        this.b.clear();
        fal fal = this.g;
        if (fal != null) {
            fal.a();
        }
    }

    public final CharSequence a(String str, boolean z) {
        CharSequence format;
        if (z) {
            try {
                format = String.format(this.i, new Object[]{str});
                return format;
            } catch (IllegalFormatException e) {
                xtl.a("Tab's description cannot be generated due to a formatting error.", e);
            }
        }
        return format;
    }

    public final akwy d() {
        int a = a();
        return (a < this.b.size() && a >= 0) ? ((lbt) this.b.get(a)).c : null;
    }

    public final akbc e() {
        int a = a();
        return (a < this.b.size() && a >= 0) ? ((lbt) this.b.get(a)).a : null;
    }

    public final void a(int i, boolean z) {
        if (i < this.b.size() && i >= 0) {
            lbt lbt = (lbt) this.b.get(i);
            lbt.c.d();
            jmz jmz = lbt.d;
            if (jmz != null) {
                jmz.f();
            }
            this.d.c(lbt.a.j);
            if (!z) {
                byte[] bArr = lbt.a.k;
                if (bArr != null) {
                    this.f.a(3, new acvs(bArr), null);
                }
            }
        }
    }

    public final boolean a(int i) {
        if (i >= 0 && i < this.b.size()) {
            ((lbt) this.b.get(i)).c.m();
        }
        return true;
    }

    public final void c() {
        b();
        fal fal = this.g;
        if (fal != null) {
            fal.b(this);
        }
    }
}
