package defpackage;

import java.util.ArrayList;

/* renamed from: aknu */
public final class aknu extends aknb {
    public final aknh a;
    public final amqv b;
    public final ArrayList d = new ArrayList();
    private final aknx e = new aknx(this);

    public aknu(aknh aknh, amqv amqv) {
        this.a = (aknh) amqw.a((Object) aknh);
        this.b = (amqv) amqw.a((Object) amqv);
        aknh.b(this.e);
    }

    public final long a(int i) {
        return (long) i;
    }

    public final int d() {
        return this.d.size();
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final Object c(int i) {
        return this.a.c(((Integer) this.d.get(i)).intValue());
    }

    public final void a(akor akor, int i) {
        this.a.a(akor, xty.a(i, 0, d()) ? ((Integer) this.d.get(i)).intValue() : -1);
    }

    public final void a(akoq akoq) {
        this.a.a(akoq);
    }
}
