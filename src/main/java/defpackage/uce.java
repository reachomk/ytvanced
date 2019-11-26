package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: uce */
public final class uce extends PhantomReference {
    public final String a;
    public uce b;
    public uce c;

    public uce(Object obj, String str, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = str;
    }

    public final void a(uce uce) {
        uhy.a((Object) uce);
        this.b = uce;
        this.c = uce.c;
        uce uce2 = this.c;
        if (uce2 != null) {
            uce2.b = this;
        }
        uce.c = this;
    }

    public final uce a() {
        uce uce = this.b;
        if (uce != null) {
            uce.c = this.c;
        }
        uce uce2 = this.c;
        if (uce2 != null) {
            uce2.b = uce;
        }
        this.c = null;
        this.b = null;
        return this;
    }
}
