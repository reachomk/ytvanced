package defpackage;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: tqs */
final class tqs {
    public final EnumSet a = EnumSet.noneOf(tqv.class);
    public final EnumMap b = new EnumMap(tqv.class);

    tqs() {
    }

    public final void a(tqv tqv) {
        this.a.add(tqv);
        if (!this.b.containsKey(tqv)) {
            this.b.put(tqv, Boolean.valueOf(false));
        }
    }

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((tqv) it.next()).m;
        }
        return i;
    }
}
