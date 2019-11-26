package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ayn */
public final class ayn {
    public final int a;
    public final byte[] b;
    private final int c;

    private ayn(int i, int i2, byte[] bArr) {
        this(i, i2, bArr, (byte) 0);
    }

    ayn(int i, int i2, byte[] bArr, byte b) {
        this.a = i;
        this.c = i2;
        this.b = bArr;
    }

    public static ayn a(int i, ByteOrder byteOrder) {
        int[] iArr = new int[]{i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aym.b[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new ayn(3, 1, wrap.array());
    }

    public static ayn a(long j, ByteOrder byteOrder) {
        long[] jArr = new long[]{j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aym.b[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new ayn(4, 1, wrap.array());
    }

    public static ayn a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(0);
        byte[] bytes = stringBuilder.toString().getBytes(aym.d);
        return new ayn(2, bytes.length, bytes);
    }

    public static ayn a(ayp ayp, ByteOrder byteOrder) {
        ayp[] aypArr = new ayp[]{ayp};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aym.b[5]]);
        wrap.order(byteOrder);
        ayp ayp2 = aypArr[0];
        wrap.putInt((int) ayp2.a);
        wrap.putInt((int) ayp2.b);
        return new ayn(5, 1, wrap.array());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(aym.a[this.a]);
        stringBuilder.append(", data length:");
        stringBuilder.append(this.b.length);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x019b A:{SYNTHETIC, Splitter:B:162:0x019b} */
    public final java.lang.Object a(java.nio.ByteOrder r11) {
        /*
        r10 = this;
        r0 = "IOException occurred while closing InputStream";
        r1 = "ExifInterface";
        r2 = 0;
        r3 = new ayo;	 Catch:{ IOException -> 0x0187, all -> 0x0184 }
        r4 = r10.b;	 Catch:{ IOException -> 0x0187, all -> 0x0184 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0187, all -> 0x0184 }
        r3.a = r11;	 Catch:{ IOException -> 0x0182 }
        r11 = r10.a;	 Catch:{ IOException -> 0x0182 }
        r4 = 0;
        switch(r11) {
            case 1: goto L_0x0149;
            case 2: goto L_0x00fe;
            case 3: goto L_0x00e4;
            case 4: goto L_0x00ca;
            case 5: goto L_0x00a7;
            case 6: goto L_0x0149;
            case 7: goto L_0x00fe;
            case 8: goto L_0x008d;
            case 9: goto L_0x0073;
            case 10: goto L_0x004e;
            case 11: goto L_0x0033;
            case 12: goto L_0x0019;
            default: goto L_0x0014;
        };
    L_0x0014:
        r3.close();	 Catch:{ IOException -> 0x017b }
        goto L_0x017f;
    L_0x0019:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new double[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x001d:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x002a;
    L_0x0021:
        r5 = r3.readDouble();	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x001d;
    L_0x002a:
        r3.close();	 Catch:{ IOException -> 0x002e }
        goto L_0x0032;
    L_0x002e:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x0032:
        return r11;
    L_0x0033:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new double[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x0037:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x0045;
    L_0x003b:
        r5 = r3.readFloat();	 Catch:{ IOException -> 0x0182 }
        r5 = (double) r5;	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x0037;
    L_0x0045:
        r3.close();	 Catch:{ IOException -> 0x0049 }
        goto L_0x004d;
    L_0x0049:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x004d:
        return r11;
    L_0x004e:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new defpackage.ayp[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x0052:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x006a;
    L_0x0056:
        r5 = r3.readInt();	 Catch:{ IOException -> 0x0182 }
        r5 = (long) r5;	 Catch:{ IOException -> 0x0182 }
        r7 = r3.readInt();	 Catch:{ IOException -> 0x0182 }
        r7 = (long) r7;	 Catch:{ IOException -> 0x0182 }
        r9 = new ayp;	 Catch:{ IOException -> 0x0182 }
        r9.<init>(r5, r7);	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r9;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x0052;
    L_0x006a:
        r3.close();	 Catch:{ IOException -> 0x006e }
        goto L_0x0072;
    L_0x006e:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x0072:
        return r11;
    L_0x0073:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new int[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x0077:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x0084;
    L_0x007b:
        r5 = r3.readInt();	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x0077;
    L_0x0084:
        r3.close();	 Catch:{ IOException -> 0x0088 }
        goto L_0x008c;
    L_0x0088:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x008c:
        return r11;
    L_0x008d:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new int[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x0091:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x009e;
    L_0x0095:
        r5 = r3.readShort();	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x0091;
    L_0x009e:
        r3.close();	 Catch:{ IOException -> 0x00a2 }
        goto L_0x00a6;
    L_0x00a2:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x00a6:
        return r11;
    L_0x00a7:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new defpackage.ayp[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x00ab:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x00c1;
    L_0x00af:
        r5 = r3.a();	 Catch:{ IOException -> 0x0182 }
        r7 = r3.a();	 Catch:{ IOException -> 0x0182 }
        r9 = new ayp;	 Catch:{ IOException -> 0x0182 }
        r9.<init>(r5, r7);	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r9;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x00ab;
    L_0x00c1:
        r3.close();	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00c9;
    L_0x00c5:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x00c9:
        return r11;
    L_0x00ca:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new long[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x00ce:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x00db;
    L_0x00d2:
        r5 = r3.a();	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x00ce;
    L_0x00db:
        r3.close();	 Catch:{ IOException -> 0x00df }
        goto L_0x00e3;
    L_0x00df:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x00e3:
        return r11;
    L_0x00e4:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r11 = new int[r11];	 Catch:{ IOException -> 0x0182 }
    L_0x00e8:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x00f5;
    L_0x00ec:
        r5 = r3.readUnsignedShort();	 Catch:{ IOException -> 0x0182 }
        r11[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r4 = r4 + 1;
        goto L_0x00e8;
    L_0x00f5:
        r3.close();	 Catch:{ IOException -> 0x00f9 }
        goto L_0x00fd;
    L_0x00f9:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x00fd:
        return r11;
    L_0x00fe:
        r11 = r10.c;	 Catch:{ IOException -> 0x0182 }
        r5 = defpackage.aym.c;	 Catch:{ IOException -> 0x0182 }
        r5 = r5.length;	 Catch:{ IOException -> 0x0182 }
        if (r11 < r5) goto L_0x011b;
    L_0x0105:
        r11 = 0;
    L_0x0106:
        r5 = defpackage.aym.c;	 Catch:{ IOException -> 0x0182 }
        r5 = r5.length;	 Catch:{ IOException -> 0x0182 }
        if (r11 >= r5) goto L_0x0118;
    L_0x010b:
        r5 = r10.b;	 Catch:{ IOException -> 0x0182 }
        r5 = r5[r11];	 Catch:{ IOException -> 0x0182 }
        r6 = defpackage.aym.c;	 Catch:{ IOException -> 0x0182 }
        r6 = r6[r11];	 Catch:{ IOException -> 0x0182 }
        if (r5 != r6) goto L_0x011b;
    L_0x0115:
        r11 = r11 + 1;
        goto L_0x0106;
    L_0x0118:
        r11 = defpackage.aym.c;	 Catch:{ IOException -> 0x0182 }
        r4 = r11.length;	 Catch:{ IOException -> 0x0182 }
    L_0x011b:
        r11 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0182 }
        r11.<init>();	 Catch:{ IOException -> 0x0182 }
    L_0x0120:
        r5 = r10.c;	 Catch:{ IOException -> 0x0182 }
        if (r4 >= r5) goto L_0x013c;
    L_0x0124:
        r5 = r10.b;	 Catch:{ IOException -> 0x0182 }
        r5 = r5[r4];	 Catch:{ IOException -> 0x0182 }
        if (r5 != 0) goto L_0x012b;
    L_0x012a:
        goto L_0x013c;
    L_0x012b:
        r6 = 32;
        if (r5 < r6) goto L_0x0134;
    L_0x012f:
        r5 = (char) r5;	 Catch:{ IOException -> 0x0182 }
        r11.append(r5);	 Catch:{ IOException -> 0x0182 }
        goto L_0x0139;
    L_0x0134:
        r5 = 63;
        r11.append(r5);	 Catch:{ IOException -> 0x0182 }
    L_0x0139:
        r4 = r4 + 1;
        goto L_0x0120;
    L_0x013c:
        r11 = r11.toString();	 Catch:{ IOException -> 0x0182 }
        r3.close();	 Catch:{ IOException -> 0x0144 }
        goto L_0x0148;
    L_0x0144:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x0148:
        return r11;
    L_0x0149:
        r11 = r10.b;	 Catch:{ IOException -> 0x0182 }
        r5 = r11.length;	 Catch:{ IOException -> 0x0182 }
        r6 = 1;
        if (r5 != r6) goto L_0x016b;
    L_0x014f:
        r5 = r11[r4];	 Catch:{ IOException -> 0x0182 }
        if (r5 >= 0) goto L_0x0154;
    L_0x0153:
        goto L_0x016b;
    L_0x0154:
        if (r5 > r6) goto L_0x016b;
    L_0x0156:
        r11 = new java.lang.String;	 Catch:{ IOException -> 0x0182 }
        r6 = new char[r6];	 Catch:{ IOException -> 0x0182 }
        r5 = r5 + 48;
        r5 = (char) r5;	 Catch:{ IOException -> 0x0182 }
        r6[r4] = r5;	 Catch:{ IOException -> 0x0182 }
        r11.<init>(r6);	 Catch:{ IOException -> 0x0182 }
        r3.close();	 Catch:{ IOException -> 0x0166 }
        goto L_0x016a;
    L_0x0166:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x016a:
        return r11;
    L_0x016b:
        r4 = new java.lang.String;	 Catch:{ IOException -> 0x0182 }
        r5 = defpackage.aym.d;	 Catch:{ IOException -> 0x0182 }
        r4.<init>(r11, r5);	 Catch:{ IOException -> 0x0182 }
        r3.close();	 Catch:{ IOException -> 0x0176 }
        goto L_0x017a;
    L_0x0176:
        r11 = move-exception;
        android.util.Log.e(r1, r0, r11);
    L_0x017a:
        return r4;
    L_0x017b:
        r11 = move-exception;
        android.util.Log.e(r1, r0, r11);
    L_0x017f:
        return r2;
    L_0x0180:
        r11 = move-exception;
        goto L_0x0199;
    L_0x0182:
        r11 = move-exception;
        goto L_0x0189;
    L_0x0184:
        r11 = move-exception;
        r3 = r2;
        goto L_0x0199;
    L_0x0187:
        r11 = move-exception;
        r3 = r2;
    L_0x0189:
        r4 = "IOException occurred during reading a value";
        android.util.Log.w(r1, r4, r11);	 Catch:{ all -> 0x0180 }
        if (r3 == 0) goto L_0x0198;
    L_0x0190:
        r3.close();	 Catch:{ IOException -> 0x0194 }
        goto L_0x0198;
    L_0x0194:
        r11 = move-exception;
        android.util.Log.e(r1, r0, r11);
    L_0x0198:
        return r2;
    L_0x0199:
        if (r3 == 0) goto L_0x01a3;
    L_0x019b:
        r3.close();	 Catch:{ IOException -> 0x019f }
        goto L_0x01a3;
    L_0x019f:
        r2 = move-exception;
        android.util.Log.e(r1, r0, r2);
    L_0x01a3:
        goto L_0x01a5;
    L_0x01a4:
        throw r11;
    L_0x01a5:
        goto L_0x01a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.a(java.nio.ByteOrder):java.lang.Object");
    }

    public final int b(ByteOrder byteOrder) {
        Object a = a(byteOrder);
        if (a == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (a instanceof String) {
            return Integer.parseInt((String) a);
        } else {
            String str = "There are more than one component";
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException(str);
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException(str);
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String c(ByteOrder byteOrder) {
        Object a = a(byteOrder);
        if (a != null) {
            if (a instanceof String) {
                return (String) a;
            }
            StringBuilder stringBuilder = new StringBuilder();
            String str = ",";
            int i = 0;
            int length;
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                while (true) {
                    length = jArr.length;
                    if (i >= length) {
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(jArr[i]);
                    i++;
                    if (i != length) {
                        stringBuilder.append(str);
                    }
                }
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                while (true) {
                    length = iArr.length;
                    if (i >= length) {
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(iArr[i]);
                    i++;
                    if (i != length) {
                        stringBuilder.append(str);
                    }
                }
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                while (true) {
                    length = dArr.length;
                    if (i >= length) {
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(dArr[i]);
                    i++;
                    if (i != length) {
                        stringBuilder.append(str);
                    }
                }
            } else if (a instanceof ayp[]) {
                ayp[] aypArr = (ayp[]) a;
                while (true) {
                    length = aypArr.length;
                    if (i >= length) {
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(aypArr[i].a);
                    stringBuilder.append('/');
                    stringBuilder.append(aypArr[i].b);
                    i++;
                    if (i != length) {
                        stringBuilder.append(str);
                    }
                }
            }
        }
        return null;
    }
}
