package defpackage;

/* renamed from: asv */
public final class asv {
    public final zj a = new zj();
    public final zr b = new zr();

    public final void a() {
        this.a.clear();
        this.b.c();
    }

    public final void a(aqj aqj, api api) {
        asu asu = (asu) this.a.get(aqj);
        if (asu == null) {
            asu = asu.a();
            this.a.put(aqj, asu);
        }
        asu.b = api;
        asu.a |= 4;
    }

    public final boolean a(aqj aqj) {
        asu asu = (asu) this.a.get(aqj);
        return (asu == null || (asu.a & 1) == 0) ? false : true;
    }

    public final api a(aqj aqj, int i) {
        int a = this.a.a((Object) aqj);
        if (a >= 0) {
            asu asu = (asu) this.a.c(a);
            if (asu != null) {
                int i2 = asu.a;
                if ((i2 & i) != 0) {
                    api api;
                    int i3 = (i ^ -1) & i2;
                    asu.a = i3;
                    if (i == 4) {
                        api = asu.b;
                    } else if (i == 8) {
                        api = asu.c;
                    } else {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    if ((i3 & 12) == 0) {
                        this.a.d(a);
                        asu.a(asu);
                    }
                    return api;
                }
            }
        }
        return null;
    }

    public final void a(long j, aqj aqj) {
        this.b.b(j, aqj);
    }

    public final void b(aqj aqj, api api) {
        asu asu = (asu) this.a.get(aqj);
        if (asu == null) {
            asu = asu.a();
            this.a.put(aqj, asu);
        }
        asu.c = api;
        asu.a |= 8;
    }

    /* Access modifiers changed, original: final */
    public final void b(aqj aqj) {
        asu asu = (asu) this.a.get(aqj);
        if (asu == null) {
            asu = asu.a();
            this.a.put(aqj, asu);
        }
        asu.a |= 1;
    }

    /* Access modifiers changed, original: final */
    public final void c(aqj aqj) {
        asu asu = (asu) this.a.get(aqj);
        if (asu != null) {
            asu.a &= -2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void d(aqj aqj) {
        int b = this.b.b();
        while (true) {
            b--;
            if (b >= 0) {
                if (aqj == this.b.c(b)) {
                    this.b.a(b);
                    break;
                }
            } else {
                break;
            }
        }
        asu asu = (asu) this.a.remove(aqj);
        if (asu != null) {
            asu.a(asu);
        }
    }
}
