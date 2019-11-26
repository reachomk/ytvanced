package defpackage;

import java.io.File;

/* renamed from: byu */
public final class byu implements bzq {
    private final byx a;

    public byu(byx byx) {
        this.a = byx;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        File file = (File) obj;
        return new bzp(new chi(file), new byy(file, this.a));
    }
}
