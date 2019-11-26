package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: xjn */
final class xjn implements xkm {
    public bcaa a;
    public bcaa b;
    public xsc c;
    private bcaa d;
    private Boolean e;
    private xax f;
    private aosr g;
    private ScheduledExecutorService h;
    private xgv i;
    private Executor j;
    private xhl k;
    private bqa l;
    private xhj m;
    private Integer n;
    private Long o;
    private Executor p;
    private xkl q;
    private xkl r;

    xjn() {
    }

    public final xkm a(aosr aosr) {
        if (aosr != null) {
            this.g = aosr;
            return this;
        }
        throw new NullPointerException("Null androidCrolleyConfig");
    }

    public final xkm a(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService != null) {
            this.h = scheduledExecutorService;
            return this;
        }
        throw new NullPointerException("Null timeoutExecutor");
    }

    public final xkm a(xgv xgv) {
        this.i = xgv;
        return this;
    }

    public final xkm a(Executor executor) {
        this.j = executor;
        return this;
    }

    public final xkm a(xhl xhl) {
        if (xhl != null) {
            this.k = xhl;
            return this;
        }
        throw new NullPointerException("Null volleyNetworkConfig");
    }

    public final xkm a(bqa bqa) {
        if (bqa != null) {
            this.l = bqa;
            return this;
        }
        throw new NullPointerException("Null cache");
    }

    public final xkm a(xhj xhj) {
        this.m = xhj;
        return this;
    }

    public final xkm a(int i) {
        this.n = Integer.valueOf(i);
        return this;
    }

    public final xkm a() {
        this.o = Long.valueOf(5000);
        return this;
    }

    public final xkm b(Executor executor) {
        if (executor != null) {
            this.p = executor;
            return this;
        }
        throw new NullPointerException("Null deliveryExecutor");
    }

    public final xkm a(xkl xkl) {
        this.q = xkl;
        return this;
    }

    public final xkm b(xkl xkl) {
        this.r = xkl;
        return this;
    }

    public final xkj b() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" cronetEngineProvider");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" headerDecoratorProvider");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" uriRewriter");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" useObscura");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" commonConfigs");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" clock");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" androidCrolleyConfig");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" timeoutExecutor");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" volleyNetworkConfig");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" cache");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" threadPoolSize");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" connectionTimeout");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" deliveryExecutor");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" normalExecutorGenerator");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" priorityExecutorGenerator");
        }
        if (str.isEmpty()) {
            return new xjq(this.a, this.b, this.d, this.e.booleanValue(), this.f, this.c, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n.intValue(), this.o.longValue(), this.p, this.q, this.r);
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
