package defpackage;

import java.util.Iterator;

/* renamed from: bbus */
public final class bbus extends bbmi {
    private final Iterable a;

    public bbus(Iterable iterable) {
        this.a = iterable;
    }

    public final void a(bbmo bbmo) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (it.hasNext()) {
                    bbnc bbur = new bbur(bbmo, it);
                    bbmo.a(bbur);
                    if (!bbur.d) {
                        while (!bbur.c) {
                            try {
                                bbur.a.b_(bbow.a(bbur.b.next(), "The iterator returned a null value"));
                                if (bbur.c) {
                                    break;
                                }
                                try {
                                    if (!bbur.b.hasNext()) {
                                        if (!bbur.c) {
                                            bbur.a.a();
                                        }
                                    }
                                } catch (Throwable th) {
                                    bbnm.a(th);
                                    bbur.a.a(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                bbnm.a(th2);
                                bbur.a.a(th2);
                            }
                        }
                    }
                    return;
                }
                bboc.a(bbmo);
            } catch (Throwable th3) {
                bbnm.a(th3);
                bboc.a(th3, bbmo);
            }
        } catch (Throwable th32) {
            bbnm.a(th32);
            bboc.a(th32, bbmo);
        }
    }
}
