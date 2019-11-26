package defpackage;

/* renamed from: adif */
final class adif extends adit {
    public String a;
    public String b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private adiw i;
    private Integer j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Integer p;
    private Long q;
    private Integer r;

    adif() {
    }

    public final adit a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final adit b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final adit c(int i) {
        this.e = Integer.valueOf(i);
        return this;
    }

    public final adit d(int i) {
        this.f = Integer.valueOf(i);
        return this;
    }

    public final adit e(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    public final adit f(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public final adit a(adiw adiw) {
        if (adiw != null) {
            this.i = adiw;
            return this;
        }
        throw new NullPointerException("Null pageType");
    }

    public final adit g(int i) {
        this.j = Integer.valueOf(i);
        return this;
    }

    public final adit a(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final adit b(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final adit c(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public final adit d(boolean z) {
        this.n = Boolean.valueOf(z);
        return this;
    }

    public final adit e(boolean z) {
        this.o = Boolean.valueOf(z);
        return this;
    }

    public final adit h(int i) {
        this.p = Integer.valueOf(i);
        return this;
    }

    public final adit a(String str) {
        this.a = str;
        return this;
    }

    public final adit b(String str) {
        this.b = str;
        return this;
    }

    public final adit a(long j) {
        this.q = Long.valueOf(j);
        return this;
    }

    public final adit i(int i) {
        this.r = Integer.valueOf(i);
        return this;
    }

    public final adiu a() {
        String str = "";
        if (this.c == null) {
            str = str.concat(" mdxConnectionCountDay");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" mdxConnectionCountWeek");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" mdxConnectionCountMonth");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" castAvailableSessionCountDay");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" castAvailableSessionCountWeek");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" castAvailableSessionCountMonth");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" pageType");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" currentVideoDuration");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" fullScreen");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" hd");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" sd");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" playlistPlayback");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" videoControlsVisible");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" uncastedVideoCount");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" currentTime");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" casterCategory");
        }
        if (str.isEmpty()) {
            return new adig(this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i, this.j.intValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.intValue(), this.a, this.b, this.q.longValue(), this.r.intValue());
        }
        String str2 = "Missing required properties:";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    /* synthetic */ adif(adiu adiu) {
        adig adig = (adig) adiu;
        this.c = Integer.valueOf(adig.a);
        this.d = Integer.valueOf(adig.b);
        this.e = Integer.valueOf(adig.c);
        this.f = Integer.valueOf(adig.d);
        this.g = Integer.valueOf(adig.e);
        this.h = Integer.valueOf(adig.f);
        this.i = adig.g;
        this.j = Integer.valueOf(adig.h);
        this.k = Boolean.valueOf(adig.i);
        this.l = Boolean.valueOf(adig.j);
        this.m = Boolean.valueOf(adig.k);
        this.n = Boolean.valueOf(adig.l);
        this.o = Boolean.valueOf(adig.m);
        this.p = Integer.valueOf(adig.n);
        this.a = adig.o;
        this.b = adig.p;
        this.q = Long.valueOf(adig.q);
        this.r = Integer.valueOf(adig.r);
    }
}
