package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ac */
public final class ac {
    public static AtomicBoolean a = new AtomicBoolean(false);

    private static void a(nt ntVar, z zVar) {
        List<Object> f = ntVar.f();
        if (f != null) {
            for (Object obj : f) {
                if (obj != null) {
                    ac.a(obj, zVar);
                    if (obj.F_()) {
                        ac.a(obj.s(), zVar);
                    }
                }
            }
        }
    }

    private static void a(Object obj, z zVar) {
        if (obj instanceof ak) {
            ((ak) obj).a().a(zVar);
        }
    }

    public static void a(nn nnVar, z zVar) {
        ac.a((Object) nnVar, zVar);
        ac.a(nnVar.f(), zVar);
    }

    public static void a(nf nfVar, aa aaVar) {
        if (nfVar instanceof ak) {
            ((ak) nfVar).a().a(aaVar);
        }
    }
}
