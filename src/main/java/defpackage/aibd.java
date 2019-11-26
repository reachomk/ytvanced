package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aibd */
public class aibd {
    public final aibo A;
    public final aibl B;
    public final aibk C;
    private aiaw a;
    public final aizy c;
    public final aibb d;
    public final aeeu e;
    public final ScheduledExecutorService f;
    public final Executor g;
    public aibg h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ahkn p;
    public airi q;
    public Map r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final Object x;
    public aahr[] y;
    public final aibf z;

    public aibd(aizy aizy, aibb aibb, aeeu aeeu, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this(null, aizy, null, aibb, aeeu, scheduledExecutorService, executor);
    }

    public aibd(Context context, aizy aizy, aiaw aiaw, aibb aibb, aeeu aeeu, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.x = new Object();
        this.z = new aibf(this);
        this.c = aizy;
        this.d = (aibb) amqw.a((Object) aibb);
        this.e = (aeeu) amqw.a((Object) aeeu);
        this.f = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.g = (Executor) amqw.a((Object) executor);
        this.a = aiaw;
        this.h = b() ? new aibg(this, context) : null;
        this.A = new aibo(this);
        this.B = new aibl(this);
        this.C = new aibk(this);
    }

    public final void a() {
        this.d.f();
    }

    public final boolean b() {
        return this.a != null;
    }

    public final void c() {
        boolean z = false;
        if (b() && this.a.a()) {
            z = true;
        }
        this.d.d_(z);
    }

    public final void d() {
        this.d.a(this.s, this.t, this.u, Math.min(Math.max(this.v, this.w), this.u));
    }

    public final void e() {
        ahkn ahkn = this.p;
        if (ahkn != null) {
            Object obj = null;
            if (ahkn.h) {
                aakj aakj = ahkn.b;
                if (aakj != null && aakj.i()) {
                    obj = 1;
                }
            }
            if (this.q != airi.PLAYBACK_INTERRUPTED) {
                if (this.q.a()) {
                    boolean z = this.i;
                    if (z && this.p.f == null) {
                        this.d.a(aicd.m);
                    } else {
                        aicd aicd;
                        aibb aibb = this.d;
                        if (z) {
                            aicd = aicd.j;
                        } else {
                            aicd = aicd.i;
                        }
                        aibb.a(aicd);
                    }
                } else if (this.q.a(airi.READY)) {
                    aibb aibb2;
                    aicd aicd2;
                    if (this.i) {
                        if (this.p.h) {
                            aibb2 = this.d;
                            if (obj == null) {
                                aicd2 = aicd.g;
                            } else {
                                aicd2 = aicd.h;
                            }
                            aibb2.a(aicd2);
                        } else if (this.o) {
                            aibb2 = this.d;
                            if (this.n) {
                                aicd2 = aicd.b;
                            } else {
                                aicd2 = aicd.c;
                            }
                            aibb2.a(aicd2);
                        } else if (this.l) {
                            this.d.a(aicd.e);
                        } else {
                            this.d.a(aicd.f);
                        }
                    } else if (this.p.h) {
                        aibb2 = this.d;
                        if (obj == null) {
                            aicd2 = aicd.k;
                        } else {
                            aicd2 = aicd.l;
                        }
                        aibb2.a(aicd2);
                    } else if (this.o) {
                        aibb2 = this.d;
                        if (this.n) {
                            aicd2 = aicd.b;
                        } else {
                            aicd2 = aicd.c;
                        }
                        aibb2.a(aicd2);
                    } else if (this.l) {
                        this.d.a(aicd.d);
                    } else {
                        this.d.a(aicd.a);
                    }
                }
            }
        }
    }
}
