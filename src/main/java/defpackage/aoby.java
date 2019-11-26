package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: aoby */
public final class aoby {
    public final ByteBuffer a;
    public int b;
    private anwm c;

    private aoby(byte[] bArr, int i) {
        this.a = ByteBuffer.wrap(bArr, 0, i);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int d(long j) {
        return (-128 & j) != 0 ? (-16384 & j) != 0 ? (-2097152 & j) != 0 ? (-268435456 & j) != 0 ? (-34359738368L & j) != 0 ? (-4398046511104L & j) != 0 ? (-562949953421312L & j) != 0 ? (-72057594037927936L & j) != 0 ? (j & Long.MIN_VALUE) != 0 ? 10 : 9 : 8 : 7 : 6 : 5 : 4 : 3 : 2 : 1;
    }

    private static long f(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int j(int i) {
        return (i & -128) != 0 ? (i & -16384) != 0 ? (-2097152 & i) != 0 ? (i & -268435456) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    private static int l(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static aoby a(byte[] bArr, int i) {
        return new aoby(bArr, i);
    }

    public final anwm a() {
        if (this.c == null) {
            this.c = anwm.a(this.a);
            this.b = this.a.position();
        } else if (this.b != this.a.position()) {
            this.c.c(this.a.array(), this.b, this.a.position() - this.b);
            this.b = this.a.position();
        }
        return this.c;
    }

    public final void a(int i, float f) {
        e(i, 5);
        a(f);
    }

    public final void a(int i, long j) {
        e(i, 0);
        c(j);
    }

    public final void b(int i, long j) {
        e(i, 0);
        c(j);
    }

    public final void a(int i, int i2) {
        e(i, 0);
        a(i2);
    }

    public final void a(int i, boolean z) {
        e(i, 0);
        g(z);
    }

    public final void a(int i, String str) {
        e(i, 2);
        a(str);
    }

    public final void a(int i, aocf aocf) {
        e(i, 2);
        a(aocf);
    }

    public final void a(int i, anze anze) {
        anwm a = a();
        a.a(i, anze);
        a.i();
        this.b = this.a.position();
    }

    public final void a(int i, byte[] bArr) {
        e(i, 2);
        a(bArr);
    }

    public final void b(int i, int i2) {
        e(i, 0);
        i(i2);
    }

    public final void a(double d) {
        e(Double.doubleToLongBits(d));
    }

    public final void a(float f) {
        k(Float.floatToIntBits(f));
    }

    public final void a(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            i(i);
        }
    }

    public final void a(String str) {
        try {
            int j = aoby.j(str.length());
            if (j == aoby.j(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= j) {
                    this.a.position(position + j);
                    aoby.a((CharSequence) str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    i((position2 - position) - j);
                    this.a.position(position2);
                    return;
                }
                throw new aobx(position + j, this.a.limit());
            }
            i(aoby.a((CharSequence) str));
            aoby.a((CharSequence) str, this.a);
        } catch (BufferOverflowException e) {
            aobx aobx = new aobx(this.a.position(), this.a.limit());
            aobx.initCause(e);
            throw aobx;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A:{RETURN} */
    private static int a(java.lang.CharSequence r8) {
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
        if (r2 >= r0) goto L_0x006e;
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
        goto L_0x006e;
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
        r8 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = 39;
        r0.<init>(r1);
        r1 = "Unpaired surrogate at index ";
        r0.append(r1);
        r0.append(r2);
        r0 = r0.toString();
        r8.<init>(r0);
        throw r8;
    L_0x006e:
        if (r3 < r0) goto L_0x0071;
    L_0x0070:
        return r3;
    L_0x0071:
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
        goto L_0x0092;
    L_0x0091:
        throw r8;
    L_0x0092:
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoby.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Missing block: B:26:0x0073, code skipped:
            if (r11 > 57343) goto L_0x0075;
     */
    private static void a(java.lang.CharSequence r14, java.nio.ByteBuffer r15) {
        /*
        r0 = r15.isReadOnly();
        if (r0 != 0) goto L_0x01be;
    L_0x0006:
        r0 = r15.hasArray();
        r1 = "Unpaired surrogate at index ";
        r2 = 39;
        r3 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r6 = 0;
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r0 == 0) goto L_0x0127;
    L_0x001b:
        r0 = r15.array();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r15.arrayOffset();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r9 = r15.position();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r8 + r9;
        r9 = r15.remaining();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r10 = r14.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r9 = r9 + r8;
    L_0x0031:
        if (r6 >= r10) goto L_0x0043;
    L_0x0033:
        r11 = r6 + r8;
        if (r11 >= r9) goto L_0x0043;
    L_0x0037:
        r12 = r14.charAt(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        if (r12 >= r7) goto L_0x0043;
    L_0x003d:
        r12 = (byte) r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r11] = r12;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r6 = r6 + 1;
        goto L_0x0031;
    L_0x0043:
        if (r6 == r10) goto L_0x0112;
    L_0x0045:
        r8 = r8 + r6;
    L_0x0046:
        if (r6 >= r10) goto L_0x0113;
    L_0x0048:
        r11 = r14.charAt(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        if (r11 >= r7) goto L_0x0058;
    L_0x004e:
        if (r8 >= r9) goto L_0x0058;
    L_0x0050:
        r12 = r8 + 1;
        r11 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
    L_0x0055:
        r8 = r12;
        goto L_0x00d5;
    L_0x0058:
        if (r11 >= r5) goto L_0x0070;
    L_0x005a:
        r12 = r9 + -2;
        if (r8 > r12) goto L_0x0070;
    L_0x005e:
        r12 = r8 + 1;
        r13 = r11 >>> 6;
        r13 = r13 | 960;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r12 + 1;
        r11 = r11 & 63;
        r11 = r11 | r7;
        r11 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r12] = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        goto L_0x00d5;
    L_0x0070:
        if (r11 >= r4) goto L_0x0073;
    L_0x0072:
        goto L_0x0075;
    L_0x0073:
        if (r11 <= r3) goto L_0x0095;
    L_0x0075:
        r12 = r9 + -3;
        if (r8 > r12) goto L_0x0095;
    L_0x0079:
        r12 = r8 + 1;
        r13 = r11 >>> 12;
        r13 = r13 | 480;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r12 + 1;
        r13 = r11 >>> 6;
        r13 = r13 & 63;
        r13 = r13 | r7;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r12] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r12 = r8 + 1;
        r11 = r11 & 63;
        r11 = r11 | r7;
        r11 = (byte) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        goto L_0x0055;
    L_0x0095:
        r12 = r9 + -4;
        if (r8 > r12) goto L_0x00f1;
    L_0x0099:
        r12 = r6 + 1;
        r13 = r14.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        if (r12 == r13) goto L_0x00da;
    L_0x00a1:
        r6 = r14.charAt(r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r13 = java.lang.Character.isSurrogatePair(r11, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        if (r13 == 0) goto L_0x00d9;
    L_0x00ab:
        r6 = java.lang.Character.toCodePoint(r11, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r11 = r8 + 1;
        r13 = r6 >>> 18;
        r13 = r13 | 240;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r11 + 1;
        r13 = r6 >>> 12;
        r13 = r13 & 63;
        r13 = r13 | r7;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r11] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r11 = r8 + 1;
        r13 = r6 >>> 6;
        r13 = r13 & 63;
        r13 = r13 | r7;
        r13 = (byte) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r8] = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r11 + 1;
        r6 = r6 & 63;
        r6 = r6 | r7;
        r6 = (byte) r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0[r11] = r6;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r6 = r12;
    L_0x00d5:
        r6 = r6 + 1;
        goto L_0x0046;
    L_0x00d9:
        r6 = r12;
    L_0x00da:
        r14 = new java.lang.IllegalArgumentException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r6 = r6 + -1;
        r15 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15.<init>(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15.append(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15.append(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15 = r15.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r14.<init>(r15);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        throw r14;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
    L_0x00f1:
        r14 = new java.lang.ArrayIndexOutOfBoundsException;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0 = 37;
        r15.<init>(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0 = "Failed writing ";
        r15.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15.append(r11);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r0 = " at index ";
        r15.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15.append(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r15 = r15.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r14.<init>(r15);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        throw r14;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
    L_0x0112:
        r8 = r8 + r10;
    L_0x0113:
        r14 = r15.arrayOffset();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        r8 = r8 - r14;
        r15.position(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x011d }
        goto L_0x01bd;
    L_0x011d:
        r14 = move-exception;
        r15 = new java.nio.BufferOverflowException;
        r15.<init>();
        r15.initCause(r14);
        throw r15;
    L_0x0127:
        r0 = r14.length();
    L_0x012b:
        if (r6 >= r0) goto L_0x01bd;
    L_0x012d:
        r8 = r14.charAt(r6);
        if (r8 >= r7) goto L_0x0139;
    L_0x0133:
        r8 = (byte) r8;
        r15.put(r8);
        goto L_0x01b9;
    L_0x0139:
        if (r8 >= r5) goto L_0x014b;
    L_0x013b:
        r9 = r8 >>> 6;
        r9 = r9 | 960;
        r9 = (byte) r9;
        r15.put(r9);
        r8 = r8 & 63;
        r8 = r8 | r7;
        r8 = (byte) r8;
        r15.put(r8);
        goto L_0x01b9;
    L_0x014b:
        if (r8 >= r4) goto L_0x014e;
    L_0x014d:
        goto L_0x01a1;
    L_0x014e:
        if (r8 > r3) goto L_0x01a1;
    L_0x0150:
        r9 = r6 + 1;
        r10 = r14.length();
        if (r9 == r10) goto L_0x018a;
    L_0x0158:
        r6 = r14.charAt(r9);
        r10 = java.lang.Character.isSurrogatePair(r8, r6);
        if (r10 == 0) goto L_0x0189;
    L_0x0162:
        r6 = java.lang.Character.toCodePoint(r8, r6);
        r8 = r6 >>> 18;
        r8 = r8 | 240;
        r8 = (byte) r8;
        r15.put(r8);
        r8 = r6 >>> 12;
        r8 = r8 & 63;
        r8 = r8 | r7;
        r8 = (byte) r8;
        r15.put(r8);
        r8 = r6 >>> 6;
        r8 = r8 & 63;
        r8 = r8 | r7;
        r8 = (byte) r8;
        r15.put(r8);
        r6 = r6 & 63;
        r6 = r6 | r7;
        r6 = (byte) r6;
        r15.put(r6);
        r6 = r9;
        goto L_0x01b9;
    L_0x0189:
        r6 = r9;
    L_0x018a:
        r14 = new java.lang.IllegalArgumentException;
        r15 = new java.lang.StringBuilder;
        r15.<init>(r2);
        r15.append(r1);
        r6 = r6 + -1;
        r15.append(r6);
        r15 = r15.toString();
        r14.<init>(r15);
        throw r14;
    L_0x01a1:
        r9 = r8 >>> 12;
        r9 = r9 | 480;
        r9 = (byte) r9;
        r15.put(r9);
        r9 = r8 >>> 6;
        r9 = r9 & 63;
        r9 = r9 | r7;
        r9 = (byte) r9;
        r15.put(r9);
        r8 = r8 & 63;
        r8 = r8 | r7;
        r8 = (byte) r8;
        r15.put(r8);
    L_0x01b9:
        r6 = r6 + 1;
        goto L_0x012b;
    L_0x01bd:
        return;
    L_0x01be:
        r14 = new java.nio.ReadOnlyBufferException;
        r14.<init>();
        goto L_0x01c5;
    L_0x01c4:
        throw r14;
    L_0x01c5:
        goto L_0x01c4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoby.a(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public final void a(aocf aocf) {
        i(aocf.getCachedSize());
        aocf.writeTo(this);
    }

    public final void a(byte[] bArr) {
        i(bArr.length);
        b(bArr);
    }

    public final void b(int i) {
        i(aoby.l(i));
    }

    public final void a(long j) {
        c(aoby.f(j));
    }

    public static int c(int i) {
        return aoby.h(i) + 4;
    }

    public static int c(int i, long j) {
        return aoby.h(i) + aoby.d(j);
    }

    public static int d(int i, long j) {
        return aoby.h(i) + aoby.d(j);
    }

    public static int c(int i, int i2) {
        return aoby.h(i) + aoby.e(i2);
    }

    public static int d(int i) {
        return aoby.h(i) + 1;
    }

    public static int b(int i, String str) {
        return aoby.h(i) + aoby.b(str);
    }

    public static int b(int i, aocf aocf) {
        i = aoby.h(i);
        int serializedSize = aocf.getSerializedSize();
        return i + (aoby.j(serializedSize) + serializedSize);
    }

    public static int b(int i, byte[] bArr) {
        i = aoby.h(i);
        int length = bArr.length;
        return i + (aoby.j(length) + length);
    }

    public static int d(int i, int i2) {
        return aoby.h(i) + aoby.j(i2);
    }

    public static int e(int i) {
        return i < 0 ? 10 : aoby.j(i);
    }

    public static int b(String str) {
        int a = aoby.a((CharSequence) str);
        return aoby.j(a) + a;
    }

    public static int f(int i) {
        return aoby.j(aoby.l(i));
    }

    public static int b(long j) {
        return aoby.d(aoby.f(j));
    }

    public final int b() {
        return this.a.remaining();
    }

    public final void g(int i) {
        byte b = (byte) i;
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new aobx(this.a.position(), this.a.limit());
    }

    public final void b(byte[] bArr) {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new aobx(this.a.position(), this.a.limit());
    }

    public final void e(int i, int i2) {
        i(aock.a(i, i2));
    }

    public static int h(int i) {
        return aoby.j(aock.a(i, 0));
    }

    public final void i(int i) {
        while ((i & -128) != 0) {
            g((i & 127) | 128);
            i >>>= 7;
        }
        g(i);
    }

    public final void c(long j) {
        while ((-128 & j) != 0) {
            g((((int) j) & 127) | 128);
            j >>>= 7;
        }
        g((int) j);
    }

    public final void k(int i) {
        if (this.a.remaining() >= 4) {
            this.a.putInt(i);
            return;
        }
        throw new aobx(this.a.position(), this.a.limit());
    }

    public final void e(long j) {
        if (this.a.remaining() >= 8) {
            this.a.putLong(j);
            return;
        }
        throw new aobx(this.a.position(), this.a.limit());
    }
}
