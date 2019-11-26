package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eux */
public final class eux implements akyw, ejn, eul {
    public final xhv a;
    public final TextView b;
    public axxd c;
    public acvx d;
    private final Context e;
    private final fnb f;
    private final fmx g;
    private final akpi h;
    private final afve i;
    private final Map j;
    private final afuu k;
    private final Map l;
    private axxf m;
    private axxf n;

    eux(Context context, fna fna, fmx fmx, xhv xhv, akpi akpi, afve afve, afuu afuu, TextView textView) {
        this.e = context;
        this.g = fmx;
        this.b = (TextView) amqw.a((Object) textView);
        this.a = xhv;
        this.h = akpi;
        this.i = afve;
        this.k = afuu;
        this.f = fna.a(textView);
        this.f.a();
        fnb fnb = this.f;
        fnb.a((int) R.dimen.text_button_icon_padding);
        this.f.d = new eva(this);
        this.l = new HashMap();
        this.j = amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    public final void a(axxd axxd, acvx acvx) {
        this.c = axxd;
        this.d = acvx;
        if (axxd == null) {
            d();
            return;
        }
        if (acvx != null) {
            acvx.a(axxd.g.d(), null);
        }
        this.m = null;
        this.n = null;
        this.l.clear();
        for (axxf axxf : this.c.b) {
            this.l.put(Integer.valueOf(axxf.b), axxf);
        }
        a(this.i.c(this.e));
        arup arup = axxd.e;
        if (arup == null) {
            arup = arup.c;
        }
        if (arup.a == 102716411) {
            aruh aruh;
            fmx fmx = this.g;
            arup arup2 = axxd.e;
            if (arup2 == null) {
                arup2 = arup.c;
            }
            if (arup2.a == 102716411) {
                aruh = (aruh) arup2.b;
            } else {
                aruh = aruh.j;
            }
            fmx.a(aruh, this.b, axxd, acvx);
        }
        this.h.a(axxd, this.b);
    }

    private final void d() {
        c();
        this.c = null;
        this.l.clear();
        this.m = null;
        this.n = null;
        this.f.a(null, null);
    }

    public final void c() {
        this.b.setVisibility(8);
    }

    public final void a(aphf aphf) {
        acvx acvx = this.d;
        if (acvx != null) {
            axxd axxd = this.c;
            if (!(axxd == null || (axxd.a & 64) == 0)) {
                acvx.a(3, new acvs(axxd.g), null);
            }
        }
        if (this.m != null && this.a.c()) {
            a(this.m.c);
            this.k.a(this.c, this.m.b, this.b, new euz(this), this.d);
        }
    }

    public final void a(int i) {
        if (this.n == null) {
            this.n = this.m;
        }
        this.m = (axxf) this.l.get(Integer.valueOf(i));
        axxf axxf = this.m;
        if (!(axxf == null || (axxf.a & 4) == 0)) {
            axxh axxh = axxf.d;
            if (axxh == null) {
                axxh = axxh.c;
            }
            if (axxh.a == 65153809) {
                aphg aphg;
                fnb fnb = this.f;
                axxh axxh2 = this.m.d;
                if (axxh2 == null) {
                    axxh2 = axxh.c;
                }
                if (axxh2.a == 65153809) {
                    aphg = (aphg) axxh2.b;
                } else {
                    aphg = aphg.s;
                }
                fnb.a(aphg, this.d, this.j);
                return;
            }
        }
        d();
    }

    public final void a() {
        axxf axxf = this.n;
        if (axxf != null) {
            a(axxf.b);
            this.n = null;
        }
    }

    public final void b() {
        this.n = null;
    }

    public final void a(afvg afvg) {
        if (!(afvg.a() && afvg.b() && afvg.c())) {
            if (this.l.containsKey(Integer.valueOf(this.c.d))) {
                a(this.c.d);
                return;
            }
        }
        a(this.c.c);
    }
}
