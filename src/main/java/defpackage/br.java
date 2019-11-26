package defpackage;

import java.text.Format;

/* renamed from: br */
final class br {
    public final int a;
    public final String b;
    public final Number c;
    public final double d;
    public int e;
    public Format f;
    public String g;
    public boolean h;

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }

    /* synthetic */ br(int i, String str, Number number, double d) {
        this.a = i;
        this.b = str;
        if (d == 0.0d) {
            this.c = number;
        } else {
            this.c = Double.valueOf(number.doubleValue() - d);
        }
        this.d = d;
    }
}
