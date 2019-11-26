package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: qnu */
public final class qnu extends qnn {
    private final bbb a;
    private final Map b = new HashMap();

    public qnu(bbb bbb) {
        this.a = bbb;
    }

    public final int a() {
        return 13280009;
    }

    public final void a(Bundle bundle, qnq qnq) {
        baz a = baz.a(bundle);
        if (!this.b.containsKey(a)) {
            this.b.put(a, new HashSet());
        }
        ((Set) this.b.get(a)).add(new qnr(qnq));
    }

    public final void e() {
        for (Set<bbe> it : this.b.values()) {
            for (bbe a : it) {
                this.a.a(a);
            }
        }
        this.b.clear();
    }

    public final void a(Bundle bundle, int i) {
        baz a = baz.a(bundle);
        for (bbe a2 : (Set) this.b.get(a)) {
            this.a.a(a, a2, i);
        }
    }

    public final void a(Bundle bundle) {
        for (bbe a : (Set) this.b.get(baz.a(bundle))) {
            this.a.a(a);
        }
    }

    public final boolean b(Bundle bundle, int i) {
        return bbb.a(baz.a(bundle), i);
    }

    public final void a(String str) {
        for (bbs bbs : bbb.a()) {
            if (bbs.c.equals(str)) {
                bbb.a(bbs);
                return;
            }
        }
    }

    public final void b() {
        bbb.a(bbb.b());
    }

    public final boolean c() {
        return bbb.c().c.equals(bbb.b().c);
    }

    public final Bundle b(String str) {
        for (bbs bbs : bbb.a()) {
            if (bbs.c.equals(str)) {
                return bbs.r;
            }
        }
        return null;
    }

    public final String d() {
        return bbb.c().c;
    }
}
