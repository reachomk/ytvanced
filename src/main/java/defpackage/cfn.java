package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cfn */
public final class cfn {
    private final List a = new ArrayList();

    public final synchronized bsh a(Class cls) {
        for (cfq cfq : this.a) {
            if (cfq.a.isAssignableFrom(cls)) {
                return cfq.b;
            }
        }
        return null;
    }

    public final synchronized void a(Class cls, bsh bsh) {
        this.a.add(new cfq(cls, bsh));
    }
}
