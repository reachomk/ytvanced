package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jzy */
public final class jzy extends akpl {
    public final aaas a;
    private final ewb b;
    private final akyy c;
    private final View d;
    private final View e = this.d.findViewById(R.id.show_channels);
    private final View f;
    private final View g = this.d.findViewById(R.id.gradient_overlay);
    private final View h;
    private final akpk i;
    private final akod j;
    private final kad k;
    private final gau l;
    private final ans m = new ans();
    private final RecyclerView n = ((RecyclerView) this.d.findViewById(R.id.channels_list));
    private final apv o;
    private int p;
    private int q;

    public jzy(Context context, aaas aaas, ewb ewb, epf epf, fna fna, akpe akpe) {
        this.b = (ewb) amqw.a((Object) ewb);
        this.a = aaas;
        this.d = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu, null);
        this.m.b(0);
        this.n.a(this.m);
        this.i = new akpk();
        apa a = akpe.a((akpb) epf.get());
        a.a(this.i);
        this.j = new akod();
        a.a(this.j);
        this.k = new kad();
        a.a(this.k);
        this.l = new gau();
        a.a(this.l);
        this.n.a(a);
        this.o = new kaa(this);
        this.f = this.d.findViewById(R.id.channels_button);
        this.c = fna.a((TextView) this.f);
        this.c.a((int) R.dimen.text_button_icon_padding);
        this.c.a();
        this.d.setBackground(new eza(xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height)));
        this.h = this.d.findViewById(R.id.channels_navigation_layout);
        this.q = -1;
        this.p = -1;
    }

    public final void b() {
        xpr.a(this.g, this.m.s() < this.i.size() + -1);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.l.a();
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        int dimensionPixelOffset;
        int integer;
        Resources resources;
        acwb acwb = akor;
        ajsg ajsg = (ajsg) obj;
        this.j.a = acwb.a;
        String str = "sectionListController";
        if (acwb.a(str) instanceof akxv) {
            this.k.a = new akxx((akxv) acwb.a(str));
        }
        apmu apmu = ajsg.b;
        for (ajsf ajsf : ajsg.a) {
            ajse ajse = ajsf.b;
            if (ajse != null) {
                ajse.setExtension(ajsd.a, apmu);
            }
        }
        this.i.clear();
        List list = null;
        Class cls = null;
        for (ajsf ajsf2 : ajsg.a) {
            Class cls2;
            Object obj2 = ajsf2.b;
            if (obj2 != null) {
                cls2 = ajse.class;
            } else {
                obj2 = ajsf2.c;
                if (obj2 != null) {
                    Class cls3 = awyw.class;
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(ajsf2.c);
                    cls2 = cls3;
                } else {
                }
            }
            if (!(cls == null || cls2 == cls)) {
                this.i.add(new jzz());
            }
            this.i.add(obj2);
            cls = cls2;
        }
        if (list != null) {
            this.l.a(list);
        }
        RecyclerView recyclerView = this.n;
        int i = 1;
        if (ajsg.f == 3) {
            resources = recyclerView.getResources();
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_horizontal_margin), recyclerView.getPaddingBottom());
            recyclerView.setLayoutParams(new LayoutParams(-2, -2, 17));
            if (recyclerView.c() > 0) {
                recyclerView.d();
            }
            DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
            int a = recyclerView.m.a();
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_min_item_space);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_max_item_space);
            int dimensionPixelOffset4 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
            dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_width) - dimensionPixelOffset4;
            int min = Math.min(Math.max(((displayMetrics.widthPixels - (a * dimensionPixelOffset4)) / (a + 1)) - dimensionPixelOffset4, dimensionPixelOffset2), dimensionPixelOffset3);
            integer = resources.getInteger(R.integer.channel_list_sub_menu_horizontal_spacing_factor);
            recyclerView.a(new kac(xss.a(displayMetrics, integer * (xss.b(displayMetrics, min + dimensionPixelOffset) / integer)) - dimensionPixelOffset));
        } else {
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
            recyclerView.setLayoutParams(new LayoutParams(-1, -2));
            if (recyclerView.c() > 0) {
                recyclerView.d();
            }
        }
        apmu = ajsg.b;
        if (apmu != null) {
            int a2 = apmw.a(apmu.b);
            if (a2 != 0) {
                i = a2;
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        if (i == 4) {
            resources = this.h.getResources();
            dimensionPixelOffset = this.q;
            if (dimensionPixelOffset == -1) {
                dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin);
                this.q = dimensionPixelOffset;
            }
            layoutParams.topMargin = dimensionPixelOffset;
            dimensionPixelOffset = this.p;
            if (dimensionPixelOffset == -1) {
                dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
                this.p = dimensionPixelOffset;
            }
            layoutParams.height = dimensionPixelOffset;
            layoutParams.gravity = 48;
        } else {
            layoutParams.topMargin = 0;
            layoutParams.height = -2;
            layoutParams.gravity = 16;
        }
        this.h.setLayoutParams(layoutParams);
        if (ajsg.c != null) {
            this.e.setVisibility(0);
            this.e.setOnClickListener(new kab(this, ajsg));
            this.b.a(ajsg, this.e);
            this.n.a(this.o);
            b();
            this.c.a(null, acwb.a);
            return;
        }
        aphg aphg;
        akyy akyy = this.c;
        aphj aphj = ajsg.e;
        if (aphj == null) {
            aphg = null;
        } else {
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        akyy.a(aphg, acwb.a);
        this.b.a(ajsg, this.f);
        this.n.b(this.o);
        this.g.setVisibility(8);
        this.e.setVisibility(8);
    }
}
