package defpackage;

/* renamed from: akeu */
final class akeu extends akhu {
    private Integer a;
    private Float b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Integer l;
    private Float m;
    private Boolean n;
    private Boolean o;
    private Float p;

    akeu() {
    }

    /* Access modifiers changed, original: final */
    public final akhu a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu a(float f) {
        this.b = Float.valueOf(f);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu a(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu b(boolean z) {
        this.d = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu c(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu d(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu e(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu f(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu g(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu h(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu i(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu b(int i) {
        this.l = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akhu b(float f) {
        this.m = Float.valueOf(f);
        return this;
    }

    public final akhu j(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public final akhu k(boolean z) {
        this.o = Boolean.valueOf(z);
        return this;
    }

    public final akhu c(float f) {
        this.p = Float.valueOf(f);
        return this;
    }

    public final akhr a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" lithoInitRange");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" lithoRangeRatio");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" useAdapterProxy");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" recyclerViewItemPrefetch");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" recyclerViewFixedSize");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" recyclerViewDisableViewCache");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" useIncrementalMountForRb");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" scheduleAsyncInitRangeOne");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" scheduleAsyncInitRangeAll");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" useSizeSpecYouTubeElement");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" useAsyncPresenterPreparation");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" asyncPrepareInitRange");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" asyncPrepareRangeRatio");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" useIncrementalMountForAsyncPrepare");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" useFlatbufferRuntime");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" imagePrefetchRangeRatio");
        }
        if (str.isEmpty()) {
            return new aker(this.a.intValue(), this.b.floatValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.intValue(), this.m.floatValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.floatValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
