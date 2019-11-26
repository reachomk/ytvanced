package defpackage;

import java.util.Map.Entry;

/* renamed from: amts */
public abstract class amts extends amtr implements Entry {
    protected amts() {
    }

    public abstract Entry a();

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final Object getKey() {
        return a().getKey();
    }

    public Object getValue() {
        return a().getValue();
    }

    public final Object setValue(Object obj) {
        return a().setValue(obj);
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
