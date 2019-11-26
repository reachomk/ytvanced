package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: wuo */
public final class wuo implements akot, akxj, akxw {
    public final RecyclerView a;
    private final akwy b;
    private aafn c;

    public wuo(Context context, acvx acvx, akpe akpe, aana aana, xci xci, akwb akwb, xoi xoi, bcaa bcaa) {
        this.a = new RecyclerView(context);
        this.a.a(new ans());
        this.b = new akwy(null, this.a, akpe, new akwn(), aana, xci, akwb, xoi, acvx, (akpb) ((akvz) bcaa.get()).get(), this, this);
    }

    public final void a(int i) {
    }

    public final void a(akpb akpb) {
    }

    public final boolean ap_() {
        return false;
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axtd axtd) {
        acvx acvx = akor.a;
        if ((axtd.a & 1) != 0) {
            axak axak = axtd.b;
            if (axak == null) {
                axak = axak.a;
            }
            akab akab = (akab) ajzv.a(ajzv.a(axak), akab.class);
            if (akab != null) {
                this.c = new aafn(akab);
                this.b.b(this.c);
                acvx.a(axtd.c.d(), null);
            }
        }
    }

    public final void H_() {
        this.b.H_();
    }
}
