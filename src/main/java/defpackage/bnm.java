package defpackage;

import android.graphics.Path.FillType;

/* renamed from: bnm */
public final class bnm implements bnc {
    public final FillType a;
    public final String b;
    public final bml c;
    public final bmq d;
    public final boolean e;
    private final boolean f;

    public bnm(String str, boolean z, FillType fillType, bml bml, bmq bmq, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = bml;
        this.d = bmq;
        this.e = z2;
    }

    public final bku a(bju bju, bnr bnr) {
        return new bky(bju, bnr, this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeFill{color=, fillEnabled=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
