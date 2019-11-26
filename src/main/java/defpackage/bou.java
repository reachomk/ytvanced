package defpackage;

/* renamed from: bou */
public final class bou {
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0360  */
    /* JADX WARNING: Missing block: B:87:0x01c4, code skipped:
            r38 = r12;
            r14 = r36;
     */
    /* JADX WARNING: Missing block: B:268:0x052d, code skipped:
            r14 = r36;
     */
    /* JADX WARNING: Missing block: B:276:0x0589, code skipped:
            r14 = r36;
     */
    /* JADX WARNING: Missing block: B:278:0x0598, code skipped:
            r14 = r36;
     */
    /* JADX WARNING: Missing block: B:279:0x059b, code skipped:
            r14 = r36;
            r13 = r37;
     */
    /* JADX WARNING: Missing block: B:280:0x059f, code skipped:
            r5 = r39;
     */
    /* JADX WARNING: Missing block: B:281:0x05a1, code skipped:
            r4 = r40;
     */
    /* JADX WARNING: Missing block: B:282:0x05a3, code skipped:
            r12 = r38;
     */
    public static defpackage.bnv a(android.util.JsonReader r41, defpackage.bjj r42) {
        /*
        r0 = r41;
        r7 = r42;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r41.beginObject();
        r11 = 0;
        r12 = java.lang.Float.valueOf(r11);
        r4 = "UNSET";
        r5 = 0;
        r13 = -1;
        r20 = r5;
        r24 = r13;
        r5 = 0;
        r14 = 0;
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r22 = 0;
        r23 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r29 = 0;
        r30 = 1;
        r31 = 0;
        r32 = 0;
        r33 = 0;
        r13 = r4;
        r4 = 0;
    L_0x0042:
        r6 = r41.hasNext();
        if (r6 == 0) goto L_0x05a8;
    L_0x0048:
        r6 = r41.nextName();
        r34 = r6.hashCode();
        r9 = "sw";
        r11 = "sc";
        r2 = "nm";
        r1 = "t";
        r35 = -1;
        switch(r34) {
            case -995424086: goto L_0x014f;
            case -903568142: goto L_0x0144;
            case 104: goto L_0x0139;
            case 116: goto L_0x0130;
            case 119: goto L_0x0125;
            case 3177: goto L_0x011a;
            case 3233: goto L_0x010f;
            case 3324: goto L_0x0104;
            case 3367: goto L_0x00f9;
            case 3432: goto L_0x00ee;
            case 3519: goto L_0x00e5;
            case 3553: goto L_0x00d9;
            case 3664: goto L_0x00d0;
            case 3669: goto L_0x00c5;
            case 3679: goto L_0x00b9;
            case 3681: goto L_0x00ad;
            case 3684: goto L_0x00a4;
            case 3705: goto L_0x0098;
            case 3712: goto L_0x008c;
            case 3717: goto L_0x0081;
            case 104415: goto L_0x0076;
            case 108390670: goto L_0x006b;
            case 1441620890: goto L_0x005f;
            default: goto L_0x005d;
        };
    L_0x005d:
        goto L_0x0159;
    L_0x005f:
        r3 = "masksProperties";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0067:
        r3 = 10;
        goto L_0x015a;
    L_0x006b:
        r3 = "refId";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0073:
        r3 = 2;
        goto L_0x015a;
    L_0x0076:
        r3 = "ind";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x007e:
        r3 = 1;
        goto L_0x015a;
    L_0x0081:
        r3 = "ty";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0089:
        r3 = 3;
        goto L_0x015a;
    L_0x008c:
        r3 = "tt";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0094:
        r3 = 9;
        goto L_0x015a;
    L_0x0098:
        r3 = "tm";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00a0:
        r3 = 20;
        goto L_0x015a;
    L_0x00a4:
        r3 = r6.equals(r9);
        if (r3 == 0) goto L_0x0159;
    L_0x00aa:
        r3 = 5;
        goto L_0x015a;
    L_0x00ad:
        r3 = "st";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00b5:
        r3 = 15;
        goto L_0x015a;
    L_0x00b9:
        r3 = "sr";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00c1:
        r3 = 14;
        goto L_0x015a;
    L_0x00c5:
        r3 = "sh";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00cd:
        r3 = 6;
        goto L_0x015a;
    L_0x00d0:
        r3 = r6.equals(r11);
        if (r3 == 0) goto L_0x0159;
    L_0x00d6:
        r3 = 7;
        goto L_0x015a;
    L_0x00d9:
        r3 = "op";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00e1:
        r3 = 19;
        goto L_0x015a;
    L_0x00e5:
        r3 = r6.equals(r2);
        if (r3 == 0) goto L_0x0159;
    L_0x00eb:
        r3 = 0;
        goto L_0x015a;
    L_0x00ee:
        r3 = "ks";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x00f6:
        r3 = 8;
        goto L_0x015a;
    L_0x00f9:
        r3 = "ip";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0101:
        r3 = 18;
        goto L_0x015a;
    L_0x0104:
        r3 = "hd";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x010c:
        r3 = 22;
        goto L_0x015a;
    L_0x010f:
        r3 = "ef";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0117:
        r3 = 13;
        goto L_0x015a;
    L_0x011a:
        r3 = "cl";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0122:
        r3 = 21;
        goto L_0x015a;
    L_0x0125:
        r3 = "w";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x012d:
        r3 = 16;
        goto L_0x015a;
    L_0x0130:
        r3 = r6.equals(r1);
        if (r3 == 0) goto L_0x0159;
    L_0x0136:
        r3 = 12;
        goto L_0x015a;
    L_0x0139:
        r3 = "h";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0141:
        r3 = 17;
        goto L_0x015a;
    L_0x0144:
        r3 = "shapes";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x014c:
        r3 = 11;
        goto L_0x015a;
    L_0x014f:
        r3 = "parent";
        r3 = r6.equals(r3);
        if (r3 == 0) goto L_0x0159;
    L_0x0157:
        r3 = 4;
        goto L_0x015a;
    L_0x0159:
        r3 = -1;
    L_0x015a:
        r6 = "a";
        r36 = r14;
        r14 = 97;
        switch(r3) {
            case 0: goto L_0x058c;
            case 1: goto L_0x0578;
            case 2: goto L_0x0569;
            case 3: goto L_0x0543;
            case 4: goto L_0x0531;
            case 5: goto L_0x0515;
            case 6: goto L_0x04fc;
            case 7: goto L_0x04e8;
            case 8: goto L_0x04d8;
            case 9: goto L_0x04bd;
            case 10: goto L_0x03b4;
            case 11: goto L_0x0394;
            case 12: goto L_0x022f;
            case 13: goto L_0x01cc;
            case 14: goto L_0x01be;
            case 15: goto L_0x01b5;
            case 16: goto L_0x01a5;
            case 17: goto L_0x0195;
            case 18: goto L_0x018d;
            case 19: goto L_0x0185;
            case 20: goto L_0x017f;
            case 21: goto L_0x0177;
            case 22: goto L_0x0172;
            default: goto L_0x0163;
        };
    L_0x0163:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r41.skipValue();
        goto L_0x059b;
    L_0x0172:
        r33 = r41.nextBoolean();
        goto L_0x01c4;
    L_0x0177:
        r1 = r41.nextString();
        r14 = r1;
        r38 = r12;
        goto L_0x01c8;
    L_0x017f:
        r3 = 0;
        r23 = defpackage.boh.a(r0, r7, r3);
        goto L_0x01c4;
    L_0x0185:
        r3 = 0;
        r1 = r41.nextDouble();
        r1 = (float) r1;
        r5 = r1;
        goto L_0x01c4;
    L_0x018d:
        r3 = 0;
        r1 = r41.nextDouble();
        r1 = (float) r1;
        r4 = r1;
        goto L_0x01c4;
    L_0x0195:
        r3 = 0;
        r1 = r41.nextInt();
        r1 = (float) r1;
        r2 = defpackage.bpg.a();
        r1 = r1 * r2;
        r1 = (int) r1;
        r18 = r1;
        goto L_0x01c4;
    L_0x01a5:
        r3 = 0;
        r1 = r41.nextInt();
        r1 = (float) r1;
        r2 = defpackage.bpg.a();
        r1 = r1 * r2;
        r1 = (int) r1;
        r17 = r1;
        goto L_0x01c4;
    L_0x01b5:
        r3 = 0;
        r1 = r41.nextDouble();
        r1 = (float) r1;
        r16 = r1;
        goto L_0x01c4;
    L_0x01be:
        r3 = 0;
        r1 = r41.nextDouble();
        r15 = (float) r1;
    L_0x01c4:
        r38 = r12;
        r14 = r36;
    L_0x01c8:
        r1 = 1;
        r3 = 0;
        goto L_0x05a3;
    L_0x01cc:
        r3 = 0;
        r41.beginArray();
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x01d5:
        r6 = r41.hasNext();
        if (r6 == 0) goto L_0x020c;
    L_0x01db:
        r41.beginObject();
    L_0x01de:
        r6 = r41.hasNext();
        if (r6 == 0) goto L_0x0208;
    L_0x01e4:
        r6 = r41.nextName();
        r9 = r6.hashCode();
        r11 = 3519; // 0xdbf float:4.931E-42 double:1.7386E-320;
        if (r9 == r11) goto L_0x01f1;
    L_0x01f0:
        goto L_0x01f9;
    L_0x01f1:
        r6 = r6.equals(r2);
        if (r6 == 0) goto L_0x01f9;
    L_0x01f7:
        r6 = 0;
        goto L_0x01fa;
    L_0x01f9:
        r6 = -1;
    L_0x01fa:
        if (r6 == 0) goto L_0x0200;
    L_0x01fc:
        r41.skipValue();
        goto L_0x01de;
    L_0x0200:
        r6 = r41.nextString();
        r1.add(r6);
        goto L_0x01de;
    L_0x0208:
        r41.endObject();
        goto L_0x01d5;
    L_0x020c:
        r41.endArray();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ";
        r2.append(r6);
        r2.append(r1);
        r1 = r2.toString();
        r7.a(r1);
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        goto L_0x059b;
    L_0x022f:
        r3 = 0;
        r41.beginObject();
    L_0x0233:
        r2 = r41.hasNext();
        if (r2 == 0) goto L_0x0383;
    L_0x0239:
        r2 = r41.nextName();
        r3 = r2.hashCode();
        if (r3 == r14) goto L_0x0252;
    L_0x0243:
        r14 = 100;
        if (r3 == r14) goto L_0x0248;
    L_0x0247:
        goto L_0x025a;
    L_0x0248:
        r3 = "d";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x025a;
    L_0x0250:
        r2 = 0;
        goto L_0x025b;
    L_0x0252:
        r2 = r2.equals(r6);
        if (r2 == 0) goto L_0x025a;
    L_0x0258:
        r2 = 1;
        goto L_0x025b;
    L_0x025a:
        r2 = -1;
    L_0x025b:
        if (r2 == 0) goto L_0x0360;
    L_0x025d:
        r3 = 1;
        if (r2 == r3) goto L_0x026e;
    L_0x0260:
        r41.skipValue();
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        goto L_0x0376;
    L_0x026e:
        r41.beginArray();
        r2 = r41.hasNext();
        if (r2 != 0) goto L_0x0282;
    L_0x0277:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        goto L_0x0352;
    L_0x0282:
        r41.beginObject();
        r2 = 0;
    L_0x0286:
        r3 = r41.hasNext();
        if (r3 == 0) goto L_0x033b;
    L_0x028c:
        r3 = r41.nextName();
        r14 = r3.hashCode();
        r37 = r13;
        r13 = 97;
        if (r14 == r13) goto L_0x029b;
    L_0x029a:
        goto L_0x02a3;
    L_0x029b:
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x02a3;
    L_0x02a1:
        r3 = 0;
        goto L_0x02a4;
    L_0x02a3:
        r3 = -1;
    L_0x02a4:
        if (r3 == 0) goto L_0x02ac;
    L_0x02a6:
        r41.skipValue();
        r13 = r37;
        goto L_0x0286;
    L_0x02ac:
        r41.beginObject();
        r2 = 0;
        r3 = 0;
        r13 = 0;
        r14 = 0;
    L_0x02b3:
        r32 = r41.hasNext();
        if (r32 == 0) goto L_0x0326;
    L_0x02b9:
        r38 = r12;
        r12 = r41.nextName();
        r39 = r5;
        r5 = r12.hashCode();
        r40 = r4;
        r4 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r5 == r4) goto L_0x02f2;
    L_0x02cb:
        r4 = 3261; // 0xcbd float:4.57E-42 double:1.611E-320;
        if (r5 == r4) goto L_0x02e8;
    L_0x02cf:
        r4 = 3664; // 0xe50 float:5.134E-42 double:1.8103E-320;
        if (r5 == r4) goto L_0x02e0;
    L_0x02d3:
        r4 = 3684; // 0xe64 float:5.162E-42 double:1.82E-320;
        if (r5 == r4) goto L_0x02d8;
    L_0x02d7:
        goto L_0x02fa;
    L_0x02d8:
        r4 = r12.equals(r9);
        if (r4 == 0) goto L_0x02fa;
    L_0x02de:
        r4 = 2;
        goto L_0x02fb;
    L_0x02e0:
        r4 = r12.equals(r11);
        if (r4 == 0) goto L_0x02fa;
    L_0x02e6:
        r4 = 1;
        goto L_0x02fb;
    L_0x02e8:
        r4 = "fc";
        r4 = r12.equals(r4);
        if (r4 == 0) goto L_0x02fa;
    L_0x02f0:
        r4 = 0;
        goto L_0x02fb;
    L_0x02f2:
        r4 = r12.equals(r1);
        if (r4 == 0) goto L_0x02fa;
    L_0x02f8:
        r4 = 3;
        goto L_0x02fb;
    L_0x02fa:
        r4 = -1;
    L_0x02fb:
        if (r4 == 0) goto L_0x031b;
    L_0x02fd:
        r5 = 1;
        if (r4 == r5) goto L_0x0316;
    L_0x0300:
        r5 = 2;
        if (r4 == r5) goto L_0x0310;
    L_0x0303:
        r5 = 3;
        if (r4 == r5) goto L_0x030a;
    L_0x0306:
        r41.skipValue();
        goto L_0x031f;
    L_0x030a:
        r4 = defpackage.boh.a(r41, r42);
        r14 = r4;
        goto L_0x031f;
    L_0x0310:
        r4 = defpackage.boh.a(r41, r42);
        r13 = r4;
        goto L_0x031f;
    L_0x0316:
        r3 = defpackage.boh.e(r41, r42);
        goto L_0x031f;
    L_0x031b:
        r2 = defpackage.boh.e(r41, r42);
    L_0x031f:
        r12 = r38;
        r5 = r39;
        r4 = r40;
        goto L_0x02b3;
    L_0x0326:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r41.endObject();
        r4 = new bmv;
        r4.<init>(r2, r3, r13, r14);
        r2 = r4;
        r13 = r37;
        r4 = r40;
        goto L_0x0286;
    L_0x033b:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r41.endObject();
        if (r2 != 0) goto L_0x034f;
    L_0x0348:
        r2 = new bmv;
        r3 = 0;
        r2.<init>(r3, r3, r3, r3);
        goto L_0x0350;
    L_0x034f:
        r3 = 0;
    L_0x0350:
        r32 = r2;
    L_0x0352:
        r2 = r41.hasNext();
        if (r2 == 0) goto L_0x035c;
    L_0x0358:
        r41.skipValue();
        goto L_0x0352;
    L_0x035c:
        r41.endArray();
        goto L_0x0376;
    L_0x0360:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        r2 = new bmw;
        r4 = defpackage.bom.a;
        r4 = defpackage.boh.a(r0, r7, r4);
        r2.<init>(r4);
        r31 = r2;
    L_0x0376:
        r13 = r37;
        r12 = r38;
        r5 = r39;
        r4 = r40;
        r3 = 0;
        r14 = 97;
        goto L_0x0233;
    L_0x0383:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        r41.endObject();
        r14 = r36;
        r1 = 1;
        goto L_0x05a3;
    L_0x0394:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        r41.beginArray();
    L_0x03a0:
        r1 = r41.hasNext();
        if (r1 == 0) goto L_0x03b0;
    L_0x03a6:
        r1 = defpackage.boj.a(r41, r42);
        if (r1 == 0) goto L_0x03a0;
    L_0x03ac:
        r8.add(r1);
        goto L_0x03a0;
    L_0x03b0:
        r41.endArray();
        goto L_0x03d0;
    L_0x03b4:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        r41.beginArray();
    L_0x03c0:
        r1 = r41.hasNext();
        if (r1 != 0) goto L_0x03d3;
    L_0x03c6:
        r1 = r10.size();
        r7.a(r1);
        r41.endArray();
    L_0x03d0:
        r1 = 1;
        goto L_0x059b;
    L_0x03d3:
        r41.beginObject();
        r2 = r3;
        r4 = r2;
        r1 = 0;
        r5 = 0;
    L_0x03da:
        r9 = r41.hasNext();
        if (r9 == 0) goto L_0x04ac;
    L_0x03e0:
        r9 = r41.nextName();
        r11 = r9.hashCode();
        r12 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        if (r11 == r12) goto L_0x0419;
    L_0x03ec:
        r12 = 3588; // 0xe04 float:5.028E-42 double:1.7727E-320;
        if (r11 == r12) goto L_0x040f;
    L_0x03f0:
        r12 = 104433; // 0x197f1 float:1.46342E-40 double:5.1597E-319;
        if (r11 == r12) goto L_0x0405;
    L_0x03f5:
        r12 = 3357091; // 0x3339a3 float:4.704286E-39 double:1.6586233E-317;
        if (r11 == r12) goto L_0x03fb;
    L_0x03fa:
        goto L_0x0423;
    L_0x03fb:
        r11 = "mode";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x0423;
    L_0x0403:
        r11 = 0;
        goto L_0x0424;
    L_0x0405:
        r11 = "inv";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x0423;
    L_0x040d:
        r11 = 3;
        goto L_0x0424;
    L_0x040f:
        r11 = "pt";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x0423;
    L_0x0417:
        r11 = 1;
        goto L_0x0424;
    L_0x0419:
        r11 = "o";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x0423;
    L_0x0421:
        r11 = 2;
        goto L_0x0424;
    L_0x0423:
        r11 = -1;
    L_0x0424:
        if (r11 == 0) goto L_0x0447;
    L_0x0426:
        r12 = 1;
        if (r11 == r12) goto L_0x0441;
    L_0x0429:
        r9 = 2;
        if (r11 == r9) goto L_0x043b;
    L_0x042c:
        r12 = 3;
        if (r11 == r12) goto L_0x0436;
    L_0x042f:
        r41.skipValue();
    L_0x0432:
        r11 = 2;
        r13 = 97;
        goto L_0x03da;
    L_0x0436:
        r5 = r41.nextBoolean();
        goto L_0x0432;
    L_0x043b:
        r12 = 3;
        r4 = defpackage.boh.b(r41, r42);
        goto L_0x0432;
    L_0x0441:
        r12 = 3;
        r2 = defpackage.boh.d(r41, r42);
        goto L_0x0432;
    L_0x0447:
        r12 = 3;
        r1 = r41.nextString();
        r11 = r1.hashCode();
        r13 = 97;
        if (r11 == r13) goto L_0x0471;
    L_0x0454:
        r14 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        if (r11 == r14) goto L_0x0467;
    L_0x0458:
        r14 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r11 == r14) goto L_0x045d;
    L_0x045c:
        goto L_0x0479;
    L_0x045d:
        r11 = "s";
        r1 = r1.equals(r11);
        if (r1 == 0) goto L_0x0479;
    L_0x0465:
        r1 = 1;
        goto L_0x047a;
    L_0x0467:
        r11 = "i";
        r1 = r1.equals(r11);
        if (r1 == 0) goto L_0x0479;
    L_0x046f:
        r1 = 2;
        goto L_0x047a;
    L_0x0471:
        r1 = r1.equals(r6);
        if (r1 == 0) goto L_0x0479;
    L_0x0477:
        r1 = 0;
        goto L_0x047a;
    L_0x0479:
        r1 = -1;
    L_0x047a:
        if (r1 == 0) goto L_0x04aa;
    L_0x047c:
        r11 = 1;
        if (r1 == r11) goto L_0x04a6;
    L_0x047f:
        r11 = 2;
        if (r1 == r11) goto L_0x049e;
    L_0x0482:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r14 = "Unknown mask mode ";
        r1.append(r14);
        r1.append(r9);
        r9 = ". Defaulting to Add.";
        r1.append(r9);
        r1 = r1.toString();
        defpackage.bpb.a(r1);
    L_0x049b:
        r1 = 1;
        goto L_0x03da;
    L_0x049e:
        r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks.";
        r7.a(r1);
        r1 = 3;
        goto L_0x03da;
    L_0x04a6:
        r11 = 2;
        r1 = 2;
        goto L_0x03da;
    L_0x04aa:
        r11 = 2;
        goto L_0x049b;
    L_0x04ac:
        r11 = 2;
        r12 = 3;
        r13 = 97;
        r41.endObject();
        r9 = new bng;
        r9.<init>(r1, r2, r4, r5);
        r10.add(r9);
        goto L_0x03c0;
    L_0x04bd:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r3 = 0;
        r1 = 4;
        r1 = new int[r1];
        r1 = {1, 2, 3, 4};
        r2 = r41.nextInt();
        r30 = r1[r2];
        r1 = 1;
        r7.a(r1);
        goto L_0x0598;
    L_0x04d8:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r29 = defpackage.boi.a(r41, r42);
        goto L_0x0598;
    L_0x04e8:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextString();
        r28 = android.graphics.Color.parseColor(r2);
        goto L_0x0598;
    L_0x04fc:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextInt();
        r2 = (float) r2;
        r4 = defpackage.bpg.a();
        r2 = r2 * r4;
        r2 = (int) r2;
        r27 = r2;
        goto L_0x052d;
    L_0x0515:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextInt();
        r2 = (float) r2;
        r4 = defpackage.bpg.a();
        r2 = r2 * r4;
        r2 = (int) r2;
        r26 = r2;
    L_0x052d:
        r14 = r36;
        goto L_0x05a1;
    L_0x0531:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextInt();
        r4 = (long) r2;
        r24 = r4;
        goto L_0x0589;
    L_0x0543:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextInt();
        r4 = 6;
        if (r2 >= r4) goto L_0x055d;
    L_0x0554:
        r4 = 7;
        r4 = new int[r4];
        r4 = {1, 2, 3, 4, 5, 6, 7};
        r22 = r4[r2];
        goto L_0x059b;
    L_0x055d:
        r4 = 7;
        r14 = r36;
        r13 = r37;
        r5 = r39;
        r4 = r40;
        r22 = 7;
        goto L_0x05a3;
    L_0x0569:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r19 = r41.nextString();
        goto L_0x0598;
    L_0x0578:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r1 = 1;
        r3 = 0;
        r2 = r41.nextInt();
        r4 = (long) r2;
        r20 = r4;
    L_0x0589:
        r14 = r36;
        goto L_0x059f;
    L_0x058c:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r1 = 1;
        r3 = 0;
        r13 = r41.nextString();
    L_0x0598:
        r14 = r36;
        goto L_0x05a3;
    L_0x059b:
        r14 = r36;
        r13 = r37;
    L_0x059f:
        r5 = r39;
    L_0x05a1:
        r4 = r40;
    L_0x05a3:
        r12 = r38;
        r11 = 0;
        goto L_0x0042;
    L_0x05a8:
        r40 = r4;
        r39 = r5;
        r38 = r12;
        r37 = r13;
        r36 = r14;
        r41.endObject();
        r9 = r40 / r15;
        r11 = r39 / r15;
        r14 = new java.util.ArrayList;
        r14.<init>();
        r0 = 0;
        r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r1 <= 0) goto L_0x05d8;
    L_0x05c3:
        r12 = new bpf;
        r4 = 0;
        r5 = 0;
        r6 = java.lang.Float.valueOf(r9);
        r0 = r12;
        r1 = r42;
        r2 = r38;
        r3 = r38;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r14.add(r12);
    L_0x05d8:
        r0 = 0;
        r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x05de;
    L_0x05dd:
        goto L_0x05e1;
    L_0x05de:
        r0 = r7.j;
        r11 = r0;
    L_0x05e1:
        r12 = new bpf;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = java.lang.Float.valueOf(r0);
        r4 = 0;
        r6 = java.lang.Float.valueOf(r11);
        r0 = r12;
        r1 = r42;
        r2 = r3;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r14.add(r12);
        r9 = new bpf;
        r0 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r6 = java.lang.Float.valueOf(r0);
        r0 = r9;
        r2 = r38;
        r3 = r38;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r14.add(r9);
        r0 = ".ai";
        r4 = r37;
        r0 = r4.endsWith(r0);
        if (r0 != 0) goto L_0x0622;
    L_0x0618:
        r0 = "ai";
        r2 = r36;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0627;
    L_0x0622:
        r0 = "Convert your Illustrator layers to shape layers.";
        r7.a(r0);
    L_0x0627:
        r34 = new bnv;
        r0 = r34;
        r1 = r8;
        r2 = r42;
        r3 = r4;
        r4 = r20;
        r6 = r22;
        r7 = r24;
        r9 = r19;
        r11 = r29;
        r12 = r26;
        r13 = r27;
        r21 = r14;
        r14 = r28;
        r19 = r31;
        r20 = r32;
        r22 = r30;
        r24 = r33;
        r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
        return r34;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bou.a(android.util.JsonReader, bjj):bnv");
    }
}
