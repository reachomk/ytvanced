package defpackage;

import com.google.android.gms.cast.CastDevice;

/* renamed from: san */
public final class san extends bbe {
    private final saf a;
    private boolean b = false;

    public san(saf saf) {
        this.a = saf;
    }

    public final void a(bbs bbs) {
        String.valueOf(bbs).length();
        saf saf = this.a;
        if (saf.k != 3) {
            Object obj;
            saf.i.a("route-id", bbs.c);
            CastDevice a = CastDevice.a(bbs.r);
            this.a.a(a, bbs);
            if (a == null) {
                obj = "Null";
            } else {
                obj = a.c;
            }
            String valueOf = String.valueOf(obj);
            String str = "onRouteSelected: mSelectedDevice=";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
                return;
            } else {
                str.concat(valueOf);
                return;
            }
        }
        saf.d(4);
        this.a.j();
    }

    public final void b(bbs bbs) {
        String.valueOf(bbs).length();
        this.a.a(null, bbs);
    }

    public final void a(bbb bbb, bbs bbs) {
        if (!bbb.b().equals(bbs)) {
            d();
            for (sbm d : this.a.j) {
                d.d();
            }
        }
        saf saf = this.a;
        if (saf.k == 1) {
            if (bbs.c.equals(saf.i.a("route-id"))) {
                Object obj;
                String.valueOf(bbs).length();
                this.a.d(2);
                CastDevice a = CastDevice.a(bbs.r);
                if (a == null) {
                    obj = "Null";
                } else {
                    obj = a.c;
                }
                String valueOf = String.valueOf(obj);
                String str = "onRouteAdded: Attempting to recover a session with device: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.a.a(a, bbs);
            }
        }
    }

    public final void b(bbb bbb, bbs bbs) {
        d();
        for (sbm f : this.a.j) {
            f.f();
        }
    }

    public final void c(bbb bbb, bbs bbs) {
        d();
    }

    private final void d() {
        boolean a = bbb.a(this.a.e, 3);
        if (a != this.b) {
            this.b = a;
            for (sbm e : this.a.j) {
                e.e();
            }
        }
    }

    static {
        sdf.a(san.class);
    }
}
