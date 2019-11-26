package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* renamed from: hki */
public final class hki extends fja implements xcp {
    public xci ae;
    public xhv af;
    public aiuu ag;
    public agwc ah;
    public hio ai;
    public hnl aj;
    public hng ak;
    public ezq al;
    public hpd am;
    public fag an;
    public String ao;
    public Future ap;
    public hin aq;
    private agvz ar;
    private String as;
    private faa at;

    public static fiw a(String str, boolean z, String str2) {
        amqw.a((Object) str);
        Class cls = hki.class;
        Bundle b = fiw.b();
        b.putString("playlist_id", str);
        b.putInt("network_connectivity_requirement", 1);
        b.putBoolean("detail_pane", z);
        if (!amqu.a(str2)) {
            b.putString("offline_playlist_top_level_tab_id", str2);
        }
        return new fiw(cls, b);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.as = this.j.getString("playlist_id");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.offline_playlist_fragment, viewGroup, false);
        ((hkl) xse.a(p())).a(this);
        this.at = this.an.b;
        this.ar = this.ah.b();
        this.ag.c = new aiuq(this.a, null);
        hio hio = this.ai;
        acvx t = t();
        agvz agvz = this.ar;
        String str = this.as;
        hin hin = r9;
        hin hin2 = new hin((Activity) hio.a((Activity) hio.a.get(), 1), (xci) hio.a((xci) hio.b.get(), 2), (akkq) hio.a((akkq) hio.c.get(), 3), (ahcn) hio.a((ahcn) hio.d.get(), 4), (ahcd) hio.a((ahcd) hio.e.get(), 5), (hiw) hio.a((hiw) hio.f.get(), 6), (hsy) hio.a((hsy) hio.g.get(), 7), (hmc) hio.a((hmc) hio.h.get(), 8), (hpt) hio.a((hpt) hio.i.get(), 9), (hmj) hio.a((hmj) hio.j.get(), 10), (akoe) hio.a((akoe) hio.k.get(), 11), (aaas) hio.a((aaas) hio.l.get(), 12), (zyw) hio.a((zyw) hio.m.get(), 13), (hqp) hio.a((hqp) hio.n.get(), 14), (akpb) hio.a((akpb) hio.o.get(), 15), (hng) hio.a((hng) hio.p.get(), 16), (acvx) hio.a(t, 17), (agvz) hio.a(agvz, 18), (String) hio.a(str, 19), af());
        this.aq = hin;
        hin hin3 = this.aq;
        hin3.v = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        hin3.w = (ListView) inflate.findViewById(R.id.videos);
        if (hin3.t) {
            Object fah = new fah();
            hin3.A = akoz.a(hin3.o, fah, null);
            hin3.A.a_(new akor(), fah);
            hin3.A.K_().setLayoutParams(new LayoutParams(-1, -2));
            hin3.w.addHeaderView(hin3.A.K_());
        }
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater2.inflate(R.layout.playlist_header, hin3.w, false);
        hin3.w.addHeaderView(viewGroup2);
        hiw hiw = hin3.f;
        agvx n = hin3.r.n();
        acvx acvx = hin3.q;
        auac auac = auac.INDIFFERENT;
        String str2 = hin3.s;
        Activity activity = (Activity) hiw.a((Activity) hiw.a.get(), 1);
        akkq akkq = (akkq) hiw.a((akkq) hiw.b.get(), 2);
        iml iml = (iml) hiw.a((iml) hiw.c.get(), 3);
        ahcd ahcd = (ahcd) hiw.a((ahcd) hiw.d.get(), 4);
        boolean z = hin3.t;
        hiw.a((ffo) hiw.e.get(), 5);
        fll fll = (fll) hiw.a((fll) hiw.f.get(), 6);
        hna hna = (hna) hiw.a((hna) hiw.g.get(), 7);
        hir hir = r11;
        iml iml2 = iml;
        boolean z2 = z;
        hir hir2 = new hir(activity, akkq, iml2, ahcd, fll, hna, (ekg) hiw.a((ekg) hiw.h.get(), 8), (agvx) hiw.a(n, 9), (acvx) hiw.a(acvx, 10), (auac) hiw.a(auac, 11), (ViewGroup) hiw.a(viewGroup2, 12), (String) hiw.a(str2, 13), z2);
        hin3.B = hir;
        aknw aknw = new aknw();
        Context context = hin3.a;
        View view = inflate;
        aknw.a(agqp.class, new hmm(context, hin3.b, hin3.d, hin3.e, hin3.r, hin3.c, hin3.s, null, new eqe(context), hin3.g, hin3.h, hin3.j, hin3.l, hin3.m, hin3.n, hin3.p));
        akoc a = hin3.k.a(aknw);
        hin3.x = new akpk();
        a.a(hin3.x);
        hin3.w.setAdapter(a);
        hin3.z = (TextView) layoutInflater2.inflate(R.layout.offline_videos_footer, hin3.w, false);
        hin3.z.setVisibility(8);
        hin3.w.addFooterView(hin3.z);
        return view;
    }

    public final void W_() {
        super.W_();
        this.ae.a((Object) this);
        this.ae.a(this.aj);
        this.ae.a(this.ak);
        Object obj = this.aq;
        obj.a(true);
        obj.b.a(obj);
        obj.b.a(obj.B);
        hir hir = obj.B;
        hir.f.a(hir.c);
        this.ap = this.am.a(this.as, new hkk(this));
        this.aj.a();
    }

    public final void B() {
        super.B();
        if (this.af.c()) {
            this.ar.l().a();
        }
    }

    public final void N_() {
        super.N_();
        this.ae.b(this);
        this.ae.b(this.aj);
        this.ae.b(this.ak);
        hin hin = this.aq;
        wxi wxi = hin.y;
        if (!(wxi == null || wxi.b())) {
            hin.y.a();
        }
        hin.y = null;
        if (hin.A != null) {
            hin.w.reclaimViews(new ArrayList());
            hin.o.a(hin.A.K_());
            hin.A = null;
        }
        hin.b.b(hin);
        hin.B.a();
        hin.b.b(hin.B);
        Future future = this.ap;
        if (future != null) {
            future.cancel(false);
            this.ap = null;
        }
    }

    public final ezz W() {
        if (this.c == null) {
            faf i = this.an.i();
            i.a = this.ao;
            i.c = this.at;
            this.c = i.a();
        }
        return this.c;
    }

    public final CharSequence Y() {
        return this.ao;
    }

    public final fag X() {
        return this.an;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agkz.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((agkz) obj).a.equals(this.as)) {
            this.ac.a(true);
            return null;
        }
        return clsArr;
    }
}
