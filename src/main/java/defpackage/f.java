package defpackage;

import java.util.HashMap;

/* renamed from: f */
public final class f extends i {
    public final HashMap a = new HashMap();

    /* Access modifiers changed, original: protected|final */
    public final j a(Object obj) {
        return (j) this.a.get(obj);
    }

    public final Object a(Object obj, Object obj2) {
        j a = a(obj);
        if (a != null) {
            return a.b;
        }
        this.a.put(obj, b(obj, obj2));
        return null;
    }

    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.a.remove(obj);
        return b;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
