package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbru */
public final class bbru extends bbrh {
    private final bbnv b;
    private final bbnv c;
    private final Callable d;

    public bbru(bbmg bbmg, bbnv bbnv, bbnv bbnv2, Callable callable) {
        super(bbmg);
        this.b = bbnv;
        this.c = bbnv2;
        this.d = callable;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmd bbmd) {
        this.a.b(new bbrt(bbmd, this.b, this.c, this.d));
    }
}
