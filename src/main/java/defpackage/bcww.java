package defpackage;

import java.util.Iterator;

/* renamed from: bcww */
public final class bcww implements bcty {
    private final Iterable a;

    public bcww(Iterable iterable) {
        if (iterable != null) {
            this.a = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    public final /* synthetic */ void a(Object obj) {
        bcup bcup = (bcup) obj;
        try {
            Iterator it = this.a.iterator();
            boolean hasNext = it.hasNext();
            if (!bcup.c()) {
                if (hasNext) {
                    bcup.a(new bcwz(bcup, it));
                } else {
                    bcup.bM_();
                }
            }
        } catch (Throwable th) {
            bcva.a(th, bcup);
        }
    }
}
