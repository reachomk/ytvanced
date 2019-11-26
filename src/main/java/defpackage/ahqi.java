package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ahqi */
final class ahqi implements Runnable {
    private final /* synthetic */ ahqj a;

    ahqi(ahqj ahqj) {
        this.a = ahqj;
    }

    public final void run() {
        ahqj ahqj = this.a;
        if (!ahqj.b.isEmpty()) {
            int length;
            byte[] bArr;
            int i;
            int i2;
            byte[] bArr2;
            byte[] bArr3;
            double d;
            int i3;
            ArrayList arrayList = new ArrayList(ahqj.b);
            ahqj.b.clear();
            double d2 = (double) ahqj.c;
            Double.isNaN(d2);
            d2 /= 1000.0d;
            double d3 = (double) ahqj.d;
            Double.isNaN(d3);
            double d4 = d3 / 1000.0d;
            ahqj.c = -1;
            ahqj.d = 0;
            ahqj.l = -1;
            ahqj.e = null;
            int i4 = 0;
            if (arrayList.size() != 0) {
                length = ((byte[]) arrayList.get(0)).length;
                bArr = new byte[length];
                for (i = 0; i < length; i++) {
                    bArr[i] = ((byte[]) arrayList.get(0))[i];
                }
                for (i = 1; i < arrayList.size(); i++) {
                    for (i2 = 0; i2 < length; i2++) {
                        byte b = ((byte[]) arrayList.get(i))[i2];
                        bArr2 = (byte[]) arrayList.get(i);
                        bArr2[i2] = (byte) (bArr2[i2] - bArr[i2]);
                        bArr[i2] = b;
                    }
                }
            }
            if (arrayList.size() == 0) {
                bArr3 = new byte[0];
            } else {
                length = ((byte[]) arrayList.get(0)).length;
                bArr = new byte[(arrayList.size() * length)];
                for (i = 0; i < length; i++) {
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        bArr[(arrayList.size() * i) + i2] = ((byte[]) arrayList.get(i2))[i];
                    }
                }
                bArr3 = bArr;
            }
            length = bArr3.length;
            bArr = new byte[((length + length) + 3)];
            bArr[0] = (byte) 0;
            bArr[1] = (byte) (length >> 8);
            bArr[2] = (byte) length;
            i2 = 256;
            byte[] bArr4 = new byte[256];
            bArr2 = new byte[256];
            int[] iArr = new int[256];
            i = 0;
            while (i < i2) {
                byte b2 = (byte) i;
                bArr4[i] = b2;
                bArr2[i] = b2;
                iArr[i] = 0;
                i++;
                i2 = 256;
            }
            i = 0;
            i2 = 0;
            int i5 = 3;
            while (i < length) {
                int i6;
                byte b3 = bArr3[i];
                byte[] bArr5 = bArr3;
                byte a = ahqj.a(bArr4, b3);
                i4 &= 255;
                int i7 = length;
                length = b3 & 255;
                if (bArr2[i4] == b3) {
                    iArr[i4] = iArr[i4] + 4;
                    d = d4;
                    i6 = 1;
                } else {
                    d = d4;
                    i6 = 1;
                    i3 = iArr[i4] >> 1;
                    iArr[i4] = i3;
                    if (i3 == 0) {
                        bArr2[i4] = b3;
                        iArr[i4] = 1;
                    }
                }
                if (iArr[length] > i6) {
                    ahqj.a(bArr4, bArr2[length]);
                }
                if (a == (byte) 0) {
                    i2++;
                } else {
                    while (i2 > 0) {
                        i2--;
                        i3 = i5 + 1;
                        bArr[i5] = (byte) ((i2 & 1) == 0 ? 0 : -2);
                        i2 >>= 1;
                        i5 = i3;
                    }
                    if (a == (byte) -1 || a == (byte) -2) {
                        int i8 = i5 + 1;
                        bArr[i5] = (byte) -1;
                        i5 = i8;
                    }
                    i3 = i5 + 1;
                    bArr[i5] = a;
                    i5 = i3;
                }
                i++;
                byte i42 = b3;
                bArr3 = bArr5;
                length = i7;
                d4 = d;
            }
            d = d4;
            i3 = i5;
            while (i2 > 0) {
                i2--;
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i2 & 1) == 0 ? 0 : -2);
                i2 >>= 1;
                i3 = i9;
            }
            ahqj.m.post(new ahqk(ahqj, d2, d, Base64.encodeToString(Arrays.copyOf(bArr, i3), 10)));
        }
        if (this.a.i) {
            this.a.quit();
        } else {
            this.a.a(30000);
        }
    }
}
