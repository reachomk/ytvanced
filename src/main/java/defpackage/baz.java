package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: baz */
public final class baz {
    public static final baz c = new baz(new Bundle(), null);
    public final Bundle a;
    public List b;

    baz(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    public final List a() {
        b();
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.b == null) {
            this.b = this.a.getStringArrayList("controlCategories");
            List list = this.b;
            if (list == null || list.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final boolean c() {
        b();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof baz)) {
            return false;
        }
        baz baz = (baz) obj;
        b();
        baz.b();
        return this.b.equals(baz.b);
    }

    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteSelector{ controlCategories=");
        stringBuilder.append(Arrays.toString(a().toArray()));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static baz a(Bundle bundle) {
        return bundle != null ? new baz(bundle, null) : null;
    }
}
