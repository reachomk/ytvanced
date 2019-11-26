package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lsy */
public final class lsy extends aktw implements ezn {
    public final aaas a;
    public final ezg b;
    public final axpw c;
    public final akpk d = new akpk();
    public final List e = new ArrayList();
    public boolean f;
    public boolean g;
    public azek h;
    private final lud i;
    private final akoh j = new akoh();

    public lsy(Context context, aaas aaas, ezg ezg, lud lud, akxm akxm, lta lta, akdk akdk, axpw axpw) {
        Object obj;
        this.a = aaas;
        this.b = ezg;
        this.i = lud;
        this.c = axpw;
        anxr access$000 = anxl.checkIsLite(axpq.b);
        axpw.a(access$000);
        Object b = axpw.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        this.f = ((Boolean) obj).booleanValue();
        akxm.a((akxt) lta);
        akxm.a((akxt) akdk);
        this.d.addAll(akxm.a((ajzw[]) ajzv.a(axpw.b).toArray(new ajzw[0])));
        this.d.a(new akwa(this));
        this.d.a(new isy());
        b(context.getResources().getConfiguration());
    }

    public final aknh a() {
        return this.j;
    }

    public final void a(Configuration configuration) {
        b(configuration);
    }

    public final void c() {
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void b() {
        int i = this.f ^ 1;
        this.f = i;
        if (i != 0) {
            lui lui = this.i.a;
            if (lui != null) {
                lui.j();
            }
        }
        for (lsx aD_ : this.e) {
            aD_.aD_();
        }
    }

    public final void a(String str, azek azek) {
        if (amqq.a(this.c.c, str)) {
            this.h = azek;
            for (lsx aE_ : this.e) {
                aE_.aE_();
            }
        }
    }

    public final String d() {
        return this.c.c;
    }

    private final void b(Configuration configuration) {
        this.j.a();
        if (configuration.orientation != 2) {
            this.j.a(this.d);
        }
    }
}
