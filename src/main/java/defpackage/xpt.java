package defpackage;

import java.util.Observable;

/* renamed from: xpt */
public final class xpt extends Observable {
    private long a = -1;
    private final xsc b;

    public xpt(xsc xsc) {
        this.b = xsc;
    }

    public final void a() {
        this.a = this.b.b();
        setChanged();
        notifyObservers(Long.valueOf(this.a));
    }

    public final long b() {
        if (this.a != -1) {
            return this.b.b() - this.a;
        }
        return -1;
    }
}
