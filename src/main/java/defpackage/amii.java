package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: amii */
public final class amii {
    public final ScheduledExecutorService a;
    private final alyz b;
    private final alys c;
    private final amab d;
    private final ambw e;
    private final amca f;
    private final Map g;
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final Map j = new HashMap();

    public amii(alyz alyz, amab amab, ambw ambw, ScheduledExecutorService scheduledExecutorService, Map map, alys alys, amca amca) {
        this.b = alyz;
        this.a = scheduledExecutorService;
        this.g = map;
        this.c = alys;
        this.d = amab;
        this.e = ambw;
        this.f = amca;
    }

    public final synchronized boolean a(amct amct) {
        return a(amct.a());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a(String str) {
        try {
            if (!this.h.containsKey(str)) {
                amea a = this.b.a(str);
                String str2;
                if (a == null) {
                    str2 = "Job not found ";
                    str = String.valueOf(str);
                    throw new alzc(str.length() == 0 ? new String(str2) : str2.concat(str));
                }
                int a2 = amek.a(a.h);
                if (a2 == 0) {
                    a2 = 1;
                }
                bcaa bcaa = (bcaa) this.g.get(Integer.valueOf(a2 - 1));
                if (bcaa == null) {
                    String valueOf = String.valueOf(amek.b(a2));
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
                    stringBuilder.append("Unsupported UploadFlow ");
                    stringBuilder.append(valueOf);
                    throw new UnsupportedOperationException(stringBuilder.toString());
                } else if (this.h.containsKey(str)) {
                    str2 = "UploadFlow Future already exists for ";
                    str = String.valueOf(str);
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    throw new IllegalStateException(str);
                } else {
                    amje a3 = ((amif) bcaa.get()).a(str);
                    anjf.a(a3, new amil(this, str), this.a);
                    this.h.put(str, new amiq(a3));
                    return true;
                }
            }
        } catch (alzc unused) {
        }
        return false;
    }

    public final synchronized boolean b(String str) {
        boolean z;
        amiq amiq = (amiq) this.h.remove(str);
        if (amiq == null || !amiq.b) {
            z = false;
        } else {
            this.a.execute(new amih(this, str));
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Missing block: B:43:0x00e5, code skipped:
            return;
     */
    public final synchronized void a(java.lang.String r9, defpackage.amjd r10) {
        /*
        r8 = this;
        monitor-enter(r8);
        r9 = r8.b(r9);	 Catch:{ all -> 0x00e8 }
        if (r9 != 0) goto L_0x00e6;
    L_0x0007:
        if (r10 == 0) goto L_0x00e4;
    L_0x0009:
        r9 = r10.d();	 Catch:{ all -> 0x00e8 }
        if (r9 != 0) goto L_0x00e4;
    L_0x000f:
        r9 = r10.d();	 Catch:{ all -> 0x00e8 }
        if (r9 != 0) goto L_0x00dc;
    L_0x0015:
        r9 = r10.a();	 Catch:{ all -> 0x00e8 }
        r0 = r10.b();	 Catch:{ all -> 0x00e8 }
        r1 = r0.isEmpty();	 Catch:{ all -> 0x00e8 }
        if (r1 != 0) goto L_0x00b7;
    L_0x0023:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00e8 }
        r2 = r0.size();	 Catch:{ all -> 0x00e8 }
        r1.<init>(r2);	 Catch:{ all -> 0x00e8 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00e8 }
    L_0x0030:
        r2 = r0.hasNext();	 Catch:{ all -> 0x00e8 }
        if (r2 == 0) goto L_0x00b2;
    L_0x0036:
        r2 = r0.next();	 Catch:{ all -> 0x00e8 }
        r2 = (defpackage.amcj) r2;	 Catch:{ all -> 0x00e8 }
        r3 = new amio;	 Catch:{ all -> 0x00e8 }
        r3.<init>(r8, r9, r2);	 Catch:{ all -> 0x00e8 }
        r2.a(r3);	 Catch:{ all -> 0x00e8 }
        r4 = r2.e();	 Catch:{ all -> 0x00e8 }
        r4 = r4.b;	 Catch:{ all -> 0x00e8 }
        if (r4 == 0) goto L_0x005d;
    L_0x004c:
        r2.b(r3);	 Catch:{ all -> 0x00e8 }
        defpackage.amii.a(r1);	 Catch:{ all -> 0x00e8 }
        r0 = r8.a;	 Catch:{ all -> 0x00e8 }
        r1 = new amik;	 Catch:{ all -> 0x00e8 }
        r1.<init>(r8, r9);	 Catch:{ all -> 0x00e8 }
        r0.execute(r1);	 Catch:{ all -> 0x00e8 }
        goto L_0x00b7;
    L_0x005d:
        r4 = r8.b;	 Catch:{ alzc -> 0x00a5 }
        r4 = r4.a(r9);	 Catch:{ alzc -> 0x00a5 }
        if (r4 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x009d;
    L_0x0066:
        r5 = r4.a;	 Catch:{ all -> 0x00e8 }
        r6 = 1;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x009d;
    L_0x006c:
        r2 = r2.e();	 Catch:{ all -> 0x00e8 }
        r2 = r2.c;	 Catch:{ all -> 0x00e8 }
        r5 = 3;
        if (r2 == r6) goto L_0x0078;
    L_0x0075:
        if (r2 == r5) goto L_0x0078;
    L_0x0077:
        goto L_0x00ad;
    L_0x0078:
        r7 = defpackage.amec.g;	 Catch:{ all -> 0x00e8 }
        r7 = r7.createBuilder();	 Catch:{ all -> 0x00e8 }
        r7 = (defpackage.ameb) r7;	 Catch:{ all -> 0x00e8 }
        r7.b(r6);	 Catch:{ all -> 0x00e8 }
        if (r2 != r5) goto L_0x0088;
    L_0x0085:
        r2 = 8;
        goto L_0x008a;
    L_0x0088:
        r2 = 9;
    L_0x008a:
        r7.c(r2);	 Catch:{ all -> 0x00e8 }
        r2 = r7.build();	 Catch:{ all -> 0x00e8 }
        r2 = (defpackage.anxl) r2;	 Catch:{ all -> 0x00e8 }
        r2 = (defpackage.amec) r2;	 Catch:{ all -> 0x00e8 }
        r5 = r8.d;	 Catch:{ all -> 0x00e8 }
        r4 = r4.c;	 Catch:{ all -> 0x00e8 }
        r5.a(r4, r9, r2);	 Catch:{ all -> 0x00e8 }
        goto L_0x00ad;
    L_0x009d:
        r2 = r8.c;	 Catch:{ all -> 0x00e8 }
        r4 = "IdentityId missing while updating UI for requirements.";
        r2.a(r4);	 Catch:{ all -> 0x00e8 }
        goto L_0x00ad;
    L_0x00a5:
        r2 = move-exception;
        r4 = r8.c;	 Catch:{ all -> 0x00e8 }
        r5 = "Can't update UI.";
        r4.a(r5, r2);	 Catch:{ all -> 0x00e8 }
    L_0x00ad:
        r1.add(r3);	 Catch:{ all -> 0x00e8 }
        goto L_0x0030;
    L_0x00b2:
        r0 = r8.j;	 Catch:{ all -> 0x00e8 }
        r0.put(r9, r1);	 Catch:{ all -> 0x00e8 }
    L_0x00b7:
        r10 = r10.c();	 Catch:{ all -> 0x00e8 }
        r0 = r10.a();	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x00e4;
    L_0x00c1:
        r0 = r8.a;	 Catch:{ all -> 0x00e8 }
        r1 = new amij;	 Catch:{ all -> 0x00e8 }
        r1.<init>(r8, r9);	 Catch:{ all -> 0x00e8 }
        r10 = r10.b();	 Catch:{ all -> 0x00e8 }
        r10 = (defpackage.bcpu) r10;	 Catch:{ all -> 0x00e8 }
        r2 = r10.b;	 Catch:{ all -> 0x00e8 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00e8 }
        r10 = r0.schedule(r1, r2, r10);	 Catch:{ all -> 0x00e8 }
        r0 = r8.i;	 Catch:{ all -> 0x00e8 }
        r0.put(r9, r10);	 Catch:{ all -> 0x00e8 }
        goto L_0x00e4;
    L_0x00dc:
        r9 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00e8 }
        r10 = "Cannot reschedule an already completed UploadFlow.";
        r9.<init>(r10);	 Catch:{ all -> 0x00e8 }
        throw r9;	 Catch:{ all -> 0x00e8 }
    L_0x00e4:
        monitor-exit(r8);
        return;
    L_0x00e6:
        monitor-exit(r8);
        return;
    L_0x00e8:
        r9 = move-exception;
        monitor-exit(r8);
        goto L_0x00ec;
    L_0x00eb:
        throw r9;
    L_0x00ec:
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amii.a(java.lang.String, amjd):void");
    }

    public final synchronized ambv c(String str) {
        alzf alzf = null;
        try {
            amea a = this.b.a(str);
            if (a != null) {
                if (a.L) {
                    alzg alzh;
                    if (a.M) {
                        alzh = new alzh();
                    } else {
                        alzh = new alzg();
                    }
                    alzf = alzh;
                }
            }
        } catch (alzc e) {
            xtl.a("UploadFlowController", e);
        }
        if (alzf == null) {
            a(str, true);
            amiq amiq = (amiq) this.h.get(str);
            if (amiq != null) {
                amiq.b = true;
                amiq.a.cancel(true);
            } else {
                this.a.execute(new amim(this, str));
            }
            ambv a2 = this.b.a(str, new alyw(this.e));
            this.f.a(a2);
            return a2;
        }
        return this.b.a(str, alzf);
    }

    public final synchronized void a(String str, boolean z) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.i.remove(str);
        if (scheduledFuture != null) {
            if (z) {
                scheduledFuture.cancel(false);
            }
        }
        List list = (List) this.j.remove(str);
        if (list != null) {
            amii.a(list);
        }
    }

    private static void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                amio amio = (amio) it.next();
                amio.b.b(amio);
                it.remove();
            }
        }
    }
}
