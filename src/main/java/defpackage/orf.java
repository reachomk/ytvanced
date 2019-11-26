package defpackage;

/* renamed from: orf */
public class orf {
    public final CharSequence a;
    public final float b;
    public final float c;
    public final int d;

    public orf(float f, int i, float f2) {
        this(null, f2, f, i, 0);
    }

    public orf(CharSequence charSequence) {
        this(charSequence, Float.MIN_VALUE, Float.MIN_VALUE, aocf.UNSET_ENUM_VALUE);
    }

    public orf(CharSequence charSequence, float f, float f2, int i) {
        this(charSequence, f, f2, i, 0);
    }

    public orf(CharSequence charSequence, float f, float f2) {
        this(charSequence, f, f2, (int) aocf.UNSET_ENUM_VALUE, 0);
    }

    public orf(CharSequence charSequence, float f, float f2, int i, byte b) {
        this(charSequence, f, f2, i, 0);
    }

    private orf(CharSequence charSequence, float f, float f2, int i, char c) {
        this.a = charSequence;
        this.b = f;
        this.c = f2;
        this.d = i;
    }
}
