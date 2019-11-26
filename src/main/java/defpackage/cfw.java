package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cfw */
public final class cfw {
    private final List a = new ArrayList();

    public final synchronized void a(Class cls, bss bss) {
        this.a.add(new cfv(cls, bss));
    }

    public final synchronized bss a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            cfv cfv = (cfv) this.a.get(i);
            if (cfv.a.isAssignableFrom(cls)) {
                return cfv.b;
            }
        }
        return null;
    }
}
