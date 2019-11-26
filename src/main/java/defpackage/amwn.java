package defpackage;

import java.util.Iterator;

/* renamed from: amwn */
final class amwn extends amuw {
    private final transient amur a;
    private final transient amul b;

    amwn(amur amur, amul amul) {
        this.a = amur;
        this.b = amul;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return true;
    }

    public final amxo a() {
        return (amxn) this.b.listIterator();
    }

    /* Access modifiers changed, original: final */
    public final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    public final amul e() {
        return this.b;
    }

    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    public final int size() {
        return this.a.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
