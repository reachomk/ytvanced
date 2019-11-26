package defpackage;

import android.text.TextUtils;

/* renamed from: gml */
public final class gml implements xcp {
    public final Object a = new Object();
    public final xsc b;
    public acxt c;
    public long d;
    public boolean e;
    private final acxs f;
    private String g;

    public gml(acxs acxs, xsc xsc) {
        this.f = acxs;
        this.b = xsc;
    }

    public final aiqw a() {
        synchronized (this.a) {
            aiqw aiqw;
            if (this.c == null) {
                aiqw = aiqw.a;
                return aiqw;
            }
            aiqw = aiqw.b().a(this.c).a();
            return aiqw;
        }
    }

    public final void a(String str) {
        amqw.a((Object) str);
        synchronized (this.a) {
            if (this.c != null) {
                if (this.g == null) {
                    if (str != null) {
                        this.g = str;
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(String str) {
        if (this.c == null) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null || str2.equals(str)) {
            return true;
        }
        return false;
    }

    public final void c(String str) {
        synchronized (this.a) {
            if (this.c != null && b(str)) {
                this.c.a("r_vtc");
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c = null;
                this.g = null;
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            ahkn ahkn = (ahkn) obj;
            synchronized (this.a) {
                if (this.c != null) {
                    if (!TextUtils.isEmpty(ahkn.e)) {
                        atyl atyl = (atyl) atyi.l.createBuilder();
                        atyl.b(ahkn.e);
                        this.c.a((atyi) ((anxl) atyl.build()));
                    }
                }
            }
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void a(int i, int i2, String str) {
        a(i, i2);
        a(str);
    }

    public final void a(int i, int i2) {
        long a = this.b.a();
        if (this.c != null) {
            synchronized (this.a) {
                acxt acxt = this.c;
                if (!(acxt == null || this.e)) {
                    acxt.a("aa");
                    this.e = true;
                }
            }
            b();
        }
        acxt a2 = this.f.a(atyw.LATENCY_ACTION_REEL_WATCH);
        atyn atyn = (atyn) atyk.i.createBuilder();
        if (i == 1) {
            atyn.b(6);
        } else if (i == 2) {
            atyn.b(5);
        } else if (i == 3) {
            atyn.b(11);
        } else if (i == 4) {
            atyn.b(10);
        } else if (i != 5) {
            atyn.b(2);
        } else {
            atyn.b(3);
        }
        atyt atyt = (atyt) atyq.e.createBuilder();
        atyt.copyOnWrite();
        atyq atyq = (atyq) atyt.instance;
        atyq.a |= 1;
        atyq.b = i2 - 1;
        atyt.a(2);
        atyt.copyOnWrite();
        atyq atyq2 = (atyq) atyt.instance;
        atyq2.a |= 4;
        atyq2.d = 0;
        atyq2 = (atyq) ((anxl) atyt.build());
        atyl atyl = (atyl) atyi.l.createBuilder();
        atyl.a(atyq2);
        atyl.a(atyn);
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            long j = this.d;
            if (j > 0) {
                j = a - j;
                if (j < 2147483647L) {
                    atyl.copyOnWrite();
                    atyi atyi = (atyi) atyl.instance;
                    atyi.a |= 1048576;
                    atyi.g = (int) j;
                }
            }
        }
        a2.a((atyi) ((anxl) atyl.build()));
        synchronized (this.a) {
            this.c = a2;
            this.e = false;
            this.d = a;
        }
    }
}
