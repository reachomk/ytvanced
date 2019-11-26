package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: iqd */
public final class iqd extends iqk {
    public final xoi a;
    public final akpk b = new akpk();
    private final agur c;
    private final Executor d;
    private final agvz e;

    public iqd(bcaa bcaa, aiuu aiuu, bcaa bcaa2, bcaa bcaa3, hsy hsy, hmc hmc, hmj hmj, akkq akkq, xhv xhv, agur agur, agvs agvs, bcaa bcaa4, akpe akpe, Executor executor, xci xci, aaas aaas, xoi xoi, zyw zyw, zzl zzl, hqp hqp, bcaa bcaa5, hng hng, RecyclerView recyclerView, LoadingFrameLayout loadingFrameLayout, Activity activity, acvx acvx) {
        RecyclerView recyclerView2 = recyclerView;
        Activity activity2 = activity;
        hsy hsy2 = hsy;
        hmc hmc2 = hmc;
        hmj hmj2 = hmj;
        akkq akkq2 = akkq;
        xci xci2 = xci;
        aaas aaas2 = aaas;
        zyw zyw2 = zyw;
        hqp hqp2 = hqp;
        hng hng2 = hng;
        Context context = activity;
        super(loadingFrameLayout, activity, acvx, zyw, zzl);
        this.c = agur;
        this.d = executor;
        this.a = xoi;
        this.e = ((agwc) bcaa.get()).b();
        ahcn ahcn = (ahcn) bcaa2.get();
        ahcd ahcd = (ahcd) bcaa3.get();
        agvz agvz = this.e;
        eqe eqe = r1;
        eqe eqe2 = new eqe(activity2);
        Activity activity3 = activity2;
        akox hmm = new hmm(context, xci2, ahcn, ahcd, agvz, akkq2, null, null, eqe, hsy2, hmc2, hmj2, aaas2, zyw2, hqp2, hng2);
        aiuu.c = new aiuq(activity3, null);
        xci xci3 = xci;
        hmm = new hmg(context, akkq.c(), xci3, this.e.n(), xhv, agvs, new eqf(activity3), aaas);
        recyclerView2.a(new ans());
        aknw aknw = new aknw();
        aknw.a(agqp.class, hmm);
        aknw.a(agqi.class, hmm);
        aknw.a(auwl.class, new akpa(bcaa4));
        aknw.a(apaj.class, new akpa(bcaa5));
        apa a = akpe.a(aknw);
        a.a(this.b);
        recyclerView2.a(a);
    }

    public final void a(Configuration configuration) {
    }

    public final void b() {
    }

    public final boolean c() {
        return false;
    }

    public final void a(String str) {
        this.o.a();
        this.c.a(this.e, str, wxh.a(this.d, new iqc(this)));
    }

    public final /* bridge */ /* synthetic */ iqm d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ String e() {
        return this.x;
    }

    public final /* bridge */ /* synthetic */ List f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ axny g() {
        return this.u;
    }

    public final /* bridge */ /* synthetic */ void a(String str, axny axny) {
        super.a(str, axny);
    }

    public final /* bridge */ /* synthetic */ void b(Bundle bundle) {
        super.b(bundle);
    }
}
