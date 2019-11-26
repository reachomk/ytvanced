package defpackage;

/* renamed from: bcsi */
final class bcsi implements bcsv, bcsz {
    private final bcpm a;
    private final int b;
    private final int c;

    protected bcsi(bcpm bcpm, int i, int i2) {
        this.a = bcpm;
        int i3 = 18;
        if (i2 <= 18) {
            i3 = i2;
        }
        this.b = i;
        this.c = i3;
    }

    public final int a() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1 A:{LOOP_START, Catch:{ IOException -> 0x00e8 }, PHI: r12 , LOOP:4: B:49:0x00d1->B:50:0x00d3} */
    public final void a(java.lang.StringBuffer r7, long r8, defpackage.bcpl r10, int r11, defpackage.bcpt r12, java.util.Locale r13) {
        /*
        r6 = this;
        r11 = r6.a;	 Catch:{ IOException -> 0x00e8 }
        r10 = r11.a(r10);	 Catch:{ IOException -> 0x00e8 }
        r11 = r6.b;	 Catch:{ IOException -> 0x00e8 }
        r8 = r10.d(r8);	 Catch:{ RuntimeException -> 0x00e5 }
        r12 = 0;
        r0 = 48;
        r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x001c;
    L_0x0014:
        r11 = r11 + -1;
        if (r11 < 0) goto L_0x00e0;
    L_0x0018:
        r7.append(r0);	 Catch:{ IOException -> 0x00e8 }
        goto L_0x0014;
    L_0x001c:
        r10 = r10.d();	 Catch:{ IOException -> 0x00e8 }
        r12 = r10.d();	 Catch:{ IOException -> 0x00e8 }
        r10 = r6.c;	 Catch:{ IOException -> 0x00e8 }
    L_0x0026:
        switch(r10) {
            case 1: goto L_0x007f;
            case 2: goto L_0x007c;
            case 3: goto L_0x0079;
            case 4: goto L_0x0076;
            case 5: goto L_0x0072;
            case 6: goto L_0x006e;
            case 7: goto L_0x006a;
            case 8: goto L_0x0066;
            case 9: goto L_0x0062;
            case 10: goto L_0x005c;
            case 11: goto L_0x0056;
            case 12: goto L_0x0050;
            case 13: goto L_0x004a;
            case 14: goto L_0x0044;
            case 15: goto L_0x003e;
            case 16: goto L_0x0038;
            case 17: goto L_0x0032;
            case 18: goto L_0x002c;
            default: goto L_0x0029;
        };	 Catch:{ IOException -> 0x00e8 }
    L_0x0029:
        r1 = 1;
        goto L_0x0081;
    L_0x002c:
        r1 = 1000000000000000000; // 0xde0b6b3a7640000 float:-3.1641356E-15 double:7.832953389245686E-242;
        goto L_0x0081;
    L_0x0032:
        r1 = 100000000000000000; // 0x16345785d8a0000 float:1.2429935E18 double:5.620395787888205E-302;
        goto L_0x0081;
    L_0x0038:
        r1 = 10000000000000000; // 0x2386f26fc10000 float:1.1946121E29 double:5.431165199810528E-308;
        goto L_0x0081;
    L_0x003e:
        r1 = 1000000000000000; // 0x38d7ea4c68000 float:-8.608565E-17 double:4.940656458412465E-309;
        goto L_0x0081;
    L_0x0044:
        r1 = 100000000000000; // 0x5af3107a4000 float:4.935311E-29 double:4.94065645841247E-310;
        goto L_0x0081;
    L_0x004a:
        r1 = 10000000000000; // 0x9184e72a000 float:1.01764301E9 double:4.9406564584125E-311;
        goto L_0x0081;
    L_0x0050:
        r1 = 1000000000000; // 0xe8d4a51000 float:-5.6715043E12 double:4.94065645841E-312;
        goto L_0x0081;
    L_0x0056:
        r1 = 100000000000; // 0x174876e800 float:252832.0 double:4.9406564584E-313;
        goto L_0x0081;
    L_0x005c:
        r1 = 10000000000; // 0x2540be400 float:2.40330264E12 double:4.9406564584E-314;
        goto L_0x0081;
    L_0x0062:
        r1 = 1000000000; // 0x3b9aca00 float:0.0047237873 double:4.94065646E-315;
        goto L_0x0081;
    L_0x0066:
        r1 = 100000000; // 0x5f5e100 float:2.3122341E-35 double:4.94065646E-316;
        goto L_0x0081;
    L_0x006a:
        r1 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
        goto L_0x0081;
    L_0x006e:
        r1 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        goto L_0x0081;
    L_0x0072:
        r1 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        goto L_0x0081;
    L_0x0076:
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        goto L_0x0081;
    L_0x0079:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        goto L_0x0081;
    L_0x007c:
        r1 = 100;
        goto L_0x0081;
    L_0x007f:
        r1 = 10;
    L_0x0081:
        r3 = r12 * r1;
        r3 = r3 / r1;
        r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x00e1;
    L_0x0088:
        r3 = 2;
        r3 = new long[r3];	 Catch:{ IOException -> 0x00e8 }
        r8 = r8 * r1;
        r8 = r8 / r12;
        r12 = 0;
        r3[r12] = r8;	 Catch:{ IOException -> 0x00e8 }
        r8 = (long) r10;	 Catch:{ IOException -> 0x00e8 }
        r10 = 1;
        r3[r10] = r8;	 Catch:{ IOException -> 0x00e8 }
        r1 = r3[r12];	 Catch:{ IOException -> 0x00e8 }
        r9 = (int) r8;	 Catch:{ IOException -> 0x00e8 }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = r3 & r1;
        r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
        if (r8 != 0) goto L_0x00a6;
    L_0x00a0:
        r8 = (int) r1;	 Catch:{ IOException -> 0x00e8 }
        r8 = java.lang.Integer.toString(r8);	 Catch:{ IOException -> 0x00e8 }
        goto L_0x00aa;
    L_0x00a6:
        r8 = java.lang.Long.toString(r1);	 Catch:{ IOException -> 0x00e8 }
    L_0x00aa:
        r13 = r8.length();	 Catch:{ IOException -> 0x00e8 }
    L_0x00ae:
        if (r13 >= r9) goto L_0x00b8;
    L_0x00b0:
        r7.append(r0);	 Catch:{ IOException -> 0x00e8 }
        r11 = r11 + -1;
        r9 = r9 + -1;
        goto L_0x00ae;
    L_0x00b8:
        if (r11 >= r9) goto L_0x00dd;
    L_0x00ba:
        if (r11 >= r9) goto L_0x00cb;
    L_0x00bc:
        if (r13 > r10) goto L_0x00bf;
    L_0x00be:
        goto L_0x00cb;
    L_0x00bf:
        r1 = r13 + -1;
        r2 = r8.charAt(r1);	 Catch:{ IOException -> 0x00e8 }
        if (r2 != r0) goto L_0x00cb;
    L_0x00c7:
        r9 = r9 + -1;
        r13 = r1;
        goto L_0x00ba;
    L_0x00cb:
        r9 = r8.length();	 Catch:{ IOException -> 0x00e8 }
        if (r13 >= r9) goto L_0x00dd;
    L_0x00d1:
        if (r12 >= r13) goto L_0x00e0;
    L_0x00d3:
        r9 = r8.charAt(r12);	 Catch:{ IOException -> 0x00e8 }
        r7.append(r9);	 Catch:{ IOException -> 0x00e8 }
        r12 = r12 + 1;
        goto L_0x00d1;
    L_0x00dd:
        r7.append(r8);	 Catch:{ IOException -> 0x00e8 }
    L_0x00e0:
        return;
    L_0x00e1:
        r10 = r10 + -1;
        goto L_0x0026;
    L_0x00e5:
        defpackage.bcse.a(r7, r11);	 Catch:{ IOException -> 0x00e8 }
    L_0x00e8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcsi.a(java.lang.StringBuffer, long, bcpl, int, bcpt, java.util.Locale):void");
    }

    public final int b() {
        return this.c;
    }

    public final int a(bcsu bcsu, String str, int i) {
        bcpn a = this.a.a(bcsu.a);
        int min = Math.min(this.c, str.length() - i);
        long d = a.d().d() * 10;
        int i2 = 0;
        long j = 0;
        while (i2 < min) {
            char charAt = str.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            d /= 10;
            j += ((long) (charAt - 48)) * d;
        }
        j /= 10;
        if (i2 == 0) {
            return i ^ -1;
        }
        if (j > 2147483647L) {
            return i ^ -1;
        }
        bcsu.a(new bcsx(new bcru(bcpm.w, bcrs.a, a.d()), (int) j));
        return i + i2;
    }
}
