package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: cnr */
public final class cnr {
    public coz a;
    public int b;

    private cnr() {
    }

    public static synchronized cnr a(coz coz, int i) {
        cnr cnr;
        synchronized (cnr.class) {
            cnr = new cnr();
            cma cma = (cma) coz.c.get(i);
            ComponentTree componentTree = coz.b.m;
            String str = cma.l;
            int identityHashCode = System.identityHashCode(componentTree);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
            stringBuilder.append(identityHashCode);
            stringBuilder.append(str);
            stringBuilder.toString();
            cnr.a = coz;
            cnr.b = i;
            if (coz.M == null) {
                coz.M = new HashSet();
            }
            coz.M.add(cnr);
        }
        return cnr;
    }

    public static cnr a(cpq cpq) {
        ComponentTree componentTree = cpq.t;
        cpg cpg = componentTree != null ? componentTree.w : null;
        coz coz = cpg != null ? cpg.g : null;
        if (coz != null) {
            return cnr.a(coz, Math.max(0, coz.c.size() - 1));
        }
        return null;
    }

    public final cpq a() {
        cmg cmg = this.a.b;
        ComponentTree componentTree = cmg != null ? cmg.m : null;
        if (componentTree != null) {
            return componentTree.getLithoView();
        }
        return null;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final cma c() {
        return (cma) this.a.c.get(this.b);
    }

    static {
        HashMap hashMap = new HashMap();
    }
}
