package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: barp */
public final class barp {
    private barq a;
    private Map b;

    public final barp a(bars bars, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(bars, obj);
        return this;
    }

    public final barq a() {
        if (this.b != null) {
            for (Entry entry : this.a.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((bars) entry.getKey(), entry.getValue());
                }
            }
            this.a = new barq(this.b, (byte) 0);
            this.b = null;
        }
        return this.a;
    }

    /* synthetic */ barp(barq barq) {
        this.a = barq;
    }
}
