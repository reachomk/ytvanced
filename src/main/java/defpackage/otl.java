package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;

/* renamed from: otl */
public class otl {
    public long a;
    public long b;
    public SpannableStringBuilder c;
    public Alignment d;
    public float e;
    public int f;
    public int g;
    public float h;
    public int i;
    public float j;

    public otl() {
        a();
    }

    public final void a() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = aocf.UNSET_ENUM_VALUE;
        this.g = aocf.UNSET_ENUM_VALUE;
        this.h = Float.MIN_VALUE;
        this.i = aocf.UNSET_ENUM_VALUE;
        this.j = Float.MIN_VALUE;
    }

    public final otj b() {
        if (this.h != Float.MIN_VALUE && this.i == aocf.UNSET_ENUM_VALUE) {
            if (this.d == null) {
                this.i = aocf.UNSET_ENUM_VALUE;
            } else {
                int i = otm.a[this.d.ordinal()];
                if (i == 1) {
                    this.i = 0;
                } else if (i == 2) {
                    this.i = 1;
                } else if (i != 3) {
                    String valueOf = String.valueOf(this.d);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
                    stringBuilder.append("Unrecognized alignment: ");
                    stringBuilder.append(valueOf);
                    oyp.a("WebvttCueBuilder", stringBuilder.toString());
                    this.i = 0;
                } else {
                    this.i = 2;
                }
            }
        }
        return new otj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public otl a(long j) {
        this.a = j;
        return this;
    }

    public otl b(long j) {
        this.b = j;
        return this;
    }
}
