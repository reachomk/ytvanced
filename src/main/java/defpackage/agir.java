package defpackage;

import android.net.Uri;
import android.util.SparseArray;

/* renamed from: agir */
final class agir implements agie {
    private final SparseArray a = new SparseArray();
    private String b;
    private long c;
    private long d;
    private boolean e;
    private agqn f;
    private final /* synthetic */ agip g;

    private final void a(String str) {
        agid agid = (agid) this.g.b.get(str);
        if (agid != null) {
            agid.i();
        }
    }

    public final agql a(int i) {
        return (agql) this.a.get(i);
    }

    public final void a(agql agql) {
        synchronized (this.g.l) {
            this.a.put(agql.r(), agql);
            f();
            a(this.b);
        }
    }

    public final void b(int i) {
        synchronized (this.g.l) {
            if (this.a.get(i) != null) {
                f();
                a(this.b);
            }
            this.a.remove(i);
        }
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final void a(long j, long j2) {
        synchronized (this.g.l) {
            if (j != 0) {
                this.c = j;
                f();
                a(this.b);
            }
            if (j2 != 0) {
                this.d = j2;
                f();
                a(this.b);
            }
        }
    }

    public final void a(boolean z) {
        synchronized (this.g.l) {
            this.e = z;
            f();
            a(this.b);
        }
    }

    public final agqn e() {
        synchronized (this.g.l) {
            if (this.f == null) {
                agql a = a();
                agql b = b();
                if (a == null) {
                    if (b == null) {
                        return null;
                    }
                }
                this.f = new agqn(a, b, this.e);
            }
            agqn agqn = this.f;
            return agqn;
        }
    }

    public final agqn a(agho agho) {
        Throwable th;
        agir agir = this;
        Object obj = agir.g.l;
        synchronized (obj) {
            Object obj2;
            agqn agqn;
            if (agho != null) {
                int i = 0;
                agql agql = null;
                agql agql2 = null;
                while (i < agir.a.size()) {
                    try {
                        try {
                            Uri a;
                            agql agql3 = (agql) agir.a.valueAt(i);
                            arlx arlx = (arlx) ((anxo) agql3.a().a.toBuilder());
                            String q = agql3.q();
                            int r = agql3.r();
                            String str = ((arlv) arlx.instance).r;
                            long t = agql3.t();
                            long j = ((arlv) arlx.instance).n;
                            agsu agsu = ((agdl) agho).a;
                            if (agsu != null) {
                                obj2 = obj;
                                a = agsu.a(q, r, str, t, j, ((agdl) agho).b);
                            } else {
                                obj2 = obj;
                                a = null;
                            }
                            arlx.a(a == null ? "" : a.toString());
                            agql a2 = agql3.y().a(new aahr((arlv) ((anxl) arlx.build()), agql3.q(), agql3.a().c)).a();
                            boolean b = a2.b();
                            if (b) {
                                agql2 = a2;
                            }
                            if (!b) {
                                agql = a2;
                            }
                            i++;
                            agir = this;
                            obj = obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                obj2 = obj;
                if (agql == null) {
                    if (agql2 == null) {
                        return null;
                    }
                }
                agqn = new agqn(agql, agql2, this.e);
                return agqn;
            }
            obj2 = obj;
            agqn = e();
            return agqn;
        }
    }

    public final agql a() {
        for (int i = 0; i < this.a.size(); i++) {
            agql agql = (agql) this.a.valueAt(i);
            if (!agql.b()) {
                return agql;
            }
        }
        return null;
    }

    public final agql b() {
        for (int i = 0; i < this.a.size(); i++) {
            agql agql = (agql) this.a.valueAt(i);
            if (agql.b()) {
                return agql;
            }
        }
        return null;
    }

    private final void f() {
        this.f = null;
    }

    /* synthetic */ agir(agip agip, agql agql, agql agql2) {
        this.g = agip;
        boolean z = (agql == null && agql2 == null) ? false : true;
        amqw.a(z, (Object) "One stream pair cannot hold a pair of null streams");
        if (agql != null) {
            this.a.put(agql.r(), agql);
            this.b = agql.q();
        }
        if (agql2 != null) {
            this.a.put(agql2.r(), agql2);
            this.b = agql2.q();
        }
        this.e = true;
    }
}
