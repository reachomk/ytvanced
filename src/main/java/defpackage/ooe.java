package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ooe */
public final class ooe extends ons {
    private final ool b;
    private final int c = Integer.MAX_VALUE;
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public ooe(ool ool) {
        oxz.a(true);
        this.b = ool;
    }

    public final void a(owt owt) {
        super.a(owt);
        a(null, this.b);
    }

    public final ooj a(ook ook, ouw ouw, long j) {
        if (this.c == Integer.MAX_VALUE) {
            return this.b.a(ook, ouw, j);
        }
        ook a = ook.a(onp.b(ook.a));
        this.d.put(a, ook);
        ooj a2 = this.b.a(a, ouw, j);
        this.e.put(a2, a);
        return a2;
    }

    public final void a(ooj ooj) {
        this.b.a(ooj);
        ook ook = (ook) this.e.remove(ooj);
        if (ook != null) {
            this.d.remove(ook);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ook a(Object obj, ook ook) {
        return this.c != Integer.MAX_VALUE ? (ook) this.d.get(ook) : ook;
    }
}
