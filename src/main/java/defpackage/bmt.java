package defpackage;

import java.util.List;

/* renamed from: bmt */
public final class bmt implements bmx {
    private final bmo a;
    private final bmo b;

    public bmt(bmo bmo, bmo bmo2) {
        this.a = bmo;
        this.b = bmo2;
    }

    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        return this.a.c() && this.b.c();
    }

    public final blj a() {
        return new bly(this.a.a(), this.b.a());
    }
}
