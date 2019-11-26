package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yrb */
public final class yrb extends apa {
    public final List c = new ArrayList();
    private final yrh d;

    yrb(yrh yrh) {
        this.d = (yrh) amqw.a((Object) yrh);
    }

    public final int a() {
        return this.c.size();
    }

    /* Access modifiers changed, original: final */
    public final yrd f(int i) {
        return (yrd) this.c.get(i);
    }
}
