package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbqz */
public final class bbqz extends bbmc {
    private final Callable b;
    private final bbnr c;
    private final bbnw d;

    public bbqz(Callable callable, bbnr bbnr, bbnw bbnw) {
        this.b = callable;
        this.c = bbnr;
        this.d = bbnw;
    }

    public final void b(bcto bcto) {
        try {
            bcto.a(new bbrc(bcto, this.c, this.d, this.b.call()));
        } catch (Throwable th) {
            bbnm.a(th);
            bbyn.a(th, bcto);
        }
    }
}
