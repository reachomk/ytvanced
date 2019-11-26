package defpackage;

import java.util.Locale;

/* renamed from: bcsn */
class bcsn extends bcsk {
    private final int d;

    protected bcsn(bcpm bcpm, int i, boolean z, int i2) {
        super(bcpm, i, z);
        this.d = i2;
    }

    public final int a() {
        return this.b;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        try {
            bcsy.a(stringBuffer, this.a.a(bcpl).a(j), this.d);
        } catch (RuntimeException unused) {
            bcse.a(stringBuffer, this.d);
        }
    }
}
