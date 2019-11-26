package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: agto */
final /* synthetic */ class agto implements Runnable {
    private final agtl a;
    private final aiqq b;
    private final wxf c;

    agto(agtl agtl, aiqq aiqq, wxf wxf) {
        this.a = agtl;
        this.b = aiqq;
        this.c = wxf;
    }

    public final void run() {
        agqp agqp;
        agtl agtl = this.a;
        aiqq aiqq = this.b;
        wxf wxf = this.c;
        boolean z = false;
        if (TextUtils.isEmpty(aiqq.b())) {
            agvv agvv = agtl.a;
            String c = aiqq.c();
            aiqq.b();
            agvw a = agvv.a(c);
            int d = aiqq.d() != -1 ? aiqq.d() : 0;
            List c2 = a.c();
            agqp = xty.a(d, 0, c2.size()) ? (agqp) c2.get(d) : null;
        } else {
            agqp = agtl.a().k().h(aiqq.b());
        }
        if (!aiqq.m() && agtl.a(agtl.b)) {
            z = true;
        }
        agtl.a(agqp, wxf, z);
    }
}
