package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: adna */
public final class adna implements ajlm {
    private final Context a;
    private final xsc b;
    private final Executor c;
    private final xci d;
    private final bctz e;
    private final bcaa f;
    private final airt g;
    private final bcaa h;
    private final boolean i;
    private final ajll j;
    private final xua k;
    private final ajpw l;

    public adna(Context context, xsc xsc, Executor executor, xci xci, bctz bctz, bcaa bcaa, airt airt, bcaa bcaa2, boolean z, bcud bcud, bcud bcud2, bdfg bdfg, bdfg bdfg2, xua xua, ajpw ajpw) {
        this.a = context;
        this.b = xsc;
        this.c = executor;
        xci xci2 = xci;
        this.d = xci2;
        this.e = bctz;
        this.f = bcaa;
        this.g = airt;
        this.h = bcaa2;
        this.i = z;
        this.j = new ajll(xci2, new HashSet(), bcud, bcud2, bdfg, bdfg2);
        this.k = xua;
        this.l = ajpw;
    }

    public final ajlj a(aiqq aiqq, aiqw aiqw) {
        adms adms = new adms(this.a, this.b, this.c, this.d, this.e, ((adqf) this.f.get()).c(), this.g, (aajx) this.h.get(), this.i, this.j, this.k, this.l);
        bdfu bdfu = adms.d;
        admv admv = adms.c;
        bcuo[] bcuoArr = new bcuo[1];
        bctz a = ajcg.a(adms.b, admy.a);
        admv = admv.a.c;
        admv.getClass();
        bcuoArr[0] = a.a(new admx(admv));
        bdfu.a(bcuoArr);
        adms.a.a((Object) adms);
        return adms;
    }

    public final ajlj a(ajpz ajpz, aiqw aiqw) {
        return a(null, null);
    }
}
