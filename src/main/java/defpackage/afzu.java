package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: afzu */
final /* synthetic */ class afzu implements Runnable {
    private final afzs a;
    private final List b;
    private final Map c;
    private final Map d;
    private final int e;
    private final long f;

    afzu(afzs afzs, List list, Map map, Map map2, int i, long j) {
        this.a = afzs;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = i;
        this.f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0406  */
    public final void run() {
        /*
        r48 = this;
        r1 = r48;
        r2 = r1.a;
        r0 = r1.b;
        r3 = r1.c;
        r4 = r1.d;
        r15 = r1.e;
        r5 = r1.f;
        defpackage.xak.b();
        r7 = r0.size();
        r8 = r3.size();
        if (r8 != r7) goto L_0x001d;
    L_0x001b:
        r8 = 1;
        goto L_0x001e;
    L_0x001d:
        r8 = 0;
    L_0x001e:
        defpackage.amqw.a(r8);
        r8 = r4.size();
        if (r8 != r7) goto L_0x0029;
    L_0x0027:
        r7 = 1;
        goto L_0x002a;
    L_0x0029:
        r7 = 0;
    L_0x002a:
        defpackage.amqw.a(r7);
        r7 = r2.k;
        r7 = r7.get();
        r12 = r7;
        r12 = (defpackage.agfi) r12;
        r7 = r2.h;
        r7 = r7.get();
        r7 = (defpackage.agul) r7;
        r8 = r2.m;
        r8 = r8.get();
        r8 = (defpackage.agpi) r8;
        r9 = r2.p;
        r9 = r9.get();
        r9 = (defpackage.agci) r9;
        r10 = new java.util.ArrayList;
        r10.<init>();
        r11 = new java.util.HashMap;
        r11.<init>();
        r14 = new java.util.HashMap;
        r14.<init>();
        r13 = new java.util.HashMap;
        r13.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r18 = r15;
        r15 = new java.util.HashMap;
        r15.<init>();
        r19 = r5;
        r5 = new java.util.HashMap;
        r5.<init>();
        r6 = new java.util.HashMap;
        r6.<init>();
        r21 = r10;
        r10 = new java.util.HashMap;
        r10.<init>();
        r22 = r0.iterator();
    L_0x0085:
        r0 = r22.hasNext();
        r23 = r10;
        if (r0 == 0) goto L_0x01e3;
    L_0x008d:
        r0 = r22.next();
        r10 = r0;
        r10 = (java.lang.String) r10;
        r0 = r12.l(r10);
        if (r0 != 0) goto L_0x00a0;
    L_0x009a:
        r2.n(r10);
        r10 = r23;
        goto L_0x0085;
    L_0x00a0:
        r25 = r6;
        r6 = r2.r(r10);
        r26 = r5;
        r5 = r12.f(r10);
        r0 = r3.containsKey(r10);	 Catch:{ ExecutionException -> 0x019d }
        if (r0 == 0) goto L_0x00bd;
    L_0x00b2:
        r0 = r3.get(r10);	 Catch:{ ExecutionException -> 0x019d }
        r0 = (java.lang.Integer) r0;	 Catch:{ ExecutionException -> 0x019d }
        r0 = r0.intValue();	 Catch:{ ExecutionException -> 0x019d }
        goto L_0x00c0;
    L_0x00bd:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x00c0:
        r0 = r7.a(r10, r0);	 Catch:{ ExecutionException -> 0x019d }
        if (r0 != 0) goto L_0x00d0;
    L_0x00c6:
        r2.g(r10);
        r10 = r23;
        r6 = r25;
        r5 = r26;
        goto L_0x0085;
    L_0x00d0:
        r27 = r3;
        r3 = r0.b;
        r28 = r7;
        r7 = r12.b(r10);
        r7 = r7.second;
        r7 = r2.e;
        r7 = r7.get();
        r7 = (defpackage.agvs) r7;
        r7.l();
        r0 = r0.a;
        r7 = r0.e;
        r29 = r5;
        r5 = r3.size();
        if (r7 == r5) goto L_0x0102;
    L_0x00f3:
        r5 = "Playlist size doesn't match number of playlist videos";
        defpackage.xtl.d(r5);
        r5 = new agqi;
        r7 = r3.size();
        r5.<init>(r0, r7);
        goto L_0x0103;
    L_0x0102:
        r5 = r0;
    L_0x0103:
        r8.a(r5);	 Catch:{ IOException -> 0x010b, IOException | ExecutionException -> 0x0109 }
        r30 = r8;
        goto L_0x0129;
    L_0x0109:
        r0 = move-exception;
        goto L_0x010c;
    L_0x010b:
        r0 = move-exception;
    L_0x010c:
        r7 = r5.a;
        r7 = java.lang.String.valueOf(r7);
        r30 = r8;
        r8 = "Failed saving playlist thumbnail for ";
        r31 = r7.length();
        if (r31 != 0) goto L_0x0122;
    L_0x011c:
        r7 = new java.lang.String;
        r7.<init>(r8);
        goto L_0x0126;
    L_0x0122:
        r7 = r8.concat(r7);
    L_0x0126:
        defpackage.xtl.b(r7, r0);
    L_0x0129:
        r0 = r9.a(r3);
        r7 = r4.get(r10);
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r8 = r2.v;
        r8 = defpackage.ahda.a(r8);
        if (r8 != 0) goto L_0x0141;
    L_0x013f:
        r8 = 2;
        goto L_0x0146;
    L_0x0141:
        r8 = r8.o;
        if (r8 == 0) goto L_0x013f;
    L_0x0145:
        goto L_0x0150;
    L_0x0146:
        if (r7 == r8) goto L_0x0150;
    L_0x0148:
        r8 = r12.c(r10);
        if (r8 > 0) goto L_0x014f;
    L_0x014e:
        goto L_0x0150;
    L_0x014f:
        r7 = 1;
    L_0x0150:
        r11.put(r10, r5);
        r14.put(r10, r3);
        r13.put(r10, r6);
        r1.put(r10, r0);
        r0 = defpackage.zzp.b;
        r15.put(r10, r0);
        r0 = defpackage.agqq.DEFER_FOR_DISCOUNTED_DATA;
        if (r6 != r0) goto L_0x0167;
    L_0x0165:
        r0 = 1;
        goto L_0x0168;
    L_0x0167:
        r0 = 0;
    L_0x0168:
        r0 = java.lang.Boolean.valueOf(r0);
        r3 = r26;
        r3.put(r10, r0);
        r0 = -1;
        r0 = java.lang.Integer.valueOf(r0);
        r5 = r25;
        r5.put(r10, r0);
        r8 = r23;
        r6 = r29;
        r8.put(r10, r6);
        if (r7 != 0) goto L_0x0187;
    L_0x0184:
        r6 = r21;
        goto L_0x018b;
    L_0x0187:
        r6 = 2;
        if (r7 != r6) goto L_0x0196;
    L_0x018a:
        goto L_0x0184;
    L_0x018b:
        r6.add(r10);
        r21 = r6;
        r10 = r8;
        r7 = r28;
        r8 = r30;
        goto L_0x01dd;
    L_0x0196:
        r6 = r5;
        r10 = r8;
        r7 = r28;
        r8 = r30;
        goto L_0x01de;
    L_0x019d:
        r0 = move-exception;
        r27 = r3;
        r28 = r7;
        r30 = r8;
        r6 = r21;
        r8 = r23;
        r5 = r25;
        r3 = r26;
        r7 = java.lang.String.valueOf(r10);
        r7 = r7.length();
        r21 = r9;
        r9 = new java.lang.StringBuilder;
        r7 = r7 + 39;
        r9.<init>(r7);
        r7 = "Failed requesting playlist ";
        r9.append(r7);
        r9.append(r10);
        r7 = " for offline";
        r9.append(r7);
        r7 = r9.toString();
        defpackage.xtl.a(r7, r0);
        r2.n(r10);
        r10 = r8;
        r9 = r21;
        r7 = r28;
        r8 = r30;
        r21 = r6;
    L_0x01dd:
        r6 = r5;
    L_0x01de:
        r5 = r3;
        r3 = r27;
        goto L_0x0085;
    L_0x01e3:
        r3 = r5;
        r5 = r6;
        r6 = r21;
        r8 = r23;
        r0 = new java.util.HashMap;
        r0.<init>();
        r7 = new java.util.HashMap;
        r7.<init>();
        r9 = new java.util.HashMap;
        r9.<init>();
        r10 = r6.size();
        r21 = r4;
        r4 = 0;
    L_0x01ff:
        if (r4 < r10) goto L_0x04fc;
    L_0x0201:
        r1 = r2.q;
        r1 = r1.get();
        r1 = (defpackage.agdh) r1;
        r4 = new java.util.HashMap;
        r4.<init>();
        r10 = new java.util.HashMap;
        r10.<init>();
        r28 = r2;
        r2 = new java.util.HashMap;
        r2.<init>();
        r29 = r12;
        r12 = new java.util.HashMap;
        r12.<init>();
        r30 = r13;
        r13 = r7.size();
        r21 = r7.keySet();
        r21 = r21.iterator();
        r31 = r11;
        r25 = r12;
        r26 = 0;
    L_0x0235:
        r22 = r21.hasNext();
        if (r22 == 0) goto L_0x02fb;
    L_0x023b:
        r22 = r21.next();
        r11 = r22;
        r11 = (java.lang.String) r11;
        r12 = r14.containsKey(r11);
        defpackage.amqw.a(r12);
        r22 = r13;
        r12 = r19 - r26;
        r46 = r4;
        r45 = r5;
        r4 = 0;
        r41 = java.lang.Math.max(r12, r4);
        r12 = r8.get(r11);
        r12 = (defpackage.avsi) r12;
        r13 = r1.b;
        r44 = r13.b(r12);
        r12 = r1.a;
        r34 = 0;
        r13 = r7.get(r11);
        r35 = r13;
        r35 = (java.util.List) r35;
        r13 = r14.get(r11);
        r36 = r13;
        r36 = (java.util.List) r36;
        r13 = r9.get(r11);
        r37 = r13;
        r37 = (defpackage.avrp) r37;
        r13 = r15.get(r11);
        r38 = r13;
        r38 = (byte[]) r38;
        r13 = r3.get(r11);
        r13 = (java.lang.Boolean) r13;
        r39 = r13.booleanValue();
        r13 = r45;
        r23 = r13.get(r11);
        r23 = (java.lang.Integer) r23;
        r40 = r23.intValue();
        r23 = r8.get(r11);
        r43 = r23;
        r43 = (defpackage.avsi) r43;
        r32 = r12;
        r33 = r11;
        r12 = r32.a(r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r44);
        r4 = r12.a;
        r4 = r4.get(r11);
        r4 = (java.util.Set) r4;
        r5 = r46;
        r5.put(r11, r4);
        r4 = r12.a(r11);
        r10.put(r11, r4);
        r4 = r12.b(r11);
        r2.put(r11, r4);
        r4 = r12.c(r11);
        r32 = r1;
        r1 = r22;
        r22 = r3;
        r3 = 1;
        if (r1 > r3) goto L_0x02d9;
    L_0x02d6:
        r3 = r25;
        goto L_0x02e9;
    L_0x02d9:
        if (r4 == 0) goto L_0x02d6;
    L_0x02db:
        r3 = r4.isEmpty();
        if (r3 != 0) goto L_0x02d6;
    L_0x02e1:
        r3 = "Encountered transient list in batched playlist mode. This is not supported.";
        defpackage.xtl.c(r3);
        r3 = r25;
        goto L_0x02ec;
    L_0x02e9:
        r3.put(r11, r4);
    L_0x02ec:
        r11 = r12.b;
        r26 = r26 + r11;
        r25 = r3;
        r4 = r5;
        r5 = r13;
        r3 = r22;
        r13 = r1;
        r1 = r32;
        goto L_0x0235;
    L_0x02fb:
        r5 = r4;
        r3 = r25;
        r1 = r7.size();
        r4 = 1;
        if (r1 <= r4) goto L_0x0308;
    L_0x0305:
        r3.size();
    L_0x0308:
        r1 = new agdn;
        r21 = r1;
        r22 = r5;
        r23 = r10;
        r24 = r2;
        r25 = r3;
        r21.<init>(r22, r23, r24, r25, r26);
        r2 = r6.size();
        r3 = 0;
    L_0x031c:
        if (r3 >= r2) goto L_0x034d;
    L_0x031e:
        r4 = r6.get(r3);
        r4 = (java.lang.String) r4;
        r5 = r1.a(r4);
        if (r5 == 0) goto L_0x034a;
    L_0x032a:
        r7 = new java.util.HashSet;
        r7.<init>();
        r5 = r5.iterator();
    L_0x0333:
        r9 = r5.hasNext();
        if (r9 == 0) goto L_0x0347;
    L_0x0339:
        r9 = r5.next();
        r9 = (defpackage.agqp) r9;
        r9 = r9.a();
        r7.add(r9);
        goto L_0x0333;
    L_0x0347:
        r0.put(r4, r7);
    L_0x034a:
        r3 = r3 + 1;
        goto L_0x031c;
    L_0x034d:
        r1 = r31.keySet();
        r1 = r1.iterator();
    L_0x0355:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x04fb;
    L_0x035b:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r31;
        r4 = r3.get(r2);
        r4 = (defpackage.agqi) r4;
        r5 = r14.get(r2);
        r5 = (java.util.List) r5;
        r6 = r0.get(r2);
        r6 = (java.util.Set) r6;
        r7 = r8.get(r2);
        r15 = r7;
        r15 = (defpackage.avsi) r15;
        r13 = r30;
        r7 = r13.get(r2);
        r30 = r7;
        r30 = (defpackage.agqq) r30;
        defpackage.xvd.a(r2);
        r12 = r29;
        r7 = r12.d;
        r26 = r7.d(r2);
        defpackage.xvd.a(r2);
        r7 = r12.d;
        r7 = r7.a;
        r31 = r7.a();
        r11 = 1;
        r7 = new java.lang.String[r11];
        r9 = "player_response_tracking_params";
        r10 = 0;
        r7[r10] = r9;
        r9 = new java.lang.String[r11];
        r9[r10] = r2;
        r36 = 0;
        r37 = 0;
        r38 = 0;
        r39 = 0;
        r32 = "playlistsV13";
        r34 = "id = ?";
        r33 = r7;
        r35 = r9;
        r2 = r31.query(r32, r33, r34, r35, r36, r37, r38, r39);
        r7 = r2.moveToNext();	 Catch:{ all -> 0x04f6 }
        if (r7 == 0) goto L_0x03cd;
    L_0x03c2:
        r10 = 0;
        r7 = r2.getBlob(r10);	 Catch:{ all -> 0x04f6 }
        r2.close();
        r27 = r7;
        goto L_0x03d4;
    L_0x03cd:
        r10 = 0;
        r2.close();
        r2 = 0;
        r27 = r2;
    L_0x03d4:
        r2 = r28;
        r7 = r2.e;
        r7 = r7.get();
        r7 = (defpackage.agvs) r7;
        r17 = r7.b(r15);
        r7 = r2.k;
        r7 = r7.get();
        r19 = r7;
        r19 = (defpackage.agfi) r19;
        r9 = r4.a;
        if (r6 != 0) goto L_0x03f4;
    L_0x03f0:
        r6 = java.util.Collections.emptySet();
    L_0x03f4:
        r20 = r4;
        r21 = r5;
        r22 = r15;
        r23 = r17;
        r24 = r6;
        r25 = r30;
        r7 = r19.a(r20, r21, r22, r23, r24, r25, r26, r27);
        if (r7 != 0) goto L_0x0436;
    L_0x0406:
        r4 = java.lang.String.valueOf(r9);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 36;
        r5.<init>(r4);
        r4 = "Failed syncing playlist ";
        r5.append(r4);
        r5.append(r9);
        r4 = " to database";
        r5.append(r4);
        r4 = r5.toString();
        defpackage.xtl.c(r4);
        r2.n(r9);
        r28 = r2;
        r31 = r3;
        r29 = r12;
        r30 = r13;
        goto L_0x0355;
    L_0x0436:
        r7 = r2.s;
        r7 = r7.a(r4, r6);
        r10 = r2.p;
        r10 = r10.get();
        r10 = (defpackage.agci) r10;
        r11 = r2.r;
        r11 = r11.get();
        r11 = (defpackage.agdz) r11;
        r20 = r10.a();
        r23 = r0;
        r0 = r20.size();
        r11.a(r0);
        r0 = r11.b();
        r0.a(r6);
        r0 = r4.a;
        r0 = java.lang.String.valueOf(r0);
        r0.length();
        r0 = r2.i;
        r4 = new agld;
        r7 = r7.c();
        r4.<init>(r7);
        r0.a(r4);
        r0 = r11.b();
        r0 = r0.a();
        r10.a(r0);
        r0 = r2.o;
        r0 = r0.get();
        r0 = (defpackage.afzq) r0;
        r0.a(r5);
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x04ea;
    L_0x0493:
        r0 = r2.n;
        r0 = r0.get();
        r0 = (defpackage.agdo) r0;
        r4 = r6.iterator();
    L_0x049f:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x04ea;
    L_0x04a5:
        r5 = r4.next();
        r7 = r5;
        r7 = (java.lang.String) r7;
        r10 = 0;
        r11 = 1;
        r20 = 0;
        r21 = 0;
        r22 = 1;
        r5 = r0;
        r6 = r9;
        r24 = r8;
        r8 = r10;
        r25 = r9;
        r9 = r15;
        r26 = r24;
        r16 = 0;
        r10 = r17;
        r19 = 1;
        r27 = r12;
        r12 = r18;
        r28 = r13;
        r29 = 1;
        r13 = r30;
        r47 = r14;
        r31 = 0;
        r14 = r20;
        r19 = r15;
        r15 = r21;
        r16 = r22;
        r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r15 = r19;
        r9 = r25;
        r8 = r26;
        r12 = r27;
        r13 = r28;
        r14 = r47;
        goto L_0x049f;
    L_0x04ea:
        r28 = r2;
        r31 = r3;
        r29 = r12;
        r30 = r13;
        r0 = r23;
        goto L_0x0355;
    L_0x04f6:
        r0 = move-exception;
        r2.close();
        throw r0;
    L_0x04fb:
        return;
    L_0x04fc:
        r23 = r0;
        r22 = r3;
        r26 = r8;
        r3 = r11;
        r27 = r12;
        r28 = r13;
        r47 = r14;
        r29 = 1;
        r31 = 0;
        r13 = r5;
        r5 = r2;
        r0 = r6.get(r4);
        r0 = (java.lang.String) r0;
        r2 = r1.get(r0);
        r2 = (java.util.Collection) r2;
        r8 = new java.util.ArrayList;
        r8.<init>();
        r11 = r47;
        r12 = r11.get(r0);
        r12 = (java.util.List) r12;
        r12 = r12.iterator();
    L_0x052c:
        r14 = r12.hasNext();
        if (r14 == 0) goto L_0x054e;
    L_0x0532:
        r14 = r12.next();
        r14 = (defpackage.agqp) r14;
        r16 = r1;
        r1 = r14.a();
        r1 = r2.contains(r1);
        if (r1 != 0) goto L_0x054b;
    L_0x0544:
        r1 = r14.a();
        r8.add(r1);
    L_0x054b:
        r1 = r16;
        goto L_0x052c;
    L_0x054e:
        r16 = r1;
        r7.put(r0, r8);
        r1 = r21;
        r2 = r1.get(r0);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r8 = 2;
        if (r2 != r8) goto L_0x0563;
    L_0x0562:
        goto L_0x0568;
    L_0x0563:
        if (r18 == 0) goto L_0x0568;
    L_0x0565:
        r2 = defpackage.avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE;
        goto L_0x056a;
    L_0x0568:
        r2 = defpackage.avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
    L_0x056a:
        r9.put(r0, r2);
        r4 = r4 + 1;
        r21 = r1;
        r2 = r5;
        r14 = r11;
        r5 = r13;
        r1 = r16;
        r0 = r23;
        r8 = r26;
        r12 = r27;
        r13 = r28;
        r11 = r3;
        r3 = r22;
        goto L_0x01ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzu.run():void");
    }
}
