package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: adja */
public final class adja implements Iterable {
    public static final adja b = new adja(Collections.emptyMap());
    public final Map a;

    public adja() {
        this(new HashMap());
    }

    public adja(adja adja) {
        this(adja.a);
    }

    private adja(Map map) {
        this.a = new HashMap(map);
    }

    public final adja a(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final Iterator iterator() {
        return new adiz(this);
    }

    public final String toString() {
        return TextUtils.join(", ", this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adja)) {
            return false;
        }
        return this.a.equals(((adja) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
