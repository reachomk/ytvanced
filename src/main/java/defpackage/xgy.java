package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: xgy */
public final class xgy {
    public static final xgy a = new xgy(Collections.emptyList());
    public final Collection b;

    xgy(Collection collection) {
        this.b = collection;
    }

    public final String a(String str) {
        for (Entry entry : this.b) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public final Map a() {
        xha xha = new xha(this.b.size());
        for (Entry entry : this.b) {
            xha.put((String) entry.getKey(), (String) entry.getValue());
        }
        return Collections.unmodifiableMap(xha);
    }

    public final boolean equals(Object obj) {
        return obj instanceof xgy ? this.b.equals(((xgy) obj).b) : false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    public static xgx b() {
        return new xgx();
    }
}
