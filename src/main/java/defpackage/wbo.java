package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: wbo */
public final class wbo extends was {
    private static final PriorityQueue f = new PriorityQueue();
    private static final PriorityQueue g = new PriorityQueue();
    public final aaga b;
    public final vuh c;
    public final vqp d;
    public ahjn e = null;
    private boolean h;
    private int i;
    private int j;
    private PriorityQueue k;
    private PriorityQueue l;
    private bcuo m;

    wbo(vuh vuh, aaga aaga, String str, ahjn ahjn, aiqh aiqh, vqp vqp) {
        PriorityQueue priorityQueue;
        this.c = vuh;
        this.b = aaga;
        this.j = -1;
        if (wbo.a(this.b)) {
            priorityQueue = new PriorityQueue(this.b.C().size() + 1, new wbq(this));
            for (aagv aagv : this.b.C()) {
                if (aagv.a(this.b.n()) >= 0) {
                    priorityQueue.add(aagv);
                }
            }
        } else {
            priorityQueue = f;
        }
        this.k = priorityQueue;
        int i = this.j;
        if (wbo.a(this.b)) {
            priorityQueue = g;
        } else {
            PriorityQueue priorityQueue2 = new PriorityQueue(this.b.D().size() + 1, a);
            for (aojo aojo : this.b.D()) {
                if (aojo.c > i) {
                    priorityQueue2.add(aojo);
                }
            }
            priorityQueue = priorityQueue2;
        }
        this.l = priorityQueue;
        this.e = (ahjn) amqw.a((Object) ahjn);
        this.d = vqp;
        vqp.a(null, str);
        vqp.a = aaga;
        vqp.c = this.e;
        this.m = aiqh.b.a(new wbn(this));
    }

    public final void a(int i, int i2) {
    }

    public final void a(ahkr ahkr) {
    }

    public final void a(vqi vqi) {
    }

    public final void a(vra vra) {
    }

    public final void a(vtb vtb) {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void j() {
    }

    public final void m() {
    }

    public final void o() {
    }

    public final void b() {
        bcuo bcuo = this.m;
        if (bcuo != null) {
            bcuo.b();
            this.m = null;
        }
    }

    public final vqp c() {
        return this.d;
    }

    public final String n() {
        aaga aaga = this.b;
        return aaga != null ? aaga.l() : null;
    }

    public final void l() {
        if (this.i >= 5) {
            return;
        }
        if (wbo.a(this.b)) {
            this.c.a(this.b.S(), this.b.ac(), this.d);
            return;
        }
        this.c.a(this.b.T(), this.d);
    }

    public final void k() {
        this.d.e = TimeUnit.SECONDS.toMillis((long) this.b.n());
        while (this.k.size() > 0) {
            this.c.a(((aagv) this.k.poll()).c, this.b.ac());
        }
        while (this.l.size() > 0) {
            this.c.a((aojo) this.l.poll());
        }
        if (wbo.a(this.b)) {
            this.c.a(this.b.E(), this.b.ac(), new aftl[0]);
        } else {
            this.c.a(this.b.F());
        }
        this.i = 5;
    }

    public final void g() {
        if (!(this.h || a())) {
            if (wbo.a(this.b)) {
                this.c.a(this.b.u(), this.b.ac(), new aftl[0]);
            } else {
                this.c.a(this.b.v());
            }
            this.h = true;
        }
        if (this.i == 0) {
            this.i = 1;
        } else if (wbo.a(this.b)) {
            this.c.a(this.b.K(), this.b.ac(), new aftl[0]);
        } else {
            this.c.a(this.b.L());
        }
    }

    public final void h() {
        if (wbo.a(this.b)) {
            this.c.a(this.b.G(), this.b.ac(), new aftl[0]);
        } else {
            this.c.a(this.b.H());
        }
    }

    public final void a(afif afif) {
        vqk vqk = new vqk(vqi.a(afif));
        if (this.i != 5) {
            if (wbo.a(this.b)) {
                this.c.a(this.b.G(), this.b.ac(), vqk);
                this.c.a(this.b.Q(), this.b.ac(), vqk);
            } else {
                this.c.a(this.b.H(), vqk);
                this.c.a(this.b.R(), vqk);
            }
            this.i = 5;
        }
    }

    public final void i() {
        if (wbo.a(this.b)) {
            this.c.a(this.b.I(), this.b.ac(), new aftl[0]);
        } else {
            this.c.a(this.b.J());
        }
    }

    public final void a(ahkm ahkm) {
        if (ahkm.g) {
            a((int) ahkm.a);
        }
    }

    public final void a(vqg vqg) {
        a((int) vqg.a);
    }

    private final void a(int i) {
        if (!this.h && a()) {
            if (wbo.a(this.b)) {
                this.c.a(this.b.u(), this.b.ac(), new aftl[0]);
            } else {
                this.c.a(this.b.v());
            }
            this.h = true;
        }
        this.d.e = (long) i;
        while (this.k.size() > 0 && i >= ((aagv) this.k.peek()).a(this.b.n())) {
            this.c.a(((aagv) this.k.poll()).c, this.b.ac());
        }
        while (this.l.size() > 0 && i >= ((aojo) this.l.peek()).c) {
            this.c.a((aojo) this.l.poll());
        }
        this.j = i;
        int n = this.b.n() * 1000;
        i = n > 0 ? (i << 2) / n : 0;
        if (i >= this.i) {
            for (n = i; n >= this.i; n--) {
                boolean a;
                aaga aaga;
                List w;
                if (wbo.a(this.b)) {
                    aaga = this.b;
                    if (n == 1) {
                        w = aaga.w();
                    } else if (n == 2) {
                        w = aaga.y();
                    } else if (n != 3) {
                        w = Collections.emptyList();
                    } else {
                        w = aaga.A();
                    }
                    a = this.c.a(w, this.b.ac(), new aftl[0]);
                } else {
                    aaga = this.b;
                    if (n == 1) {
                        w = aaga.x();
                    } else if (n == 2) {
                        w = aaga.z();
                    } else if (n != 3) {
                        w = Collections.emptyList();
                    } else {
                        w = aaga.B();
                    }
                    a = this.c.a(w);
                }
                if (a) {
                    break;
                }
            }
            this.i = i + 1;
        }
    }

    private final boolean a() {
        return this.b.r().b();
    }

    public final void a(aagw aagw) {
        aaga aaga = this.b;
        if (aaga != null && aaga.af() != null && this.b.af().contains(aagw)) {
            for (aahi aahi : aagw.c) {
                if (aahi.a == 1) {
                    this.c.a(aahi.b, this.b.ac());
                }
            }
        }
    }

    public final void a(aagw aagw, aaha aaha) {
        aaga aaga = this.b;
        if (aaga != null && aaga.af() != null && this.b.af().contains(aagw)) {
            for (Uri a : aaha.d) {
                this.c.a(a, this.b.ac());
            }
        }
    }

    public static boolean a(aaga aaga) {
        return aaga.t() == null;
    }
}
