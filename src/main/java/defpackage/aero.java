package defpackage;

import java.util.Arrays;

/* renamed from: aero */
public final class aero implements nxt {
    private static final nxu a = new nxu(null, -1, -1);

    public final nxu a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length > 32) {
                try {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
                    byte b = bArr[8];
                    if (b != (byte) 0) {
                        StringBuilder stringBuilder = new StringBuilder(44);
                        stringBuilder.append("Expected PSSH version 0, actual version ");
                        stringBuilder.append(b);
                        xtl.d(stringBuilder.toString());
                        return a;
                    }
                    baaa baaa = (baaa) anxl.parseFrom(baaa.e, copyOfRange);
                    if (baaa != null) {
                        byte[] d = baaa.b.d();
                        int i = baaa.c;
                        int i2 = baaa.d;
                        if (i2 <= 0) {
                            i2 = 120;
                        }
                        return new nxu(d, i, i2);
                    }
                    xtl.d("Widevine PSSH Proto parsing failed.");
                    return a;
                } catch (anyg | ArrayIndexOutOfBoundsException unused) {
                    xtl.d("Could not parse drmInitData");
                    return a;
                }
            }
        }
        return a;
    }
}
