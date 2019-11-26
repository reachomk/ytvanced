package defpackage;

import java.nio.ByteBuffer;

/* renamed from: obe */
public final class obe {
    private static final int[] a = new int[]{1, 2, 3, 6};
    private static final int[] b = new int[]{48000, 44100, 32000};
    private static final int[] c = new int[]{24000, 22050, 16000};
    private static final int[] d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    public static nzw a(oza oza, String str, String str2, odq odq) {
        int i = b[(oza.d() & 192) >> 6];
        int d = oza.d();
        int i2 = d[(d & 56) >> 3];
        if ((d & 4) != 0) {
            i2++;
        }
        return nzw.a(str, "audio/ac3", -1, -1, i2, i, null, odq, str2);
    }

    public static nzw b(oza oza, String str, String str2, odq odq) {
        oza.d(2);
        int i = b[(oza.d() & 192) >> 6];
        int d = oza.d();
        int i2 = d[(d & 14) >> 1];
        if ((d & 1) != 0) {
            i2++;
        }
        if (((oza.d() & 30) >> 1) > 0 && (2 & oza.d()) != 0) {
            i2 += 2;
        }
        int i3 = i2;
        String str3 = (oza.b() <= 0 || (oza.d() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        return nzw.a(str, str3, -1, -1, i3, i, null, odq, str2);
    }

    public static obd a(oyx oyx) {
        int c;
        int i;
        int c2;
        String str;
        int i2;
        oyx oyx2 = oyx;
        int b = oyx.b();
        oyx2.b(40);
        int c3 = oyx2.c(5);
        oyx2.a(b);
        Object obj = -1;
        int i3;
        if (c3 == 16) {
            int i4;
            int i5;
            oyx2.b(16);
            c3 = oyx2.c(2);
            if (c3 == 0) {
                obj = null;
            } else if (c3 == 1) {
                obj = 1;
            } else if (c3 == 2) {
                obj = 2;
            }
            oyx2.b(3);
            c3 = oyx2.c(11) + 1;
            c3 += c3;
            c = oyx2.c(2);
            if (c == 3) {
                i4 = c[oyx2.c(2)];
                i = 3;
                i5 = 6;
            } else {
                i = oyx2.c(2);
                i5 = a[i];
                i4 = b[c];
            }
            int i6 = i5 << 8;
            c2 = oyx2.c(3);
            boolean e = oyx.e();
            int i7 = d[c2] + e;
            oyx2.b(10);
            if (oyx.e()) {
                oyx2.b(8);
            }
            if (c2 == 0) {
                oyx2.b(5);
                if (oyx.e()) {
                    oyx2.b(8);
                }
            }
            if (obj == 1 && oyx.e()) {
                oyx2.b(16);
            }
            if (oyx.e()) {
                if (c2 > 2) {
                    oyx2.b(2);
                }
                if ((c2 & 1) != 0 && c2 > 2) {
                    oyx2.b(6);
                }
                if ((c2 & 4) != 0) {
                    oyx2.b(6);
                }
                if (e && oyx.e()) {
                    oyx2.b(5);
                }
                if (obj == null) {
                    if (oyx.e()) {
                        oyx2.b(6);
                    }
                    if (c2 == 0 && oyx.e()) {
                        oyx2.b(6);
                    }
                    if (oyx.e()) {
                        oyx2.b(6);
                    }
                    int c4 = oyx2.c(2);
                    if (c4 == 1) {
                        oyx2.b(5);
                    } else if (c4 == 2) {
                        oyx2.b(12);
                    } else if (c4 == 3) {
                        c4 = oyx2.c(5);
                        if (oyx.e()) {
                            oyx2.b(5);
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                oyx2.b(4);
                            }
                            if (oyx.e()) {
                                if (oyx.e()) {
                                    oyx2.b(4);
                                }
                                if (oyx.e()) {
                                    oyx2.b(4);
                                }
                            }
                        }
                        if (oyx.e()) {
                            oyx2.b(5);
                            if (oyx.e()) {
                                oyx2.b(7);
                                if (oyx.e()) {
                                    oyx2.b(8);
                                }
                            }
                        }
                        oyx2.b((c4 + 2) << 3);
                        oyx.f();
                    }
                    if (c2 < 2) {
                        if (oyx.e()) {
                            oyx2.b(14);
                        }
                        if (c2 == 0 && oyx.e()) {
                            oyx2.b(14);
                        }
                    }
                    if (oyx.e()) {
                        if (i == 0) {
                            oyx2.b(5);
                        } else {
                            for (c4 = 0; c4 < i5; c4++) {
                                if (oyx.e()) {
                                    oyx2.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (oyx.e()) {
                oyx2.b(5);
                if (c2 == 2) {
                    oyx2.b(4);
                }
                if (c2 >= 6) {
                    oyx2.b(2);
                }
                if (oyx.e()) {
                    oyx2.b(8);
                }
                if (c2 == 0 && oyx.e()) {
                    oyx2.b(8);
                }
                i3 = 3;
                if (c < 3) {
                    oyx.d();
                }
            } else {
                i3 = 3;
            }
            if (obj == null && i != i3) {
                oyx.d();
            }
            if (obj == 2 && (i == i3 || oyx.e())) {
                oyx2.b(6);
            }
            String str2 = (oyx.e() && oyx2.c(6) == 1 && oyx2.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            str = str2;
            c = c3;
            c2 = i4;
            i = i6;
            i2 = i7;
        } else {
            oyx2.b(32);
            i3 = oyx2.c(2);
            String str3 = i3 == 3 ? null : "audio/ac3";
            int a = obe.a(i3, oyx2.c(6));
            oyx2.b(8);
            c3 = oyx2.c(3);
            if (!((c3 & 1) == 0 || c3 == 1)) {
                oyx2.b(2);
            }
            if ((c3 & 4) != 0) {
                oyx2.b(2);
            }
            if (c3 == 2) {
                oyx2.b(2);
            }
            int[] iArr = b;
            str = str3;
            c = a;
            c2 = i3 < iArr.length ? iArr[i3] : -1;
            i2 = d[c3] + oyx.e();
            i = 1536;
        }
        return new obd(str, i2, c2, c, i);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return obe.a((b & 192) >> 6, b & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i << 8;
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == (byte) -8 && bArr[5] == (byte) 114 && bArr[6] == (byte) 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                return 40 << ((bArr[(b & 255) == 187 ? 9 : 8] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i < iArr.length && i2 >= 0) {
                int[] iArr2 = f;
                if (i3 < iArr2.length) {
                    i = iArr[i];
                    if (i == 44100) {
                        i = iArr2[i3] + (i2 & 1);
                        return i + i;
                    }
                    i2 = e[i3];
                    return i == 32000 ? i2 * 6 : i2 << 2;
                }
            }
        }
        return -1;
    }
}
