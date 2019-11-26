package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: afiv */
public final class afiv implements ovi {
    private final ovi a;
    private final xhv b;
    private final afjc c;
    private final aajj d;
    private final xsc e;
    private final afjv f;

    public afiv(ovi ovi, xhv xhv, aajj aajj, xsc xsc, afjv afjv, afjc afjc) {
        this.a = ovi;
        this.b = xhv;
        this.c = afjc;
        this.d = aajj;
        this.e = xsc;
        this.f = afjv;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        String path = ovm.a.getPath();
        if (path != null && path.equals("/videoplayback")) {
            if (ovm.c != null) {
                afpc.a(2, afpf.media, "AbrDataSource: Unexpected http body.");
            }
            apui apui = (apui) apuj.j.createBuilder();
            afjh b = this.c.b(this.b.k());
            long a = this.e.a();
            long j = b.e;
            if (j != -1) {
                apui.a(b.d);
                apui.b(b.b);
                apui.a(a - j);
            }
            apui.e(this.b.m());
            afjs afjs = (afjs) this.f.get();
            if (afjs != null) {
                int i = afjs.b;
                if (i > 0 && afjs.c > 0) {
                    apui.c(i);
                    apui.d(afjs.c);
                }
            }
            List r = this.d.r();
            if (!r.isEmpty() && r.contains(Integer.valueOf(this.b.k()))) {
                apui.b(this.d.q() / 8);
            }
            njx njx = (njx) njy.c.createBuilder();
            apuj apuj = (apuj) ((anxl) apui.build());
            njx.copyOnWrite();
            njy njy = (njy) njx.instance;
            if (apuj != null) {
                njy.b = apuj;
                njy.a |= 1;
                ovm = new ovm(ovm.a, 2, ((njy) ((anxl) njx.build())).toByteArray(), ovm.d, ovm.e, ovm.f, ovm.g, ovm.h);
            } else {
                throw new NullPointerException();
            }
        }
        return this.a.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    public final Uri b() {
        return this.a.b();
    }

    public final void a() {
        this.a.a();
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
