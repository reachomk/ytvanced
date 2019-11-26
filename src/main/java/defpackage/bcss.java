package defpackage;

import java.util.Locale;

/* renamed from: bcss */
final class bcss extends bcsk {
    protected bcss(bcpm bcpm, int i, boolean z) {
        super(bcpm, i, z);
    }

    public final int a() {
        return this.b;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        try {
            bcsy.a(stringBuffer, this.a.a(bcpl).a(j));
        } catch (RuntimeException unused) {
            stringBuffer.append(65533);
        }
    }
}
