package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.Executor;

/* renamed from: agbk */
public final class agbk extends agrf implements xcp {
    public final Context a;
    public final xmc b;
    private final xci d;
    private final Executor e;
    private final bcaa f;
    private final afpu g;
    private final ahdm h;
    private final agem i;
    private final SharedPreferences j;
    private final agpq k;
    private final agbl l = agbj.a;
    private volatile agak m;

    public agbk(Context context, xci xci, Executor executor, xmc xmc, bcaa bcaa, afpu afpu, ahdm ahdm, agem agem, agtv agtv, agdj agdj, SharedPreferences sharedPreferences, agpq agpq) {
        this.a = context;
        this.d = xci;
        this.e = executor;
        this.b = xmc;
        this.g = afpu;
        this.f = bcaa;
        this.h = ahdm;
        this.i = agem;
        this.j = sharedPreferences;
        this.k = agpq;
        xci.a((Object) this);
        xci.a((Object) agtv);
        agdj.a.a((Object) agdj);
        agdj.f = false;
    }

    /* JADX WARNING: Missing block: B:19:0x0059, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.g;	 Catch:{ all -> 0x0061 }
        r0 = r0.c();	 Catch:{ all -> 0x0061 }
        r1 = defpackage.afpt.g;	 Catch:{ all -> 0x0061 }
        if (r0 == r1) goto L_0x005f;
    L_0x000b:
        r1 = r4.h;	 Catch:{ all -> 0x0061 }
        r1 = r1.a();	 Catch:{ all -> 0x0061 }
        r2 = 1;
        if (r1 == r2) goto L_0x005a;
    L_0x0014:
        r3 = 2;
        if (r1 == r3) goto L_0x0058;
    L_0x0017:
        r4.a(r0);	 Catch:{ all -> 0x0061 }
        r0 = r4.m;	 Catch:{ all -> 0x0061 }
        r0 = r0.k();	 Catch:{ all -> 0x0061 }
        r0 = r0.a();	 Catch:{ all -> 0x0061 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0051;
    L_0x002a:
        r0 = r4.m;	 Catch:{ all -> 0x0061 }
        r0 = r0.n();	 Catch:{ all -> 0x0061 }
        r0 = r0.a();	 Catch:{ all -> 0x0061 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0051;
    L_0x003a:
        r0 = r4.m;	 Catch:{ all -> 0x0061 }
        r0 = r0.o();	 Catch:{ all -> 0x0061 }
        r0 = r0.a();	 Catch:{ all -> 0x0061 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0051;
    L_0x004a:
        r0 = r4.h;	 Catch:{ all -> 0x0061 }
        r1 = 0;
        r0.a(r1);	 Catch:{ all -> 0x0061 }
        goto L_0x0058;
    L_0x0051:
        r0 = r4.h;	 Catch:{ all -> 0x0061 }
        r0.a(r2);	 Catch:{ all -> 0x0061 }
        monitor-exit(r4);
        return;
    L_0x0058:
        monitor-exit(r4);
        return;
    L_0x005a:
        r4.a(r0);	 Catch:{ all -> 0x0061 }
        monitor-exit(r4);
        return;
    L_0x005f:
        monitor-exit(r4);
        return;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbk.a():void");
    }

    public final synchronized agvz b() {
        afpt c = this.g.c();
        if (c == afpt.g) {
            return this.c;
        }
        try {
            if (this.m == null) {
                a(c);
            }
            return this.m;
        } catch (SQLiteException e) {
            if (this.i.g()) {
                return this.c;
            }
            throw e;
        }
    }

    public final synchronized String c() {
        return b().f();
    }

    public final String d() {
        return this.j.getString("current_offline_store_tag", "NO_OP_STORE_TAG");
    }

    public final boolean e() {
        if (this.m != null) {
            agak agak = this.m;
            if (agak.M && agak.N.d.isDone()) {
                return true;
            }
        }
        return false;
    }

    private final void a(afpt afpt) {
        amqw.a((Object) afpt);
        if (afpt == afpt.g) {
            throw new IllegalArgumentException("Identity must be signed in.");
        } else if (this.m == null || !afpt.a().equals(this.m.L)) {
            agpq agpq = this.k;
            agpq.b = agpq.a.a(atyw.LATENCY_ACTION_OFFLINE_STORE_START);
            f();
            this.m = this.l.a(this.a, afpt.a());
            ((afzf) this.f.get()).a(this.m.z);
            this.m.a();
            this.d.a(this.m);
            acxt acxt = this.k.b;
            if (acxt != null) {
                acxt.a("st_a");
            }
        }
    }

    private final void f() {
        if (this.m != null) {
            this.d.b(this.m);
            this.m.c();
            this.m = null;
            ((afzf) this.f.get()).a(null);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afpw.class, afqf.class, afqh.class};
        } else if (i == 0) {
            this.e.execute(new agbm(this, ((afpw) obj).a));
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else if (i == 2) {
            f();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
