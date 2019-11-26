package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;

/* renamed from: aanv */
public final class aanv {
    public final aoer a;
    public aaft b;
    public aaoe c;
    private aaft d;

    public aanv(aoer aoer) {
        this.a = aoer;
        if (aoer != null && (aoer.a & 128) != 0) {
            anxp anxp = aoer.g;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.c = new aaoe((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) b);
        }
    }

    public final Spanned a() {
        arml arml;
        aoer aoer = this.a;
        if ((aoer.a & 4) != 0) {
            arml = aoer.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public final aaft b() {
        if (this.d == null) {
            aygk aygk = this.a.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            this.d = new aaft(aygk);
        }
        return this.d;
    }

    public final Spanned c() {
        arml arml;
        aoer aoer = this.a;
        if ((aoer.a & 8) != 0) {
            arml = aoer.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    public final boolean d() {
        return this.a.f;
    }

    public final String e() {
        return this.c.b();
    }

    public final String f() {
        aaoe aaoe = this.c;
        if (aaoe.c == null) {
            aaoe.a();
        }
        return aaoe.c;
    }

    public final String g() {
        aaoe aaoe = this.c;
        if (aaoe.b == null) {
            aaoe.a();
        }
        return aaoe.b;
    }

    public final boolean h() {
        aaoe aaoe = this.c;
        if (aaoe.d == null) {
            aaoe.a();
        }
        Boolean bool = aaoe.d;
        return bool != null && bool.booleanValue();
    }

    public final String i() {
        aaoe aaoe = this.c;
        if (aaoe.a == null) {
            aaoe.a();
        }
        return aaoe.a;
    }

    public final boolean j() {
        aaoe aaoe = this.c;
        if (aaoe.e == null) {
            aaoe.a();
        }
        Boolean bool = aaoe.e;
        return bool != null && bool.booleanValue();
    }

    public final String k() {
        aaoe aaoe = this.c;
        if (aaoe.f == null) {
            aaoe.a();
        }
        return aaoe.f;
    }

    public final byte[] l() {
        return this.a.b.d();
    }
}
