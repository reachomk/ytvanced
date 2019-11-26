package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aobd */
final class aobd {
    public static final aobf a;

    public static int a(int i) {
        return i > -12 ? -1 : i;
    }

    public static int a(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : i ^ (i2 << 8);
    }

    public static int a(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }

    public static int b(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        i2 -= i;
        if (i2 == 0) {
            return aobd.a(i3);
        }
        if (i2 == 1) {
            return aobd.a(i3, bArr[i]);
        }
        if (i2 == 2) {
            return aobd.a(i3, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A:{RETURN} */
    static int a(java.lang.CharSequence r8) {
        /*
        r0 = r8.length();
        r1 = 0;
        r2 = 0;
    L_0x0006:
        if (r2 >= r0) goto L_0x0013;
    L_0x0008:
        r3 = r8.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 >= r4) goto L_0x0013;
    L_0x0010:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x0013:
        r3 = r0;
    L_0x0014:
        if (r2 >= r0) goto L_0x005b;
    L_0x0016:
        r4 = r8.charAt(r2);
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r4 >= r5) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x0026:
        r4 = r8.length();
    L_0x002a:
        if (r2 < r4) goto L_0x002e;
    L_0x002c:
        r3 = r3 + r1;
        goto L_0x005b;
    L_0x002e:
        r6 = r8.charAt(r2);
        if (r6 >= r5) goto L_0x003a;
    L_0x0034:
        r6 = 127 - r6;
        r6 = r6 >>> 31;
        r1 = r1 + r6;
        goto L_0x0052;
    L_0x003a:
        r1 = r1 + 2;
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r6 >= r7) goto L_0x0042;
    L_0x0041:
        goto L_0x0052;
    L_0x0042:
        r7 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r6 <= r7) goto L_0x0048;
    L_0x0047:
        goto L_0x0052;
    L_0x0048:
        r6 = java.lang.Character.codePointAt(r8, r2);
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r6 < r7) goto L_0x0055;
    L_0x0050:
        r2 = r2 + 1;
    L_0x0052:
        r2 = r2 + 1;
        goto L_0x002a;
    L_0x0055:
        r8 = new aobh;
        r8.<init>(r2, r4);
        throw r8;
    L_0x005b:
        if (r3 < r0) goto L_0x005e;
    L_0x005d:
        return r3;
    L_0x005e:
        r8 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = 54;
        r0.<init>(r1);
        r1 = "UTF-8 length does not fit in int: ";
        r0.append(r1);
        r1 = (long) r3;
        r3 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r1 = r1 + r3;
        r0.append(r1);
        r0 = r0.toString();
        r8.<init>(r0);
        goto L_0x007f;
    L_0x007e:
        throw r8;
    L_0x007f:
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobd.a(java.lang.CharSequence):int");
    }

    static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static String c(byte[] bArr, int i, int i2) {
        return a.b(bArr, i, i2);
    }

    static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        aobf aobf = a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(aobd.a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            aobf.a(charSequence, byteBuffer);
        } else {
            aobf.b(charSequence, byteBuffer);
        }
    }

    static {
        aobf aobk;
        if (aoax.c && aoax.b && !anvm.a()) {
            aobk = new aobk();
        } else {
            aobk = new aobi();
        }
        a = aobk;
    }
}
