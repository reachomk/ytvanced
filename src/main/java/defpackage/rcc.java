package defpackage;

/* renamed from: rcc */
public final class rcc extends rhf {
    public rcc(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 5);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        qpa qpa = this.b;
        Long valueOf = Long.valueOf(-1);
        qpa.d = valueOf;
        this.b.e = valueOf;
        int[] iArr = (int[]) this.c.invoke(null, new Object[]{this.a.a});
        synchronized (this.b) {
            this.b.d = Long.valueOf((long) iArr[0]);
            this.b.e = Long.valueOf((long) iArr[1]);
            int i = iArr[2];
            if (i != aocf.UNSET_ENUM_VALUE) {
                this.b.M = Long.valueOf((long) i);
            }
        }
    }
}
