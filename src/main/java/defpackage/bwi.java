package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bwi */
final class bwi {
    private final bwh a = new bwh();
    private final Map b = new HashMap();

    bwi() {
    }

    public final void a(bwp bwp, Object obj) {
        bwh bwh = (bwh) this.b.get(bwp);
        if (bwh == null) {
            bwh = new bwh(bwp);
            bwi.b(bwh);
            bwh bwh2 = this.a;
            bwh.d = bwh2.d;
            bwh.c = bwh2;
            bwi.a(bwh);
            this.b.put(bwp, bwh);
        } else {
            bwp.a();
        }
        if (bwh.b == null) {
            bwh.b = new ArrayList();
        }
        bwh.b.add(obj);
    }

    public final Object a(bwp bwp) {
        bwh bwh = (bwh) this.b.get(bwp);
        if (bwh == null) {
            bwh = new bwh(bwp);
            this.b.put(bwp, bwh);
        } else {
            bwp.a();
        }
        bwi.b(bwh);
        bwh bwh2 = this.a;
        bwh.d = bwh2;
        bwh.c = bwh2.c;
        bwi.a(bwh);
        return bwh.a();
    }

    public final Object a() {
        for (Object obj = this.a.d; !obj.equals(this.a); obj = obj.d) {
            Object a = obj.a();
            if (a != null) {
                return a;
            }
            bwi.b(obj);
            this.b.remove(obj.a);
            ((bwp) obj.a).a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = this.a.c;
        Object obj2 = null;
        while (!obj.equals(this.a)) {
            stringBuilder.append('{');
            stringBuilder.append(obj.a);
            stringBuilder.append(':');
            stringBuilder.append(obj.b());
            stringBuilder.append("}, ");
            obj = obj.c;
            obj2 = 1;
        }
        if (obj2 != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    private static void a(bwh bwh) {
        bwh.c.d = bwh;
        bwh.d.c = bwh;
    }

    private static void b(bwh bwh) {
        bwh bwh2 = bwh.d;
        bwh2.c = bwh.c;
        bwh.c.d = bwh2;
    }
}
