package defpackage;

import com.google.protos.youtube.api.innertube.AddConnectionSectionRendererOuterClass;

/* renamed from: xwq */
public final class xwq extends aktw {
    private final akpk a = new akpk();

    public xwq(akvz akvz, aoms aoms) {
        akvz.a(aoms.class);
        for (aomu aomu : aoms.b) {
            Object obj = null;
            if (aomu != null) {
                int i = aomu.a;
                if (i == 105876287) {
                    obj = (aomo) aomu.b;
                } else if (i == 79129962) {
                    obj = (aqeq) aomu.b;
                } else if (i == 154581033) {
                    obj = (aomm) aomu.b;
                }
            }
            if (obj != null) {
                this.a.add(obj);
            }
        }
        if (!this.a.isEmpty()) {
            anxp anxp = aoms.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(AddConnectionSectionRendererOuterClass.addConnectionSectionHeaderRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                akpk akpk = this.a;
                anxp anxp2 = aoms.c;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$000 = anxl.checkIsLite(AddConnectionSectionRendererOuterClass.addConnectionSectionHeaderRenderer);
                anxp2.a(access$000);
                Object b = anxp2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                akpk.add(0, b);
                this.a.add(new akvh());
            }
        }
    }

    public final aknh a() {
        return this.a;
    }
}
