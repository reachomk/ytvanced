package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xjo */
class xjo extends xkj {
    public final xax a;
    public final xhl b;
    public final int c;
    public final xkl d;
    public final xkl e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final boolean i;
    private final xsc j;
    private final aosr k;
    private final ScheduledExecutorService l;
    private final xgv m;
    private final Executor n;
    private final bqa o;
    private final xhj p;
    private final long q;
    private final Executor r;

    xjo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, boolean z, xax xax, xsc xsc, aosr aosr, ScheduledExecutorService scheduledExecutorService, xgv xgv, Executor executor, xhl xhl, bqa bqa, xhj xhj, int i, long j, Executor executor2, xkl xkl, xkl xkl2) {
        bcaa bcaa4 = bcaa;
        bcaa bcaa5 = bcaa2;
        bcaa bcaa6 = bcaa3;
        xax xax2 = xax;
        xsc xsc2 = xsc;
        aosr aosr2 = aosr;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        xhl xhl2 = xhl;
        bqa bqa2 = bqa;
        Executor executor3 = executor2;
        xkl xkl3 = xkl;
        xkl xkl4 = xkl2;
        if (bcaa4 != null) {
            this.f = bcaa4;
            if (bcaa5 != null) {
                this.g = bcaa5;
                if (bcaa6 != null) {
                    this.h = bcaa6;
                    this.i = z;
                    if (xax2 != null) {
                        this.a = xax2;
                        if (xsc2 != null) {
                            this.j = xsc2;
                            if (aosr2 != null) {
                                this.k = aosr2;
                                if (scheduledExecutorService2 != null) {
                                    this.l = scheduledExecutorService2;
                                    this.m = xgv;
                                    this.n = executor;
                                    if (xhl2 != null) {
                                        this.b = xhl2;
                                        if (bqa2 != null) {
                                            this.o = bqa2;
                                            this.p = xhj;
                                            this.c = i;
                                            this.q = j;
                                            if (executor3 != null) {
                                                this.r = executor3;
                                                if (xkl3 != null) {
                                                    this.d = xkl3;
                                                    if (xkl4 != null) {
                                                        this.e = xkl4;
                                                        return;
                                                    }
                                                    throw new NullPointerException("Null priorityExecutorGenerator");
                                                }
                                                throw new NullPointerException("Null normalExecutorGenerator");
                                            }
                                            throw new NullPointerException("Null deliveryExecutor");
                                        }
                                        throw new NullPointerException("Null cache");
                                    }
                                    throw new NullPointerException("Null volleyNetworkConfig");
                                }
                                throw new NullPointerException("Null timeoutExecutor");
                            }
                            throw new NullPointerException("Null androidCrolleyConfig");
                        }
                        throw new NullPointerException("Null clock");
                    }
                    throw new NullPointerException("Null commonConfigs");
                }
                throw new NullPointerException("Null uriRewriter");
            }
            throw new NullPointerException("Null headerDecoratorProvider");
        }
        throw new NullPointerException("Null cronetEngineProvider");
    }

    public final bcaa a() {
        return this.f;
    }

    public final bcaa b() {
        return this.g;
    }

    public final bcaa c() {
        return this.h;
    }

    public final boolean d() {
        return this.i;
    }

    public final xax e() {
        return this.a;
    }

    public final xsc f() {
        return this.j;
    }

    /* Access modifiers changed, original: final */
    public final aosr g() {
        return this.k;
    }

    public final ScheduledExecutorService i() {
        return this.l;
    }

    public final xgv k() {
        return this.m;
    }

    public final Executor l() {
        return this.n;
    }

    /* Access modifiers changed, original: final */
    public final xhl m() {
        return this.b;
    }

    public final bqa n() {
        return this.o;
    }

    public final xhj o() {
        return this.p;
    }

    /* Access modifiers changed, original: final */
    public final int p() {
        return this.c;
    }

    public final long q() {
        return this.q;
    }

    public final Executor r() {
        return this.r;
    }

    public final xkl s() {
        return this.d;
    }

    public final xkl t() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        boolean z = this.i;
        String valueOf4 = String.valueOf(this.a);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        String valueOf9 = String.valueOf(this.n);
        String valueOf10 = String.valueOf(this.b);
        String valueOf11 = String.valueOf(this.o);
        String valueOf12 = String.valueOf(this.p);
        int i = this.c;
        long j = this.q;
        String valueOf13 = String.valueOf(this.r);
        String valueOf14 = String.valueOf(this.d);
        boolean z2 = z;
        String valueOf15 = String.valueOf(this.e);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        int length6 = valueOf6.length();
        int length7 = valueOf7.length();
        int length8 = valueOf8.length();
        int length9 = valueOf9.length();
        int length10 = valueOf10.length();
        int length11 = valueOf11.length();
        int length12 = valueOf12.length();
        int length13 = valueOf13.length();
        String str = valueOf15;
        StringBuilder stringBuilder = new StringBuilder(((((((((((((((length + 417) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + length9) + length10) + length11) + length12) + length13) + valueOf14.length()) + valueOf15.length());
        stringBuilder.append("CronetRequestQueueConfig{cronetEngineProvider=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", headerDecoratorProvider=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", uriRewriter=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", useObscura=");
        stringBuilder.append(z2);
        stringBuilder.append(", commonConfigs=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", clock=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", androidCrolleyConfig=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", timeoutExecutor=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", requestFinishedListener=");
        stringBuilder.append(valueOf8);
        stringBuilder.append(", requestFinishedListenerExecutor=");
        stringBuilder.append(valueOf9);
        stringBuilder.append(", volleyNetworkConfig=");
        stringBuilder.append(valueOf10);
        stringBuilder.append(", cache=");
        stringBuilder.append(valueOf11);
        stringBuilder.append(", requestLogger=");
        stringBuilder.append(valueOf12);
        stringBuilder.append(", threadPoolSize=");
        stringBuilder.append(i);
        stringBuilder.append(", connectionTimeout=");
        stringBuilder.append(j);
        stringBuilder.append(", deliveryExecutor=");
        stringBuilder.append(valueOf13);
        stringBuilder.append(", normalExecutorGenerator=");
        stringBuilder.append(valueOf14);
        stringBuilder.append(", priorityExecutorGenerator=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xkj) {
            xkj xkj = (xkj) obj;
            if (this.f.equals(xkj.a()) && this.g.equals(xkj.b()) && this.h.equals(xkj.c()) && this.i == xkj.d() && this.a.equals(xkj.e()) && this.j.equals(xkj.f()) && this.k.equals(xkj.g()) && this.l.equals(xkj.i())) {
                xgv xgv = this.m;
                if (xgv == null ? xkj.k() != null : !xgv.equals(xkj.k())) {
                    Executor executor = this.n;
                    if (executor == null ? xkj.l() != null : !executor.equals(xkj.l())) {
                        if (this.b.equals(xkj.m()) && this.o.equals(xkj.n())) {
                            xhj xhj = this.p;
                            if (xhj == null ? xkj.o() == null : xhj.equals(xkj.o())) {
                                return this.c == xkj.p() && this.q == xkj.q() && this.r.equals(xkj.r()) && this.d.equals(xkj.s()) && this.e.equals(xkj.t());
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        xgv xgv = this.m;
        int i = 0;
        hashCode = (hashCode ^ (xgv != null ? xgv.hashCode() : 0)) * 1000003;
        Executor executor = this.n;
        hashCode = (((((hashCode ^ (executor != null ? executor.hashCode() : 0)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003;
        xhj xhj = this.p;
        if (xhj != null) {
            i = xhj.hashCode();
        }
        int i2 = this.c;
        long j = this.q;
        return ((((((((((hashCode ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
