package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: abol */
public final class abol {
    public final abnu a;
    public final aboe b;
    public final afpu c;
    public final ScheduledExecutorService d;
    public final anjz e;
    public final xsc f;
    public final abmw g;
    public long h;
    public final AtomicInteger i = new AtomicInteger();
    public final AtomicLong j = new AtomicLong();
    private final utc k;
    private final aboa l;
    private final aboi m;
    private final abno n;
    private final abns o;
    private final AtomicBoolean p = new AtomicBoolean();

    public abol(abnu abnu, aboe aboe, Context context, afpu afpu, utc utc, ScheduledExecutorService scheduledExecutorService, xsc xsc, aboa aboa, abno abno, abns abns, abmw abmw, aboi aboi) {
        amqw.a((Object) context);
        this.a = (abnu) amqw.a((Object) abnu);
        this.b = (aboe) amqw.a((Object) aboe);
        this.m = aboi;
        amqw.a(TextUtils.isEmpty(abnu.a()) ^ 1);
        this.c = (afpu) amqw.a((Object) afpu);
        this.k = (utc) amqw.a((Object) utc);
        this.d = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.e = ankc.a(scheduledExecutorService);
        this.f = (xsc) amqw.a((Object) xsc);
        this.l = (aboa) amqw.a((Object) aboa);
        this.n = (abno) amqw.a((Object) abno);
        this.o = (abns) amqw.a((Object) abns);
        this.g = abmw;
    }

    public final synchronized Collection a(String str) {
        return b(str);
    }

