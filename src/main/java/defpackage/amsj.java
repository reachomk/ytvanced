package defpackage;

import java.util.ListIterator;

/* renamed from: amsj */
final class amsj extends amsh implements ListIterator {
    private final /* synthetic */ amsk b;

    amsj(amsk amsk) {
        this.b = amsk;
        super(amsk);
    }

    public amsj(amsk amsk, int i) {
        this.b = amsk;
        super(amsk, amsk.d().listIterator(i));
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final Object previous() {
        return b().previous();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(Object obj) {
        b().set(obj);
    }

    public final void add(Object obj) {
        boolean isEmpty = this.b.isEmpty();
        b().add(obj);
        this.b.d.b = this.b.d.b + 1;
        if (isEmpty) {
            this.b.c();
        }
    }
}
