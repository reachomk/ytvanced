package defpackage;

/* renamed from: okl */
public final class okl {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public okl(int i, int i2) {
        this(aocf.UNSET_ENUM_VALUE, i, i2);
    }

    public okl(int i, int i2, int i3) {
        String stringBuilder;
        if (i != aocf.UNSET_ENUM_VALUE) {
            StringBuilder stringBuilder2 = new StringBuilder(12);
            stringBuilder2.append(i);
            stringBuilder2.append("/");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        this.a = stringBuilder;
        this.b = i2;
        this.c = i3;
        this.d = aocf.UNSET_ENUM_VALUE;
    }

    public final void a() {
        int i = this.d;
        if (i != aocf.UNSET_ENUM_VALUE) {
            i += this.c;
        } else {
            i = this.b;
        }
        this.d = i;
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
        stringBuilder.append(str);
        stringBuilder.append(i);
        this.e = stringBuilder.toString();
    }

    public final int b() {
        d();
        return this.d;
    }

    public final String c() {
        d();
        return this.e;
    }

    private final void d() {
        if (this.d == aocf.UNSET_ENUM_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
