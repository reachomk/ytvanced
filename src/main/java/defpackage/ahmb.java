package defpackage;

/* renamed from: ahmb */
public final class ahmb extends xaq implements xcp {
    public final xci d;
    private final int e;

    public ahmb(xci xci, int i) {
        this.d = (xci) amqw.a((Object) xci);
        this.e = i;
    }

    public final void c() {
        this.d.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahkv.class};
        } else if (i == 0) {
            ahkv ahkv = (ahkv) obj;
            int i2 = this.e;
            if (i2 > 0) {
                if (ahkv.a >= ((long) i2)) {
                    this.d.b(this);
                    this.c = true;
                    b();
                    return null;
                }
            } else if (i2 < 0 && ahkv.b - ahkv.a <= ((long) (-i2))) {
                this.d.b(this);
                this.c = true;
                b();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
