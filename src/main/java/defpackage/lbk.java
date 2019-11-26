package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* renamed from: lbk */
public final class lbk extends kzo {
    private final jps e;

    public lbk(jps jps, ayix ayix) {
        super(ayix);
        this.e = jps;
    }

    public final boolean f() {
        return (((ayix) this.a).c >>> 24) < 255;
    }

    public final CharSequence e() {
        arml arml = ((ayix) this.a).b;
        if (arml == null) {
            arml = arml.f;
        }
        return ajqy.a(arml);
    }

    public final amuw a(amuw amuw) {
        Iterable a;
        amuv i = amuw.i();
        ayix ayix = (ayix) this.a;
        anxp anxp = ayix.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            jps jps = this.e;
            anxp anxp2 = ayix.g;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
            anxp2.a(access$000);
            Object b = anxp2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            jps.a((auvn) b);
            a = amul.a(this.e.a());
        } else {
            a = amul.g();
        }
        i.b(a);
        i.b(amuw);
        return i.a();
    }

    public final boolean g() {
        return ((ayix) this.a).h;
    }
}
