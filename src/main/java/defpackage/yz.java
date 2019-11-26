package defpackage;

/* renamed from: yz */
final class yz {
    private static final byte[] f = new byte[1792];
    public final CharSequence a;
    public final boolean b = false;
    public final int c;
    public int d;
    public char e;

    yz(CharSequence charSequence) {
        this.a = charSequence;
        this.c = charSequence.length();
    }

    public static byte a(char c) {
        return c < 1792 ? f[c] : Character.getDirectionality(c);
    }

    /* Access modifiers changed, original: final */
    public final byte a() {
        char charAt = this.a.charAt(this.d - 1);
        this.e = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.a, this.d);
            this.d -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.d--;
        return yz.a(this.e);
    }

    static {
        for (int i = 0; i < 1792; i++) {
            f[i] = Character.getDirectionality(i);
        }
    }
}
