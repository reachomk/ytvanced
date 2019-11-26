package defpackage;

import java.util.List;

/* renamed from: baqi */
public final class baqi {
    private final List a;
    private final List b;

    public final baqi a(bcaa bcaa) {
        this.a.add(bcaa);
        return this;
    }

    public final baqi b(bcaa bcaa) {
        this.b.add(bcaa);
        return this;
    }

    public final baqf a() {
        return new baqf(this.a, this.b);
    }

    /* synthetic */ baqi(int i, int i2) {
        this.a = bapv.a(i);
        this.b = bapv.a(i2);
    }
}
