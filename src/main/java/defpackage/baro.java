package defpackage;

/* renamed from: baro */
public final class baro extends barl {
    public String g;
    public int h;

    /* synthetic */ baro(barl barl) {
        super(barl);
        byte[] bArr = barl.e;
        if (bArr.length >= 2) {
            int i = 0;
            int i2 = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
            int[] iArr = new int[]{1000, 1001, 1002, 1003, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1015};
            for (int i3 = 0; i3 < 12; i3++) {
                int i4 = iArr[i3];
                if (i4 == i2) {
                    i = i4;
                    break;
                }
            }
            this.h = i;
            bArr = this.e;
            this.g = new String(bArr, 2, bArr.length - 2, barl.a);
        }
    }

    public baro(int i, String str) {
        byte[] bArr;
        barn barn = barn.Close;
        if (i == 0) {
            bArr = new byte[0];
        } else {
            byte[] a = barl.a(str);
            int length = a.length;
            byte[] bArr2 = new byte[(length + 2)];
            bArr2[0] = (byte) (i >> 8);
            bArr2[1] = (byte) i;
            System.arraycopy(a, 0, bArr2, 2, length);
            bArr = bArr2;
        }
        super(barn, bArr);
    }
}
