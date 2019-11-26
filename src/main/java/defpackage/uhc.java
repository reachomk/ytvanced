package defpackage;

import java.util.HashMap;

/* renamed from: uhc */
public final class uhc implements uhf {
    private volatile Object a;
    private final Object b = new Object();
    private final uhe c;

    public uhc(uhe uhe) {
        HashMap hashMap = new HashMap();
        this.c = uhe;
    }

    public final Object b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = this.c.a();
                }
            }
        }
        return this.a;
    }
}
