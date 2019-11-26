package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* renamed from: lax */
public final class lax extends kzo {
    private final jps e;

    public lax(jps jps, attr attr) {
        super(attr);
        this.e = jps;
    }

    public final CharSequence e() {
        arml arml;
        attr attr = (attr) this.a;
        if ((attr.a & 2) != 0) {
            arml = attr.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return xvd.a(ajqy.a(arml));
    }

    public final amuw a(amuw amuw) {
        Iterable a;
        amuv i = amuw.i();
        attr attr = (attr) this.a;
        anxp anxp = attr.k;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            jps jps = this.e;
            anxp anxp2 = attr.k;
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
            a = amuw.a(this.e.a());
        } else {
            a = amwp.a;
        }
        i.b(a);
        i.b(amuw);
        return i.a();
    }
}
