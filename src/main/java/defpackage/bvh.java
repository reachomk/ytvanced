package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bvh */
final class bvh implements Iterable {
    public final List a;

    bvh() {
        this(new ArrayList(2));
    }

    private bvh(List list) {
        this.a = list;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(cgf cgf) {
        return this.a.contains(bvh.b(cgf));
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a.isEmpty();
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.a.size();
    }

    /* Access modifiers changed, original: final */
    public final bvh c() {
        return new bvh(new ArrayList(this.a));
    }

    public static bvi b(cgf cgf) {
        return new bvi(cgf, chn.b);
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }
}
