package defpackage;

import java.util.Iterator;

/* renamed from: amtn */
final class amtn extends amto {
    public final /* synthetic */ Iterable[] a;

    amtn(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    public final Iterator iterator() {
        return new amvh(new amtq(this, this.a.length));
    }
}
