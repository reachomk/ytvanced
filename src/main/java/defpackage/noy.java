package defpackage;

import java.util.HashMap;
import java.util.List;

/* renamed from: noy */
public final class noy {
    public final int a;
    public final long b;
    public final HashMap c;
    public npv d;
    public boolean e;
    public boolean f;
    public long g;
    private final int[] h;
    private long i;

    public noy(nou nou, int i, npf npf, int i2, nov nov) {
        this.a = i;
        npk a = npf.a(i2);
        long a2 = noy.a(npf, i2);
        npe npe = (npe) a.b.get(nov.d);
        List list = npe.b;
        this.b = a.a * 1000;
        npv npv = null;
        if (!npe.c.isEmpty()) {
            for (i = 0; i < npe.c.size(); i++) {
                npd npd = (npd) npe.c.get(i);
                if (!(npd.b == null || npd.c == null)) {
                    if (npv == null) {
                        npv = new npy();
                    }
                    npv.a(npd.b, npd.c);
                }
            }
        }
        this.d = npv;
        if (nov.a()) {
            this.h = new int[nov.f.length];
            i = 0;
            while (true) {
                nom[] nomArr = nov.f;
                if (i >= nomArr.length) {
                    break;
                }
                this.h[i] = noy.a(list, nomArr[i].a);
                i++;
            }
        } else {
            this.h = new int[]{noy.a(list, nov.e.a)};
        }
        this.c = new HashMap();
        i = 0;
        while (true) {
            int[] iArr = this.h;
            if (i < iArr.length) {
                npm npm = (npm) list.get(iArr[i]);
                this.c.put(npm.b.a, new nox(nou, this.b, a2, npm));
                i++;
            } else {
                a(a2, (npm) list.get(iArr[0]));
                return;
            }
        }
    }

    public final void a(npf npf, int i, nov nov) {
        npk a = npf.a(i);
        long a2 = noy.a(npf, i);
        List list = ((npe) a.b.get(nov.d)).b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i2 < iArr.length) {
                npm npm = (npm) list.get(iArr[i2]);
                nox nox = (nox) this.c.get(npm.b.a);
                npa d = nox.c.d();
                npa d2 = npm.d();
                nox.g = a2;
                nox.c = npm;
                if (d != null) {
                    nox.d = d2;
                    if (d.b()) {
                        int a3 = d.a(nox.g);
                        long a4 = d.a(a3) + d.a(a3, nox.g);
                        a3 = d2.a();
                        long a5 = d2.a(a3);
                        if (a4 == a5) {
                            nox.h += (d.a(nox.g) + 1) - a3;
                        } else if (a4 >= a5) {
                            nox.h += d.a(a5, nox.g) - a3;
                        } else {
                            throw new nli();
                        }
                    }
                    continue;
                }
                i2++;
            } else {
                a(a2, (npm) list.get(iArr[0]));
                return;
            }
        }
    }

    public final long a() {
        if (!this.e) {
            return this.i;
        }
        throw new IllegalStateException("Period has unbounded index");
    }

    private final void a(long j, npm npm) {
        npa d = npm.d();
        boolean z = true;
        if (d != null) {
            int a = d.a();
            int a2 = d.a(j);
            if (a2 != -1) {
                z = false;
            }
            this.e = z;
            this.f = d.b();
            this.g = this.b + d.a(a);
            if (!this.e) {
                this.i = (this.b + d.a(a2)) + d.a(a2, j);
            }
            return;
        }
        this.e = false;
        this.f = true;
        long j2 = this.b;
        this.g = j2;
        this.i = j2 + j;
    }

    private static int a(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(((npm) list.get(i)).b.a)) {
                return i;
            }
        }
        str = String.valueOf(str);
        String str2 = "Missing format id: ";
        throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    private static long a(npf npf, int i) {
        long b = npf.b(i);
        return b != -1 ? b * 1000 : -1;
    }
}
