package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbhu */
public final class bbhu {
    private static final Logger a = Logger.getLogger(bbhu.class.getName());
    private static final byte[] b = "-bin".getBytes(ampv.a);

    public static byte[][] a(baum baum) {
        byte[][] a = bats.a(baum);
        if (a == null) {
            return new byte[0][];
        }
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = a.length;
            if (i >= length) {
                break;
            }
            byte[] bArr = a[i];
            byte[] bArr2 = a[i + 1];
            if (bbhu.a(bArr, b)) {
                a[i2] = bArr;
                a[i2 + 1] = bats.b.a(bArr2).getBytes(ampv.a);
            } else {
                for (byte b : bArr2) {
                    if (b < (byte) 32 || b > (byte) 126) {
                        String str = new String(bArr, ampv.a);
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String arrays = Arrays.toString(bArr2);
                        StringBuilder stringBuilder = new StringBuilder((str.length() + 55) + String.valueOf(arrays).length());
                        stringBuilder.append("Metadata key=");
                        stringBuilder.append(str);
                        stringBuilder.append(", value=");
                        stringBuilder.append(arrays);
                        stringBuilder.append(" contains invalid ASCII characters");
                        logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", stringBuilder.toString());
                        break;
                    }
                }
                a[i2] = bArr;
                a[i2 + 1] = bArr2;
            }
            i2 += 2;
            i += 2;
        }
        if (i2 != length) {
            a = (byte[][]) Arrays.copyOfRange(a, 0, i2);
        }
        return a;
    }

    public static byte[][] a(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (bbhu.a(bArr2, b)) {
                int i3;
                for (byte b : bArr3) {
                    if (b == (byte) 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            bArr2 = bArr[i];
                            Object obj = bArr[i + 1];
                            if (bbhu.a(bArr2, b)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = obj.length;
                                    if (i4 > length) {
                                        break;
                                    }
                                    if (i4 == length || obj[i4] == (byte) 44) {
                                        byte[] a = anar.a.a(new String(obj, i5, i4 - i5, ampv.a));
                                        length = i4 + 1;
                                        arrayList.add(bArr2);
                                        arrayList.add(a);
                                        i5 = length;
                                    }
                                    i4++;
                                }
                            } else {
                                arrayList.add(bArr2);
                                arrayList.add(obj);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = anar.a.a(new String(bArr3, ampv.a));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    private bbhu() {
    }
}
