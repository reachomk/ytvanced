package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: agug */
public class agug implements aguh {
    private final aguk a;
    private final aguw b;
    private final xsc c;
    private final SharedPreferences d;
    private final zzl e;
    private final agej f;
    private final xci g;

    public agug(aguk aguk, aguw aguw, xsc xsc, SharedPreferences sharedPreferences, zzl zzl, agej agej, xci xci) {
        this.a = aguk;
        this.b = aguw;
        this.c = xsc;
        this.d = sharedPreferences;
        this.e = zzl;
        this.f = agej;
        this.g = xci;
    }

    /* Access modifiers changed, original: protected */
    public agva a(agva agva) {
        return agva;
    }

    public final synchronized int a(String str, agvz agvz) {
        xak.b();
        a(str);
        this.d.edit().remove(xuq.a("offline_refresh_video_ids_%s", str)).apply();
        this.a.a();
        Set hashSet = new HashSet();
        for (agqy agqy : agvz.k().a()) {
            if (agqy.y()) {
                hashSet.add(agqy.a());
            }
        }
        if (hashSet.isEmpty()) {
            a();
            return 0;
        }
        a(str, hashSet);
        this.a.c(str);
        return 0;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: EliminatePhiNodes
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1009)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:963)
        	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMerge(EliminatePhiNodes.java:114)
        	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMergeInstructions(EliminatePhiNodes.java:68)
        	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.visit(EliminatePhiNodes.java:31)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized int b(java.lang.String r30, defpackage.agvz r31) {
        /*
        r29 = this;
        r8 = r29;
        r0 = r30;
        monitor-enter(r29);
        defpackage.xak.b();	 Catch:{ all -> 0x03b3 }
        r1 = r8.d;	 Catch:{ all -> 0x03b3 }
        r2 = "offline_refresh_video_ids_%s";	 Catch:{ all -> 0x03b3 }
        r2 = defpackage.xuq.a(r2, r0);	 Catch:{ all -> 0x03b3 }
        r3 = new java.util.HashSet;	 Catch:{ all -> 0x03b3 }
        r3.<init>();	 Catch:{ all -> 0x03b3 }
        r1 = r1.getStringSet(r2, r3);	 Catch:{ all -> 0x03b3 }
        r2 = r8.d;	 Catch:{ all -> 0x03b3 }
        r3 = "offline_refresh_continuation_token_%s";	 Catch:{ all -> 0x03b3 }
        r3 = defpackage.xuq.a(r3, r0);	 Catch:{ all -> 0x03b3 }
        r7 = 0;	 Catch:{ all -> 0x03b3 }
        r2 = r2.getString(r3, r7);	 Catch:{ all -> 0x03b3 }
        r3 = r8.d;	 Catch:{ all -> 0x03b3 }
        r4 = "offline_refresh_continuation_expiration_%s";	 Catch:{ all -> 0x03b3 }
        r4 = defpackage.xuq.a(r4, r0);	 Catch:{ all -> 0x03b3 }
        r5 = -1;	 Catch:{ all -> 0x03b3 }
        r3 = r3.getLong(r4, r5);	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        if (r2 == 0) goto L_0x0042;	 Catch:{ all -> 0x03b3 }
    L_0x0038:
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));	 Catch:{ all -> 0x03b3 }
        if (r5 <= 0) goto L_0x0042;	 Catch:{ all -> 0x03b3 }
    L_0x003c:
        r5 = new aguf;	 Catch:{ all -> 0x03b3 }
        r5.<init>(r2, r3);	 Catch:{ all -> 0x03b3 }
        goto L_0x0043;	 Catch:{ all -> 0x03b3 }
    L_0x0042:
        r5 = r7;	 Catch:{ all -> 0x03b3 }
    L_0x0043:
        r2 = new android.util.Pair;	 Catch:{ all -> 0x03b3 }
        r2.<init>(r1, r5);	 Catch:{ all -> 0x03b3 }
        r1 = r2.first;	 Catch:{ all -> 0x03b3 }
        r11 = r1;	 Catch:{ all -> 0x03b3 }
        r11 = (java.util.Set) r11;	 Catch:{ all -> 0x03b3 }
        r1 = r2.second;	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.aguf) r1;	 Catch:{ all -> 0x03b3 }
        r2 = r11.isEmpty();	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        if (r2 != 0) goto L_0x0059;	 Catch:{ all -> 0x03b3 }
    L_0x0058:
        goto L_0x0060;	 Catch:{ all -> 0x03b3 }
    L_0x0059:
        if (r1 != 0) goto L_0x0060;	 Catch:{ all -> 0x03b3 }
    L_0x005b:
        r29.a();	 Catch:{ all -> 0x03b3 }
        monitor-exit(r29);
        return r12;
    L_0x0060:
        r2 = r8.c;	 Catch:{ all -> 0x03b3 }
        r13 = r2.a();	 Catch:{ all -> 0x03b3 }
        r15 = 1;	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x006a;	 Catch:{ all -> 0x03b3 }
    L_0x0069:
        goto L_0x0092;	 Catch:{ all -> 0x03b3 }
    L_0x006a:
        r2 = r1.b;	 Catch:{ all -> 0x03b3 }
        r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1));	 Catch:{ all -> 0x03b3 }
        if (r4 > 0) goto L_0x0083;	 Catch:{ all -> 0x03b3 }
    L_0x0070:
        r4 = r1.a;	 Catch:{ all -> 0x03b3 }
        r1 = r29;	 Catch:{ all -> 0x03b3 }
        r2 = r30;	 Catch:{ all -> 0x03b3 }
        r3 = r31;	 Catch:{ all -> 0x03b3 }
        r5 = r13;	 Catch:{ all -> 0x03b3 }
        r1 = r1.a(r2, r3, r4, r5);	 Catch:{ all -> 0x03b3 }
        if (r1 == 0) goto L_0x0081;
    L_0x007f:
        if (r1 != r15) goto L_0x0092;
    L_0x0081:
        monitor-exit(r29);
        return r1;
    L_0x0083:
        r1 = r8.f;	 Catch:{ all -> 0x03b3 }
        r1 = r1.b();	 Catch:{ all -> 0x03b3 }
        if (r1 == 0) goto L_0x0092;	 Catch:{ all -> 0x03b3 }
    L_0x008b:
        r1 = r8.a;	 Catch:{ all -> 0x03b3 }
        r1.a(r0);	 Catch:{ all -> 0x03b3 }
        monitor-exit(r29);
        return r12;
    L_0x0092:
        r1 = r11.isEmpty();	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x03a0;	 Catch:{ all -> 0x03b3 }
    L_0x0098:
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x03b3 }
        r1.<init>();	 Catch:{ all -> 0x03b3 }
        r6 = new java.util.HashSet;	 Catch:{ all -> 0x03b3 }
        r6.<init>();	 Catch:{ all -> 0x03b3 }
        r2 = r8.e;	 Catch:{ all -> 0x03b3 }
        r2 = r2.b();	 Catch:{ all -> 0x03b3 }
        r2 = r2.h;	 Catch:{ all -> 0x03b3 }
        if (r2 != 0) goto L_0x00ae;	 Catch:{ all -> 0x03b3 }
    L_0x00ac:
        r2 = defpackage.avoa.w;	 Catch:{ all -> 0x03b3 }
    L_0x00ae:
        r3 = r2.f;	 Catch:{ all -> 0x03b3 }
        if (r3 > 0) goto L_0x00b3;	 Catch:{ all -> 0x03b3 }
    L_0x00b2:
        goto L_0x00d8;	 Catch:{ all -> 0x03b3 }
    L_0x00b3:
        r4 = r11.size();	 Catch:{ all -> 0x03b3 }
        if (r3 >= r4) goto L_0x00d8;	 Catch:{ all -> 0x03b3 }
    L_0x00b9:
        r3 = r11.iterator();	 Catch:{ all -> 0x03b3 }
        r4 = 0;	 Catch:{ all -> 0x03b3 }
    L_0x00be:
        r5 = r3.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r5 == 0) goto L_0x00db;	 Catch:{ all -> 0x03b3 }
    L_0x00c4:
        r5 = r3.next();	 Catch:{ all -> 0x03b3 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x03b3 }
        r11 = r2.f;	 Catch:{ all -> 0x03b3 }
        if (r4 < r11) goto L_0x00d2;	 Catch:{ all -> 0x03b3 }
    L_0x00ce:
        r6.add(r5);	 Catch:{ all -> 0x03b3 }
        goto L_0x00d5;	 Catch:{ all -> 0x03b3 }
    L_0x00d2:
        r1.add(r5);	 Catch:{ all -> 0x03b3 }
    L_0x00d5:
        r4 = r4 + 1;	 Catch:{ all -> 0x03b3 }
        goto L_0x00be;	 Catch:{ all -> 0x03b3 }
    L_0x00d8:
        r1.addAll(r11);	 Catch:{ all -> 0x03b3 }
    L_0x00db:
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x03b3 }
        r2.<init>();	 Catch:{ all -> 0x03b3 }
        r3 = r31.m();	 Catch:{ all -> 0x03b3 }
        r3 = r3.a();	 Catch:{ all -> 0x03b3 }
        r1 = r1.iterator();	 Catch:{ all -> 0x03b3 }
    L_0x00ec:
        r4 = r1.hasNext();	 Catch:{ all -> 0x03b3 }
        if (r4 == 0) goto L_0x030e;	 Catch:{ all -> 0x03b3 }
    L_0x00f2:
        r4 = r1.next();	 Catch:{ all -> 0x03b3 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x03b3 }
        r11 = r31.k();	 Catch:{ all -> 0x03b3 }
        r11 = r11.a(r4);	 Catch:{ all -> 0x03b3 }
        if (r11 == 0) goto L_0x02e9;	 Catch:{ all -> 0x03b3 }
    L_0x0102:
        r16 = r11.y();	 Catch:{ all -> 0x03b3 }
        if (r16 != 0) goto L_0x010a;	 Catch:{ all -> 0x03b3 }
    L_0x0108:
        goto L_0x02e9;	 Catch:{ all -> 0x03b3 }
    L_0x010a:
        r7 = r11.j;	 Catch:{ all -> 0x03b3 }
        r17 = r6;	 Catch:{ all -> 0x03b3 }
        r5 = r7.c;	 Catch:{ all -> 0x03b3 }
        r9 = r11.g;	 Catch:{ all -> 0x03b3 }
        r11 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x03b3 }
        r5 = r13 - r5;	 Catch:{ all -> 0x03b3 }
        r5 = r11.toSeconds(r5);	 Catch:{ all -> 0x03b3 }
        r5 = defpackage.agug.a(r5);	 Catch:{ all -> 0x03b3 }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x03b3 }
        r9 = r13 - r9;	 Catch:{ all -> 0x03b3 }
        r9 = r6.toSeconds(r9);	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.agug.a(r9);	 Catch:{ all -> 0x03b3 }
        r9 = r31.h();	 Catch:{ all -> 0x03b3 }
        defpackage.xvd.a(r4);	 Catch:{ all -> 0x03b3 }
        r9 = r9.c;	 Catch:{ all -> 0x03b3 }
        r9 = r9.a;	 Catch:{ all -> 0x03b3 }
        r20 = r9.a();	 Catch:{ all -> 0x03b3 }
        r9 = new java.lang.String[r15];	 Catch:{ all -> 0x03b3 }
        r10 = "metadata_timestamp";	 Catch:{ all -> 0x03b3 }
        r9[r12] = r10;	 Catch:{ all -> 0x03b3 }
        r10 = new java.lang.String[r15];	 Catch:{ all -> 0x03b3 }
        r10[r12] = r4;	 Catch:{ all -> 0x03b3 }
        r21 = "videosV2";	 Catch:{ all -> 0x03b3 }
        r23 = "id = ?";	 Catch:{ all -> 0x03b3 }
        r25 = 0;	 Catch:{ all -> 0x03b3 }
        r26 = 0;	 Catch:{ all -> 0x03b3 }
        r27 = 0;	 Catch:{ all -> 0x03b3 }
        r28 = 0;	 Catch:{ all -> 0x03b3 }
        r22 = r9;	 Catch:{ all -> 0x03b3 }
        r24 = r10;	 Catch:{ all -> 0x03b3 }
        r9 = r20.query(r21, r22, r23, r24, r25, r26, r27, r28);	 Catch:{ all -> 0x03b3 }
        r10 = r9.moveToNext();	 Catch:{ all -> 0x02e4 }
        if (r10 == 0) goto L_0x0165;	 Catch:{ all -> 0x02e4 }
    L_0x015d:
        r10 = r9.getLong(r12);	 Catch:{ all -> 0x02e4 }
        r9.close();	 Catch:{ all -> 0x03b3 }
        goto L_0x016a;	 Catch:{ all -> 0x03b3 }
    L_0x0165:
        r9.close();	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
    L_0x016a:
        r18 = 0;	 Catch:{ all -> 0x03b3 }
        r9 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1));	 Catch:{ all -> 0x03b3 }
        if (r9 <= 0) goto L_0x017d;	 Catch:{ all -> 0x03b3 }
    L_0x0170:
        r9 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x03b3 }
        r10 = r13 - r10;	 Catch:{ all -> 0x03b3 }
        r9 = r9.toSeconds(r10);	 Catch:{ all -> 0x03b3 }
        r9 = defpackage.agug.a(r9);	 Catch:{ all -> 0x03b3 }
        goto L_0x017e;	 Catch:{ all -> 0x03b3 }
    L_0x017d:
        r9 = 0;	 Catch:{ all -> 0x03b3 }
    L_0x017e:
        r10 = r31.h();	 Catch:{ all -> 0x03b3 }
        defpackage.xvd.a(r4);	 Catch:{ all -> 0x03b3 }
        r10 = r10.c;	 Catch:{ all -> 0x03b3 }
        r10 = r10.a;	 Catch:{ all -> 0x03b3 }
        r20 = r10.a();	 Catch:{ all -> 0x03b3 }
        r10 = new java.lang.String[r15];	 Catch:{ all -> 0x03b3 }
        r11 = "streams_timestamp";	 Catch:{ all -> 0x03b3 }
        r10[r12] = r11;	 Catch:{ all -> 0x03b3 }
        r11 = new java.lang.String[r15];	 Catch:{ all -> 0x03b3 }
        r11[r12] = r4;	 Catch:{ all -> 0x03b3 }
        r21 = "videosV2";	 Catch:{ all -> 0x03b3 }
        r23 = "id = ?";	 Catch:{ all -> 0x03b3 }
        r25 = 0;	 Catch:{ all -> 0x03b3 }
        r26 = 0;	 Catch:{ all -> 0x03b3 }
        r27 = 0;	 Catch:{ all -> 0x03b3 }
        r28 = 0;	 Catch:{ all -> 0x03b3 }
        r22 = r10;	 Catch:{ all -> 0x03b3 }
        r24 = r11;	 Catch:{ all -> 0x03b3 }
        r10 = r20.query(r21, r22, r23, r24, r25, r26, r27, r28);	 Catch:{ all -> 0x03b3 }
        r11 = r10.moveToNext();	 Catch:{ all -> 0x02df }
        if (r11 == 0) goto L_0x01bd;	 Catch:{ all -> 0x02df }
    L_0x01b1:
        r20 = r10.getLong(r12);	 Catch:{ all -> 0x02df }
        r10.close();	 Catch:{ all -> 0x03b3 }
        r18 = r20;	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        goto L_0x01c4;	 Catch:{ all -> 0x03b3 }
    L_0x01bd:
        r10.close();	 Catch:{ all -> 0x03b3 }
        r10 = 0;	 Catch:{ all -> 0x03b3 }
        r18 = 0;	 Catch:{ all -> 0x03b3 }
    L_0x01c4:
        r20 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1));	 Catch:{ all -> 0x03b3 }
        if (r20 > 0) goto L_0x01cb;	 Catch:{ all -> 0x03b3 }
    L_0x01c8:
        r11 = r1;	 Catch:{ all -> 0x03b3 }
        r0 = 0;	 Catch:{ all -> 0x03b3 }
        goto L_0x01d8;	 Catch:{ all -> 0x03b3 }
    L_0x01cb:
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x03b3 }
        r11 = r1;	 Catch:{ all -> 0x03b3 }
        r0 = r13 - r18;	 Catch:{ all -> 0x03b3 }
        r0 = r10.toSeconds(r0);	 Catch:{ all -> 0x03b3 }
        r0 = defpackage.agug.a(r0);	 Catch:{ all -> 0x03b3 }
    L_0x01d8:
        r1 = java.util.Locale.US;	 Catch:{ all -> 0x03b3 }
        r10 = 3;	 Catch:{ all -> 0x03b3 }
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x03b3 }
        r10[r12] = r4;	 Catch:{ all -> 0x03b3 }
        r19 = r11;	 Catch:{ all -> 0x03b3 }
        r11 = r7.d;	 Catch:{ all -> 0x03b3 }
        r11 = r13 - r11;	 Catch:{ all -> 0x03b3 }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x03b3 }
        r10[r15] = r11;	 Catch:{ all -> 0x03b3 }
        r11 = r7.f();	 Catch:{ all -> 0x03b3 }
        r11 = r11 - r13;	 Catch:{ all -> 0x03b3 }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x03b3 }
        r12 = 2;	 Catch:{ all -> 0x03b3 }
        r10[r12] = r11;	 Catch:{ all -> 0x03b3 }
        r11 = "Refreshing video %s: Time since last refreshed: %d. Time to expire: %d";	 Catch:{ all -> 0x03b3 }
        java.lang.String.format(r1, r11, r10);	 Catch:{ all -> 0x03b3 }
        r1 = defpackage.atcm.h;	 Catch:{ all -> 0x03b3 }
        r1 = r1.createBuilder();	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.atcl) r1;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r10 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r10 = (defpackage.atcm) r10;	 Catch:{ all -> 0x03b3 }
        if (r4 == 0) goto L_0x02d9;	 Catch:{ all -> 0x03b3 }
    L_0x020d:
        r11 = r10.a;	 Catch:{ all -> 0x03b3 }
        r11 = r11 | r15;	 Catch:{ all -> 0x03b3 }
        r10.a = r11;	 Catch:{ all -> 0x03b3 }
        r10.b = r4;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r10 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r10 = (defpackage.atcm) r10;	 Catch:{ all -> 0x03b3 }
        r11 = r10.a;	 Catch:{ all -> 0x03b3 }
        r12 = 2;	 Catch:{ all -> 0x03b3 }
        r11 = r11 | r12;	 Catch:{ all -> 0x03b3 }
        r10.a = r11;	 Catch:{ all -> 0x03b3 }
        r10.c = r5;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r5 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r5 = (defpackage.atcm) r5;	 Catch:{ all -> 0x03b3 }
        r10 = r5.a;	 Catch:{ all -> 0x03b3 }
        r10 = r10 | 4;	 Catch:{ all -> 0x03b3 }
        r5.a = r10;	 Catch:{ all -> 0x03b3 }
        r5.d = r6;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r5 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r5 = (defpackage.atcm) r5;	 Catch:{ all -> 0x03b3 }
        r6 = r5.a;	 Catch:{ all -> 0x03b3 }
        r6 = r6 | 8;	 Catch:{ all -> 0x03b3 }
        r5.a = r6;	 Catch:{ all -> 0x03b3 }
        r5.f = r9;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r5 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r5 = (defpackage.atcm) r5;	 Catch:{ all -> 0x03b3 }
        r6 = r5.a;	 Catch:{ all -> 0x03b3 }
        r6 = r6 | 16;	 Catch:{ all -> 0x03b3 }
        r5.a = r6;	 Catch:{ all -> 0x03b3 }
        r5.g = r0;	 Catch:{ all -> 0x03b3 }
        r0 = r3.containsKey(r4);	 Catch:{ all -> 0x03b3 }
        if (r0 == 0) goto L_0x0278;	 Catch:{ all -> 0x03b3 }
    L_0x0256:
        r0 = r3.get(r4);	 Catch:{ all -> 0x03b3 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x03b3 }
        r1.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r4 = r1.instance;	 Catch:{ all -> 0x03b3 }
        r4 = (defpackage.atcm) r4;	 Catch:{ all -> 0x03b3 }
        r5 = r4.e;	 Catch:{ all -> 0x03b3 }
        r5 = r5.a();	 Catch:{ all -> 0x03b3 }
        if (r5 != 0) goto L_0x0273;	 Catch:{ all -> 0x03b3 }
    L_0x026b:
        r5 = r4.e;	 Catch:{ all -> 0x03b3 }
        r5 = defpackage.anxl.mutableCopy(r5);	 Catch:{ all -> 0x03b3 }
        r4.e = r5;	 Catch:{ all -> 0x03b3 }
    L_0x0273:
        r4 = r4.e;	 Catch:{ all -> 0x03b3 }
        defpackage.anvf.addAll(r0, r4);	 Catch:{ all -> 0x03b3 }
    L_0x0278:
        r0 = r7.e();	 Catch:{ all -> 0x03b3 }
        r4 = r2.containsKey(r0);	 Catch:{ all -> 0x03b3 }
        if (r4 == 0) goto L_0x0291;	 Catch:{ all -> 0x03b3 }
    L_0x0282:
        r4 = r2.get(r0);	 Catch:{ all -> 0x03b3 }
        r4 = (defpackage.atcu) r4;	 Catch:{ all -> 0x03b3 }
        r4 = r4.toBuilder();	 Catch:{ all -> 0x03b3 }
        r4 = (defpackage.anxo) r4;	 Catch:{ all -> 0x03b3 }
        r4 = (defpackage.atct) r4;	 Catch:{ all -> 0x03b3 }
        goto L_0x02a9;	 Catch:{ all -> 0x03b3 }
    L_0x0291:
        r4 = defpackage.atcu.d;	 Catch:{ all -> 0x03b3 }
        r4 = r4.createBuilder();	 Catch:{ all -> 0x03b3 }
        r4 = (defpackage.atct) r4;	 Catch:{ all -> 0x03b3 }
        if (r0 == 0) goto L_0x02a9;	 Catch:{ all -> 0x03b3 }
    L_0x029b:
        r4.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r5 = r4.instance;	 Catch:{ all -> 0x03b3 }
        r5 = (defpackage.atcu) r5;	 Catch:{ all -> 0x03b3 }
        r6 = r5.a;	 Catch:{ all -> 0x03b3 }
        r6 = r6 | r15;	 Catch:{ all -> 0x03b3 }
        r5.a = r6;	 Catch:{ all -> 0x03b3 }
        r5.b = r0;	 Catch:{ all -> 0x03b3 }
    L_0x02a9:
        r4.copyOnWrite();	 Catch:{ all -> 0x03b3 }
        r5 = r4.instance;	 Catch:{ all -> 0x03b3 }
        r5 = (defpackage.atcu) r5;	 Catch:{ all -> 0x03b3 }
        r6 = r5.c;	 Catch:{ all -> 0x03b3 }
        r6 = r6.a();	 Catch:{ all -> 0x03b3 }
        if (r6 != 0) goto L_0x02c0;	 Catch:{ all -> 0x03b3 }
    L_0x02b8:
        r6 = r5.c;	 Catch:{ all -> 0x03b3 }
        r6 = defpackage.anxl.mutableCopy(r6);	 Catch:{ all -> 0x03b3 }
        r5.c = r6;	 Catch:{ all -> 0x03b3 }
    L_0x02c0:
        r5 = r5.c;	 Catch:{ all -> 0x03b3 }
        r1 = r1.build();	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.anxl) r1;	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.atcm) r1;	 Catch:{ all -> 0x03b3 }
        r5.add(r1);	 Catch:{ all -> 0x03b3 }
        r1 = r4.build();	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.anxl) r1;	 Catch:{ all -> 0x03b3 }
        r1 = (defpackage.atcu) r1;	 Catch:{ all -> 0x03b3 }
        r2.put(r0, r1);	 Catch:{ all -> 0x03b3 }
        goto L_0x0302;	 Catch:{ all -> 0x03b3 }
    L_0x02d9:
        r0 = new java.lang.NullPointerException;	 Catch:{ all -> 0x03b3 }
        r0.<init>();	 Catch:{ all -> 0x03b3 }
        throw r0;	 Catch:{ all -> 0x03b3 }
    L_0x02df:
        r0 = move-exception;	 Catch:{ all -> 0x03b3 }
        r10.close();	 Catch:{ all -> 0x03b3 }
        throw r0;	 Catch:{ all -> 0x03b3 }
    L_0x02e4:
        r0 = move-exception;	 Catch:{ all -> 0x03b3 }
        r9.close();	 Catch:{ all -> 0x03b3 }
        throw r0;	 Catch:{ all -> 0x03b3 }
    L_0x02e9:
        r19 = r1;	 Catch:{ all -> 0x03b3 }
        r17 = r6;	 Catch:{ all -> 0x03b3 }
        r0 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x03b3 }
        r1 = "Skipping missing or unrefreshable video: ";	 Catch:{ all -> 0x03b3 }
        r4 = r0.length();	 Catch:{ all -> 0x03b3 }
        if (r4 != 0) goto L_0x02ff;	 Catch:{ all -> 0x03b3 }
    L_0x02f9:
        r0 = new java.lang.String;	 Catch:{ all -> 0x03b3 }
        r0.<init>(r1);	 Catch:{ all -> 0x03b3 }
        goto L_0x0302;	 Catch:{ all -> 0x03b3 }
    L_0x02ff:
        r1.concat(r0);	 Catch:{ all -> 0x03b3 }
    L_0x0302:
        r0 = r30;	 Catch:{ all -> 0x03b3 }
        r6 = r17;	 Catch:{ all -> 0x03b3 }
        r1 = r19;	 Catch:{ all -> 0x03b3 }
        r7 = 0;	 Catch:{ all -> 0x03b3 }
        r9 = 0;	 Catch:{ all -> 0x03b3 }
        r12 = 0;	 Catch:{ all -> 0x03b3 }
        goto L_0x00ec;	 Catch:{ all -> 0x03b3 }
    L_0x030e:
        r17 = r6;	 Catch:{ all -> 0x03b3 }
        r0 = r2.values();	 Catch:{ all -> 0x03b3 }
        r1 = r0.isEmpty();	 Catch:{ all -> 0x03b3 }
        if (r1 == 0) goto L_0x0320;
    L_0x031a:
        r0 = r30;
        r9 = r17;
        r1 = 0;
        goto L_0x0364;
    L_0x0320:
        defpackage.xak.b();	 Catch:{ aanq -> 0x0394 }
        r1 = r8.b;	 Catch:{ aanq -> 0x0394 }
        r1 = r1.a();	 Catch:{ aanq -> 0x0394 }
        r8.a(r1);	 Catch:{ aanq -> 0x0394 }
        defpackage.amqw.a(r0);	 Catch:{ aanq -> 0x0394 }
        r1.a = r0;	 Catch:{ aanq -> 0x0394 }
        r0 = r8.b;	 Catch:{ aanq -> 0x0394 }
        r0 = r0.a(r1);	 Catch:{ aanq -> 0x0394 }
        r1 = r0.c;	 Catch:{ aanq -> 0x0394 }
        r1.size();	 Catch:{ aanq -> 0x0394 }
        r1 = r0.a;	 Catch:{ aanq -> 0x0394 }
        r2 = 2;	 Catch:{ aanq -> 0x0394 }
        r1 = r1 & r2;	 Catch:{ aanq -> 0x0394 }
        if (r1 == 0) goto L_0x0349;	 Catch:{ aanq -> 0x0394 }
    L_0x0342:
        r7 = r0.d;	 Catch:{ aanq -> 0x0394 }
        if (r7 != 0) goto L_0x034a;	 Catch:{ aanq -> 0x0394 }
    L_0x0346:
        r7 = defpackage.atck.c;	 Catch:{ aanq -> 0x0394 }
        goto L_0x034a;	 Catch:{ aanq -> 0x0394 }
    L_0x0349:
        r7 = 0;	 Catch:{ aanq -> 0x0394 }
    L_0x034a:
        r1 = java.lang.String.valueOf(r7);	 Catch:{ aanq -> 0x0394 }
        r1.length();	 Catch:{ aanq -> 0x0394 }
        r4 = r0.c;	 Catch:{ aanq -> 0x0394 }
        r5 = r0.e;	 Catch:{ aanq -> 0x0394 }
        r1 = r29;	 Catch:{ aanq -> 0x0394 }
        r2 = r30;	 Catch:{ aanq -> 0x0394 }
        r3 = r31;	 Catch:{ aanq -> 0x0394 }
        r9 = r17;	 Catch:{ aanq -> 0x0394 }
        r6 = r13;	 Catch:{ aanq -> 0x0394 }
        r1.a(r2, r3, r4, r5, r6);	 Catch:{ aanq -> 0x0394 }
        r1 = r0;
        r0 = r30;
    L_0x0364:
        r8.a(r0, r9);	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x036a;	 Catch:{ all -> 0x03b3 }
    L_0x0369:
        goto L_0x03a1;	 Catch:{ all -> 0x03b3 }
    L_0x036a:
        r2 = r1.d;	 Catch:{ all -> 0x03b3 }
        if (r2 != 0) goto L_0x0370;	 Catch:{ all -> 0x03b3 }
    L_0x036e:
        r2 = defpackage.atck.c;	 Catch:{ all -> 0x03b3 }
    L_0x0370:
        r2 = r2.a;	 Catch:{ all -> 0x03b3 }
        r2 = r2 & r15;	 Catch:{ all -> 0x03b3 }
        if (r2 == 0) goto L_0x03a1;	 Catch:{ all -> 0x03b3 }
    L_0x0375:
        r1 = r1.d;	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x037b;	 Catch:{ all -> 0x03b3 }
    L_0x0379:
        r1 = defpackage.atck.c;	 Catch:{ all -> 0x03b3 }
    L_0x037b:
        r1 = r1.b;	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x0381;	 Catch:{ all -> 0x03b3 }
    L_0x037f:
        r1 = defpackage.avpd.e;	 Catch:{ all -> 0x03b3 }
    L_0x0381:
        r4 = r1;	 Catch:{ all -> 0x03b3 }
        r1 = r29;	 Catch:{ all -> 0x03b3 }
        r2 = r30;	 Catch:{ all -> 0x03b3 }
        r3 = r31;	 Catch:{ all -> 0x03b3 }
        r5 = r13;	 Catch:{ all -> 0x03b3 }
        r1 = r1.a(r2, r3, r4, r5);	 Catch:{ all -> 0x03b3 }
        if (r1 == 0) goto L_0x0392;
    L_0x038f:
        if (r1 == r15) goto L_0x0392;
    L_0x0391:
        goto L_0x03a1;
    L_0x0392:
        monitor-exit(r29);
        return r1;
    L_0x0394:
        r0 = r8.g;	 Catch:{ all -> 0x03b3 }
        r1 = new aglt;	 Catch:{ all -> 0x03b3 }
        r1.<init>();	 Catch:{ all -> 0x03b3 }
        r0.d(r1);	 Catch:{ all -> 0x03b3 }
        monitor-exit(r29);
        return r15;
    L_0x03a0:
        r9 = r11;
    L_0x03a1:
        r1 = r9.isEmpty();	 Catch:{ all -> 0x03b3 }
        if (r1 != 0) goto L_0x03ad;	 Catch:{ all -> 0x03b3 }
    L_0x03a7:
        r1 = r8.a;	 Catch:{ all -> 0x03b3 }
        r1.c(r0);	 Catch:{ all -> 0x03b3 }
        goto L_0x03b0;	 Catch:{ all -> 0x03b3 }
    L_0x03ad:
        r29.a();	 Catch:{ all -> 0x03b3 }
    L_0x03b0:
        monitor-exit(r29);
        r0 = 0;
        return r0;
    L_0x03b3:
        r0 = move-exception;
        monitor-exit(r29);
        goto L_0x03b7;
    L_0x03b6:
        throw r0;
    L_0x03b7:
        goto L_0x03b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agug.b(java.lang.String, agvz):int");
    }

    private final void a(String str, Set set) {
        this.d.edit().putStringSet(xuq.a("offline_refresh_video_ids_%s", str), set).apply();
    }

    private final void a(String str) {
        this.d.edit().remove(xuq.a("offline_refresh_continuation_token_%s", str)).remove(xuq.a("offline_refresh_continuation_expiration_%s", str)).apply();
    }

    private static int a(long j) {
        return j >= 0 ? Math.max(1, (int) j) : Integer.MAX_VALUE;
    }

    private final int a(String str, agvz agvz, avpd avpd, long j) {
        amqw.a((Object) avpd);
        aguf aguf = new aguf(avpd, j);
        this.d.edit().putString(xuq.a("offline_refresh_continuation_token_%s", str), aguf.a).putLong(xuq.a("offline_refresh_continuation_expiration_%s", str), aguf.b).apply();
        int i = avpd.c;
        if (i > this.f.a()) {
            this.a.b(str, (long) i);
            String.format(Locale.US, "Schedule deferred continuation in %d seconds", new Object[]{Integer.valueOf(i)});
            return 0;
        }
        String.format(Locale.US, "Schedule continuation in %d seconds", new Object[]{Integer.valueOf(i)});
        if (i > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis((long) i));
            } catch (InterruptedException e) {
                xtl.a("Thread.sleep interrupted: ", e);
                return 1;
            }
        }
        return a(str, agvz, avpd.b, j);
    }

    private final int a(String str, agvz agvz, String str2, long j) {
        xvd.a(str2);
        agva a = this.b.a();
        a(a);
        a.b = (String) amqw.a((Object) str2);
        try {
            Object obj;
            atci a2 = this.b.a(a);
            String.format(Locale.US, "Offlined video set update count: %d", new Object[]{Integer.valueOf(a2.c.size())});
            if ((a2.a & 2) != 0) {
                obj = a2.d;
                if (obj == null) {
                    obj = atck.c;
                }
            } else {
                obj = null;
            }
            String.valueOf(obj).length();
            if (a2.c.size() > 0) {
                a(str, agvz, a2.c, a2.e, j);
            }
            atck atck = a2.d;
            if (atck == null) {
                atck = atck.c;
            }
            if ((1 & atck.a) != 0) {
                atck atck2 = a2.d;
                if (atck2 == null) {
                    atck2 = atck.c;
                }
                avpd avpd = atck2.b;
                if (avpd == null) {
                    avpd = avpd.e;
                }
                return a(str, agvz, avpd, j);
            }
            a(str);
            return 2;
        } catch (aanq unused) {
            this.g.d(new aglt());
            return 1;
        }
    }

    private final void a(String str, agvz agvz, List list, int i, long j) {
        int i2 = i;
        xak.b();
        StringBuilder stringBuilder = new StringBuilder();
        for (atcw atcw : list) {
            avqc avqc = atcw.b;
            if (avqc == null) {
                avqc = avqc.j;
            }
            for (atcy atcy : atcw.c) {
                String str2 = atcy.d;
                int a = avqe.a(avqc.e);
                if (a == 0 || a != 2) {
                    a = avqe.a(avqc.e);
                    int i3 = 1;
                    if (a == 0) {
                        a = 1;
                    }
                    a--;
                    if (a == 2) {
                        stringBuilder.append("DELETE");
                    } else if (a == 3) {
                        stringBuilder.append("DISABLE");
                    } else if (a == 4) {
                        stringBuilder.append("REFRESH");
                    } else if (a == 5) {
                        stringBuilder.append("REFRESH_AD");
                    } else if (a != 6) {
                        stringBuilder.append("UNEXPECTED_ACTION_");
                        a = avqe.a(avqc.e);
                        if (a != 0) {
                            i3 = a;
                        }
                        stringBuilder.append(i3 - 1);
                    } else {
                        stringBuilder.append("DELETE_AD");
                    }
                    stringBuilder.append(" video ");
                    stringBuilder.append(str2);
                    stringBuilder.append("\n");
                }
                a(atcy, avqc, agvz, j, agvz.l().a(str2));
            }
        }
        String valueOf = String.valueOf(stringBuilder.toString());
        String str3 = "Offline refresh results: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            str3.concat(valueOf);
        }
        if (i2 > 0) {
            long j2 = (long) i2;
            String str4 = str;
            this.a.a(str, j2);
            return;
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(atcy atcy, avqc avqc, agvz agvz, long j, agqw agqw) {
        if (agqw != null) {
            String str = agqw.a;
            int a = avqe.a(avqc.e);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 1:
                case 3:
                    agug.a(agvz, j, avqc, agqw);
                    break;
                case 2:
                    agvz.k().g(str);
                    return;
                case 4:
                case 5:
                    agvz.l().b(str);
                    return;
                case 6:
                    try {
                        avqb avqb = (avqb) ((anvi) ((avqb) avqc.j.createBuilder()).mergeFrom(avqc.toByteArray(), anxa.c()));
                        avqb.a(2);
                        agug.a(agvz, j, (avqc) ((anxl) avqb.build()), agqw);
                        agvz.m().b(str);
                        return;
                    } catch (anyg unused) {
                        xtl.c("Error parsing the original OfflineStateModel");
                        return;
                    }
            }
        }
    }

    protected static void a(agvz agvz, long j, avqc avqc, agqw agqw) {
        agwi l = agvz.l();
        agqv h = agqw.h();
        h.b = avqc;
        h.d = j;
        if (!l.a((agqw) h.b())) {
            String valueOf = String.valueOf(agqw.a);
            String str = "UpdateVideoPolicy failed for video ";
            xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }

    private final void a() {
        this.g.d(new aglv());
    }
}
