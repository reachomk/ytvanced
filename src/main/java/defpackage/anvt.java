package defpackage;

import java.util.NoSuchElementException;

/* renamed from: anvt */
final class anvt extends anvv {
    private int a = 0;
    private final int b = this.c.b();
    private final /* synthetic */ anvu c;

    anvt(anvu anvu) {
        this.c = anvu;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.b(i);
        }
        throw new NoSuchElementException();
    }
}
