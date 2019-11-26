package defpackage;

import java.util.Collections;

/* renamed from: blz */
public final class blz extends blj {
    public blz(bph bph) {
        this(bph, (byte) 0);
    }

    /* Access modifiers changed, original: final */
    public final float e() {
        return 1.0f;
    }

    public blz(bph bph, byte b) {
        super(Collections.emptyList());
        bpi bpi = new bpi();
        this.d = bph;
    }

    public final void a() {
        if (this.d != null) {
            super.a();
        }
    }

    public final Object f() {
        return this.d.a;
    }

    /* Access modifiers changed, original: final */
    public final Object a(bpf bpf, float f) {
        return f();
    }
}
