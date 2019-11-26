package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbc */
public final class bbc {
    private ArrayList a;

    public bbc(baz baz) {
        if (baz != null) {
            baz.b();
            if (!baz.b.isEmpty()) {
                this.a = new ArrayList(baz.b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final bbc a(String str) {
        if (str != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            return this;
        }
        throw new IllegalArgumentException("category must not be null");
    }

    public final bbc a(baz baz) {
        if (baz != null) {
            List<String> a = baz.a();
            if (a != null) {
                if (!a.isEmpty()) {
                    for (String a2 : a) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final baz a() {
        if (this.a == null) {
            return baz.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new baz(bundle, this.a);
    }
}
