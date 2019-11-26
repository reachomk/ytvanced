package defpackage;

/* renamed from: ahoo */
final class ahoo {
    public final int[] a;
    private int b = 0;

    public ahoo(int i) {
        i++;
        this.a = new int[(i + i)];
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        int[] iArr = this.a;
        int i3 = this.b;
        int i4 = i3 + 1;
        this.b = i4;
        iArr[i3] = i;
        this.b = i4 + 1;
        iArr[i4] = i2;
    }
}
