package defpackage;

/* renamed from: txx */
final class txx extends txw {
    private volatile udc a;
    private volatile amqp b;
    private volatile amqp c;
    private volatile amqp d;
    private volatile amqp e;
    private volatile amqp f;
    private volatile amqp g;
    private volatile amqp h;
    private volatile amqp i;
    private volatile amqp j;
    private volatile amqp k;
    private volatile amqp l;
    private volatile amqp m;
    private volatile amqp n;
    private final Object o = new Object();
    private final txw p;

    txx(txw txw) {
        this.p = txw;
    }

    public final udc a() {
        if (this.a == null) {
            synchronized (this.o) {
                if (this.a == null) {
                    udc a = this.p.a();
                    if (a == null) {
                        a = udc.a;
                    }
                    this.a = a;
                }
            }
        }
        return this.a;
    }

    public final amqp c() {
        if (this.c == null) {
            synchronized (this.o) {
                if (this.c == null) {
                    this.c = this.p.c();
                }
            }
        }
        return this.c;
    }

    public final amqp b() {
        if (this.b == null) {
            synchronized (this.o) {
                if (this.b == null) {
                    this.b = this.p.b();
                }
            }
        }
        return this.b;
    }

    public final amqp d() {
        if (this.d == null) {
            synchronized (this.o) {
                if (this.d == null) {
                    amqp d = this.p.d();
                    if (!d.a() || ((tzq) d.b()).c <= 0) {
                        d = ampo.a;
                    }
                    this.d = d;
                }
            }
        }
        return this.d;
    }

    public final amqp e() {
        if (this.e == null) {
            synchronized (this.o) {
                if (this.e == null) {
                    this.e = this.p.e();
                }
            }
        }
        return this.e;
    }

    public final amqp f() {
        if (this.f == null) {
            synchronized (this.o) {
                if (this.f == null) {
                    this.f = this.p.f();
                }
            }
        }
        return this.f;
    }

    public final amqp g() {
        if (this.g == null) {
            synchronized (this.o) {
                if (this.g == null) {
                    this.g = this.p.g();
                }
            }
        }
        return this.g;
    }

    public final amqp h() {
        if (this.h == null) {
            synchronized (this.o) {
                if (this.h == null) {
                    this.h = this.p.h();
                }
            }
        }
        return this.h;
    }

    public final amqp i() {
        if (this.i == null) {
            synchronized (this.o) {
                if (this.i == null) {
                    this.i = this.p.i();
                }
            }
        }
        return this.i;
    }

    public final amqp j() {
        if (this.j == null) {
            synchronized (this.o) {
                if (this.j == null) {
                    this.j = this.p.j();
                }
            }
        }
        return this.j;
    }

    public final amqp k() {
        if (this.k == null) {
            synchronized (this.o) {
                if (this.k == null) {
                    this.k = this.p.k();
                }
            }
        }
        return this.k;
    }

    public final amqp l() {
        if (this.l == null) {
            synchronized (this.o) {
                if (this.l == null) {
                    this.l = this.p.l();
                }
            }
        }
        return this.l;
    }

    public final amqp m() {
        if (this.m == null) {
            synchronized (this.o) {
                if (this.m == null) {
                    this.m = this.p.m();
                }
            }
        }
        return this.m;
    }

    public final amqp n() {
        if (this.n == null) {
            synchronized (this.o) {
                if (this.n == null) {
                    this.n = this.p.n();
                }
            }
        }
        return this.n;
    }
}
