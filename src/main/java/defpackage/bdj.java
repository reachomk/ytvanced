package defpackage;

/* renamed from: bdj */
final class bdj {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ bdh j;

    bdj(bdh bdh, int i, int i2) {
        this.j = bdh;
        this.a = i;
        this.b = i2;
        c();
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return (((this.e - this.d) + 1) * ((this.g - this.f) + 1)) * ((this.i - this.h) + 1);
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return (this.b + 1) - this.a > 1;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        bdh bdh = this.j;
        int[] iArr = bdh.a;
        int[] iArr2 = bdh.b;
        int i = aocf.UNSET_ENUM_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = aocf.UNSET_ENUM_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = aocf.UNSET_ENUM_VALUE;
        int i7 = 0;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int a = bdh.a(i9);
            int b = bdh.b(i9);
            i9 = bdh.c(i9);
            if (a > i) {
                i = a;
            }
            if (a < i2) {
                i2 = a;
            }
            if (b > i4) {
                i4 = b;
            }
            if (b < i3) {
                i3 = b;
            }
            if (i9 > i6) {
                i6 = i9;
            }
            if (i9 < i5) {
                i5 = i9;
            }
        }
        this.d = i2;
        this.e = i;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.c = i7;
    }
}
