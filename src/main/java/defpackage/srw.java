package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* renamed from: srw */
public final class srw implements sxk {
    private final List a;

    public srw(Collection collection, Collection collection2) {
        amuo j = amul.j();
        j.b(collection);
        j.b(collection2);
        this.a = j.a();
    }

    public final void a(cmg cmg, bdho bdho, swn swn) {
        if (bdho != null) {
            for (int i = 0; i < this.a.size(); i++) {
                sxm sxm = (sxm) this.a.get(i);
                if (aobj.b(sxm.a().c) != 168774585) {
                    Object a = szb.a(bdho, sxm.a());
                    if (a != null) {
                        sxm.a(cmg, a, swn);
                    }
                } else {
                    try {
                        Object obj;
                        byte[] bArr;
                        anwf a2 = anwf.a(aocf.toByteArray(bdho));
                        while (true) {
                            obj = null;
                            if (a2.u()) {
                                bArr = null;
                                break;
                            }
                            int a3 = a2.a();
                            if (aobj.b(a3) == 168774585) {
                                bArr = a2.m();
                                break;
                            }
                            a2.b(a3);
                        }
                        if (bArr != null) {
                            obj = (azsv) anxl.parseFrom(azsv.l, bArr, anxa.b());
                        }
                        if (obj != null) {
                            sxm.a(cmg, obj, swn);
                        }
                    } catch (IOException e) {
                        throw new sxf("Failure obtaining CommandProperties extension", e);
                    }
                }
            }
        }
    }
}
