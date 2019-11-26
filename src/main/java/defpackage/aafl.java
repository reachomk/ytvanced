package defpackage;

/* renamed from: aafl */
public final class aafl {
    public aafc a;
    public aafc b;
    public aafc c;
    public aafc d;
    public aafc e;
    public aafc f;
    public aafc g;
    public aafc h;

    public aafl(aozg aozg, amqd amqd) {
        amqw.a((Object) aozg);
        for (aozl aozl : aozg.b) {
            int a = aozp.a(aozl.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a != 1) {
                if (a == 2) {
                    this.c = new aafc(aozl, amqd);
                } else if (a == 3) {
                    this.b = new aafc(aozl, amqd);
                } else if (a == 4) {
                    this.d = new aafc(aozl, amqd);
                } else if (a != 5) {
                }
            }
            this.a = new aafc(aozl, amqd);
        }
        for (aozl aozl2 : aozg.c) {
            int a2 = aozp.a(aozl2.b);
            if (a2 == 0) {
                a2 = 1;
            }
            a2--;
            if (a2 == 1) {
                this.e = new aafc(aozl2, amqd);
            } else if (a2 == 2) {
                this.g = new aafc(aozl2, amqd);
            } else if (a2 == 3) {
                this.f = new aafc(aozl2, amqd);
            } else if (a2 == 4) {
                this.h = new aafc(aozl2, amqd);
            }
        }
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final aafc a(boolean z, boolean z2, boolean z3) {
        Object obj = null;
        Object obj2 = (z && b()) ? 1 : null;
        if (z2 && a()) {
            obj = 1;
        }
        aafc aafc;
        if (obj2 == null && obj == null) {
            if (z3) {
                aafc = this.e;
                if (aafc != null) {
                    return aafc;
                }
            }
            return this.a;
        } else if (obj2 == null && obj != null) {
            if (z3) {
                aafc = this.g;
                if (aafc != null) {
                    return aafc;
                }
            }
            return this.c;
        } else if (obj2 != null && obj == null) {
            if (z3) {
                aafc = this.f;
                if (aafc != null) {
                    return aafc;
                }
            }
            return this.b;
        } else if (obj2 == null || obj == null) {
            return null;
        } else {
            if (z3) {
                aafc = this.h;
                if (aafc != null) {
                    return aafc;
                }
            }
            return this.d;
        }
    }
}
