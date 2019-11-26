package defpackage;

import java.io.IOException;

/* renamed from: amgr */
public final class amgr extends amgh {
    private final atlx a;
    private final amez c;
    private final alys d;
    private final ambw e;

    public amgr(atlx atlx, amez amez, alys alys, ambw ambw) {
        super(3, ambw);
        this.a = atlx;
        this.c = amez;
        this.d = alys;
        this.e = ambw;
    }

    public final String a() {
        return "FileAnalysisTask";
    }

    public final amcj b() {
        return null;
    }

    public final boolean d() {
        return false;
    }

    public final amec a(amea amea) {
        amec amec = amea.o;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amgu.a;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A:{Catch:{ IOException -> 0x0234 }} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db A:{Catch:{ IOException -> 0x0234 }} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04ef  */
    public final defpackage.anjv a(java.lang.String r26, defpackage.amea r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r27;
        r2 = r0.a;
        r2 = r2.B;
        r3 = 1;
        if (r2 == 0) goto L_0x0562;
    L_0x000b:
        r2 = r1.m;
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        r2 = defpackage.amec.g;
    L_0x0011:
        r2 = r2.b;
        r2 = defpackage.amee.a(r2);
        r4 = 0;
        r5 = 2;
        if (r2 == 0) goto L_0x002b;
    L_0x001b:
        if (r2 == r5) goto L_0x001e;
    L_0x001d:
        goto L_0x002b;
    L_0x001e:
        r2 = r0.c;
        r6 = r1.l;
        r6 = android.net.Uri.parse(r6);
        r2 = r2.a(r6, r4);
        goto L_0x0037;
    L_0x002b:
        r2 = r0.c;
        r6 = r1.d;
        r6 = android.net.Uri.parse(r6);
        r2 = r2.a(r6, r4);
    L_0x0037:
        r4 = r2.a();
        if (r4 == 0) goto L_0x053b;
    L_0x003d:
        r4 = defpackage.amjq.a(r27);
        r2 = r2.a(r4);
        r4 = r2.a();
        if (r4 == 0) goto L_0x0515;
    L_0x004b:
        r6 = r2.b();
        r4 = new ulv;
        r4.<init>();
        r2 = defpackage.amqw.a(r2);
        r2 = (java.io.InputStream) r2;
        r4.a = r2;
        r8 = 0;
        r2 = 0;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0065;
    L_0x0063:
        r10 = 1;
        goto L_0x0066;
    L_0x0065:
        r10 = 0;
    L_0x0066:
        defpackage.amqw.a(r10);
        r4.b = r6;
        r4.c = r3;
        r4.d = r3;
        r4.e = r3;
        r10 = r4.a;
        if (r10 == 0) goto L_0x0077;
    L_0x0075:
        r10 = 1;
        goto L_0x0078;
    L_0x0077:
        r10 = 0;
    L_0x0078:
        defpackage.amqw.b(r10);
        r10 = r4.b;
        r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r12 <= 0) goto L_0x0083;
    L_0x0081:
        r8 = 1;
        goto L_0x0084;
    L_0x0083:
        r8 = 0;
    L_0x0084:
        defpackage.amqw.b(r8);
        r8 = new ulw;
        r10 = r4.a;
        r11 = r4.b;
        r13 = r4.c;
        r14 = r4.d;
        r15 = r4.e;
        r9 = r8;
        r9.<init>(r10, r11, r13, r14, r15);
        r4 = new ulh;
        r9 = r8.a;
        r10 = r8.b;
        r4.<init>(r9, r10);
        r9 = new uly;
        r9.<init>();
        r10 = defpackage.ulo.a(r4);	 Catch:{ IOException -> 0x0234 }
        r11 = r10.b;	 Catch:{ IOException -> 0x0234 }
        r12 = "ftyp";
        r11 = r11.equals(r12);	 Catch:{ IOException -> 0x0234 }
        if (r11 == 0) goto L_0x0234;
    L_0x00b3:
        r11 = new ulm;	 Catch:{ IOException -> 0x0234 }
        r11.<init>(r10);	 Catch:{ IOException -> 0x0234 }
        r9.a = r11;	 Catch:{ IOException -> 0x0234 }
        r10 = r9.a;	 Catch:{ IOException -> 0x0234 }
        r10.a(r4);	 Catch:{ IOException -> 0x0234 }
        r10 = r9.a;	 Catch:{ IOException -> 0x0234 }
        r11 = defpackage.uls.a;	 Catch:{ IOException -> 0x0234 }
        r12 = r11.length;	 Catch:{ IOException -> 0x0234 }
        r13 = 0;
    L_0x00c5:
        if (r13 >= r12) goto L_0x0232;
    L_0x00c7:
        r14 = r11[r13];	 Catch:{ IOException -> 0x0234 }
        r5 = r10.a;	 Catch:{ IOException -> 0x0234 }
        if (r5 != 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00d7;
    L_0x00ce:
        r5 = r5.equals(r14);	 Catch:{ IOException -> 0x0234 }
        if (r5 == 0) goto L_0x00d7;
    L_0x00d4:
        r5 = 0;
        r10 = 0;
        goto L_0x00f6;
    L_0x00d7:
        r5 = r10.b;	 Catch:{ IOException -> 0x0234 }
        if (r5 != 0) goto L_0x00dd;
    L_0x00db:
        goto L_0x022c;
    L_0x00dd:
        r5 = r5.iterator();	 Catch:{ IOException -> 0x0234 }
    L_0x00e1:
        r16 = r5.hasNext();	 Catch:{ IOException -> 0x0234 }
        if (r16 == 0) goto L_0x022c;
    L_0x00e7:
        r16 = r5.next();	 Catch:{ IOException -> 0x0234 }
        r15 = r16;
        r15 = (java.lang.String) r15;	 Catch:{ IOException -> 0x0234 }
        r15 = r15.equals(r14);	 Catch:{ IOException -> 0x0234 }
        if (r15 == 0) goto L_0x00e1;
    L_0x00f5:
        goto L_0x00d4;
    L_0x00f6:
        r11 = r4.g();	 Catch:{ ult -> 0x0229 }
        r13 = 8;
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 < 0) goto L_0x0221;
    L_0x0100:
        r11 = defpackage.ulo.a(r4);	 Catch:{ ult -> 0x0229 }
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r13 = "moov";
        r12 = r12.equals(r13);	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x01bd;
    L_0x010e:
        if (r5 == 0) goto L_0x0113;
    L_0x0110:
        r5 = 5;
        goto L_0x0222;
    L_0x0113:
        r12 = r11.a;	 Catch:{ ult -> 0x0229 }
        r14 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r5 > 0) goto L_0x01b7;
    L_0x011c:
        r5 = r8.e;	 Catch:{ ult -> 0x0229 }
        if (r5 != 0) goto L_0x012e;
    L_0x0120:
        r5 = defpackage.ull.a(r11);	 Catch:{ ult -> 0x0229 }
        r9.b = r5;	 Catch:{ ult -> 0x0229 }
        r5 = r9.b;	 Catch:{ ult -> 0x0229 }
        r5.a(r4);	 Catch:{ ult -> 0x0229 }
    L_0x012b:
        r5 = 1;
        goto L_0x021e;
    L_0x012e:
        r5 = r11.f;	 Catch:{ ult -> 0x0229 }
        if (r5 != 0) goto L_0x0135;
    L_0x0132:
        r5 = 8;
        goto L_0x0137;
    L_0x0135:
        r5 = 16;
    L_0x0137:
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r13 = "uuid";
        r12 = r12.equals(r13);	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x0143;
    L_0x0141:
        r5 = r5 + 16;
    L_0x0143:
        r5 = java.nio.ByteBuffer.allocate(r5);	 Catch:{ ult -> 0x0229 }
        r12 = r11.f;	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x014f;
    L_0x014b:
        r5.putInt(r3);	 Catch:{ ult -> 0x0229 }
        goto L_0x0155;
    L_0x014f:
        r12 = r11.a;	 Catch:{ ult -> 0x0229 }
        r13 = (int) r12;	 Catch:{ ult -> 0x0229 }
        r5.putInt(r13);	 Catch:{ ult -> 0x0229 }
    L_0x0155:
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r12 = r12.getBytes();	 Catch:{ ult -> 0x0229 }
        r5.put(r12);	 Catch:{ ult -> 0x0229 }
        r12 = r11.f;	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x0167;
    L_0x0162:
        r12 = r11.a;	 Catch:{ ult -> 0x0229 }
        r5.putLong(r12);	 Catch:{ ult -> 0x0229 }
    L_0x0167:
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r13 = "uuid";
        r12 = r12.equals(r13);	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x0176;
    L_0x0171:
        r12 = r11.c;	 Catch:{ ult -> 0x0229 }
        r5.put(r12);	 Catch:{ ult -> 0x0229 }
    L_0x0176:
        r5 = r5.array();	 Catch:{ ult -> 0x0229 }
        r12 = r11.a;	 Catch:{ ult -> 0x0229 }
        r14 = r11.e;	 Catch:{ ult -> 0x0229 }
        r12 = r12 - r14;
        r13 = (int) r12;	 Catch:{ ult -> 0x0229 }
        r12 = r4.a(r13);	 Catch:{ ult -> 0x0229 }
        r13 = r5.length;	 Catch:{ ult -> 0x0229 }
        r14 = r12.length;	 Catch:{ ult -> 0x0229 }
        r15 = r13 + r14;
        r15 = new byte[r15];	 Catch:{ ult -> 0x0229 }
        r9.c = r15;	 Catch:{ ult -> 0x0229 }
        r15 = r9.c;	 Catch:{ ult -> 0x0229 }
        java.lang.System.arraycopy(r5, r2, r15, r2, r13);	 Catch:{ ult -> 0x0229 }
        r5 = r9.c;	 Catch:{ ult -> 0x0229 }
        java.lang.System.arraycopy(r12, r2, r5, r13, r14);	 Catch:{ ult -> 0x0229 }
        r5 = new java.io.ByteArrayInputStream;	 Catch:{ ult -> 0x0229 }
        r12 = r9.c;	 Catch:{ ult -> 0x0229 }
        r5.<init>(r12);	 Catch:{ ult -> 0x0229 }
        r12 = new ulh;	 Catch:{ ult -> 0x0229 }
        r14 = r9.c;	 Catch:{ ult -> 0x0229 }
        r14 = r14.length;	 Catch:{ ult -> 0x0229 }
        r14 = (long) r14;	 Catch:{ ult -> 0x0229 }
        r12.<init>(r5, r14);	 Catch:{ ult -> 0x0229 }
        r13 = (long) r13;	 Catch:{ ult -> 0x0229 }
        r12.b(r13);	 Catch:{ ult -> 0x0229 }
        r5 = defpackage.ull.a(r11);	 Catch:{ ult -> 0x0229 }
        r9.b = r5;	 Catch:{ ult -> 0x0229 }
        r5 = r9.b;	 Catch:{ ult -> 0x0229 }
        r5.a(r12);	 Catch:{ ult -> 0x0229 }
        goto L_0x012b;
    L_0x01b7:
        r4 = 10;
        r5 = 10;
        goto L_0x0222;
    L_0x01bd:
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r13 = "mdat";
        r12 = r12.equals(r13);	 Catch:{ ult -> 0x0229 }
        if (r12 != 0) goto L_0x0205;
    L_0x01c7:
        r12 = r8.d;	 Catch:{ ult -> 0x0229 }
        if (r12 == 0) goto L_0x01e2;
    L_0x01cb:
        r12 = r11.b;	 Catch:{ ult -> 0x0229 }
        r13 = defpackage.uls.b;	 Catch:{ ult -> 0x0229 }
        r14 = r13.length;	 Catch:{ ult -> 0x0229 }
        r15 = 0;
    L_0x01d1:
        if (r15 >= r14) goto L_0x01df;
    L_0x01d3:
        r2 = r13[r15];	 Catch:{ ult -> 0x0229 }
        r2 = r2.equals(r12);	 Catch:{ ult -> 0x0229 }
        if (r2 != 0) goto L_0x01e2;
    L_0x01db:
        r15 = r15 + 1;
        r2 = 0;
        goto L_0x01d1;
    L_0x01df:
        r5 = 8;
        goto L_0x0222;
    L_0x01e2:
        r2 = r11.b;	 Catch:{ ult -> 0x0229 }
        r12 = defpackage.uls.c;	 Catch:{ ult -> 0x0229 }
        r13 = r12.length;	 Catch:{ ult -> 0x0229 }
        r14 = 0;
    L_0x01e8:
        if (r14 >= r13) goto L_0x01f8;
    L_0x01ea:
        r15 = r12[r14];	 Catch:{ ult -> 0x0229 }
        r15 = r15.equals(r2);	 Catch:{ ult -> 0x0229 }
        if (r15 != 0) goto L_0x01f5;
    L_0x01f2:
        r14 = r14 + 1;
        goto L_0x01e8;
    L_0x01f5:
        r2 = 7;
        r5 = 7;
        goto L_0x0222;
    L_0x01f8:
        r2 = defpackage.ull.a(r11);	 Catch:{ ult -> 0x0229 }
        r2.a(r4);	 Catch:{ ult -> 0x0229 }
        r11 = r9.e;	 Catch:{ ult -> 0x0229 }
        r11.add(r2);	 Catch:{ ult -> 0x0229 }
        goto L_0x021e;
    L_0x0205:
        if (r10 == 0) goto L_0x0209;
    L_0x0207:
        r5 = 6;
        goto L_0x0222;
    L_0x0209:
        r2 = r8.c;	 Catch:{ ult -> 0x0229 }
        if (r2 != 0) goto L_0x020e;
    L_0x020d:
        goto L_0x0212;
    L_0x020e:
        if (r5 == 0) goto L_0x0212;
    L_0x0210:
        r5 = 4;
        goto L_0x0222;
    L_0x0212:
        r2 = defpackage.ull.a(r11);	 Catch:{ ult -> 0x0229 }
        r9.d = r2;	 Catch:{ ult -> 0x0229 }
        r2 = r9.d;	 Catch:{ ult -> 0x0229 }
        r2.a(r4);	 Catch:{ ult -> 0x0229 }
        r10 = 1;
    L_0x021e:
        r2 = 0;
        goto L_0x00f6;
    L_0x0221:
        r5 = 1;
    L_0x0222:
        if (r5 != r3) goto L_0x0235;
    L_0x0224:
        r8.f = r9;
        r5 = 11;
        goto L_0x0235;
    L_0x0229:
        r5 = 9;
        goto L_0x0235;
    L_0x022c:
        r13 = r13 + 1;
        r2 = 0;
        r5 = 2;
        goto L_0x00c5;
    L_0x0232:
        r5 = 2;
        goto L_0x0235;
    L_0x0234:
        r5 = 3;
    L_0x0235:
        switch(r5) {
            case 2: goto L_0x0271;
            case 3: goto L_0x0265;
            case 4: goto L_0x025a;
            case 5: goto L_0x024e;
            case 6: goto L_0x024e;
            case 7: goto L_0x0271;
            case 8: goto L_0x0271;
            case 9: goto L_0x024e;
            case 10: goto L_0x024e;
            default: goto L_0x0238;
        };
    L_0x0238:
        r2 = r8.f;
        r4 = r2.b;
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 > 0) goto L_0x0406;
    L_0x0243:
        r5 = "trak";
        r4 = r4.a(r5);
        r4 = r4.iterator();
        goto L_0x027f;
    L_0x024e:
        r2 = defpackage.ulf.d();
        r4 = 3;
        r2.a = r4;
        r2 = r2.a();
        goto L_0x027c;
    L_0x025a:
        r2 = defpackage.ulf.d();
        r2.a = r3;
        r2 = r2.a();
        goto L_0x027c;
    L_0x0265:
        r2 = defpackage.ulf.d();
        r4 = 0;
        r2.a = r4;
        r2 = r2.a();
        goto L_0x027c;
    L_0x0271:
        r2 = defpackage.ulf.d();
        r4 = 2;
        r2.a = r4;
        r2 = r2.a();
    L_0x027c:
        r3 = 2;
        goto L_0x0411;
    L_0x027f:
        r6 = r4.hasNext();
        r7 = "stbl";
        r8 = "minf";
        r9 = "mdia";
        if (r6 == 0) goto L_0x02db;
    L_0x028b:
        r6 = r4.next();
        r6 = (defpackage.ulk) r6;
        r6 = r6.a(r9);
        r6 = r6.iterator();
    L_0x0299:
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x027f;
    L_0x029f:
        r9 = r6.next();
        r9 = (defpackage.ulk) r9;
        r9 = r9.a(r8);
        r9 = r9.iterator();
    L_0x02ad:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x0299;
    L_0x02b3:
        r10 = r9.next();
        r10 = (defpackage.ulk) r10;
        r10 = r10.a(r7);
        r10 = r10.iterator();
    L_0x02c1:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x02ad;
    L_0x02c7:
        r11 = r10.next();
        r11 = (defpackage.ulk) r11;
        r12 = "co64";
        r11 = r11.a(r12);
        r11 = r11.isEmpty();
        if (r11 != 0) goto L_0x02c1;
    L_0x02d9:
        goto L_0x0406;
    L_0x02db:
        r4 = defpackage.ulf.d();
        r6 = 4;
        r4.a = r6;
        r6 = r2.b;
        r10 = r6.c();
        r4.b = r10;
        r6 = r2.d;
        r10 = r6.c();
        r4.c = r10;
        r6 = r2.c;
        r10 = r6.length;
        r6 = java.util.Arrays.copyOf(r6, r10);
        r2 = r2.b;
        r2 = r2.a(r5);
        r2 = r2.iterator();
    L_0x0303:
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x03fd;
    L_0x0309:
        r5 = r2.next();
        r5 = (defpackage.ulk) r5;
        r5 = r5.a(r9);
        r5 = r5.iterator();
    L_0x0317:
        r10 = r5.hasNext();
        if (r10 == 0) goto L_0x0303;
    L_0x031d:
        r10 = r5.next();
        r10 = (defpackage.ulk) r10;
        r10 = r10.a(r8);
        r10 = r10.iterator();
    L_0x032b:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x0317;
    L_0x0331:
        r11 = r10.next();
        r11 = (defpackage.ulk) r11;
        r11 = r11.a(r7);
        r11 = r11.iterator();
    L_0x033f:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x032b;
    L_0x0345:
        r12 = r11.next();
        r12 = (defpackage.ulk) r12;
        r13 = "stco";
        r13 = r12.a(r13);
        r13 = r13.iterator();
    L_0x0355:
        r14 = r13.hasNext();
        if (r14 == 0) goto L_0x03a6;
    L_0x035b:
        r14 = r13.next();
        r14 = (defpackage.ulk) r14;
        r14 = (defpackage.ulq) r14;
        r17 = r4;
        r3 = r14.b;
        r4 = (int) r3;
        r3 = r14.a;
        r14 = r6.length;
        r18 = r7;
        r19 = r8;
        r7 = (long) r14;
        r14 = r3.length;
        r20 = r14 << 2;
        r15 = java.nio.ByteBuffer.allocate(r20);
        r20 = r2;
        r2 = 0;
    L_0x037a:
        if (r2 >= r14) goto L_0x038f;
    L_0x037c:
        r21 = r3[r2];
        r23 = r9;
        r24 = r10;
        r9 = r21 + r7;
        r10 = (int) r9;
        r15.putInt(r10);
        r2 = r2 + 1;
        r9 = r23;
        r10 = r24;
        goto L_0x037a;
    L_0x038f:
        r23 = r9;
        r24 = r10;
        r2 = r15.array();
        r3 = r2.length;
        r7 = 0;
        java.lang.System.arraycopy(r2, r7, r6, r4, r3);
        r4 = r17;
        r7 = r18;
        r8 = r19;
        r2 = r20;
        r3 = 1;
        goto L_0x0355;
    L_0x03a6:
        r20 = r2;
        r17 = r4;
        r18 = r7;
        r19 = r8;
        r23 = r9;
        r24 = r10;
        r2 = "co64";
        r2 = r12.a(r2);
        r2 = r2.iterator();
    L_0x03bc:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x03ee;
    L_0x03c2:
        r3 = r2.next();
        r3 = (defpackage.ulk) r3;
        r3 = (defpackage.ulj) r3;
        r7 = r3.a;
        r4 = (int) r7;
        r3 = r3.b;
        r7 = r6.length;
        r7 = (long) r7;
        r9 = r3.length;
        r10 = r9 << 3;
        r10 = java.nio.ByteBuffer.allocate(r10);
        r12 = 0;
    L_0x03d9:
        if (r12 >= r9) goto L_0x03e4;
    L_0x03db:
        r13 = r3[r12];
        r13 = r13 + r7;
        r10.putLong(r13);
        r12 = r12 + 1;
        goto L_0x03d9;
    L_0x03e4:
        r3 = r10.array();
        r7 = r3.length;
        r8 = 0;
        java.lang.System.arraycopy(r3, r8, r6, r4, r7);
        goto L_0x03bc;
    L_0x03ee:
        r4 = r17;
        r7 = r18;
        r8 = r19;
        r2 = r20;
        r9 = r23;
        r10 = r24;
        r3 = 1;
        goto L_0x033f;
    L_0x03fd:
        r2 = r4;
        r2.d = r6;
        r2 = r2.a();
        goto L_0x027c;
    L_0x0406:
        r2 = defpackage.ulf.d();
        r3 = 2;
        r2.a = r3;
        r2 = r2.a();
    L_0x0411:
        r4 = r2.a;
        if (r4 == 0) goto L_0x0433;
    L_0x0415:
        r5 = 1;
        if (r4 == r5) goto L_0x0430;
    L_0x0418:
        if (r4 == r3) goto L_0x042d;
    L_0x041a:
        r3 = 3;
        if (r4 == r3) goto L_0x042a;
    L_0x041d:
        r5 = 4;
        if (r4 != r5) goto L_0x0422;
    L_0x0420:
        r3 = 6;
        goto L_0x0435;
    L_0x0422:
        r1 = new java.lang.AssertionError;
        r2 = "Unhandled enum.";
        r1.<init>(r2);
        throw r1;
    L_0x042a:
        r5 = 4;
        r3 = 5;
        goto L_0x0435;
    L_0x042d:
        r5 = 4;
        r3 = 4;
        goto L_0x0435;
    L_0x0430:
        r3 = 3;
        r5 = 4;
        goto L_0x0435;
    L_0x0433:
        r5 = 4;
        r3 = 2;
    L_0x0435:
        if (r4 != r5) goto L_0x04ef;
    L_0x0437:
        r1 = r1.P;
        r4 = new java.io.File;
        r4.<init>(r1);
        r1 = android.net.Uri.fromFile(r4);
        r1 = r1.buildUpon();
        r4 = "newMoovBox.dat";
        r1 = r1.appendPath(r4);
        r1 = r1.build();
        r1 = r1.getPath();
        r4 = new java.io.File;
        r4.<init>(r1);
        r5 = r2.c();
        defpackage.anbk.a(r5, r4);
        r4 = defpackage.amdl.h;
        r4 = r4.createBuilder();
        r4 = (defpackage.amdq) r4;
        r4.a(r3);
        r4.copyOnWrite();
        r3 = r4.instance;
        r3 = (defpackage.amdl) r3;
        if (r1 == 0) goto L_0x04e9;
    L_0x0474:
        r5 = r3.a;
        r6 = 2;
        r5 = r5 | r6;
        r3.a = r5;
        r3.c = r1;
        r5 = r2.b();
        r4.copyOnWrite();
        r1 = r4.instance;
        r1 = (defpackage.amdl) r1;
        r3 = r1.a;
        r7 = 4;
        r3 = r3 | r7;
        r1.a = r3;
        r1.d = r5;
        r1 = r2.c();
        r1 = r1.length;
        r4.copyOnWrite();
        r3 = r4.instance;
        r3 = (defpackage.amdl) r3;
        r5 = r3.a;
        r6 = 8;
        r5 = r5 | r6;
        r3.a = r5;
        r5 = (long) r1;
        r3.e = r5;
        r5 = r2.a();
        r4.copyOnWrite();
        r1 = r4.instance;
        r1 = (defpackage.amdl) r1;
        r3 = r1.a;
        r7 = 16;
        r3 = r3 | r7;
        r1.a = r3;
        r1.f = r5;
        r1 = r2.c();
        r1 = r1.length;
        r4.copyOnWrite();
        r2 = r4.instance;
        r2 = (defpackage.amdl) r2;
        r3 = r2.a;
        r3 = r3 | 32;
        r2.a = r3;
        r5 = (long) r1;
        r2.g = r5;
        r1 = r4.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.amdl) r1;
        r2 = defpackage.amjq.a();
        r3 = new amgx;
        r3.<init>(r1);
        r1 = 1;
        r1 = r0.a(r2, r1, r3);
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x04e9:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x04ef:
        r1 = defpackage.amdl.h;
        r1 = r1.createBuilder();
        r1 = (defpackage.amdq) r1;
        r1.a(r3);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.amdl) r1;
        r2 = defpackage.amjq.a();
        r3 = new amgy;
        r3.<init>(r1);
        r1 = 1;
        r1 = r0.a(r2, r1, r3);
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x0515:
        r1 = 1;
        r2 = defpackage.amdl.h;
        r2 = r2.createBuilder();
        r2 = (defpackage.amdq) r2;
        r2.a(r1);
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdl) r2;
        r3 = defpackage.amjq.a();
        r4 = new amgv;
        r4.<init>(r2);
        r1 = r0.a(r3, r1, r4);
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x053b:
        r1 = defpackage.amdl.h;
        r1 = r1.createBuilder();
        r1 = (defpackage.amdq) r1;
        r2 = 2;
        r1.a(r2);
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.amdl) r1;
        r2 = defpackage.amjq.a();
        r3 = new amgw;
        r3.<init>(r1);
        r1 = 1;
        r1 = r0.a(r2, r1, r3);
        r1 = defpackage.anjf.a(r1);
        return r1;
    L_0x0562:
        r1 = 1;
        r2 = defpackage.amdl.h;
        r2 = r2.createBuilder();
        r2 = (defpackage.amdq) r2;
        r2.a(r1);
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.amdl) r2;
        r3 = defpackage.amjq.a();
        r4 = new amgt;
        r4.<init>(r2);
        r1 = r0.a(r3, r1, r4);
        r1 = defpackage.anjf.a(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgr.a(java.lang.String, amea):anjv");
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        amdq amdq = (amdq) amdl.h.createBuilder();
        amdq.a(1);
        amdl amdl = (amdl) ((anxl) amdq.build());
        String str = "FileAnalysisTask";
        alys alys;
        int a;
        if (th instanceof IOException) {
            alys = this.d;
            str = str.concat(" Source Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(3), z, new amha(amdl));
        }
        alys = this.d;
        str = str.concat(" Throwable");
        a = amek.a(amea.h);
        if (a == 0) {
            a = 1;
        }
        alys.a(str, th, a);
        return a(amgh.a(th), z, new amgz(amdl));
    }

    public final void a(long j, amea amea) {
        if (amea != null) {
            ambw ambw = this.e;
            String str = amea.g;
            amdl amdl = amea.n;
            if (amdl == null) {
                amdl = amdl.h;
            }
            int a = amdo.a(amdl.b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            amqw.a(j >= 0);
            xvd.a(str);
            aytc aytc = (aytc) aysz.e.createBuilder();
            aysx a2 = ambw.a(str);
            aytc.copyOnWrite();
            aysz aysz = (aysz) aytc.instance;
            if (a2 != null) {
                aysz.b = a2;
                aysz.a |= 1;
                aytc.copyOnWrite();
                aysz aysz2 = (aysz) aytc.instance;
                aysz2.a |= 4;
                aysz2.d = j;
                a--;
                if (a == 1) {
                    i = 3;
                } else if (a == 2) {
                    i = 4;
                } else if (a == 3) {
                    i = 5;
                } else if (a == 4) {
                    i = 6;
                } else if (a == 5) {
                    i = 8;
                }
                aytc.copyOnWrite();
                aysz aysz3 = (aysz) aytc.instance;
                aysz3.a |= 2;
                aysz3.c = i - 1;
                aysz3 = (aysz) ((anxl) aytc.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (aysz3 != null) {
                    asmw.c = aysz3;
                    asmw.b = 38;
                    ambw.a.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 16) == 0) ? false : true;
    }
}
