package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: ahaj */
public final class ahaj implements ahai {
    private static final long a = TimeUnit.SECONDS.toMillis(30);
    private final Context b;
    private final zdg c;
    private final agvi d;
    private final xsc e;
    private long f = -1;
    private int g = 0;

    public ahaj(Context context, zdg zdg, agvi agvi, xsc xsc) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (zdg) amqw.a((Object) zdg);
        this.d = (agvi) amqw.a((Object) agvi);
        this.e = (xsc) amqw.a((Object) xsc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa A:{Catch:{ ClassNotFoundException -> 0x0168 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00db A:{Catch:{ ClassNotFoundException -> 0x0168 }} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A:{Catch:{ ClassNotFoundException -> 0x0168 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013e A:{Catch:{ ClassNotFoundException -> 0x0168 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144 A:{Catch:{ ClassNotFoundException -> 0x0168 }} */
    public final synchronized int a() {
        /*
        r12 = this;
        monitor-enter(r12);
        defpackage.xak.b();	 Catch:{ all -> 0x0190 }
        r0 = r12.e;	 Catch:{ all -> 0x0190 }
        r0 = r0.b();	 Catch:{ all -> 0x0190 }
        r2 = r12.f;	 Catch:{ all -> 0x0190 }
        r4 = r0 - r2;
        r6 = -1;
        r8 = 1;
        r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r9 == 0) goto L_0x0023;
    L_0x0015:
        r2 = a;	 Catch:{ all -> 0x0190 }
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 < 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0023;
    L_0x001c:
        r0 = r12.g;	 Catch:{ all -> 0x0190 }
        r0 = r0 + r8;
        r12.g = r0;	 Catch:{ all -> 0x0190 }
        monitor-exit(r12);
        return r8;
    L_0x0023:
        r2 = r12.g;	 Catch:{ all -> 0x0190 }
        r3 = 3;
        r6 = 2;
        r7 = 0;
        if (r2 <= 0) goto L_0x0049;
    L_0x002a:
        r2 = java.util.Locale.US;	 Catch:{ all -> 0x0190 }
        r9 = new java.lang.Object[r3];	 Catch:{ all -> 0x0190 }
        r10 = a;	 Catch:{ all -> 0x0190 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x0190 }
        r9[r7] = r10;	 Catch:{ all -> 0x0190 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0190 }
        r9[r8] = r4;	 Catch:{ all -> 0x0190 }
        r4 = r12.g;	 Catch:{ all -> 0x0190 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0190 }
        r9[r6] = r4;	 Catch:{ all -> 0x0190 }
        r4 = "Requested offline time window within minimum request interval of %dms. Time since last request: %dms. Requests made during this period: %d.";
        java.lang.String.format(r2, r4, r9);	 Catch:{ all -> 0x0190 }
    L_0x0049:
        r12.g = r7;	 Catch:{ all -> 0x0190 }
        r12.f = r0;	 Catch:{ all -> 0x0190 }
        r0 = r12.c;	 Catch:{ all -> 0x0190 }
        r0.a();	 Catch:{ all -> 0x0190 }
        r0 = r12.d;	 Catch:{ all -> 0x0190 }
        r1 = new agvj;	 Catch:{ all -> 0x0190 }
        r2 = r0.c;	 Catch:{ all -> 0x0190 }
        r0 = r0.d;	 Catch:{ all -> 0x0190 }
        r0 = r0.c();	 Catch:{ all -> 0x0190 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0190 }
        r1.g();	 Catch:{ all -> 0x0190 }
        r0 = r12.d;	 Catch:{ aanq -> 0x0170 }
        r0 = r0.a;	 Catch:{ aanq -> 0x0170 }
        r0 = r0.b(r1);	 Catch:{ aanq -> 0x0170 }
        r0 = (defpackage.atba) r0;	 Catch:{ aanq -> 0x0170 }
        if (r0 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0084;
    L_0x0071:
        r1 = r0.a;	 Catch:{ all -> 0x0190 }
        r1 = r1 & r6;
        if (r1 == 0) goto L_0x0084;
    L_0x0076:
        r0 = r0.c;	 Catch:{ all -> 0x0190 }
        if (r0 != 0) goto L_0x007c;
    L_0x007a:
        r0 = defpackage.avqm.c;	 Catch:{ all -> 0x0190 }
    L_0x007c:
        r0 = r0.b;	 Catch:{ all -> 0x0190 }
        if (r0 != 0) goto L_0x0082;
    L_0x0080:
        r0 = defpackage.avqk.g;	 Catch:{ all -> 0x0190 }
    L_0x0082:
        r1 = 0;
        goto L_0x00a6;
    L_0x0084:
        r0 = defpackage.avqk.g;	 Catch:{ all -> 0x0190 }
        r0 = r0.createBuilder();	 Catch:{ all -> 0x0190 }
        r0 = (defpackage.avqj) r0;	 Catch:{ all -> 0x0190 }
        r0.a(r7);	 Catch:{ all -> 0x0190 }
        r1 = 86400; // 0x15180 float:1.21072E-40 double:4.26873E-319;
        r0.a(r1);	 Catch:{ all -> 0x0190 }
        r1 = 0;
        r0.a(r1);	 Catch:{ all -> 0x0190 }
        r0.b(r7);	 Catch:{ all -> 0x0190 }
        r0 = r0.build();	 Catch:{ all -> 0x0190 }
        r0 = (defpackage.anxl) r0;	 Catch:{ all -> 0x0190 }
        r0 = (defpackage.avqk) r0;	 Catch:{ all -> 0x0190 }
        r1 = 1;
    L_0x00a6:
        r2 = r0.e;	 Catch:{ all -> 0x0190 }
        if (r2 != 0) goto L_0x00ac;
    L_0x00aa:
        r2 = defpackage.avqo.c;	 Catch:{ all -> 0x0190 }
    L_0x00ac:
        r2 = r2.a;	 Catch:{ all -> 0x0190 }
        r4 = 0;
        r5 = 135988795; // 0x81b063b float:4.665094E-34 double:6.7187392E-316;
        if (r2 != r5) goto L_0x00db;
    L_0x00b4:
        r2 = r0.e;	 Catch:{ all -> 0x0190 }
        if (r2 != 0) goto L_0x00ba;
    L_0x00b8:
        r2 = defpackage.avqo.c;	 Catch:{ all -> 0x0190 }
    L_0x00ba:
        r4 = r2.a;	 Catch:{ all -> 0x0190 }
        if (r4 != r5) goto L_0x00c3;
    L_0x00be:
        r2 = r2.b;	 Catch:{ all -> 0x0190 }
        r2 = (defpackage.avqi) r2;	 Catch:{ all -> 0x0190 }
        goto L_0x00c5;
    L_0x00c3:
        r2 = defpackage.avqi.d;	 Catch:{ all -> 0x0190 }
    L_0x00c5:
        r4 = r2.b;	 Catch:{ all -> 0x0190 }
        r2 = r0.e;	 Catch:{ all -> 0x0190 }
        if (r2 != 0) goto L_0x00cd;
    L_0x00cb:
        r2 = defpackage.avqo.c;	 Catch:{ all -> 0x0190 }
    L_0x00cd:
        r9 = r2.a;	 Catch:{ all -> 0x0190 }
        if (r9 != r5) goto L_0x00d6;
    L_0x00d1:
        r2 = r2.b;	 Catch:{ all -> 0x0190 }
        r2 = (defpackage.avqi) r2;	 Catch:{ all -> 0x0190 }
        goto L_0x00d8;
    L_0x00d6:
        r2 = defpackage.avqi.d;	 Catch:{ all -> 0x0190 }
    L_0x00d8:
        r2 = r2.c;	 Catch:{ all -> 0x0190 }
        goto L_0x00dc;
    L_0x00db:
        r2 = r4;
    L_0x00dc:
        r9 = java.util.Locale.US;	 Catch:{ all -> 0x0190 }
        r10 = 5;
        r10 = new java.lang.Object[r10];	 Catch:{ all -> 0x0190 }
        r11 = r0.b;	 Catch:{ all -> 0x0190 }
        r11 = java.lang.Boolean.valueOf(r11);	 Catch:{ all -> 0x0190 }
        r10[r7] = r11;	 Catch:{ all -> 0x0190 }
        r7 = r0.c;	 Catch:{ all -> 0x0190 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x0190 }
        r10[r8] = r7;	 Catch:{ all -> 0x0190 }
        r7 = r0.d;	 Catch:{ all -> 0x0190 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0190 }
        r10[r6] = r7;	 Catch:{ all -> 0x0190 }
        r10[r3] = r4;	 Catch:{ all -> 0x0190 }
        r3 = 4;
        r10[r3] = r2;	 Catch:{ all -> 0x0190 }
        r2 = "Received new offline time window: %b; %d; %d; %s - %s";
        r2 = java.lang.String.format(r9, r2, r10);	 Catch:{ all -> 0x0190 }
        defpackage.xtl.e(r2);	 Catch:{ all -> 0x0190 }
        r2 = r12.b;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService";
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3.<init>(r2, r4);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "com.google.android.libraries.youtube.offline.transfer.timewindow.ActionOfflineTimeWindow";
        r3 = r3.setAction(r4);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "canOfflineNow";
        r6 = r0.b;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3 = r3.putExtra(r4, r6);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "timeCapSecs";
        r6 = r0.c;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3 = r3.putExtra(r4, r6);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "sizeCapBytes";
        r6 = r0.d;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3 = r3.putExtra(r4, r6);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = "hasDataRestriction";
        r6 = r0.f;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r3 = r3.putExtra(r4, r6);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = r0.e;	 Catch:{ ClassNotFoundException -> 0x0168 }
        if (r4 != 0) goto L_0x0140;
    L_0x013e:
        r4 = defpackage.avqo.c;	 Catch:{ ClassNotFoundException -> 0x0168 }
    L_0x0140:
        r4 = r4.a;	 Catch:{ ClassNotFoundException -> 0x0168 }
        if (r4 != r5) goto L_0x0164;
    L_0x0144:
        r0 = r0.e;	 Catch:{ ClassNotFoundException -> 0x0168 }
        if (r0 != 0) goto L_0x014a;
    L_0x0148:
        r0 = defpackage.avqo.c;	 Catch:{ ClassNotFoundException -> 0x0168 }
    L_0x014a:
        r4 = r0.a;	 Catch:{ ClassNotFoundException -> 0x0168 }
        if (r4 != r5) goto L_0x0153;
    L_0x014e:
        r0 = r0.b;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r0 = (defpackage.avqi) r0;	 Catch:{ ClassNotFoundException -> 0x0168 }
        goto L_0x0155;
    L_0x0153:
        r0 = defpackage.avqi.d;	 Catch:{ ClassNotFoundException -> 0x0168 }
    L_0x0155:
        r4 = "startTimeWindow";
        r5 = r0.b;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4 = r3.putExtra(r4, r5);	 Catch:{ ClassNotFoundException -> 0x0168 }
        r5 = "endTimeWindow";
        r0 = r0.c;	 Catch:{ ClassNotFoundException -> 0x0168 }
        r4.putExtra(r5, r0);	 Catch:{ ClassNotFoundException -> 0x0168 }
    L_0x0164:
        defpackage.xva.a(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0168 }
        goto L_0x016e;
    L_0x0168:
        r0 = move-exception;
        r2 = "Transfer service class not found";
        defpackage.xtl.a(r2, r0);	 Catch:{ all -> 0x0190 }
    L_0x016e:
        monitor-exit(r12);
        return r1;
    L_0x0170:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ all -> 0x0190 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0190 }
        r2 = "Offline time window service request failed: ";
        r3 = r1.length();	 Catch:{ all -> 0x0190 }
        if (r3 != 0) goto L_0x0187;
    L_0x0181:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0190 }
        r1.<init>(r2);	 Catch:{ all -> 0x0190 }
        goto L_0x018b;
    L_0x0187:
        r1 = r2.concat(r1);	 Catch:{ all -> 0x0190 }
    L_0x018b:
        defpackage.xtl.a(r1, r0);	 Catch:{ all -> 0x0190 }
        monitor-exit(r12);
        return r8;
    L_0x0190:
        r0 = move-exception;
        monitor-exit(r12);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahaj.a():int");
    }
}
