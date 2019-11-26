package defpackage;

import java.util.NoSuchElementException;

/* renamed from: anzv */
final class anzv extends anvv {
    private final anzx a = new anzx(this.c);
    private anvz b = b();
    private final /* synthetic */ anzw c;

    anzv(anzw anzw) {
        this.c = anzw;
    }

    private final anvz b() {
        return this.a.hasNext() ? (anvz) ((anwb) this.a.next()).iterator() : null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final byte a() {
        anvz anvz = this.b;
        if (anvz != null) {
            byte a = anvz.a();
            if (!this.b.hasNext()) {
                this.b = b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }
}
