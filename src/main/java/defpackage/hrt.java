package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: hrt */
public final class hrt extends fja {
    public hru ae;
    public fag af;
    public ezu ag;
    private fag ah;
    private hrs ai;
    private hkp aj;
    private hrv ak;

    public static boolean a(fiw fiw) {
        return fiw.a == hrt.class;
    }

    public static fiw a(apxu apxu, boolean z) {
        Bundle b = fiw.b();
        b.putBoolean("detail_pane", z);
        return fiw.a(hrt.class, apxu, b);
    }

    public static fiw a(apxu apxu) {
        return hrt.a(apxu, false);
    }

    public static fiw f() {
        return hrt.a(ekc.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((hrw) xse.a(p())).a(this);
        View inflate = layoutInflater.inflate(R.layout.downloads_page_fragment, viewGroup, false);
        acvx t = t();
        if (t != null) {
            this.aj = new hkp(t);
            hru hru = this.ae;
            hrv hrv = this.ak;
            this.ai = new hrs((hso) hru.a((hso) hru.a.get(), 1), (xci) hru.a((xci) hru.b.get(), 2), (hnl) hru.a((hnl) hru.c.get(), 3), (hqa) hru.a((hqa) hru.d.get(), 4), (hng) hru.a((hng) hru.e.get(), 5), hrv != null ? hrv.a : null, (hkp) hru.a(this.aj, 7), (CharSequence) hru.a(Y(), 8), af());
            hrs hrs = this.ai;
            hrs.i = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
            hrs.j = (RecyclerView) inflate.findViewById(R.id.downloads_list);
            RecyclerView recyclerView = hrs.j;
            recyclerView.getContext();
            recyclerView.a(new ans());
            faf i = this.af.i();
            i.a(this.ag);
            this.ah = i.a();
            return inflate;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }

    public final void W_() {
        long j;
        super.W_();
        hkp hkp = this.aj;
        atst atst = null;
        hkp.a.a(acwl.j, aa(), null);
        Object obj = this.ai;
        hso hso = obj.a;
        hrr hrr = obj.l;
        if (hrr != null) {
            atst = hrr.a;
        }
        akpe akpe = (akpe) hso.a((akpe) hso.a.get(), 1);
        akwn akwn = (akwn) hso.a((akwn) hso.b.get(), 2);
        hou hou = (hou) hso.a((hou) hso.c.get(), 3);
        xci xci = (xci) hso.a((xci) hso.d.get(), 4);
        xoi xoi = (xoi) hso.a((xoi) hso.e.get(), 5);
        akph akph = (akph) hso.a((akph) hso.f.get(), 6);
        eod eod = (eod) hso.a((eod) hso.g.get(), 7);
        hoc hoc = (hoc) hso.a((hoc) hso.h.get(), 8);
        eki eki = (eki) hso.a((eki) hso.i.get(), 9);
        hsf hsf = r5;
        Context context = (Context) hso.a((Context) hso.j.get(), 10);
        hsf hsf2 = new hsf(akpe, akwn, hou, xci, xoi, akph, eod, hoc, eki, context, atst, (RecyclerView) hso.a(obj.j, 12), (hkp) hso.a(obj.f, 13));
        obj.k = hsf;
        obj.b.a(obj);
        obj.b.a(obj.c);
        obj.b.a(obj.e);
        obj.c.a();
        hqa hqa = obj.d;
        apxn a = hqa.b.a();
        if (a == null) {
            j = 0;
        } else {
            avnm avnm = a.l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            j = avnm.m;
        }
        hqa.a(j);
        if (obj.h) {
            aknh akpk = new akpk();
            akpk.add(new fah(obj.g));
            obj.k.a(akpk);
        }
        obj.k.d();
        obj.i.b();
    }

    public final void N_() {
        super.N_();
        hrs hrs = this.ai;
        hrs.b.b(hrs);
        hrs.b.b(hrs.c);
        hrs.b.b(hrs.e);
        hrs.k.c();
        hrs.k = null;
        hkp hkp = hrs.f;
        hkp.g = 0;
        hkp.d.clear();
        hkp.c.clear();
        hkp.e.clear();
        hkp.f.clear();
    }

    public final Object ai() {
        hrs hrs = this.ai;
        akyd akyd = null;
        if (hrs == null) {
            return null;
        }
        hsf hsf = hrs.k;
        if (hsf != null) {
            akyd = hsf.E_();
        }
        return new hrv(new hrr(akyd));
    }

    public final void a(Object obj) {
        if (obj instanceof hrv) {
            this.ak = (hrv) obj;
        }
    }

    public final CharSequence Y() {
        return this.a.getString(R.string.offline_videos_title);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hrs hrs = this.ai;
        if (hrs != null) {
            hsf hsf = hrs.k;
            if (hsf != null) {
                hsf.a(configuration);
            }
        }
    }

    public final fag X() {
        return this.ah;
    }
}
