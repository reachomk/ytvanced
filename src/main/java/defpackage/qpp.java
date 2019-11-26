package defpackage;

/* renamed from: qpp */
public final class qpp extends rio {
    public byte[][] a;
    public byte[] b;
    public Integer c;
    private Integer d;

    public qpp() {
        this.a = riv.d;
        this.b = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        byte[][] bArr = this.a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    rim.a(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            rim.a(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            rim.a(3, num.intValue());
        }
        num = this.c;
        if (num != null) {
            rim.a(4, num.intValue());
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        byte[][] bArr = this.a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += rim.a(bArr3);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        byte[] bArr4 = this.b;
        if (bArr4 != null) {
            a += rim.b(2, bArr4);
        }
        Integer num = this.d;
        if (num != null) {
            a += rim.b(3, num.intValue());
        }
        num = this.c;
        return num != null ? a + rim.b(4, num.intValue()) : a;
    }
}
