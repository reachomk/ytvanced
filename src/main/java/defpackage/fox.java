package defpackage;

/* renamed from: fox */
final class fox extends foy {
    public final boolean a;
    public final int b;
    public final boolean c;

    private fox(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static fox a(bds bds, int i, int i2, int i3, int i4) {
        boolean z;
        if (bds == null || bds.b <= 0 || bds.a == 0) {
            z = false;
        } else {
            z = true;
        }
        int i5 = z ? bds.b : 0;
        boolean z2 = z && i5 >= i;
        if (z) {
            i2 = bds.a;
        }
        int i6 = i2;
        int a = fov.a(i6);
        if (z) {
            i4 = bds.b();
        }
        int i7 = i4;
        if (z) {
            i3 = bds.c();
        }
        return new fox(z, i5, z2, a, i6, i7, i3);
    }
}
