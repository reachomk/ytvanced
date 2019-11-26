package defpackage;

/* renamed from: amwm */
public final class amwm extends amur {
    public static final amur a = new amwm(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    private final transient Object b;
    private final transient Object[] c;
    private final transient int d;

    public static amwm a(int i, Object[] objArr) {
        if (i == 0) {
            return (amwm) a;
        }
        if (i == 1) {
            amss.a(objArr[0], objArr[1]);
            return new amwm(null, objArr, 1);
        }
        amqw.b(i, objArr.length >> 1);
        return new amwm(amwm.a(objArr, i, amuw.a(i), 0), objArr, i);
    }

    /* Access modifiers changed, original: final */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: Missing block: B:9:0x002e, code skipped:
            r11[r5] = (byte) r1;
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:23:0x006e, code skipped:
            r11[r5] = (short) r1;
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:35:0x00a5, code skipped:
            r11[r6] = r1;
            r2 = r2 + 1;
     */
    static java.lang.Object a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
        r0 = 1;
        if (r10 == r0) goto L_0x00bb;
    L_0x0003:
        r0 = r11 + -1;
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = 0;
        r3 = -1;
        if (r11 > r1) goto L_0x0045;
    L_0x000b:
        r11 = new byte[r11];
        java.util.Arrays.fill(r11, r3);
    L_0x0010:
        if (r2 >= r10) goto L_0x0044;
    L_0x0012:
        r1 = r2 + r2;
        r1 = r1 + r12;
        r3 = r9[r1];
        r4 = r1 ^ 1;
        r4 = r9[r4];
        defpackage.amss.a(r3, r4);
        r5 = r3.hashCode();
        r5 = defpackage.amud.a(r5);
    L_0x0026:
        r5 = r5 & r0;
        r6 = r11[r5];
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = r6 & r7;
        if (r6 != r7) goto L_0x0034;
    L_0x002e:
        r1 = (byte) r1;
        r11[r5] = r1;
        r2 = r2 + 1;
        goto L_0x0010;
    L_0x0034:
        r7 = r9[r6];
        r7 = r7.equals(r3);
        if (r7 != 0) goto L_0x003f;
    L_0x003c:
        r5 = r5 + 1;
        goto L_0x0026;
    L_0x003f:
        r9 = defpackage.amwm.a(r3, r4, r9, r6);
        throw r9;
    L_0x0044:
        return r11;
    L_0x0045:
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        if (r11 > r1) goto L_0x0085;
    L_0x004a:
        r11 = new short[r11];
        java.util.Arrays.fill(r11, r3);
    L_0x004f:
        if (r2 >= r10) goto L_0x0084;
    L_0x0051:
        r1 = r2 + r2;
        r1 = r1 + r12;
        r3 = r9[r1];
        r4 = r1 ^ 1;
        r4 = r9[r4];
        defpackage.amss.a(r3, r4);
        r5 = r3.hashCode();
        r5 = defpackage.amud.a(r5);
    L_0x0065:
        r5 = r5 & r0;
        r6 = r11[r5];
        r6 = (char) r6;
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r6 != r7) goto L_0x0074;
    L_0x006e:
        r1 = (short) r1;
        r11[r5] = r1;
        r2 = r2 + 1;
        goto L_0x004f;
    L_0x0074:
        r7 = r9[r6];
        r7 = r7.equals(r3);
        if (r7 != 0) goto L_0x007f;
    L_0x007c:
        r5 = r5 + 1;
        goto L_0x0065;
    L_0x007f:
        r9 = defpackage.amwm.a(r3, r4, r9, r6);
        throw r9;
    L_0x0084:
        return r11;
    L_0x0085:
        r11 = new int[r11];
        java.util.Arrays.fill(r11, r3);
    L_0x008a:
        if (r2 >= r10) goto L_0x00ba;
    L_0x008c:
        r1 = r2 + r2;
        r1 = r1 + r12;
        r4 = r9[r1];
        r5 = r1 ^ 1;
        r5 = r9[r5];
        defpackage.amss.a(r4, r5);
        r6 = r4.hashCode();
        r6 = defpackage.amud.a(r6);
    L_0x00a0:
        r6 = r6 & r0;
        r7 = r11[r6];
        if (r7 != r3) goto L_0x00aa;
    L_0x00a5:
        r11[r6] = r1;
        r2 = r2 + 1;
        goto L_0x008a;
    L_0x00aa:
        r8 = r9[r7];
        r8 = r8.equals(r4);
        if (r8 != 0) goto L_0x00b5;
    L_0x00b2:
        r6 = r6 + 1;
        goto L_0x00a0;
    L_0x00b5:
        r9 = defpackage.amwm.a(r4, r5, r9, r7);
        throw r9;
    L_0x00ba:
        return r11;
    L_0x00bb:
        r10 = r9[r12];
        r11 = r12 ^ 1;
        r9 = r9[r11];
        defpackage.amss.a(r10, r9);
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amwm.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        i = valueOf.length();
        int length = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((i + 39) + length) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("Multiple entries with same key: ");
        stringBuilder.append(valueOf);
        valueOf = "=";
        stringBuilder.append(valueOf);
        stringBuilder.append(valueOf2);
        stringBuilder.append(" and ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(valueOf);
        stringBuilder.append(valueOf4);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    private amwm(Object obj, Object[] objArr, int i) {
        this.b = obj;
        this.c = objArr;
        this.d = i;
    }

    public final int size() {
        return this.d;
    }

    public final Object get(Object obj) {
        return amwm.a(this.b, this.c, this.d, 0, obj);
    }

    static Object a(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                if (objArr[i2].equals(obj2)) {
                    return objArr[i2 ^ 1];
                }
                return null;
            } else if (obj != null) {
                int a;
                if (!(obj instanceof byte[])) {
                    if (!(obj instanceof short[])) {
                        int[] iArr = (int[]) obj;
                        i = iArr.length - 1;
                        a = amud.a(obj2.hashCode());
                        while (true) {
                            a &= i;
                            int i3 = iArr[a];
                            if (i3 == -1) {
                                break;
                            } else if (objArr[i3].equals(obj2)) {
                                return objArr[i3 ^ 1];
                            } else {
                                a++;
                            }
                        }
                    } else {
                        short[] sArr = (short[]) obj;
                        i = sArr.length - 1;
                        i2 = amud.a(obj2.hashCode());
                        while (true) {
                            i2 &= i;
                            char c = (char) sArr[i2];
                            if (c == 65535) {
                                return null;
                            }
                            if (objArr[c].equals(obj2)) {
                                return objArr[c ^ 1];
                            }
                            i2++;
                        }
                    }
                } else {
                    byte[] bArr = (byte[]) obj;
                    i = bArr.length - 1;
                    i2 = amud.a(obj2.hashCode());
                    while (true) {
                        i2 &= i;
                        a = bArr[i2] & 255;
                        if (a == 255) {
                            return null;
                        }
                        if (objArr[a].equals(obj2)) {
                            return objArr[a ^ 1];
                        }
                        i2++;
                    }
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final amuw g() {
        return new amwl(this, this.c, 0, this.d);
    }

    /* Access modifiers changed, original: final */
    public final amuw i() {
        return new amwn(this, new amwq(this.c, 0, this.d));
    }

    /* Access modifiers changed, original: final */
    public final amuh c() {
        return new amwq(this.c, 1, this.d);
    }
}
