package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: afgp */
public final class afgp {
    public static final afgp a = new afgp(aajj.b, aajs.a, null, null);
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final Runnable f;
    public final Handler g;
    public volatile long h = Long.MAX_VALUE;
    public float i;
    public float j;
    public boolean k;
    public final int l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final float p;
    private final float q;
    private boolean r;
    private boolean s;
    private final float t;
    private final Runnable u = new afgo(this);

    public afgp(aajj aajj, aajs aajs, Runnable runnable, Handler handler) {
        awdg awdg;
        arhh arhh;
        int aG;
        arhh arhh2;
        float f;
        float f2;
        this.m = aajs.a();
        this.o = aajs.h();
        if (aajs.e()) {
            this.l = aajj.aG();
        } else if (aajs.f()) {
            awdg = aajj.c;
            if ((awdg.a & 2) != 0) {
                arhh = awdg.d;
                if (arhh == null) {
                    arhh = arhh.bv;
                }
                if (arhh.av) {
                    aG = aajj.aG();
                    this.l = aG;
                }
            }
            aG = 2;
            this.l = aG;
        } else {
            this.l = 2;
        }
        this.r = aajs.h();
        this.n = aajs.b();
        aG = aajs.f;
        this.b = aG;
        float f3 = (float) aG;
        this.i = f3;
        this.j = f3;
        this.p = aajj.P();
        awdg = aajj.c;
        if ((awdg.a & 2) != 0) {
            arhh = awdg.d;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            f3 = arhh.ay;
        } else {
            f3 = 0.0f;
        }
        if (f3 <= 0.0f) {
            f3 = 1.0f;
        }
        this.t = f3;
        this.c = aajs.t();
        awdg awdg2 = aajj.c;
        if ((awdg2.a & 2) != 0) {
            arhh2 = awdg2.d;
            if (arhh2 == null) {
                arhh2 = arhh.bv;
            }
            f = arhh2.az;
        } else {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            f = 60.0f;
        }
        amqw.a(f > 0.0f);
        double log = Math.log(0.5d);
        double d = (double) (f / 2.0f);
        Double.isNaN(d);
        this.d = (float) (1.0d - Math.exp(log / d));
        awdg2 = aajj.c;
        if ((awdg2.a & 2) != 0) {
            arhh2 = awdg2.d;
            if (arhh2 == null) {
                arhh2 = arhh.bv;
            }
            f = arhh2.aA;
        } else {
            f = 0.0f;
        }
        if (f <= 0.0f) {
            f = 0.75f;
        }
        this.q = f;
        awdg awdg3 = aajj.c;
        if ((awdg3.a & 2) != 0) {
            arhh arhh3 = awdg3.d;
            if (arhh3 == null) {
                arhh3 = arhh.bv;
            }
            f2 = arhh3.aB;
        } else {
            f2 = 0.0f;
        }
        if (f2 <= 0.0f) {
            f2 = 3.0f;
        }
        this.e = f2;
        this.f = runnable;
        this.g = handler;
    }

    public final int a() {
        return (int) Math.ceil((double) this.i);
    }

    public final int b() {
        return a() * this.c;
    }

    public final long c() {
        return TimeUnit.MILLISECONDS.toMicros((long) b());
    }

    public final boolean a(long j) {
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 2) {
                boolean z = true;
                if (i2 == 3) {
                    if (!this.s) {
                        if (!this.r) {
                            z = false;
                        } else if (c(j)) {
                            return z;
                        } else {
                            return false;
                        }
                    }
                    return z;
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        return false;
                    }
                    if (this.s || (this.r && c(j))) {
                        int i3 = this.b;
                        if (this.j < ((float) i3) * this.q) {
                            this.i = Math.min(this.i + this.t, this.p);
                        }
                        return true;
                    }
                    if (this.r) {
                        b(true);
                    }
                    return false;
                }
            }
            return this.s;
        }
        throw null;
    }

    public final boolean b(long j) {
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 2) {
            if (i2 != 5) {
                return false;
            }
            b(false);
            return false;
        } else if (this.r && c(j)) {
            return true;
        } else {
            return false;
        }
    }

    private final void b(boolean z) {
        boolean z2 = this.k;
        this.k = z;
        Handler handler = this.g;
        if (handler != null && this.f != null) {
            if (!z2 && z) {
                handler.post(this.u);
            } else if (z2 && !z) {
                handler.removeCallbacks(this.u);
            }
        }
    }

    public final void d() {
        int i = this.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                boolean z = true;
                if (!this.s && (!this.r || this.n)) {
                    z = false;
                }
                this.s = z;
                b(false);
            }
            this.r = false;
            return;
        }
        throw null;
    }

    public final void a(boolean z) {
        if (this.m) {
            z = this.o && z;
            this.r = z;
            this.s = false;
            b(false);
        }
    }

    private final boolean c(long j) {
        if (this.m && j != 0 && j != -9223372036854775807L && j >= 0 && this.h != Long.MAX_VALUE && this.h > 0) {
            if (Math.round(((float) this.c) * this.p) < ((int) ((this.h / 1000) - j))) {
                return true;
            }
        }
        return false;
    }

    public final int a(long j, long j2) {
        if (this.r && j > 0 && j2 > 0 && j2 > j) {
            j2 -= j;
            int i = (int) j2;
            try {
                amqw.a(((long) i) == j2, "Out of range: %s", j2);
                return i;
            } catch (IllegalArgumentException unused) {
            }
        }
        return -1;
    }
}
