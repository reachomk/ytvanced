package defpackage;

import java.util.List;

/* renamed from: orv */
public final class orv extends osa {
    private final oza a = new oza();
    private final oyx d = new oyx();
    private final int e;
    private final ory[] f;
    private ory g;
    private List h;
    private List i;
    private orx j;
    private int k;

    public orv(int i) {
        if (i == -1) {
            i = 1;
        }
        this.e = i;
        this.f = new ory[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f[i2] = new ory();
        }
        this.g = this.f[0];
        l();
    }

    public final String a() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ void e() {
    }

    public final void d() {
        super.d();
        this.h = null;
        this.i = null;
        this.k = 0;
        this.g = this.f[0];
        l();
        this.j = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f() {
        return this.h != this.i;
    }

    /* Access modifiers changed, original: protected|final */
    public final ork g() {
        List list = this.h;
        this.i = list;
        return new osb(list);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(orn orn) {
        this.a.a(orn.b.array(), orn.b.limit());
        while (this.a.b() >= 3) {
            int d = this.a.d() & 7;
            int i = d & 3;
            d &= 4;
            byte d2 = (byte) this.a.d();
            byte d3 = (byte) this.a.d();
            if ((i == 2 || i == 3) && d == 4) {
                int i2;
                orx orx;
                byte[] bArr;
                if (i == 3) {
                    j();
                    d = (d2 & 192) >> 6;
                    i2 = d2 & 63;
                    if (i2 == 0) {
                        i2 = 64;
                    }
                    this.j = new orx(d, i2);
                    orx = this.j;
                    bArr = orx.c;
                    i = orx.d;
                    orx.d = i + 1;
                    bArr[i] = d3;
                } else {
                    oxz.a(true);
                    orx = this.j;
                    if (orx == null) {
                        oyp.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        bArr = orx.c;
                        i = orx.d;
                        int i3 = i + 1;
                        orx.d = i3;
                        bArr[i] = d2;
                        orx.d = i3 + 1;
                        bArr[i3] = d3;
                    }
                }
                i2 = orx.d;
                d = orx.b;
                if (i2 == (d + d) - 1) {
                    j();
                }
            }
        }
    }

    private final void j() {
        orx orx = this.j;
        if (orx != null) {
            int i = orx.d;
            int i2 = orx.b;
            i2 = (i2 + i2) - 1;
            String str = "Cea708Decoder";
            int i3;
            if (i != i2) {
                i3 = orx.a;
                StringBuilder stringBuilder = new StringBuilder(131);
                stringBuilder.append("DtvCcPacket ended prematurely; size is ");
                stringBuilder.append(i2);
                stringBuilder.append(", but current index is ");
                stringBuilder.append(i);
                stringBuilder.append(" (sequence number ");
                stringBuilder.append(i3);
                stringBuilder.append("); ignoring packet");
                oyp.a(str, stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2;
                this.d.a(orx.c, i);
                i = 3;
                i3 = this.d.c(3);
                i2 = this.d.c(5);
                int i4 = 6;
                int i5 = 7;
                if (i3 == 7) {
                    this.d.b(2);
                    i3 = this.d.c(6);
                    if (i3 < 7) {
                        stringBuilder2 = new StringBuilder(44);
                        stringBuilder2.append("Invalid extended service number: ");
                        stringBuilder2.append(i3);
                        oyp.a(str, stringBuilder2.toString());
                    }
                }
                if (i2 != 0) {
                    if (i3 == this.e) {
                        Object obj = null;
                        while (this.d.a() > 0) {
                            int c = this.d.c(8);
                            StringBuilder stringBuilder3;
                            int c2;
                            if (c == 16) {
                                c = this.d.c(8);
                                if (c > 31) {
                                    if (c <= 127) {
                                        if (c == 32) {
                                            this.g.a(' ');
                                        } else if (c == 33) {
                                            this.g.a(160);
                                        } else if (c == 37) {
                                            this.g.a(8230);
                                        } else if (c == 42) {
                                            this.g.a(352);
                                        } else if (c == 44) {
                                            this.g.a(338);
                                        } else if (c == 63) {
                                            this.g.a(376);
                                        } else if (c == 57) {
                                            this.g.a(8482);
                                        } else if (c == 58) {
                                            this.g.a(353);
                                        } else if (c == 60) {
                                            this.g.a(339);
                                        } else if (c != 61) {
                                            switch (c) {
                                                case 48:
                                                    this.g.a(9608);
                                                    break;
                                                case cv.aT /*49*/:
                                                    this.g.a(8216);
                                                    break;
                                                case cv.aU /*50*/:
                                                    this.g.a(8217);
                                                    break;
                                                case cv.aV /*51*/:
                                                    this.g.a(8220);
                                                    break;
                                                case cv.aW /*52*/:
                                                    this.g.a(8221);
                                                    break;
                                                case cv.aX /*53*/:
                                                    this.g.a(8226);
                                                    break;
                                                default:
                                                    switch (c) {
                                                        case 118:
                                                            this.g.a(8539);
                                                            break;
                                                        case 119:
                                                            this.g.a(8540);
                                                            break;
                                                        case 120:
                                                            this.g.a(8541);
                                                            break;
                                                        case 121:
                                                            this.g.a(8542);
                                                            break;
                                                        case afy.av /*122*/:
                                                            this.g.a(9474);
                                                            break;
                                                        case 123:
                                                            this.g.a(9488);
                                                            break;
                                                        case 124:
                                                            this.g.a(9492);
                                                            break;
                                                        case 125:
                                                            this.g.a(9472);
                                                            break;
                                                        case 126:
                                                            this.g.a(9496);
                                                            break;
                                                        case 127:
                                                            this.g.a(9484);
                                                            break;
                                                        default:
                                                            stringBuilder2 = new StringBuilder(33);
                                                            stringBuilder2.append("Invalid G2 character: ");
                                                            stringBuilder2.append(c);
                                                            oyp.a(str, stringBuilder2.toString());
                                                            break;
                                                    }
                                            }
                                        } else {
                                            this.g.a(8480);
                                        }
                                    } else if (c <= 159) {
                                        if (c <= 135) {
                                            this.d.b(32);
                                        } else if (c <= 143) {
                                            this.d.b(40);
                                        } else {
                                            this.d.b(2);
                                            this.d.b(this.d.c(i4) << i);
                                        }
                                    } else if (c > 255) {
                                        stringBuilder3 = new StringBuilder(37);
                                        stringBuilder3.append("Invalid extended command: ");
                                        stringBuilder3.append(c);
                                        oyp.a(str, stringBuilder3.toString());
                                    } else if (c == 160) {
                                        this.g.a(13252);
                                    } else {
                                        stringBuilder2 = new StringBuilder(33);
                                        stringBuilder2.append("Invalid G3 character: ");
                                        stringBuilder2.append(c);
                                        oyp.a(str, stringBuilder2.toString());
                                        this.g.a('_');
                                    }
                                    obj = 1;
                                } else if (c > i5) {
                                    if (c <= 15) {
                                        this.d.b(8);
                                    } else if (c <= 23) {
                                        this.d.b(16);
                                    } else {
                                        this.d.b(24);
                                    }
                                }
                            } else if (c > 31) {
                                if (c > 127) {
                                    StringBuilder stringBuilder4;
                                    if (c <= 159) {
                                        ory ory;
                                        switch (c) {
                                            case 128:
                                            case 129:
                                            case 130:
                                            case 131:
                                            case 132:
                                            case 133:
                                            case 134:
                                            case 135:
                                                c -= 128;
                                                if (this.k != c) {
                                                    this.k = c;
                                                    this.g = this.f[c];
                                                    break;
                                                }
                                                break;
                                            case 136:
                                                for (i3 = 1; i3 <= 8; i3++) {
                                                    if (this.d.e()) {
                                                        this.f[8 - i3].c();
                                                    }
                                                }
                                                break;
                                            case 137:
                                                for (i3 = 1; i3 <= 8; i3++) {
                                                    if (this.d.e()) {
                                                        this.f[8 - i3].i = true;
                                                    }
                                                }
                                                break;
                                            case 138:
                                                for (i3 = 1; i3 <= 8; i3++) {
                                                    if (this.d.e()) {
                                                        this.f[8 - i3].i = false;
                                                    }
                                                }
                                                break;
                                            case 139:
                                                for (i3 = 1; i3 <= 8; i3++) {
                                                    if (this.d.e()) {
                                                        ory = this.f[8 - i3];
                                                        ory.i ^= 1;
                                                    }
                                                }
                                                break;
                                            case 140:
                                                for (i3 = 1; i3 <= 8; i3++) {
                                                    if (this.d.e()) {
                                                        this.f[8 - i3].b();
                                                    }
                                                }
                                                break;
                                            case 141:
                                                this.d.b(8);
                                                break;
                                            case 142:
                                                break;
                                            case 143:
                                                l();
                                                break;
                                            case 144:
                                                if (!this.g.h) {
                                                    this.d.b(16);
                                                    break;
                                                }
                                                this.d.c(4);
                                                this.d.c(2);
                                                this.d.c(2);
                                                boolean e = this.d.e();
                                                boolean e2 = this.d.e();
                                                this.d.c(3);
                                                this.d.c(3);
                                                this.g.a(e, e2);
                                                break;
                                            case 145:
                                                if (!this.g.h) {
                                                    this.d.b(24);
                                                    break;
                                                }
                                                i3 = ory.a(this.d.c(2), this.d.c(2), this.d.c(2), this.d.c(2));
                                                i = ory.a(this.d.c(2), this.d.c(2), this.d.c(2), this.d.c(2));
                                                this.d.b(2);
                                                ory.a(this.d.c(2), this.d.c(2), this.d.c(2));
                                                this.g.b(i3, i);
                                                break;
                                            case 146:
                                                if (!this.g.h) {
                                                    this.d.b(16);
                                                    break;
                                                }
                                                this.d.b(4);
                                                i3 = this.d.c(4);
                                                this.d.b(2);
                                                this.d.c(6);
                                                ory = this.g;
                                                if (ory.u != i3) {
                                                    ory.a(10);
                                                }
                                                ory.u = i3;
                                                break;
                                            case 151:
                                                if (!this.g.h) {
                                                    this.d.b(32);
                                                    break;
                                                }
                                                i3 = ory.a(this.d.c(2), this.d.c(2), this.d.c(2), this.d.c(2));
                                                this.d.c(2);
                                                ory.a(this.d.c(2), this.d.c(2), this.d.c(2));
                                                this.d.e();
                                                this.d.e();
                                                this.d.c(2);
                                                this.d.c(2);
                                                i = this.d.c(2);
                                                this.d.b(8);
                                                this.g.a(i3, i);
                                                break;
                                            case 152:
                                            case 153:
                                            case 154:
                                            case 155:
                                            case 156:
                                            case 157:
                                            case 158:
                                            case 159:
                                                c -= 152;
                                                ory ory2 = this.f[c];
                                                this.d.b(2);
                                                boolean e3 = this.d.e();
                                                boolean e4 = this.d.e();
                                                this.d.e();
                                                int c3 = this.d.c(i);
                                                boolean e5 = this.d.e();
                                                i3 = this.d.c(i5);
                                                i5 = this.d.c(8);
                                                c2 = this.d.c(4);
                                                i2 = this.d.c(4);
                                                this.d.b(2);
                                                this.d.c(i4);
                                                this.d.b(2);
                                                int c4 = this.d.c(i);
                                                i4 = this.d.c(i);
                                                ory2.h = true;
                                                ory2.i = e3;
                                                ory2.p = e4;
                                                ory2.j = c3;
                                                ory2.k = e5;
                                                ory2.l = i3;
                                                ory2.m = i5;
                                                ory2.n = c2;
                                                i2++;
                                                if (ory2.o != i2) {
                                                    ory2.o = i2;
                                                    while (true) {
                                                        if ((e4 && ory2.f.size() >= ory2.o) || ory2.f.size() >= 15) {
                                                            ory2.f.remove(0);
                                                        }
                                                    }
                                                }
                                                if (!(c4 == 0 || ory2.r == c4)) {
                                                    ory2.r = c4;
                                                    c4--;
                                                    ory2.a(ory.d[c4], ory.c[c4]);
                                                }
                                                if (!(i4 == 0 || ory2.s == i4)) {
                                                    ory2.s = i4;
                                                    ory2.a(false, false);
                                                    ory2.b(ory.a, ory.e[i4 - 1]);
                                                }
                                                if (this.k != c) {
                                                    this.k = c;
                                                    this.g = this.f[c];
                                                    break;
                                                }
                                                break;
                                            default:
                                                stringBuilder4 = new StringBuilder(31);
                                                stringBuilder4.append("Invalid C1 command: ");
                                                stringBuilder4.append(c);
                                                oyp.a(str, stringBuilder4.toString());
                                                break;
                                        }
                                    } else if (c > 255) {
                                        stringBuilder4 = new StringBuilder(33);
                                        stringBuilder4.append("Invalid base command: ");
                                        stringBuilder4.append(c);
                                        oyp.a(str, stringBuilder4.toString());
                                        i = 3;
                                        i4 = 6;
                                        i5 = 7;
                                    } else {
                                        this.g.a((char) (c & 255));
                                    }
                                } else if (c != 127) {
                                    this.g.a((char) (c & 255));
                                } else {
                                    this.g.a(9835);
                                }
                                i = 3;
                                i4 = 6;
                                i5 = 7;
                                obj = 1;
                            } else if (c != 0) {
                                if (c == i) {
                                    this.h = k();
                                } else if (c != 8) {
                                    switch (c) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.g.a(10);
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (c < 17 || c > 23) {
                                                if (c < 24) {
                                                    stringBuilder3 = new StringBuilder(31);
                                                    stringBuilder3.append("Invalid C0 command: ");
                                                    stringBuilder3.append(c);
                                                    oyp.a(str, stringBuilder3.toString());
                                                    break;
                                                }
                                                stringBuilder3 = new StringBuilder(54);
                                                stringBuilder3.append("Currently unsupported COMMAND_P16 Command: ");
                                                stringBuilder3.append(c);
                                                oyp.a(str, stringBuilder3.toString());
                                                this.d.b(16);
                                                break;
                                            }
                                            StringBuilder stringBuilder5 = new StringBuilder(55);
                                            stringBuilder5.append("Currently unsupported COMMAND_EXT1 Command: ");
                                            stringBuilder5.append(c);
                                            oyp.a(str, stringBuilder5.toString());
                                            this.d.b(8);
                                            break;
                                            break;
                                    }
                                } else {
                                    ory ory3 = this.g;
                                    c2 = ory3.g.length();
                                    if (c2 > 0) {
                                        ory3.g.delete(c2 - 1, c2);
                                    }
                                }
                            }
                            i = 3;
                            i4 = 6;
                            i5 = 7;
                        }
                        if (obj != null) {
                            this.h = k();
                        }
                    }
                } else if (i3 != 0) {
                    StringBuilder stringBuilder6 = new StringBuilder(59);
                    stringBuilder6.append("serviceNumber is non-zero (");
                    stringBuilder6.append(i3);
                    stringBuilder6.append(") when blockSize is 0");
                    oyp.a(str, stringBuilder6.toString());
                }
            }
            this.j = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    private final java.util.List k() {
        /*
        r17 = this;
        r0 = r17;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 0;
        r3 = 0;
    L_0x0009:
        r4 = 8;
        if (r3 >= r4) goto L_0x00e6;
    L_0x000d:
        r4 = r0.f;
        r4 = r4[r3];
        r4 = r4.a();
        if (r4 != 0) goto L_0x00e2;
    L_0x0017:
        r4 = r0.f;
        r4 = r4[r3];
        r5 = r4.i;
        if (r5 != 0) goto L_0x0021;
    L_0x001f:
        goto L_0x00e2;
    L_0x0021:
        r5 = r4.a();
        if (r5 != 0) goto L_0x00db;
    L_0x0027:
        r7 = new android.text.SpannableStringBuilder;
        r7.<init>();
        r5 = 0;
    L_0x002d:
        r6 = r4.f;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x0048;
    L_0x0035:
        r6 = r4.f;
        r6 = r6.get(r5);
        r6 = (java.lang.CharSequence) r6;
        r7.append(r6);
        r6 = 10;
        r7.append(r6);
        r5 = r5 + 1;
        goto L_0x002d;
    L_0x0048:
        r5 = r4.d();
        r7.append(r5);
        r5 = r4.q;
        r6 = 2;
        r8 = 1;
        if (r5 == 0) goto L_0x007c;
    L_0x0055:
        if (r5 == r8) goto L_0x0079;
    L_0x0057:
        if (r5 == r6) goto L_0x0076;
    L_0x0059:
        r9 = 3;
        if (r5 != r9) goto L_0x005d;
    L_0x005c:
        goto L_0x007c;
    L_0x005d:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = 43;
        r2.<init>(r3);
        r3 = "Unexpected justification value: ";
        r2.append(r3);
        r2.append(r5);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0076:
        r5 = android.text.Layout.Alignment.ALIGN_CENTER;
        goto L_0x007e;
    L_0x0079:
        r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        goto L_0x007e;
    L_0x007c:
        r5 = android.text.Layout.Alignment.ALIGN_NORMAL;
    L_0x007e:
        r9 = r4.k;
        if (r9 == 0) goto L_0x008d;
    L_0x0082:
        r9 = r4.m;
        r9 = (float) r9;
        r10 = 1120272384; // 0x42c60000 float:99.0 double:5.53488099E-315;
        r9 = r9 / r10;
        r11 = r4.l;
        r11 = (float) r11;
        r11 = r11 / r10;
        goto L_0x009a;
    L_0x008d:
        r9 = r4.m;
        r9 = (float) r9;
        r10 = 1129381888; // 0x43510000 float:209.0 double:5.57988792E-315;
        r9 = r9 / r10;
        r10 = r4.l;
        r10 = (float) r10;
        r11 = 1116995584; // 0x42940000 float:74.0 double:5.518691446E-315;
        r11 = r10 / r11;
    L_0x009a:
        r10 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r9 = r9 * r10;
        r12 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r13 = r9 + r12;
        r11 = r11 * r10;
        r9 = r11 + r12;
        r10 = r4.n;
        r11 = r10 % 3;
        if (r11 != 0) goto L_0x00b0;
    L_0x00ae:
        r11 = 0;
        goto L_0x00b5;
    L_0x00b0:
        if (r11 == r8) goto L_0x00b4;
    L_0x00b2:
        r11 = 2;
        goto L_0x00b5;
    L_0x00b4:
        r11 = 1;
    L_0x00b5:
        r10 = r10 / 3;
        if (r10 != 0) goto L_0x00bb;
    L_0x00b9:
        r12 = 0;
        goto L_0x00c0;
    L_0x00bb:
        if (r10 == r8) goto L_0x00bf;
    L_0x00bd:
        r12 = 2;
        goto L_0x00c0;
    L_0x00bf:
        r12 = 1;
    L_0x00c0:
        r6 = r4.t;
        r10 = defpackage.ory.b;
        if (r6 == r10) goto L_0x00c8;
    L_0x00c6:
        r14 = 1;
        goto L_0x00c9;
    L_0x00c8:
        r14 = 0;
    L_0x00c9:
        r16 = new orw;
        r15 = r4.t;
        r4 = r4.j;
        r6 = r16;
        r8 = r5;
        r10 = r11;
        r11 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r4;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15);
        goto L_0x00dd;
    L_0x00db:
        r16 = 0;
    L_0x00dd:
        r4 = r16;
        r1.add(r4);
    L_0x00e2:
        r3 = r3 + 1;
        goto L_0x0009;
    L_0x00e6:
        java.util.Collections.sort(r1);
        r1 = java.util.Collections.unmodifiableList(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orv.k():java.util.List");
    }

    private final void l() {
        for (int i = 0; i < 8; i++) {
            this.f[i].b();
        }
    }

    public final /* bridge */ /* synthetic */ orq h() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ void b(orn orn) {
        super.a(orn);
    }

    public final /* bridge */ /* synthetic */ orn i() {
        return super.b();
    }
}
