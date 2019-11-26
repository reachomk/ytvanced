package defpackage;

import android.graphics.Path.FillType;

/* renamed from: bne */
public final class bne implements bnc {
    public final FillType a;
    public final bmn b;
    public final bmq c;
    public final bms d;
    public final bms e;
    public final String f;
    public final boolean g;
    public final int h;

    public final bku a(bju bju, bnr bnr) {
        return new bkx(bju, bnr, this);
    }

    public bne(String str, int i, FillType fillType, bmn bmn, bmq bmq, bms bms, bms bms2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = bmn;
        this.c = bmq;
        this.d = bms;
        this.e = bms2;
        this.f = str;
        this.g = z;
    }
}
