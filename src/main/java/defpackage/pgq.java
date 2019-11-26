package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;

/* renamed from: pgq */
final class pgq extends pgb {
    public boolean a;
    public final pgl b;
    public final pex c;
    public long d;
    public boolean e;
    private final pfo f;
    private final pfl h;
    private final pgi i;
    private final long j = Long.MIN_VALUE;
    private final pex k;
    private final pfv l;

    protected pgq(pgd pgd, pgf pgf) {
        super(pgd);
        pzr.a((Object) pgf);
        this.h = new pfl(pgd);
        this.b = new pgl(pgd);
        this.f = new pfo(pgd);
        this.i = new pgi(pgd);
        this.l = new pfv(h());
        this.k = new pgp(this, pgd);
        this.c = new peq(this, pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.g();
        this.f.g();
        this.i.g();
    }

    public final boolean d(String str) {
        return qph.a(i()).a(str) == 0;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A:{LOOP_START, LOOP:1: B:13:0x0040->B:22:0x0063} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A:{SYNTHETIC, Splitter:B:26:0x006e} */
    public final void b() {
        /*
        r5 = this;
        defpackage.pgv.a();
        defpackage.pgv.a();
        r5.f();
        r0 = defpackage.pev.a();
        if (r0 != 0) goto L_0x0014;
    L_0x000f:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r5.b(r0);
    L_0x0014:
        r0 = r5.i;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = "Service not connected";
        r5.a(r0);
        return;
    L_0x0022:
        r0 = r5.b;
        r0 = r0.d();
        if (r0 != 0) goto L_0x007b;
    L_0x002a:
        r0 = "Dispatching local hits to device AnalyticsService";
        r5.a(r0);
    L_0x002f:
        r0 = r5.b;	 Catch:{ SQLiteException -> 0x0072 }
        r1 = defpackage.pev.d();	 Catch:{ SQLiteException -> 0x0072 }
        r1 = (long) r1;	 Catch:{ SQLiteException -> 0x0072 }
        r0 = r0.a(r1);	 Catch:{ SQLiteException -> 0x0072 }
        r1 = r0.isEmpty();	 Catch:{ SQLiteException -> 0x0072 }
        if (r1 != 0) goto L_0x006e;
    L_0x0040:
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x002f;
    L_0x0046:
        r1 = 0;
        r1 = r0.get(r1);
        r1 = (defpackage.pff) r1;
        r2 = r5.i;
        r2 = r2.a(r1);
        if (r2 != 0) goto L_0x0059;
    L_0x0055:
        r5.d();
        return;
    L_0x0059:
        r0.remove(r1);
        r2 = r5.b;	 Catch:{ SQLiteException -> 0x0064 }
        r3 = r1.b;	 Catch:{ SQLiteException -> 0x0064 }
        r2.b(r3);	 Catch:{ SQLiteException -> 0x0064 }
        goto L_0x0040;
    L_0x0064:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r5.d(r1, r0);
        r5.s();
        return;
    L_0x006e:
        r5.d();	 Catch:{ SQLiteException -> 0x0072 }
        return;
    L_0x0072:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r5.d(r1, r0);
        r5.s();
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgq.b():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0096 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|20|21|22|23|(1:25)|26) */
    public final void c() {
        /*
        r7 = this;
        r0 = r7.e;
        if (r0 != 0) goto L_0x00c5;
    L_0x0004:
        r0 = defpackage.pev.a();
        if (r0 == 0) goto L_0x00c5;
    L_0x000a:
        r0 = r7.i;
        r0 = r0.b();
        if (r0 != 0) goto L_0x00c5;
    L_0x0012:
        r0 = defpackage.pel.z;
        r0 = r0.a;
        r0 = (java.lang.Long) r0;
        r0 = r0.longValue();
        r2 = r7.l;
        r0 = r2.a(r0);
        if (r0 == 0) goto L_0x00c5;
    L_0x0024:
        r0 = r7.l;
        r0.a();
        r0 = "Connecting to service";
        r7.a(r0);
        r0 = r7.i;
        defpackage.pgv.a();
        r0.f();
        r1 = r0.b;
        if (r1 != 0) goto L_0x00b8;
    L_0x003a:
        r1 = r0.a;
        defpackage.pgv.a();
        r2 = new android.content.Intent;
        r3 = "com.google.android.gms.analytics.service.START";
        r2.<init>(r3);
        r3 = new android.content.ComponentName;
        r4 = "com.google.android.gms";
        r5 = "com.google.android.gms.analytics.service.AnalyticsService";
        r3.<init>(r4, r5);
        r2.setComponent(r3);
        r3 = r1.c;
        r3 = r3.i();
        r4 = r3.getPackageName();
        r5 = "app_package_name";
        r2.putExtra(r5, r4);
        defpackage.qar.a();
        monitor-enter(r1);
        r4 = 0;
        r1.a = r4;	 Catch:{ all -> 0x00b5 }
        r5 = 1;
        r1.b = r5;	 Catch:{ all -> 0x00b5 }
        r5 = r1.c;	 Catch:{ all -> 0x00b5 }
        r5 = r5.a;	 Catch:{ all -> 0x00b5 }
        r6 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r2 = defpackage.qar.b(r3, r2, r5, r6);	 Catch:{ all -> 0x00b5 }
        r3 = r1.c;	 Catch:{ all -> 0x00b5 }
        r5 = "Bind to service requested";
        r6 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x00b5 }
        r3.a(r5, r6);	 Catch:{ all -> 0x00b5 }
        r3 = 0;
        if (r2 != 0) goto L_0x0088;
    L_0x0083:
        r1.b = r3;	 Catch:{ all -> 0x00b5 }
        monitor-exit(r1);	 Catch:{ all -> 0x00b5 }
        r2 = r4;
        goto L_0x00ad;
    L_0x0088:
        r2 = defpackage.pel.y;	 Catch:{ InterruptedException -> 0x0096 }
        r2 = r2.a;	 Catch:{ InterruptedException -> 0x0096 }
        r2 = (java.lang.Long) r2;	 Catch:{ InterruptedException -> 0x0096 }
        r5 = r2.longValue();	 Catch:{ InterruptedException -> 0x0096 }
        r1.wait(r5);	 Catch:{ InterruptedException -> 0x0096 }
        goto L_0x009d;
    L_0x0096:
        r2 = r1.c;	 Catch:{ all -> 0x00b5 }
        r5 = "Wait for service connect was interrupted";
        r2.b(r5);	 Catch:{ all -> 0x00b5 }
    L_0x009d:
        r1.b = r3;	 Catch:{ all -> 0x00b5 }
        r2 = r1.a;	 Catch:{ all -> 0x00b5 }
        r1.a = r4;	 Catch:{ all -> 0x00b5 }
        if (r2 != 0) goto L_0x00ac;
    L_0x00a5:
        r3 = r1.c;	 Catch:{ all -> 0x00b5 }
        r4 = "Successfully bound to service but never got onServiceConnected callback";
        r3.c(r4);	 Catch:{ all -> 0x00b5 }
    L_0x00ac:
        monitor-exit(r1);	 Catch:{ all -> 0x00b5 }
    L_0x00ad:
        if (r2 == 0) goto L_0x00c5;
    L_0x00af:
        r0.b = r2;
        r0.c();
        goto L_0x00b8;
    L_0x00b5:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00b5 }
        throw r0;
    L_0x00b8:
        r0 = "Connected to service";
        r7.a(r0);
        r0 = r7.l;
        r0.b();
        r7.b();
    L_0x00c5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgq.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:318:0x04b0 A:{SYNTHETIC, EDGE_INSN: B:318:0x04b0->B:233:0x04b0 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x04b0 A:{SYNTHETIC, EDGE_INSN: B:318:0x04b0->B:233:0x04b0 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b5 A:{Catch:{ SQLiteException -> 0x011d, all -> 0x056a }} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03b9 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bb A:{Catch:{ SQLiteException -> 0x011d, all -> 0x056a }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04bc A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x052b A:{SYNTHETIC, EDGE_INSN: B:303:0x052b->B:264:0x052b ?: BREAK  , EDGE_INSN: B:303:0x052b->B:264:0x052b ?: BREAK  , EDGE_INSN: B:303:0x052b->B:264:0x052b ?: BREAK  , EDGE_INSN: B:303:0x052b->B:264:0x052b ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d A:{Catch:{ SQLiteException -> 0x054a }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x058b A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0594 A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x058b A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0594 A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x037a A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036d A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a6 A:{SYNTHETIC, Splitter:B:170:0x03a6} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03b1 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0358 A:{SYNTHETIC, Splitter:B:151:0x0358} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0367 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036d A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x037a A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0358 A:{SYNTHETIC, Splitter:B:151:0x0358} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0367 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x037a A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036d A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a6 A:{SYNTHETIC, Splitter:B:170:0x03a6} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03b1 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0358 A:{SYNTHETIC, Splitter:B:151:0x0358} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0367 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x036d A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x037a A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a6 A:{SYNTHETIC, Splitter:B:170:0x03a6} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03b1 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04bc A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0512 A:{SYNTHETIC, Splitter:B:258:0x0512} */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04fd A:{SYNTHETIC, Splitter:B:253:0x04fd, EDGE_INSN: B:253:0x04fd->B:254:? ?: BREAK  , EDGE_INSN: B:253:0x04fd->B:254:? ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0457 A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x058b A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0594 A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x058b A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0594 A:{Catch:{ SQLiteException -> 0x00cf, all -> 0x05b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0451 A:{SYNTHETIC, Splitter:B:214:0x0451} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04bc A:{Catch:{ IOException -> 0x035c, all -> 0x0568 }} */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04fd A:{SYNTHETIC, Splitter:B:253:0x04fd, EDGE_INSN: B:253:0x04fd->B:254:? ?: BREAK  , EDGE_INSN: B:253:0x04fd->B:254:? ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0512 A:{SYNTHETIC, Splitter:B:258:0x0512} */
    /* JADX WARNING: Missing block: B:25:0x00b0, code skipped:
            c("Database contains successfully uploaded hit", java.lang.Long.valueOf(r8), java.lang.Integer.valueOf(r0.size()));
            s();
     */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            r1.b.b();
            r1.b.c();
     */
    /* JADX WARNING: Missing block: B:254:?, code skipped:
            r1.b.b();
            r1.b.c();
     */
    /* JADX WARNING: Missing block: B:264:0x052b, code skipped:
            r26 = r4;
     */
    /* JADX WARNING: Missing block: B:266:?, code skipped:
            a("Store is empty, nothing to dispatch");
            s();
     */
    /* JADX WARNING: Missing block: B:268:?, code skipped:
            r1.b.b();
            r1.b.c();
     */
    /* JADX WARNING: Missing block: B:269:0x0540, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:271:?, code skipped:
            d(r3, r0);
            s();
     */
    /* JADX WARNING: Missing block: B:272:0x0548, code skipped:
            r0 = e;
     */
    public final void a(defpackage.pfb r29) {
        /*
        r28 = this;
        r1 = r28;
        r2 = "Error closing http compressed post connection output stream";
        r3 = "Failed to commit local dispatch transaction";
        r4 = r1.d;
        defpackage.pgv.a();
        r28.f();
        r0 = r28.p();
        r6 = r0.b();
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 == 0) goto L_0x002a;
    L_0x001c:
        r0 = r28.h();
        r10 = r0.a();
        r10 = r10 - r6;
        r6 = java.lang.Math.abs(r10);
        goto L_0x002c;
    L_0x002a:
        r6 = -1;
    L_0x002c:
        r0 = java.lang.Long.valueOf(r6);
        r6 = "Dispatching local hits. Elapsed time since last dispatch (ms)";
        r1.b(r6, r0);
        r28.c();
        defpackage.pgv.a();	 Catch:{ all -> 0x05b3 }
        r28.f();	 Catch:{ all -> 0x05b3 }
        r0 = "Dispatching a batch of local hits";
        r1.a(r0);	 Catch:{ all -> 0x05b3 }
        r0 = r1.i;	 Catch:{ all -> 0x05b3 }
        r0 = r0.b();	 Catch:{ all -> 0x05b3 }
        r6 = 1;
        r0 = r0 ^ r6;
        r7 = r1.f;	 Catch:{ all -> 0x05b3 }
        r7 = r7.b();	 Catch:{ all -> 0x05b3 }
        r7 = r7 ^ r6;
        if (r0 != 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0060;
    L_0x0055:
        if (r7 == 0) goto L_0x0060;
    L_0x0057:
        r0 = "No network or service available. Will retry later";
        r1.a(r0);	 Catch:{ all -> 0x05b3 }
    L_0x005c:
        r26 = r4;
        goto L_0x057f;
    L_0x0060:
        r0 = defpackage.pev.d();	 Catch:{ all -> 0x05b3 }
        r7 = defpackage.pev.e();	 Catch:{ all -> 0x05b3 }
        r0 = java.lang.Math.max(r0, r7);	 Catch:{ all -> 0x05b3 }
        r11 = (long) r0;	 Catch:{ all -> 0x05b3 }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x05b3 }
        r7.<init>();	 Catch:{ all -> 0x05b3 }
    L_0x0072:
        r0 = r1.b;	 Catch:{ all -> 0x056a }
        r0.f();	 Catch:{ all -> 0x056a }
        r0 = r0.q();	 Catch:{ all -> 0x056a }
        r0.beginTransaction();	 Catch:{ all -> 0x056a }
        r7.clear();	 Catch:{ all -> 0x056a }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x054a }
        r0 = r0.a(r11);	 Catch:{ SQLiteException -> 0x054a }
        r13 = r0.isEmpty();	 Catch:{ SQLiteException -> 0x054a }
        if (r13 != 0) goto L_0x052b;
    L_0x008d:
        r13 = "Hits loaded from store. count";
        r14 = r0.size();	 Catch:{ SQLiteException -> 0x054a }
        r14 = java.lang.Integer.valueOf(r14);	 Catch:{ SQLiteException -> 0x054a }
        r1.a(r13, r14);	 Catch:{ SQLiteException -> 0x054a }
        r13 = r0.iterator();	 Catch:{ all -> 0x056a }
    L_0x009e:
        r14 = r13.hasNext();	 Catch:{ all -> 0x056a }
        if (r14 == 0) goto L_0x00d7;
    L_0x00a4:
        r14 = r13.next();	 Catch:{ all -> 0x056a }
        r14 = (defpackage.pff) r14;	 Catch:{ all -> 0x056a }
        r14 = r14.b;	 Catch:{ all -> 0x056a }
        r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r16 != 0) goto L_0x009e;
    L_0x00b0:
        r2 = "Database contains successfully uploaded hit";
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x056a }
        r0 = r0.size();	 Catch:{ all -> 0x056a }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x056a }
        r1.c(r2, r7, r0);	 Catch:{ all -> 0x056a }
        r28.s();	 Catch:{ all -> 0x056a }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x00cf }
        r0.b();	 Catch:{ SQLiteException -> 0x00cf }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x00cf }
        r0.c();	 Catch:{ SQLiteException -> 0x00cf }
        goto L_0x005c;
    L_0x00cf:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x005c;
    L_0x00d7:
        r13 = r1.i;	 Catch:{ all -> 0x056a }
        r13 = r13.b();	 Catch:{ all -> 0x056a }
        r14 = 0;
        if (r13 == 0) goto L_0x013b;
    L_0x00e0:
        r13 = "Service connected, sending hits to the service";
        r1.a(r13);	 Catch:{ all -> 0x056a }
    L_0x00e5:
        r13 = r0.isEmpty();	 Catch:{ all -> 0x056a }
        if (r13 != 0) goto L_0x013b;
    L_0x00eb:
        r13 = r0.get(r14);	 Catch:{ all -> 0x056a }
        r13 = (defpackage.pff) r13;	 Catch:{ all -> 0x056a }
        r15 = r1.i;	 Catch:{ all -> 0x056a }
        r15 = r15.a(r13);	 Catch:{ all -> 0x056a }
        if (r15 != 0) goto L_0x00fa;
    L_0x00f9:
        goto L_0x013b;
    L_0x00fa:
        r16 = r11;
        r10 = r13.b;	 Catch:{ all -> 0x056a }
        r8 = java.lang.Math.max(r8, r10);	 Catch:{ all -> 0x056a }
        r0.remove(r13);	 Catch:{ all -> 0x056a }
        r10 = "Hit sent do device AnalyticsService for delivery";
        r1.b(r10, r13);	 Catch:{ all -> 0x056a }
        r10 = r1.b;	 Catch:{ SQLiteException -> 0x011d }
        r11 = r13.b;	 Catch:{ SQLiteException -> 0x011d }
        r10.b(r11);	 Catch:{ SQLiteException -> 0x011d }
        r10 = r13.b;	 Catch:{ SQLiteException -> 0x011d }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteException -> 0x011d }
        r7.add(r10);	 Catch:{ SQLiteException -> 0x011d }
        r11 = r16;
        goto L_0x00e5;
    L_0x011d:
        r0 = move-exception;
        r2 = "Failed to remove hit that was send for delivery";
        r1.d(r2, r0);	 Catch:{ all -> 0x056a }
        r28.s();	 Catch:{ all -> 0x056a }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0132 }
        r0.b();	 Catch:{ SQLiteException -> 0x0132 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0132 }
        r0.c();	 Catch:{ SQLiteException -> 0x0132 }
        goto L_0x005c;
    L_0x0132:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x005c;
    L_0x013b:
        r16 = r11;
        r10 = r1.f;	 Catch:{ all -> 0x056a }
        r10 = r10.b();	 Catch:{ all -> 0x056a }
        if (r10 == 0) goto L_0x04f3;
    L_0x0145:
        r10 = r1.f;	 Catch:{ all -> 0x056a }
        defpackage.pgv.a();	 Catch:{ all -> 0x056a }
        r10.f();	 Catch:{ all -> 0x056a }
        defpackage.pzr.a(r0);	 Catch:{ all -> 0x056a }
        r11 = r10.k();	 Catch:{ all -> 0x056a }
        r11 = r11.i();	 Catch:{ all -> 0x056a }
        r11 = r11.isEmpty();	 Catch:{ all -> 0x056a }
        if (r11 != 0) goto L_0x01b7;
    L_0x015e:
        r11 = r10.a;	 Catch:{ all -> 0x056a }
        r12 = defpackage.pel.t;	 Catch:{ all -> 0x056a }
        r12 = r12.a;	 Catch:{ all -> 0x056a }
        r12 = (java.lang.Integer) r12;	 Catch:{ all -> 0x056a }
        r12 = r12.intValue();	 Catch:{ all -> 0x056a }
        r12 = (long) r12;	 Catch:{ all -> 0x056a }
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r18;
        r11 = r11.a(r12);	 Catch:{ all -> 0x056a }
        if (r11 == 0) goto L_0x01b7;
    L_0x0175:
        r11 = defpackage.pel.n;	 Catch:{ all -> 0x056a }
        r11 = r11.a;	 Catch:{ all -> 0x056a }
        r11 = (java.lang.String) r11;	 Catch:{ all -> 0x056a }
        r12 = "BATCH_BY_SESSION";
        r12 = r12.equalsIgnoreCase(r11);	 Catch:{ all -> 0x056a }
        if (r12 != 0) goto L_0x01a6;
    L_0x0183:
        r12 = "BATCH_BY_TIME";
        r12 = r12.equalsIgnoreCase(r11);	 Catch:{ all -> 0x056a }
        if (r12 != 0) goto L_0x01a6;
    L_0x018b:
        r12 = "BATCH_BY_BRUTE_FORCE";
        r12 = r12.equalsIgnoreCase(r11);	 Catch:{ all -> 0x056a }
        if (r12 != 0) goto L_0x01a6;
    L_0x0193:
        r12 = "BATCH_BY_COUNT";
        r12 = r12.equalsIgnoreCase(r11);	 Catch:{ all -> 0x056a }
        if (r12 != 0) goto L_0x01a6;
    L_0x019b:
        r12 = "BATCH_BY_SIZE";
        r11 = r12.equalsIgnoreCase(r11);	 Catch:{ all -> 0x056a }
        if (r11 == 0) goto L_0x01a4;
    L_0x01a3:
        goto L_0x01a6;
    L_0x01a4:
        r11 = 0;
        goto L_0x01a7;
    L_0x01a6:
        r11 = 1;
    L_0x01a7:
        r12 = defpackage.pel.o;	 Catch:{ all -> 0x056a }
        r12 = r12.a;	 Catch:{ all -> 0x056a }
        r12 = (java.lang.String) r12;	 Catch:{ all -> 0x056a }
        r13 = "GZIP";
        r12 = r13.equalsIgnoreCase(r12);	 Catch:{ all -> 0x056a }
        if (r12 == 0) goto L_0x01b8;
    L_0x01b5:
        r12 = 1;
        goto L_0x01b9;
    L_0x01b7:
        r11 = 0;
    L_0x01b8:
        r12 = 0;
    L_0x01b9:
        if (r11 == 0) goto L_0x03b9;
    L_0x01bb:
        r11 = r0.isEmpty();	 Catch:{ all -> 0x056a }
        r11 = r11 ^ r6;
        defpackage.pzr.b(r11);	 Catch:{ all -> 0x056a }
        r11 = "Uploading batched hits. compression, count";
        r15 = java.lang.Boolean.valueOf(r12);	 Catch:{ all -> 0x056a }
        r18 = r0.size();	 Catch:{ all -> 0x056a }
        r13 = java.lang.Integer.valueOf(r18);	 Catch:{ all -> 0x056a }
        r10.a(r11, r15, r13);	 Catch:{ all -> 0x056a }
        r11 = new pfn;	 Catch:{ all -> 0x056a }
        r11.<init>(r10);	 Catch:{ all -> 0x056a }
        r13 = new java.util.ArrayList;	 Catch:{ all -> 0x056a }
        r13.<init>();	 Catch:{ all -> 0x056a }
        r15 = r0.iterator();	 Catch:{ all -> 0x056a }
    L_0x01e2:
        r0 = r15.hasNext();	 Catch:{ all -> 0x056a }
        if (r0 == 0) goto L_0x0280;
    L_0x01e8:
        r0 = r15.next();	 Catch:{ all -> 0x056a }
        r14 = r0;
        r14 = (defpackage.pff) r14;	 Catch:{ all -> 0x056a }
        defpackage.pzr.a(r14);	 Catch:{ all -> 0x056a }
        r0 = r11.a;	 Catch:{ all -> 0x056a }
        r0 = r0 + r6;
        r6 = defpackage.pev.e();	 Catch:{ all -> 0x056a }
        if (r0 > r6) goto L_0x0280;
    L_0x01fb:
        r0 = r11.c;	 Catch:{ all -> 0x056a }
        r6 = 0;
        r0 = r0.a(r14, r6);	 Catch:{ all -> 0x056a }
        if (r0 != 0) goto L_0x0212;
    L_0x0204:
        r0 = r11.c;	 Catch:{ all -> 0x056a }
        r0 = r0.j();	 Catch:{ all -> 0x056a }
        r6 = "Error formatting hit";
        r0.a(r14, r6);	 Catch:{ all -> 0x056a }
        r24 = r8;
        goto L_0x0271;
    L_0x0212:
        r0 = r0.getBytes();	 Catch:{ all -> 0x056a }
        r6 = r0.length;	 Catch:{ all -> 0x056a }
        r24 = r8;
        r8 = defpackage.pel.p;	 Catch:{ all -> 0x056a }
        r8 = r8.a;	 Catch:{ all -> 0x056a }
        r8 = (java.lang.Integer) r8;	 Catch:{ all -> 0x056a }
        r8 = r8.intValue();	 Catch:{ all -> 0x056a }
        if (r6 > r8) goto L_0x0266;
    L_0x0225:
        r8 = r11.b;	 Catch:{ all -> 0x056a }
        r8 = r8.size();	 Catch:{ all -> 0x056a }
        if (r8 <= 0) goto L_0x022f;
    L_0x022d:
        r6 = r6 + 1;
    L_0x022f:
        r8 = r11.b;	 Catch:{ all -> 0x056a }
        r8 = r8.size();	 Catch:{ all -> 0x056a }
        r8 = r8 + r6;
        r6 = defpackage.pel.r;	 Catch:{ all -> 0x056a }
        r6 = r6.a;	 Catch:{ all -> 0x056a }
        r6 = (java.lang.Integer) r6;	 Catch:{ all -> 0x056a }
        r6 = r6.intValue();	 Catch:{ all -> 0x056a }
        if (r8 > r6) goto L_0x0282;
    L_0x0242:
        r6 = r11.b;	 Catch:{ IOException -> 0x025d }
        r6 = r6.size();	 Catch:{ IOException -> 0x025d }
        if (r6 <= 0) goto L_0x0251;
    L_0x024a:
        r6 = r11.b;	 Catch:{ IOException -> 0x025d }
        r8 = defpackage.pfo.b;	 Catch:{ IOException -> 0x025d }
        r6.write(r8);	 Catch:{ IOException -> 0x025d }
    L_0x0251:
        r6 = r11.b;	 Catch:{ IOException -> 0x025d }
        r6.write(r0);	 Catch:{ IOException -> 0x025d }
        r0 = r11.a;	 Catch:{ all -> 0x056a }
        r6 = 1;
        r0 = r0 + r6;
        r11.a = r0;	 Catch:{ all -> 0x056a }
        goto L_0x0271;
    L_0x025d:
        r0 = move-exception;
        r6 = r11.c;	 Catch:{ all -> 0x056a }
        r8 = "Failed to write payload when batching hits";
        r6.d(r8, r0);	 Catch:{ all -> 0x056a }
        goto L_0x0271;
    L_0x0266:
        r0 = r11.c;	 Catch:{ all -> 0x056a }
        r0 = r0.j();	 Catch:{ all -> 0x056a }
        r6 = "Hit size exceeds the maximum size limit";
        r0.a(r14, r6);	 Catch:{ all -> 0x056a }
    L_0x0271:
        r8 = r14.b;	 Catch:{ all -> 0x056a }
        r0 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x056a }
        r13.add(r0);	 Catch:{ all -> 0x056a }
        r8 = r24;
        r6 = 1;
        r14 = 0;
        goto L_0x01e2;
    L_0x0280:
        r24 = r8;
    L_0x0282:
        r0 = r11.a;	 Catch:{ all -> 0x056a }
        if (r0 == 0) goto L_0x03b5;
    L_0x0286:
        r0 = r10.c();	 Catch:{ all -> 0x056a }
        if (r0 != 0) goto L_0x0295;
    L_0x028c:
        r0 = "Failed to build batching endpoint url";
        r10.c(r0);	 Catch:{ all -> 0x056a }
        r26 = r4;
        goto L_0x039b;
    L_0x0295:
        if (r12 != 0) goto L_0x02a5;
    L_0x0297:
        r6 = r11.a();	 Catch:{ all -> 0x056a }
        r14 = r10.a(r0, r6);	 Catch:{ all -> 0x056a }
        r26 = r4;
    L_0x02a1:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        goto L_0x036b;
    L_0x02a5:
        r6 = r11.a();	 Catch:{ all -> 0x056a }
        defpackage.pzr.a(r0);	 Catch:{ all -> 0x056a }
        defpackage.pzr.a(r6);	 Catch:{ all -> 0x056a }
        r8 = r10.i();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r8.getPackageName();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r8 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r8.<init>();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r9 = new java.util.zip.GZIPOutputStream;	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r9.<init>(r8);	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r9.write(r6);	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r9.close();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r8.close();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r8 = r8.toByteArray();	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r20 = "POST compressed size, ratio %, url";
        r9 = r8.length;	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r12 = java.lang.Integer.valueOf(r9);	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r14 = (long) r9;	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r18 = 100;
        r14 = r14 * r18;
        r6 = r6.length;	 Catch:{ IOException -> 0x034b, all -> 0x0344 }
        r26 = r4;
        r4 = (long) r6;
        r14 = r14 / r4;
        r22 = java.lang.Long.valueOf(r14);	 Catch:{ IOException -> 0x0342, all -> 0x0340 }
        r19 = 3;
        r18 = r10;
        r21 = r12;
        r23 = r0;
        r18.b(r19, r20, r21, r22, r23);	 Catch:{ IOException -> 0x0342, all -> 0x0340 }
        if (r9 <= r6) goto L_0x02f8;
    L_0x02ef:
        r4 = "Compressed payload is larger then uncompressed. compressed, uncompressed";
        r5 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x0342, all -> 0x0340 }
        r10.b(r4, r12, r5);	 Catch:{ IOException -> 0x0342, all -> 0x0340 }
    L_0x02f8:
        r4 = r10.a(r0);	 Catch:{ IOException -> 0x0342, all -> 0x0340 }
        r5 = 1;
        r4.setDoOutput(r5);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r0 = "Content-Encoding";
        r5 = "gzip";
        r4.addRequestProperty(r0, r5);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r4.setFixedLengthStreamingMode(r9);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r4.connect();	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r5 = r4.getOutputStream();	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r5.write(r8);	 Catch:{ IOException -> 0x0337 }
        r5.close();	 Catch:{ IOException -> 0x0337 }
        r10.a(r4);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r14 = r4.getResponseCode();	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r14 != r5) goto L_0x0329;
    L_0x0322:
        r0 = r10.m();	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r0.c();	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
    L_0x0329:
        r0 = "POST status";
        r5 = java.lang.Integer.valueOf(r14);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r10.b(r0, r5);	 Catch:{ IOException -> 0x033e, all -> 0x0339 }
        r4.disconnect();	 Catch:{ all -> 0x0568 }
        goto L_0x02a1;
    L_0x0337:
        r0 = move-exception;
        goto L_0x0350;
    L_0x0339:
        r0 = move-exception;
        r6 = r4;
        r5 = 0;
        goto L_0x03a3;
    L_0x033e:
        r0 = move-exception;
        goto L_0x034f;
    L_0x0340:
        r0 = move-exception;
        goto L_0x0347;
    L_0x0342:
        r0 = move-exception;
        goto L_0x034e;
    L_0x0344:
        r0 = move-exception;
        r26 = r4;
    L_0x0347:
        r4 = r0;
        r5 = 0;
        r6 = 0;
        goto L_0x03a4;
    L_0x034b:
        r0 = move-exception;
        r26 = r4;
    L_0x034e:
        r4 = 0;
    L_0x034f:
        r5 = 0;
    L_0x0350:
        r6 = "Network compressed POST connection error";
        r10.c(r6, r0);	 Catch:{ all -> 0x03a1 }
        if (r5 != 0) goto L_0x0358;
    L_0x0357:
        goto L_0x0361;
    L_0x0358:
        r5.close();	 Catch:{ IOException -> 0x035c }
        goto L_0x0361;
    L_0x035c:
        r0 = move-exception;
        r5 = r0;
        r10.d(r2, r5);	 Catch:{ all -> 0x0568 }
    L_0x0361:
        if (r4 != 0) goto L_0x0367;
    L_0x0363:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r14 = 0;
        goto L_0x036b;
    L_0x0367:
        r4.disconnect();	 Catch:{ all -> 0x0568 }
        goto L_0x0363;
    L_0x036b:
        if (r14 != r4) goto L_0x037a;
    L_0x036d:
        r0 = "Batched upload completed. Hits batched";
        r4 = r11.a;	 Catch:{ all -> 0x0568 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0568 }
        r10.a(r0, r4);	 Catch:{ all -> 0x0568 }
        goto L_0x04b0;
    L_0x037a:
        r0 = "Network error uploading hits. status code";
        r4 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x0568 }
        r10.a(r0, r4);	 Catch:{ all -> 0x0568 }
        r0 = r10.k();	 Catch:{ all -> 0x0568 }
        r0 = r0.i();	 Catch:{ all -> 0x0568 }
        r0 = r0.contains(r4);	 Catch:{ all -> 0x0568 }
        if (r0 == 0) goto L_0x039b;
    L_0x0391:
        r0 = "Server instructed the client to stop batching";
        r10.b(r0);	 Catch:{ all -> 0x0568 }
        r0 = r10.a;	 Catch:{ all -> 0x0568 }
        r0.a();	 Catch:{ all -> 0x0568 }
    L_0x039b:
        r13 = java.util.Collections.emptyList();	 Catch:{ all -> 0x0568 }
        goto L_0x04b0;
    L_0x03a1:
        r0 = move-exception;
        r6 = r4;
    L_0x03a3:
        r4 = r0;
    L_0x03a4:
        if (r5 == 0) goto L_0x03af;
    L_0x03a6:
        r5.close();	 Catch:{ IOException -> 0x03aa }
        goto L_0x03af;
    L_0x03aa:
        r0 = move-exception;
        r5 = r0;
        r10.d(r2, r5);	 Catch:{ all -> 0x0568 }
    L_0x03af:
        if (r6 == 0) goto L_0x03b4;
    L_0x03b1:
        r6.disconnect();	 Catch:{ all -> 0x0568 }
    L_0x03b4:
        throw r4;	 Catch:{ all -> 0x0568 }
    L_0x03b5:
        r26 = r4;
        goto L_0x04b0;
    L_0x03b9:
        r26 = r4;
        r24 = r8;
        r13 = new java.util.ArrayList;	 Catch:{ all -> 0x0568 }
        r4 = r0.size();	 Catch:{ all -> 0x0568 }
        r13.<init>(r4);	 Catch:{ all -> 0x0568 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0568 }
    L_0x03ca:
        r4 = r0.hasNext();	 Catch:{ all -> 0x0568 }
        if (r4 == 0) goto L_0x04b0;
    L_0x03d0:
        r4 = r0.next();	 Catch:{ all -> 0x0568 }
        r4 = (defpackage.pff) r4;	 Catch:{ all -> 0x0568 }
        defpackage.pzr.a(r4);	 Catch:{ all -> 0x0568 }
        r5 = r4.d;	 Catch:{ all -> 0x0568 }
        r6 = 1;
        r5 = r5 ^ r6;
        r5 = r10.a(r4, r5);	 Catch:{ all -> 0x0568 }
        if (r5 != 0) goto L_0x03f1;
    L_0x03e3:
        r5 = r10.j();	 Catch:{ all -> 0x0568 }
        r6 = "Error formatting hit for upload";
        r5.a(r4, r6);	 Catch:{ all -> 0x0568 }
    L_0x03ec:
        r5 = 0;
    L_0x03ed:
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        goto L_0x049d;
    L_0x03f1:
        r6 = r5.length();	 Catch:{ all -> 0x0568 }
        r8 = defpackage.pel.m;	 Catch:{ all -> 0x0568 }
        r8 = r8.a;	 Catch:{ all -> 0x0568 }
        r8 = (java.lang.Integer) r8;	 Catch:{ all -> 0x0568 }
        r8 = r8.intValue();	 Catch:{ all -> 0x0568 }
        if (r6 > r8) goto L_0x045b;
    L_0x0401:
        r5 = r10.a(r4, r5);	 Catch:{ all -> 0x0568 }
        if (r5 != 0) goto L_0x040e;
    L_0x0407:
        r0 = "Failed to build collect GET endpoint url";
        r10.c(r0);	 Catch:{ all -> 0x0568 }
        goto L_0x04b0;
    L_0x040e:
        defpackage.pzr.a(r5);	 Catch:{ all -> 0x0568 }
        r6 = "GET request";
        r10.b(r6, r5);	 Catch:{ all -> 0x0568 }
        r5 = r10.a(r5);	 Catch:{ IOException -> 0x0448, all -> 0x0445 }
        r5.connect();	 Catch:{ IOException -> 0x0443 }
        r10.a(r5);	 Catch:{ IOException -> 0x0443 }
        r6 = r5.getResponseCode();	 Catch:{ IOException -> 0x0443 }
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 != r8) goto L_0x042f;
    L_0x0428:
        r8 = r10.m();	 Catch:{ IOException -> 0x0443 }
        r8.c();	 Catch:{ IOException -> 0x0443 }
    L_0x042f:
        r8 = "GET status";
        r9 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x0443 }
        r10.b(r8, r9);	 Catch:{ IOException -> 0x0443 }
        r5.disconnect();	 Catch:{ all -> 0x0568 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 == r5) goto L_0x03ec;
    L_0x043f:
        goto L_0x04b0;
    L_0x0441:
        r0 = move-exception;
        goto L_0x0455;
    L_0x0443:
        r0 = move-exception;
        goto L_0x044a;
    L_0x0445:
        r0 = move-exception;
        r5 = 0;
        goto L_0x0455;
    L_0x0448:
        r0 = move-exception;
        r5 = 0;
    L_0x044a:
        r4 = "Network GET connection error";
        r10.c(r4, r0);	 Catch:{ all -> 0x0441 }
        if (r5 == 0) goto L_0x04b0;
    L_0x0451:
        r5.disconnect();	 Catch:{ all -> 0x0568 }
        goto L_0x04b0;
    L_0x0455:
        if (r5 == 0) goto L_0x045a;
    L_0x0457:
        r5.disconnect();	 Catch:{ all -> 0x0568 }
    L_0x045a:
        throw r0;	 Catch:{ all -> 0x0568 }
    L_0x045b:
        r5 = 0;
        r6 = r10.a(r4, r5);	 Catch:{ all -> 0x0568 }
        if (r6 != 0) goto L_0x046c;
    L_0x0462:
        r6 = r10.j();	 Catch:{ all -> 0x0568 }
        r8 = "Error formatting hit for POST upload";
        r6.a(r4, r8);	 Catch:{ all -> 0x0568 }
        goto L_0x03ed;
    L_0x046c:
        r6 = r6.getBytes();	 Catch:{ all -> 0x0568 }
        r8 = r6.length;	 Catch:{ all -> 0x0568 }
        r9 = defpackage.pel.q;	 Catch:{ all -> 0x0568 }
        r9 = r9.a;	 Catch:{ all -> 0x0568 }
        r9 = (java.lang.Integer) r9;	 Catch:{ all -> 0x0568 }
        r9 = r9.intValue();	 Catch:{ all -> 0x0568 }
        if (r8 <= r9) goto L_0x0488;
    L_0x047d:
        r6 = r10.j();	 Catch:{ all -> 0x0568 }
        r8 = "Hit payload exceeds size limit";
        r6.a(r4, r8);	 Catch:{ all -> 0x0568 }
        goto L_0x03ed;
    L_0x0488:
        r8 = r10.a(r4);	 Catch:{ all -> 0x0568 }
        if (r8 != 0) goto L_0x0494;
    L_0x048e:
        r0 = "Failed to build collect POST endpoint url";
        r10.c(r0);	 Catch:{ all -> 0x0568 }
        goto L_0x04b0;
    L_0x0494:
        r6 = r10.a(r8, r6);	 Catch:{ all -> 0x0568 }
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r6 == r8) goto L_0x049d;
    L_0x049c:
        goto L_0x04b0;
    L_0x049d:
        r11 = r4.b;	 Catch:{ all -> 0x0568 }
        r4 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0568 }
        r13.add(r4);	 Catch:{ all -> 0x0568 }
        r4 = r13.size();	 Catch:{ all -> 0x0568 }
        r6 = defpackage.pev.d();	 Catch:{ all -> 0x0568 }
        if (r4 < r6) goto L_0x03ca;
    L_0x04b0:
        r0 = r13.iterator();	 Catch:{ all -> 0x0568 }
        r4 = r24;
    L_0x04b6:
        r6 = r0.hasNext();	 Catch:{ all -> 0x0568 }
        if (r6 == 0) goto L_0x04cb;
    L_0x04bc:
        r6 = r0.next();	 Catch:{ all -> 0x0568 }
        r6 = (java.lang.Long) r6;	 Catch:{ all -> 0x0568 }
        r8 = r6.longValue();	 Catch:{ all -> 0x0568 }
        r4 = java.lang.Math.max(r4, r8);	 Catch:{ all -> 0x0568 }
        goto L_0x04b6;
    L_0x04cb:
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x04d5 }
        r0.a(r13);	 Catch:{ SQLiteException -> 0x04d5 }
        r7.addAll(r13);	 Catch:{ SQLiteException -> 0x04d5 }
        r8 = r4;
        goto L_0x04f7;
    L_0x04d5:
        r0 = move-exception;
        r2 = "Failed to remove successfully uploaded hits";
        r1.d(r2, r0);	 Catch:{ all -> 0x0568 }
        r28.s();	 Catch:{ all -> 0x0568 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x04ea }
        r0.b();	 Catch:{ SQLiteException -> 0x04ea }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x04ea }
        r0.c();	 Catch:{ SQLiteException -> 0x04ea }
        goto L_0x057f;
    L_0x04ea:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x057f;
    L_0x04f3:
        r26 = r4;
        r24 = r8;
    L_0x04f7:
        r0 = r7.isEmpty();	 Catch:{ all -> 0x0568 }
        if (r0 == 0) goto L_0x0512;
    L_0x04fd:
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0509 }
        r0.b();	 Catch:{ SQLiteException -> 0x0509 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0509 }
        r0.c();	 Catch:{ SQLiteException -> 0x0509 }
        goto L_0x057f;
    L_0x0509:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x057f;
    L_0x0512:
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0523 }
        r0.b();	 Catch:{ SQLiteException -> 0x0523 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0523 }
        r0.c();	 Catch:{ SQLiteException -> 0x0523 }
        r11 = r16;
        r4 = r26;
        r6 = 1;
        goto L_0x0072;
    L_0x0523:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x057f;
    L_0x052b:
        r26 = r4;
        r0 = "Store is empty, nothing to dispatch";
        r1.a(r0);	 Catch:{ SQLiteException -> 0x0548 }
        r28.s();	 Catch:{ SQLiteException -> 0x0548 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0540 }
        r0.b();	 Catch:{ SQLiteException -> 0x0540 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0540 }
        r0.c();	 Catch:{ SQLiteException -> 0x0540 }
        goto L_0x057f;
    L_0x0540:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x057f;
    L_0x0548:
        r0 = move-exception;
        goto L_0x054d;
    L_0x054a:
        r0 = move-exception;
        r26 = r4;
    L_0x054d:
        r2 = "Failed to read hits from persisted store";
        r1.c(r2, r0);	 Catch:{ all -> 0x0568 }
        r28.s();	 Catch:{ all -> 0x0568 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0560 }
        r0.b();	 Catch:{ SQLiteException -> 0x0560 }
        r0 = r1.b;	 Catch:{ SQLiteException -> 0x0560 }
        r0.c();	 Catch:{ SQLiteException -> 0x0560 }
        goto L_0x057f;
    L_0x0560:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
        goto L_0x057f;
    L_0x0568:
        r0 = move-exception;
        goto L_0x056d;
    L_0x056a:
        r0 = move-exception;
        r26 = r4;
    L_0x056d:
        r2 = r1.b;	 Catch:{ SQLiteException -> 0x0578 }
        r2.b();	 Catch:{ SQLiteException -> 0x0578 }
        r2 = r1.b;	 Catch:{ SQLiteException -> 0x0578 }
        r2.c();	 Catch:{ SQLiteException -> 0x0578 }
        throw r0;	 Catch:{ all -> 0x05b3 }
    L_0x0578:
        r0 = move-exception;
        r1.d(r3, r0);	 Catch:{ all -> 0x05b3 }
        r28.s();	 Catch:{ all -> 0x05b3 }
    L_0x057f:
        r0 = r28.p();	 Catch:{ all -> 0x05b3 }
        r0.c();	 Catch:{ all -> 0x05b3 }
        r28.d();	 Catch:{ all -> 0x05b3 }
        if (r29 == 0) goto L_0x058e;
    L_0x058b:
        r29.a();	 Catch:{ all -> 0x05b3 }
    L_0x058e:
        r2 = r1.d;	 Catch:{ all -> 0x05b3 }
        r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1));
        if (r0 == 0) goto L_0x05b2;
    L_0x0594:
        r0 = r1.h;	 Catch:{ all -> 0x05b3 }
        r0 = r0.b;	 Catch:{ all -> 0x05b3 }
        r0 = r0.a;	 Catch:{ all -> 0x05b3 }
        r2 = new android.content.Intent;	 Catch:{ all -> 0x05b3 }
        r3 = "com.google.analytics.RADIO_POWERED";
        r2.<init>(r3);	 Catch:{ all -> 0x05b3 }
        r3 = r0.getPackageName();	 Catch:{ all -> 0x05b3 }
        r2.addCategory(r3);	 Catch:{ all -> 0x05b3 }
        r3 = defpackage.pfl.a;	 Catch:{ all -> 0x05b3 }
        r4 = 1;
        r2.putExtra(r3, r4);	 Catch:{ all -> 0x05b3 }
        r3 = 0;
        r0.sendOrderedBroadcast(r2, r3);	 Catch:{ all -> 0x05b3 }
    L_0x05b2:
        return;
    L_0x05b3:
        r0 = move-exception;
        r2 = "Local dispatch failed";
        r1.d(r2, r0);
        r0 = r28.p();
        r0.c();
        r28.d();
        if (r29 == 0) goto L_0x05c8;
    L_0x05c5:
        r29.a();
    L_0x05c8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgq.a(pfb):void");
    }

    public final void d() {
        pgv.a();
        f();
        if (this.e || t() <= 0) {
            this.h.b();
            s();
        } else if (this.b.d()) {
            this.h.b();
            s();
        } else {
            if (!((Boolean) pel.w.a).booleanValue()) {
                pfl pfl = this.h;
                pfl.a();
                if (!pfl.c) {
                    Context context = pfl.b.a;
                    context.registerReceiver(pfl, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                    intentFilter.addCategory(context.getPackageName());
                    context.registerReceiver(pfl, intentFilter);
                    pfl.d = pfl.c();
                    pfl.b.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(pfl.d));
                    pfl.c = true;
                }
                pfl = this.h;
                if (!pfl.c) {
                    pfl.b.a().b("Connectivity unknown. Receiver not registered");
                }
                if (!pfl.d) {
                    s();
                    r();
                    return;
                }
            }
            r();
            long t = t();
            long b = p().b();
            if (b != 0) {
                b = t - Math.abs(h().a() - b);
                if (b <= 0) {
                    b = Math.min(pev.b(), t);
                }
            } else {
                b = Math.min(pev.b(), t);
            }
            a("Dispatch scheduled (ms)", Long.valueOf(b));
            if (this.k.b()) {
                pex pex = this.k;
                t = Math.max(1, b + (pex.c != 0 ? Math.abs(pex.a.c.a() - pex.c) : 0));
                pex pex2 = this.k;
                if (pex2.b()) {
                    if (t >= 0) {
                        t -= Math.abs(pex2.a.c.a() - pex2.c);
                        if (t < 0) {
                            t = 0;
                        }
                        pex2.d().removeCallbacks(pex2.b);
                        if (!pex2.d().postDelayed(pex2.b, t)) {
                            pex2.a.a().d("Failed to adjust delayed post. time", Long.valueOf(t));
                        }
                    } else {
                        pex2.c();
                    }
                }
                return;
            }
            this.k.a(b);
        }
    }

    private final void r() {
        pfc n = n();
        if (n.a && !n.b) {
            pgv.a();
            f();
            pgl pgl;
            String str;
            String[] strArr;
            try {
                pgl = this.b;
                pgv.a();
                pgl.f();
                str = pgl.b;
                strArr = null;
                Cursor rawQuery = pgl.q().rawQuery(str, strArr);
                long j;
                if (rawQuery.moveToFirst()) {
                    j = rawQuery.getLong(0);
                    rawQuery.close();
                    if (j != 0 && Math.abs(h().a() - j) <= ((Long) pel.f.a).longValue()) {
                        a("Dispatch alarm scheduled (ms)", Long.valueOf(pev.c()));
                        n.f();
                        pzr.a(n.a, (Object) "Receiver not registered");
                        long c = pev.c();
                        if (c > 0) {
                            n.c();
                            long b = n.h().b() + c;
                            n.b = true;
                            if (VERSION.SDK_INT >= 24) {
                                n.a("Scheduling upload with JobScheduler");
                                JobScheduler jobScheduler = (JobScheduler) n.i().getSystemService("jobscheduler");
                                Builder builder = new Builder(n.d(), new ComponentName(n.i(), "com.google.android.gms.analytics.AnalyticsJobService"));
                                builder.setMinimumLatency(c);
                                builder.setOverrideDeadline(c + c);
                                PersistableBundle persistableBundle = new PersistableBundle();
                                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                                builder.setExtras(persistableBundle);
                                JobInfo build = builder.build();
                                n.a("Scheduling job. JobID", Integer.valueOf(n.d()));
                                jobScheduler.schedule(build);
                                return;
                            }
                            n.a("Scheduling upload with AlarmManager");
                            n.c.setInexactRepeating(2, b, c, n.b());
                            return;
                        }
                        return;
                    }
                }
                rawQuery.close();
                j = 0;
                if (j != 0) {
                }
            } catch (SQLiteException e) {
                pgl.c("Database error", str, e);
                throw e;
            } catch (SQLiteException e2) {
                d("Failed to get min/max hit times from local store", e2);
            } catch (Throwable th) {
                if (strArr != null) {
                    strArr.close();
                }
            }
        }
    }

    private final void s() {
        if (this.k.b()) {
            a("All hits dispatched or no network/service. Going to power save mode");
        }
        this.k.c();
        pfc n = n();
        if (n.b) {
            n.c();
        }
    }

    private final long t() {
        long j = this.j;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        j = ((Long) pel.c.a).longValue();
        pfx o = o();
        o.f();
        if (!o.c) {
            return j;
        }
        pfx o2 = o();
        o2.f();
        return ((long) o2.d) * 1000;
    }

    public final void q() {
        f();
        pgv.a();
        this.e = true;
        this.i.d();
        d();
    }
}
