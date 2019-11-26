package defpackage;

import java.util.Map.Entry;

/* renamed from: rfo */
final class rfo implements Entry {
    public final Entry a;

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        return ((rfl) this.a.getValue()) != null ? rfl.a() : null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof rgh) {
            rfl rfl = (rfl) this.a.getValue();
            rgh rgh = (rgh) obj;
            rgh rgh2 = rfl.a;
            rfl.b = null;
            rfl.a = rgh;
            return rgh2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ rfo(Entry entry) {
        this.a = entry;
    }
}
