package defpackage;

/* renamed from: qpm */
public final class qpm extends rio {
    private Long a;
    private Integer b;
    private Boolean c;
    private int[] d;
    private Long e;

    public qpm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = riv.a;
        this.e = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        Long l = this.a;
        if (l != null) {
            rim.a(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            rim.a(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            rim.a(3, bool.booleanValue());
        }
        int[] iArr = this.d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.d;
                if (i >= iArr2.length) {
                    break;
                }
                rim.a(4, iArr2[i]);
                i++;
            }
        }
        l = this.e;
        if (l != null) {
            long longValue = l.longValue();
            rim.c(5, 0);
            rim.a(longValue);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        Long l = this.a;
        if (l != null) {
            a += rim.b(1, l.longValue());
        }
        Integer num = this.b;
        if (num != null) {
            a += rim.b(2, num.intValue());
        }
        Boolean bool = this.c;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(3) + 1;
        }
        int[] iArr = this.d;
        if (iArr != null && iArr.length > 0) {
            int length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.d;
                length = iArr2.length;
                if (i >= length) {
                    break;
                }
                i2 += rim.a(iArr2[i]);
                i++;
            }
            a = (a + i2) + length;
        }
        l = this.e;
        if (l == null) {
            return a;
        }
        return a + (rim.b(5) + rim.b(l.longValue()));
    }
}
