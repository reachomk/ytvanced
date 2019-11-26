package defpackage;

import java.util.Iterator;

/* renamed from: bbqt */
public final class bbqt extends bbmc {
    private final Iterable b;

    public bbqt(Iterable iterable) {
        this.b = iterable;
    }

    public final void b(bcto bcto) {
        try {
            Iterator it = this.b.iterator();
            try {
                if (!it.hasNext()) {
                    bcto.a(bbyn.a);
                    bcto.a();
                } else if (bcto instanceof bboy) {
                    bcto.a(new bbqv((bboy) bcto, it));
                } else {
                    bcto.a(new bbqy(bcto, it));
                }
            } catch (Throwable th) {
                bbnm.a(th);
                bbyn.a(th, bcto);
            }
        } catch (Throwable th2) {
            bbnm.a(th2);
            bbyn.a(th2, bcto);
        }
    }
}
