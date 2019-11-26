package defpackage;

/* renamed from: nww */
public final class nww {
    private static final String[] h = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = new int[]{44100, 48000, 32000};
    private static final int[] j = new int[]{32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] k = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] l = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] m = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    private static final int[] n = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i) {
        if ((i & -2097152) == -2097152) {
            int i2 = (i >>> 19) & 3;
            if (i2 != 1) {
                int i3 = (i >>> 17) & 3;
                if (i3 != 0) {
                    int i4 = (i >>> 12) & 15;
                    if (!(i4 == 0 || i4 == 15)) {
                        int i5 = (i >>> 10) & 3;
                        if (i5 != 3) {
                            i5 = i[i5];
                            if (i2 == 2) {
                                i5 /= 2;
                            } else if (i2 == 0) {
                                i5 /= 4;
                            }
                            i = (i >>> 9) & 1;
                            if (i3 == 3) {
                                if (i2 != 3) {
                                    i2 = k[i4 - 1];
                                } else {
                                    i2 = j[i4 - 1];
                                }
                                return (((i2 * 12000) / i5) + i) << 2;
                            }
                            int i6 = i2 != 3 ? n[i4 - 1] : i3 != 2 ? m[i4 - 1] : l[i4 - 1];
                            i4 = 144000;
                            if (i2 == 3) {
                                return ((i6 * 144000) / i5) + i;
                            }
                            if (i3 == 1) {
                                i4 = 72000;
                            }
                            return ((i4 * i6) / i5) + i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean a(int i, nww nww) {
        if ((i & -2097152) == -2097152) {
            int i2 = (i >>> 19) & 3;
            if (i2 != 1) {
                int i3 = (i >>> 17) & 3;
                if (i3 != 0) {
                    int i4 = (i >>> 12) & 15;
                    if (!(i4 == 0 || i4 == 15)) {
                        int i5 = (i >>> 10) & 3;
                        if (i5 != 3) {
                            int i6 = i[i5];
                            i5 = 2;
                            if (i2 == 2) {
                                i6 /= 2;
                            } else if (i2 == 0) {
                                i6 /= 4;
                            }
                            int i7 = (i >>> 9) & 1;
                            int i8 = 1152;
                            if (i3 == 3) {
                                if (i2 != 3) {
                                    i4 = k[i4 - 1];
                                } else {
                                    i4 = j[i4 - 1];
                                }
                                i7 = (((i4 * 12000) / i6) + i7) << 2;
                                i8 = 384;
                            } else {
                                int i9 = 144000;
                                if (i2 != 3) {
                                    i4 = n[i4 - 1];
                                    if (i3 == 1) {
                                        i8 = 576;
                                    }
                                    if (i3 == 1) {
                                        i9 = 72000;
                                    }
                                    i9 = (i9 * i4) / i6;
                                } else {
                                    if (i3 != 2) {
                                        i4 = m[i4 - 1];
                                    } else {
                                        i4 = l[i4 - 1];
                                    }
                                    i9 = (144000 * i4) / i6;
                                }
                                i7 += i9;
                            }
                            String str = h[3 - i3];
                            if (((i >> 6) & 3) == 3) {
                                i5 = 1;
                            }
                            nww.a = i2;
                            nww.b = str;
                            nww.c = i7;
                            nww.d = i6;
                            nww.e = i5;
                            nww.f = i4 * 1000;
                            nww.g = i8;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
