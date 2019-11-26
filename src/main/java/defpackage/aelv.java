package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aelv */
final class aelv implements aemt {
    private final List b = new ArrayList();

    aelv() {
    }

    public final synchronized void a(aemt aemt) {
        for (aely aely : this.b) {
            aemt.a(aely.a(), aely.b());
        }
    }

    public final synchronized void a(aepc aepc, int i) {
        this.b.add(new aelm(aepc, i));
    }
}
