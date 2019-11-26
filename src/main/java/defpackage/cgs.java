package defpackage;

@Deprecated
/* renamed from: cgs */
public abstract class cgs extends cgj {
    private final int a;
    private final int b;

    public cgs() {
        this(aocf.UNSET_ENUM_VALUE, aocf.UNSET_ENUM_VALUE);
    }

    public final void b(cgr cgr) {
    }

    public cgs(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(cgr cgr) {
        if (chv.a(this.a, this.b)) {
            cgr.a(this.a, this.b);
            return;
        }
        int i = this.a;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(176);
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(i);
        stringBuilder.append(" and height: ");
        stringBuilder.append(i2);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
