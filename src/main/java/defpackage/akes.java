package defpackage;

import java.util.Map;

/* renamed from: akes */
final class akes extends akhp {
    private akhr a;
    private amur b;
    private Integer c;
    private Float d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Integer l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Float r;
    private Boolean s;
    private Boolean t;
    private Integer u;

    akes() {
    }

    /* Access modifiers changed, original: final */
    public final akhp a(akhr akhr) {
        if (akhr != null) {
            this.a = akhr;
            return this;
        }
        throw new NullPointerException("Null defaultSurfaceConfig");
    }

    /* Access modifiers changed, original: final */
    public final akhp a(Map map) {
        this.b = amur.a(map);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp a(float f) {
        this.d = Float.valueOf(f);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp a(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp b(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp c(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp d(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp e(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp f(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp g(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp b(int i) {
        this.l = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp h(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp i(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp j(boolean z) {
        this.o = Boolean.valueOf(z);
        return this;
    }

    public final akhp k(boolean z) {
        this.p = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp l(boolean z) {
        this.q = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp b(float f) {
        this.r = Float.valueOf(f);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp m(boolean z) {
        this.s = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhp n(boolean z) {
        this.t = Boolean.valueOf(z);
        return this;
    }

    public final akhp c(int i) {
        this.u = Integer.valueOf(i);
        return this;
    }

    public final akev a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" defaultSurfaceConfig");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" surfaceConfigMap");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" elementsImageClient");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" lithoPoolMultiplier");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" lithoPoolOnRB");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" useUnifiedTemplateResolver");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" prewarmUnifiedTemplateResolver");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" useArenaEkoProcessor");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" replaceRBGridRow");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" useLegacyVisible");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" cleanupRBComponentSubscriptions");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" cleanupRBComponentSubscriptionsRange");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" cleanupRBComponentSubscriptionsDuplicates");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" useUtpEkoArena");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" supportAnimationDrawable");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" supportElementsCommandExtension");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" enableElementsPerformanceMetric");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" elementsPerformanceMetricSampleRate");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" delayResolveInElementObserver");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" enablePbToFbMetric");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" ekoProcessorMaxLruCacheSize");
        }
        if (str.isEmpty()) {
            return new akep(this.a, this.b, this.c.intValue(), this.d.floatValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.intValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.floatValue(), this.s.booleanValue(), this.t.booleanValue(), this.u.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
