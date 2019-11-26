package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

/* renamed from: hsf */
public final class hsf extends akwy implements hko {
    public final Context a;
    private final hoc b;
    private final eki c;
    private final RecyclerView q;
    private final hkp r;
    private final akpk t = new akpk();
    private final hsm u = new hsm(this, hsi.a);
    private final hsm v = new hsm(this, hsh.a);
    private Parcelable w;

    public hsf(akpe akpe, akwn akwn, hou hou, xci xci, xoi xoi, akph akph, eod eod, hoc hoc, eki eki, Context context, akyd akyd, RecyclerView recyclerView, hkp hkp) {
        hoc hoc2 = hoc;
        eki eki2 = eki;
        akyd akyd2 = akyd;
        hkp hkp2 = hkp;
        hou hou2 = hou;
        super(akyd.a(akyd), recyclerView, akpe, akwn, hou2, xci, eod.a(hou2, hkp2.a), xoi, hkp2.a, akph, akxw.n, akxj.d);
        this.b = hoc2;
        this.c = eki2;
        this.a = context;
        this.q = recyclerView;
        this.r = hkp;
        akyd akyd3 = akyd;
        if (akyd3 instanceof hsl) {
            this.w = ((hsl) akyd3).a;
        } else {
            a(new aafn(hoc2.a(eki2, 2)));
        }
        b(this.t);
    }

    public final void H_() {
        a(true, "downloads_page_downloads_item_section_identifier");
    }

    public final void a(boolean z, String... strArr) {
        Parcelable j = z ? this.q.n.j() : null;
        String str = strArr[0];
        akvy a = a(str);
        if (a instanceof hry) {
            ((hry) a).s();
        } else {
            str = String.valueOf(str);
            String str2 = "Item section not found or not a ContinuableController: ";
            xtl.c(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
        if (j != null) {
            this.q.n.a(j);
        }
        am_();
    }

    public final hkp a() {
        return this.r;
    }

    public final void d() {
        super.d();
        Parcelable parcelable = this.w;
        if (parcelable != null) {
            this.q.n.a(parcelable);
            this.w = null;
        }
        an_().i.b(this.u);
        if (h() != null) {
            h().i.b(this.v);
        }
        am_();
    }

    public final void c() {
        super.c();
        an_().i.a(this.u);
        if (h() != null) {
            h().i.a(this.v);
        }
    }

    public final akyd E_() {
        return new hsl(super.E_(), this.q.n.j());
    }

    public final void am_() {
        this.t.clear();
        if (this.c.b()) {
            this.t.add(this.b.a(this.c));
            this.t.a(new hsk(this));
            this.t.a(hsj.a);
        }
    }

    public final hry an_() {
        return (hry) a("downloads_page_downloads_item_section_identifier");
    }

    private final hry h() {
        return (hry) a("downloads_page_recommendations_item_section_identifier");
    }

    public final boolean g() {
        hry h = h();
        return h != null && h.al_();
    }
}
