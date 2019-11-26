package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wsy */
public final class wsy implements aaaj, akot {
    public final Context a;
    public final ImageView b = ((ImageView) this.f.findViewById(R.id.expand_button));
    public azns c;
    private final aaas d;
    private final aaag e;
    private final LinearLayout f = ((LinearLayout) LayoutInflater.from(this.a).inflate(R.layout.ypc_offers_list_layout, null));
    private final LinearLayout g;
    private final LinearLayout h = ((LinearLayout) this.f.findViewById(R.id.additional_offer_info_list_container));
    private final TextView i = ((TextView) this.f.findViewById(R.id.offer_info_header));
    private final View j = this.f.findViewById(R.id.separator);
    private final View k = this.f.findViewById(R.id.expanded_separator);
    private final wtd l;
    private final LinearLayout m = ((LinearLayout) this.f.findViewById(R.id.collapsed_offers));
    private final LinearLayout n = ((LinearLayout) this.f.findViewById(R.id.expanded_offers));
    private final TextView o;
    private int p = 0;
    private List q;
    private akor r;

    public wsy(Context context, aaas aaas, aaag aaag, akvz akvz) {
        this.a = (Context) amqw.a((Object) context);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (aaag) amqw.a((Object) aaag);
        this.m.setOnClickListener(new wtb(this));
        this.b.setOnClickListener(new wta(this));
        this.g = (LinearLayout) this.f.findViewById(R.id.single_ypc_offers);
        this.l = new wtd(this.a, (akpb) akvz.get());
        this.o = (TextView) this.m.findViewById(R.id.more_offer_info_header);
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        this.p = 0;
        this.l.a(this.g);
        this.n.removeAllViews();
        List list = this.q;
        if (list != null) {
            list.clear();
        }
    }

    public final void b() {
        this.n.removeAllViews();
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                aznm aznm = (aznm) this.q.get(i);
                if (aznm != null) {
                    this.n.addView(this.l.a(this.l.a(this.r), aznm));
                }
            }
        }
    }

    public final void c() {
        xpr.a(this.m, false);
        xpr.a(this.o, false);
        xpr.a(this.n, true);
        xpr.a(this.k, false);
        this.p = 2;
    }

    public final void d() {
        xpr.a(this.h, false);
    }

    public final void a(azns azns) {
        CharSequence[] a = wot.a(azns.i, this.d);
        if (a == null || a.length <= 0) {
            xpr.a(this.h, false);
            return;
        }
        xpr.a(this.h, true);
        int i = 0;
        while (i < a.length) {
            if (i >= this.h.getChildCount()) {
                View.inflate(this.a, R.layout.ypc_offers_list_additional_offer_info_text, this.h);
            }
            xpr.a((TextView) this.h.getChildAt(i), a[i]);
            i++;
        }
        while (i < this.h.getChildCount()) {
            xpr.a(this.h.getChildAt(i), false);
            i++;
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        List list;
        azns azns = (azns) obj;
        this.c = azns;
        this.r = akor;
        arml arml = null;
        akor.a.a(azns.j.d(), null);
        this.g.removeAllViews();
        amul a = wot.a(this.c);
        for (int i = 0; i < a.size(); i++) {
            aznm aznm = (aznm) a.get(i);
            if (aznm != null) {
                this.g.addView(this.l.a(this.l.a(this.r), aznm));
            }
        }
        View view = this.g;
        xpr.a(view, view.getChildCount() > 0);
        azne b = wot.b(this.c);
        azne b2 = wot.b(this.c);
        if (b2 == null || b2.d.size() == 0) {
            list = null;
        } else {
            anyd<aznk> anyd = b2.d;
            list = new ArrayList(anyd.size());
            for (aznk aznk : anyd) {
                if ((aznk.a & 1) != 0) {
                    Object obj2 = aznk.b;
                    if (obj2 == null) {
                        obj2 = aznm.h;
                    }
                    list.add(obj2);
                }
            }
        }
        this.q = list;
        if (b == null || this.q == null) {
            xpr.a(this.o, false);
            xpr.a(this.n, false);
            xpr.a(this.m, false);
            xpr.a(this.k, false);
        } else {
            if (this.p == 0) {
                this.p = !b.b ? 2 : 1;
            }
            TextView textView = this.o;
            if ((b.a & 2) != 0) {
                arml = b.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            xpr.a(textView, aabb.a(arml, this.e, false));
            int i2 = this.p;
            if (i2 == 2) {
                b();
                c();
            } else if (i2 == 1) {
                xpr.a(this.m, true);
                xpr.a(this.o, true);
                xpr.a(this.n, false);
                xpr.a(this.k, true);
                this.p = 1;
            }
        }
        arml arml2 = this.c.h;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        CharSequence a2 = ajqy.a(arml2);
        if (TextUtils.isEmpty(a2)) {
            xpr.a(this.i, false);
            xpr.a(this.b, false);
            xpr.a(this.h, false);
            xpr.a(this.j, false);
            return;
        }
        xpr.a(this.i, a2);
        CharSequence[] a3 = wot.a(this.c.i, this.d);
        if (a3 == null || a3.length == 0) {
            xpr.a(this.b, false);
            xpr.a(this.h, false);
            return;
        }
        xpr.a(this.b, true);
        xpr.a(this.h, true);
        if (this.b.isSelected()) {
            a(this.c);
        } else {
            d();
        }
    }

    public final void a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 2) {
            b();
            c();
        }
    }
}
