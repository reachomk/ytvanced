package defpackage;

import java.util.Map.Entry;

/* renamed from: anyk */
final class anyk implements Entry {
    public final Entry a;

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        return ((anyh) this.a.getValue()) != null ? anyh.a() : null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof anze) {
            anyh anyh = (anyh) this.a.getValue();
            anze anze = (anze) obj;
            anze anze2 = anyh.b;
            anyh.a = null;
            anyh.c = null;
            anyh.b = anze;
            return anze2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ anyk(Entry entry) {
        this.a = entry;
    }
}
