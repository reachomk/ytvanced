package defpackage;

/* renamed from: aknf */
final class aknf implements akng {
    private final /* synthetic */ aknc a;

    public final void bF_() {
        this.a.b();
    }

    public final void d_(int i, int i2) {
        aknc aknc = this.a;
        int i3 = aknc.b;
        if (i < i3) {
            aknc.a(i, Math.min(i2 + i, i3) - i);
        }
    }

    public final void e_(int i, int i2) {
        int i3 = this.a.b;
        if (i < i3) {
            i3 = Math.min(i + i2, i3) - i;
            aknc aknc = this.a;
            int i4 = aknc.b;
            int d = aknc.a.d() - i2;
            this.a.b = Math.max(i4, d + i3);
            this.a.b(i, i3);
            this.a.b = i4;
            i = Math.min(d, i4) + i3;
            aknc aknc2 = this.a;
            i3 = aknc2.b;
            if (i > i3) {
                aknc2.d(i3, i - i3);
            }
        }
    }

    public final void f_(int i, int i2) {
        aknc aknc = this.a;
        int i3 = aknc.b;
        if (i >= i3 && i2 >= i3) {
            return;
        }
        if (i < i3 && i2 < i3 && i + 1 <= i3 && i2 + 1 <= i3) {
            aknc.c(i, i2);
        } else {
            aknc.b();
        }
    }

    public final void g_(int i, int i2) {
        int i3 = this.a.b;
        if (i < i3) {
            i2 = Math.min(i2 + i, i3) - i;
            aknc aknc = this.a;
            int i4 = aknc.b;
            i3 = aknc.a.d();
            if (i4 < i3 + i2) {
                aknc aknc2 = this.a;
                aknc2.b -= i2;
            }
            this.a.d(i, i2);
            aknc aknc3 = this.a;
            aknc3.b = i4;
            i2 = i4 - i2;
            if (i3 > i2) {
                aknc3.b(i2, Math.min(i3, i4) - i2);
            }
        }
    }

    /* synthetic */ aknf(aknc aknc) {
        this.a = aknc;
    }
}
