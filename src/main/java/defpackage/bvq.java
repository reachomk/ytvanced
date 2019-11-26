package defpackage;

/* renamed from: bvq */
final class bvq implements Appendable {
    private final Appendable a;
    private boolean b = true;

    bvq(Appendable appendable) {
        this.a = appendable;
    }

    private static CharSequence a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public final Appendable append(char c) {
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (c == 10) {
            z = true;
        }
        this.b = z;
        this.a.append(c);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        charSequence = bvq.a(charSequence);
        append(charSequence, 0, charSequence.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        charSequence = bvq.a(charSequence);
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
            z = true;
        }
        this.b = z;
        this.a.append(charSequence, i, i2);
        return this;
    }
}
