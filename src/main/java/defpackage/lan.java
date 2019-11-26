package defpackage;

import com.google.protos.youtube.api.innertube.StorageInfoRendererOuterClass;

/* renamed from: lan */
public final class lan extends kzo {
    public lan(aqdm aqdm) {
        super(aqdm);
    }

    public final CharSequence e() {
        arml arml;
        aqdm aqdm = (aqdm) this.a;
        if ((aqdm.a & 1) != 0) {
            arml = aqdm.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public final amuw a(amuw amuw) {
        return ((aqdm) this.a).d ? amwp.a : amuw;
    }

    public final /* synthetic */ Object c() {
        aqdm aqdm = (aqdm) this.a;
        if ((aqdm.a & 2) == 0) {
            return null;
        }
        anxp anxp = aqdm.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(StorageInfoRendererOuterClass.storageInfoRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (axuz) b;
    }
}
