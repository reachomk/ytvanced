package defpackage;

import com.google.protos.youtube.api.innertube.GeoSearchDetailsRendererOuterClass;

/* renamed from: iuk */
public final class iuk extends aktw {
    private final akpk a = new akpk();

    public iuk(axdw axdw) {
        anxp anxp = axdw.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            akpk akpk = this.a;
            anxp anxp2 = axdw.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer);
            anxp2.a(access$000);
            Object b = anxp2.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            akpk.add(b);
        }
    }

    public final aknh a() {
        return this.a;
    }
}
