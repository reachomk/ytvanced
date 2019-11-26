package defpackage;

/* renamed from: vll */
public final class vll {
    public final vst a;
    public final ajmp b;
    public int c = 0;

    public vll(vst vst, ajmp ajmp) {
        this.a = vst;
        this.b = ajmp;
    }

    public final void a(int i) {
        int i2;
        if (i == 1) {
            i2 = this.c;
            if (i2 != 0) {
                throw new vlk(i2, i);
            }
        } else if (i != 2) {
            i2 = this.c;
            if (i2 != 2) {
                throw new vlk(i2, i);
            }
        } else {
            int i3 = this.c;
            if (!(i3 == 0 || i3 == 1)) {
                throw new vlk(i3, i);
            }
        }
        this.c = i;
    }

    public final void a() {
        this.c = 4;
    }
}
