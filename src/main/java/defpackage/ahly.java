package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ahly */
public final class ahly implements ahku {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public ahly(ahku... ahkuArr) {
        for (int i = 0; i < 2; i++) {
            a(ahkuArr[i]);
        }
    }

    public final void a(ahku ahku) {
        this.a.add(ahku);
    }

    public final void a(ahkx ahkx) {
        for (ahku a : this.a) {
            a.a(ahkx);
        }
    }

    public final void b(ahkx ahkx) {
        for (ahku b : this.a) {
            b.b(ahkx);
        }
    }

    public final void b(awfe awfe, boolean z) {
        for (ahku b : this.a) {
            b.b(awfe, z);
        }
    }

    public final void b(long j, long j2) {
        for (ahku b : this.a) {
            b.b(j, j2);
        }
    }

    public final void ag_() {
        for (ahku ag_ : this.a) {
            ag_.ag_();
        }
    }
}