    private final synchronized Collection b(String str) {
        return a(str, false, -1, null, false, null, -1).c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0284 A:{Catch:{ IOException -> 0x0228 }} */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02aa A:{Catch:{ IOException -> 0x0228 }} */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02d6 A:{Catch:{ IOException -> 0x0228 }} */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d1 A:{Catch:{ IOException -> 0x0228 }} */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02df  */
    public final defpackage.aboc a(java.lang.String r28, boolean r29, int r30, java.lang.String r31, boolean r32, java.lang.String r33, long r34) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r2 = r34;
        r4 = r0.j;
        r5 = r0.f;
        r5 = r5.c();
        r4.set(r5);
        r4 = new aboc;
        r4.<init>(r1);
        r5 = r4.b;
        defpackage.amqw.a(r28);
        r6 = r0.a;
        r6 = r6.j();
        r7 = java.util.Collections.emptyList();
        r8 = r0.a;
        r8 = r8.i();
        r10 = 0;
        if (r8 != 0) goto L_0x0032;
    L_0x002e:
        r3 = r4;
        r2 = r6;
        goto L_0x020e;
    L_0x0032:
        r7 = new java.util.ArrayList;
        r7.<init>();
        r8 = r0.o;
        r11 = r8.a;
        r11 = android.text.TextUtils.isEmpty(r11);
        if (r11 != 0) goto L_0x0056;
    L_0x0041:
        r11 = r8.a;
        r11 = r1.equals(r11);
        if (r11 == 0) goto L_0x0056;
    L_0x0049:
        r11 = r8.b;
        if (r11 == 0) goto L_0x0056;
    L_0x004d:
        r11 = r11.size();
        if (r11 <= 0) goto L_0x0056;
    L_0x0053:
        r8 = r8.b;
        goto L_0x0057;
    L_0x0056:
        r8 = 0;
    L_0x0057:
        r11 = 1;
        if (r8 != 0) goto L_0x0060;
    L_0x005a:
        r25 = r4;
        r26 = r6;
        goto L_0x01b5;
    L_0x0060:
        r8 = r8.iterator();
    L_0x0064:
        r12 = r8.hasNext();
        if (r12 == 0) goto L_0x005a;
    L_0x006a:
        r12 = r8.next();
        r14 = r12;
        r14 = (java.lang.String) r14;
        r12 = new abnv;
        r16 = defpackage.abnv.j;
        r15 = new int[r11];
        r13 = 71;
        r15[r10] = r13;
        r13 = new android.text.SpannableStringBuilder;
        r13.<init>();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r11 = "[\\s\\_\\.\\/\\'\",]";
        r17 = r14.split(r11);
        r10 = defpackage.amvj.a(r17);
        r11 = r1.split(r11);
        r11 = defpackage.amvj.a(r11);
        r24 = r8;
        r8 = r10.size();
        r17 = r15;
        r2 = 0;
        r3 = 0;
        r15 = 0;
    L_0x00a2:
        if (r15 >= r8) goto L_0x0173;
    L_0x00a4:
        r18 = r10.get(r15);
        r19 = r8;
        r8 = r18;
        r8 = (java.lang.String) r8;
        r18 = android.text.TextUtils.isEmpty(r8);
        if (r18 != 0) goto L_0x015f;
    L_0x00b4:
        r18 = r10;
        r10 = r14.charAt(r3);
        r25 = r4;
        r1 = 0;
        r4 = r8.charAt(r1);
        if (r10 == r4) goto L_0x00db;
    L_0x00c3:
        r4 = r3;
    L_0x00c4:
        r10 = r14.charAt(r4);
        r26 = r6;
        r6 = r8.charAt(r1);
        if (r10 == r6) goto L_0x00d6;
    L_0x00d0:
        r4 = r4 + 1;
        r6 = r26;
        r1 = 0;
        goto L_0x00c4;
    L_0x00d6:
        r9.append(r14, r3, r4);
        r3 = r4;
        goto L_0x00dd;
    L_0x00db:
        r26 = r6;
    L_0x00dd:
        r1 = r8.length();
        r3 = r3 + r1;
        r1 = -1;
        r1 = 0;
        r4 = 0;
        r6 = -1;
    L_0x00e6:
        r10 = r11.size();
        r20 = r3;
        r3 = 2;
        if (r1 >= r10) goto L_0x0115;
    L_0x00ef:
        r10 = r11.get(r1);
        r10 = (java.lang.String) r10;
        r21 = android.text.TextUtils.isEmpty(r10);
        if (r21 == 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0110;
    L_0x00fc:
        r21 = r8.equals(r10);
        if (r21 != 0) goto L_0x010b;
    L_0x0102:
        r3 = r8.startsWith(r10);
        if (r3 != 0) goto L_0x010a;
    L_0x0108:
        r3 = 0;
        goto L_0x010b;
    L_0x010a:
        r3 = 1;
    L_0x010b:
        if (r3 > r4) goto L_0x010e;
    L_0x010d:
        goto L_0x0110;
    L_0x010e:
        r6 = r1;
        r4 = r3;
    L_0x0110:
        r1 = r1 + 1;
        r3 = r20;
        goto L_0x00e6;
    L_0x0115:
        if (r4 == 0) goto L_0x0119;
    L_0x0117:
        r1 = 0;
        goto L_0x011a;
    L_0x0119:
        r1 = 1;
    L_0x011a:
        if (r1 == r2) goto L_0x0128;
    L_0x011c:
        r1 = r9.toString();
        defpackage.abns.a(r13, r1, r2);
        r1 = 0;
        r9.setLength(r1);
        goto L_0x0129;
    L_0x0128:
        r1 = 0;
    L_0x0129:
        if (r4 != r3) goto L_0x0132;
    L_0x012b:
        r9.append(r8);
        r11.remove(r6);
        goto L_0x015b;
    L_0x0132:
        r2 = 1;
        if (r4 != r2) goto L_0x0157;
    L_0x0135:
        r2 = r11.get(r6);
        r2 = (java.lang.String) r2;
        r2 = r2.length();
        r9.append(r8, r1, r2);
        r3 = r9.toString();
        defpackage.abns.a(r13, r3, r1);
        r9.setLength(r1);
        r1 = r8.length();
        r9.append(r8, r2, r1);
        r11.remove(r6);
        goto L_0x015a;
    L_0x0157:
        r9.append(r8);
    L_0x015a:
        r1 = 1;
    L_0x015b:
        r2 = r1;
        r3 = r20;
        goto L_0x0165;
    L_0x015f:
        r25 = r4;
        r26 = r6;
        r18 = r10;
    L_0x0165:
        r15 = r15 + 1;
        r1 = r28;
        r10 = r18;
        r8 = r19;
        r4 = r25;
        r6 = r26;
        goto L_0x00a2;
    L_0x0173:
        r25 = r4;
        r26 = r6;
        r1 = r9.toString();
        defpackage.abns.a(r13, r1, r2);
        r1 = r14.length();
        if (r3 >= r1) goto L_0x0190;
    L_0x0184:
        r1 = r14.length();
        r1 = r14.substring(r3, r1);
        r2 = 1;
        defpackage.abns.a(r13, r1, r2);
    L_0x0190:
        r15 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r1 = r13;
        r13 = r12;
        r2 = r17;
        r23 = r1;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
        r7.add(r12);
        r1 = r28;
        r2 = r34;
        r8 = r24;
        r4 = r25;
        r6 = r26;
        r10 = 0;
        r11 = 1;
        goto L_0x0064;
    L_0x01b5:
        r1 = r0.a;
        r1 = r1.k();
        if (r1 != 0) goto L_0x01c8;
    L_0x01bd:
        r1 = r0.a;
        r1 = r1.l();
        if (r1 == 0) goto L_0x01c6;
    L_0x01c5:
        goto L_0x01c8;
    L_0x01c6:
        r10 = 0;
        goto L_0x01e3;
    L_0x01c8:
        r1 = r7.isEmpty();
        if (r1 != 0) goto L_0x01d8;
    L_0x01ce:
        r1 = r0.p;
        r2 = 1;
        r1.set(r2);
        r5.a(r2);
        goto L_0x01e2;
    L_0x01d8:
        r2 = 1;
        r1 = r0.p;
        r3 = 0;
        r1.set(r3);
        r5.a(r3);
    L_0x01e2:
        r10 = 1;
    L_0x01e3:
        r1 = r0.a;
        r1 = r1.l();
        if (r1 == 0) goto L_0x01ee;
    L_0x01eb:
        r7.clear();
    L_0x01ee:
        r1 = r0.o;
        r1.a();
        if (r26 < 0) goto L_0x020a;
    L_0x01f5:
        r1 = r7.size();
        r2 = r26;
        if (r1 >= r2) goto L_0x0200;
    L_0x01fd:
        r3 = r25;
        goto L_0x020e;
    L_0x0200:
        r1 = 0;
        r1 = r7.subList(r1, r2);
        r3 = r25;
        r3.c = r1;
        return r3;
    L_0x020a:
        r3 = r25;
        r2 = r26;
    L_0x020e:
        r1 = java.util.Collections.emptyList();
        r4 = android.text.TextUtils.isEmpty(r28);
        if (r4 == 0) goto L_0x0224;
    L_0x0218:
        r4 = r0.a;
        r4 = r4.d();
        if (r4 != 0) goto L_0x0224;
    L_0x0220:
        r4 = r28;
        goto L_0x02f4;
    L_0x0224:
        r4 = r28;
        if (r4 != 0) goto L_0x022b;
    L_0x0228:
        r9 = 0;
        goto L_0x02dc;
    L_0x022b:
        r6 = r28.isEmpty();	 Catch:{ IOException -> 0x0228 }
        if (r6 == 0) goto L_0x0239;
    L_0x0231:
        r6 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r6 = r6.d();	 Catch:{ IOException -> 0x0228 }
        if (r6 == 0) goto L_0x0228;
    L_0x0239:
        r6 = new abod;	 Catch:{ IOException -> 0x0228 }
        r6.<init>();	 Catch:{ IOException -> 0x0228 }
        r8 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0228 }
        r6.a = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = r0.l;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0228 }
        r6.b = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = r0.l;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0228 }
        r6.c = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.c();	 Catch:{ IOException -> 0x0228 }
        r6.g = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = r31;
        r6.j = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = r30;
        r6.m = r8;	 Catch:{ IOException -> 0x0228 }
        r6.d = r4;	 Catch:{ IOException -> 0x0228 }
        r8 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.f();	 Catch:{ IOException -> 0x0228 }
        r6.n = r8;	 Catch:{ IOException -> 0x0228 }
        r8 = 0;
        r11 = r34;
        r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r13 != 0) goto L_0x027b;
    L_0x0278:
        r8 = r33;
        goto L_0x027e;
    L_0x027b:
        if (r32 == 0) goto L_0x0282;
    L_0x027d:
        goto L_0x0278;
    L_0x027e:
        r6.k = r8;	 Catch:{ IOException -> 0x0228 }
        r6.l = r11;	 Catch:{ IOException -> 0x0228 }
    L_0x0282:
        if (r29 == 0) goto L_0x02a4;
    L_0x0284:
        r8 = r0.n;	 Catch:{ IOException -> 0x0228 }
        r9 = r8.b;	 Catch:{ IOException -> 0x0228 }
        r11 = android.text.TextUtils.isEmpty(r9);	 Catch:{ IOException -> 0x0228 }
        if (r11 != 0) goto L_0x029e;
    L_0x028e:
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0228 }
        r12 = r8.a;	 Catch:{ IOException -> 0x0228 }
        r12 = r12.a();	 Catch:{ IOException -> 0x0228 }
        r14 = r8.c;	 Catch:{ IOException -> 0x0228 }
        r12 = r12 - r14;
        r11 = r11.toSeconds(r12);	 Catch:{ IOException -> 0x0228 }
        goto L_0x02a0;
    L_0x029e:
        r11 = -1;
    L_0x02a0:
        r6.h = r9;	 Catch:{ IOException -> 0x0228 }
        r6.i = r11;	 Catch:{ IOException -> 0x0228 }
    L_0x02a4:
        r8 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.b;	 Catch:{ IOException -> 0x0228 }
        if (r8 == 0) goto L_0x02b5;
    L_0x02aa:
        r8 = r27.b();	 Catch:{ IOException -> 0x0228 }
        r9 = r27.c();	 Catch:{ IOException -> 0x0228 }
        r6.a(r8, r9);	 Catch:{ IOException -> 0x0228 }
    L_0x02b5:
        r8 = r0.c;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0228 }
        if (r8 != 0) goto L_0x02cd;
    L_0x02bd:
        r8 = r0.a;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0228 }
        if (r8 == 0) goto L_0x02cd;
    L_0x02c5:
        r8 = r0.c;	 Catch:{ IOException -> 0x0228 }
        r8 = r8.h();	 Catch:{ IOException -> 0x0228 }
        r6.f = r8;	 Catch:{ IOException -> 0x0228 }
    L_0x02cd:
        r8 = r0.m;	 Catch:{ IOException -> 0x0228 }
        if (r8 == 0) goto L_0x02d6;
    L_0x02d1:
        r9 = r8.a(r6);	 Catch:{ IOException -> 0x0228 }
        goto L_0x02dc;
    L_0x02d6:
        r8 = r0.b;	 Catch:{ IOException -> 0x0228 }
        r9 = r8.a(r6);	 Catch:{ IOException -> 0x0228 }
    L_0x02dc:
        if (r9 != 0) goto L_0x02df;
    L_0x02de:
        goto L_0x02f4;
    L_0x02df:
        r1 = r9.a;
        r6 = r9.c;
        r5.b = r6;
        if (r10 == 0) goto L_0x02e8;
    L_0x02e7:
        goto L_0x02f4;
    L_0x02e8:
        r6 = r0.p;
        r8 = r9.b;
        r6.set(r8);
        r6 = r9.b;
        r5.a(r6);
    L_0x02f4:
        r5 = r0.a;
        r5 = r5.c;
        if (r5 == 0) goto L_0x0330;
    L_0x02fa:
        r5 = r0.c;
        r5 = r5.a();
        if (r5 != 0) goto L_0x0330;
    L_0x0302:
        r5 = r0.c;
        r5 = r5.g();
        if (r5 != 0) goto L_0x0330;
    L_0x030a:
        r5 = r0.a;
        r5 = r5.e();
        if (r5 == 0) goto L_0x0320;
    L_0x0312:
        r5 = r0.a;
        r5 = r5.e();
        r27.c(r28);
        r1 = r5.a(r1);
        goto L_0x0330;
    L_0x0320:
        r5 = r27.c(r28);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6.addAll(r5);
        r6.addAll(r1);
        r1 = r6;
    L_0x0330:
        r5 = r0.a;
        r5 = r5.i();
        if (r5 == 0) goto L_0x0350;
    L_0x0338:
        r5 = r0.a;
        r5 = r5.h();
        if (r5 == 0) goto L_0x0350;
    L_0x0340:
        r5 = r0.a;
        r5 = r5.h();
        r6 = r0.a;
        r6 = r6.g();
        r1 = r5.a(r7, r1, r6);
    L_0x0350:
        r4 = r28.isEmpty();
        if (r4 == 0) goto L_0x0367;
    L_0x0356:
        r4 = r0.a;
        r4 = r4.d();
        if (r4 == 0) goto L_0x0367;
    L_0x035e:
        r4 = r0.i;
        r5 = r1.size();
        r4.set(r5);
    L_0x0367:
        r4 = r0.a;
        r4 = r4.i();
        if (r4 == 0) goto L_0x0386;
    L_0x036f:
        r4 = r7.isEmpty();
        if (r4 == 0) goto L_0x0376;
    L_0x0375:
        goto L_0x0386;
    L_0x0376:
        if (r2 < 0) goto L_0x0386;
    L_0x0378:
        r4 = r1.size();
        if (r4 < r2) goto L_0x0386;
    L_0x037e:
        r4 = 0;
        r1 = r1.subList(r4, r2);
        r3.c = r1;
        return r3;
    L_0x0386:
        r3.c = r1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abol.a(java.lang.String, boolean, int, java.lang.String, boolean, java.lang.String, long):aboc");
    }

    /* JADX WARNING: Missing block: B:12:0x0062, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x006d }
        r0 = r0.d();	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x006b;
    L_0x0009:
        r0 = new abod;	 Catch:{ all -> 0x006d }
        r0.<init>();	 Catch:{ all -> 0x006d }
        r1 = r3.a;	 Catch:{ all -> 0x006d }
        r1 = r1.a();	 Catch:{ all -> 0x006d }
        r0.a = r1;	 Catch:{ all -> 0x006d }
        r1 = r3.l;	 Catch:{ all -> 0x006d }
        r1 = r1.b();	 Catch:{ all -> 0x006d }
        r0.b = r1;	 Catch:{ all -> 0x006d }
        r1 = r3.l;	 Catch:{ all -> 0x006d }
        r1 = r1.a();	 Catch:{ all -> 0x006d }
        r0.c = r1;	 Catch:{ all -> 0x006d }
        r1 = r3.a;	 Catch:{ all -> 0x006d }
        r1 = r1.c();	 Catch:{ all -> 0x006d }
        r0.g = r1;	 Catch:{ all -> 0x006d }
        r1 = "";
        r0.d = r1;	 Catch:{ all -> 0x006d }
        r0.a();	 Catch:{ all -> 0x006d }
        r1 = r3.a;	 Catch:{ all -> 0x006d }
        r1 = r1.f();	 Catch:{ all -> 0x006d }
        r0.n = r1;	 Catch:{ all -> 0x006d }
        r1 = r3.a;	 Catch:{ all -> 0x006d }
        r1 = r1.b;	 Catch:{ all -> 0x006d }
        if (r1 == 0) goto L_0x004e;
    L_0x0043:
        r1 = r3.b();	 Catch:{ all -> 0x006d }
        r2 = r3.c();	 Catch:{ all -> 0x006d }
        r0.a(r1, r2);	 Catch:{ all -> 0x006d }
    L_0x004e:
        r1 = r3.b;	 Catch:{ IOException -> 0x0063 }
        r2 = r1.b;	 Catch:{ IOException -> 0x0063 }
        if (r2 == 0) goto L_0x0061;
    L_0x0054:
        defpackage.amqw.a(r0);	 Catch:{ IOException -> 0x0063 }
        r2 = "";
        r0.d = r2;	 Catch:{ IOException -> 0x0063 }
        r0.a();	 Catch:{ IOException -> 0x0063 }
        r1.a(r0);	 Catch:{ IOException -> 0x0063 }
    L_0x0061:
        monitor-exit(r3);
        return;
    L_0x0063:
        r0 = move-exception;
        r1 = "Could not background-update zero-prefix cache.";
        defpackage.xtl.b(r1, r0);	 Catch:{ all -> 0x006d }
        monitor-exit(r3);
        return;
    L_0x006b:
        monitor-exit(r3);
        return;
    L_0x006d:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abol.a():void");
    }

    private final List c(String str) {
        ArrayList arrayList = new ArrayList();
        abmw abmw = this.g;
        SQLiteDatabase readableDatabase = abmw.a.getReadableDatabase();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 2);
        String str2 = "%";
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        str = stringBuilder.toString();
        Cursor query = readableDatabase.query("suggestions", abmw.b, "suggest_intent_query LIKE ?", new String[]{str}, null, null, "date DESC");
        try {
            if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("suggest_intent_query");
                do {
                    arrayList.add(new abnv(query.getString(columnIndex), abnv.i));
                } while (query.moveToNext());
            }
            query.close();
            return arrayList;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final String b() {
        afpz b = this.k.b((ust) this.c.c());
        return !b.a() ? "" : b.c();
    }

    public final String c() {
        afpt c = this.c.c();
        return (c == null || !c.g()) ? null : c.c();
    }
}
