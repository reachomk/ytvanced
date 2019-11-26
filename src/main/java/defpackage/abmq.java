package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: abmq */
public final class abmq implements aftt {
    private final SharedPreferences a;
    private final bcaa b;
    private final bcaa c;
    private final Executor d;
    private final boolean e;
    private boolean f;

    public abmq(SharedPreferences sharedPreferences, bcaa bcaa, bcaa bcaa2, aaex aaex, Executor executor) {
        this.a = sharedPreferences;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = executor;
        Class cls = aaes.class;
        boolean z = false;
        if (aaex.a.getInt(cls.toString(), -1) == -1) {
            amqp c = amqp.c((aaeu) aaex.c.get(cls));
            if (c.a() && ((aaeu) c.b()).b()) {
                int keyAt;
                Editor edit = aaex.a.edit();
                String cls2 = cls.toString();
                SparseArray a = ((aaeu) c.b()).a();
                double a2 = aaex.b.a(0.0d, 1.0d);
                float f = 0.0f;
                for (int i = 0; i < a.size(); i++) {
                    keyAt = a.keyAt(i);
                    f += ((Float) a.get(keyAt)).floatValue();
                    if (a2 < ((double) f)) {
                        break;
                    }
                }
                keyAt = 0;
                edit.putInt(cls2, keyAt).apply();
            }
        }
        for (Class cls3 : aaex.c.keySet()) {
            if (aaex.a.getInt(cls3.toString(), 0) == 11210755) {
                z = true;
                break;
            }
        }
        this.e = z;
    }

    public final void a(String str) {
        String str2 = "visitor_id";
        if (this.a.getString(str2, null) == null && !str.contains(str2)) {
            b();
        }
    }

    public final boolean a() {
        return this.e;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0063 */
    /* JADX WARNING: Missing block: B:31:0x0071, code skipped:
            return;
     */
    private final synchronized void b() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ all -> 0x0074 }
        if (r0 != 0) goto L_0x0072;
    L_0x0005:
        r0 = r4.b;	 Catch:{ all -> 0x0074 }
        r0 = r0.get();	 Catch:{ all -> 0x0074 }
        r0 = (defpackage.aazb) r0;	 Catch:{ all -> 0x0074 }
        r1 = new aazf;	 Catch:{ all -> 0x0074 }
        r2 = r0.c;	 Catch:{ all -> 0x0074 }
        r1.<init>(r2);	 Catch:{ all -> 0x0074 }
        r2 = 0;
        r2 = new byte[r2];	 Catch:{ all -> 0x0074 }
        r1.a(r2);	 Catch:{ all -> 0x0074 }
        r2 = r4.d;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r3 = r0.a;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r1 = r3.a(r1, r2);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r2 = new aazc;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r2.<init>(r0);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r0 = defpackage.aniv.a;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r0 = defpackage.anic.a(r1, r2, r0);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r2 = 4;
        r0 = r0.get(r2, r1);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r0 = (defpackage.atoe) r0;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r0 = r0.b;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        if (r0 != 0) goto L_0x003d;
    L_0x003b:
        r0 = defpackage.asic.k;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
    L_0x003d:
        r0 = r0.b;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        if (r1 != 0) goto L_0x0070;
    L_0x0045:
        r1 = r4.a;	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r1 = r1.edit();	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r2 = "visitor_id";
        r0 = r1.putString(r2, r0);	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        r0.apply();	 Catch:{ TimeoutException -> 0x0063, InterruptedException -> 0x005c, ExecutionException -> 0x0055 }
        goto L_0x0070;
    L_0x0055:
        r0 = 22;
        r4.a(r0);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x005c:
        r0 = 21;
        r4.a(r0);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x0063:
        r0 = r4.f;	 Catch:{ all -> 0x0074 }
        if (r0 != 0) goto L_0x0070;
    L_0x0067:
        r0 = 1;
        r4.f = r0;	 Catch:{ all -> 0x0074 }
        r0 = 4;
        r4.a(r0);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x0070:
        monitor-exit(r4);
        return;
    L_0x0072:
        monitor-exit(r4);
        return;
    L_0x0074:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmq.b():void");
    }

    private final void a(int i) {
        afqg afqg = (afqg) this.c.get();
        apfj apfj = (apfj) apfg.c.createBuilder();
        apfj.copyOnWrite();
        apfg apfg = (apfg) apfj.instance;
        apfg.a |= 1;
        apfg.b = i - 1;
        apfg apfg2 = (apfg) ((anxl) apfj.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (apfg2 != null) {
            asmw.c = apfg2;
            asmw.b = 281;
            afqg.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }
}
