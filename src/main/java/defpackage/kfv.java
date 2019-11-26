package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* renamed from: kfv */
public final class kfv implements akok, akot {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private final FrameLayout f;
    private final ImageView g;
    private final akkq h;
    private final FixedAspectRatioFrameLayout i;
    private final akvo j;
    private final akou k;
    private final aaas l;
    private final akoj m;
    private final SharedPreferences n;
    private final bcaa o;
    private apxu p;
    private final View q;
    private final epv r;
    private final aadw s;
    private eps t;
    private ajxm u;

    public kfv(Context context, akkq akkq, aaas aaas, flu flu, akvo akvo, SharedPreferences sharedPreferences, bcaa bcaa, epv epv, aadw aadw) {
        this.h = akkq;
        this.k = flu;
        this.j = akvo;
        this.l = aaas;
        this.n = sharedPreferences;
        this.o = bcaa;
        this.r = epv;
        this.s = aadw;
        View view = (LinearLayout) View.inflate(context, R.layout.notification_inbox_item, null);
        this.a = (TextView) view.findViewById(R.id.short_message);
        this.b = (TextView) view.findViewById(R.id.footer);
        this.c = (TextView) view.findViewById(R.id.sent_time);
        this.d = (ImageView) view.findViewById(R.id.notification_thumbnail);
        this.e = (ImageView) view.findViewById(R.id.notification_video_thumbnail);
        this.i = (FixedAspectRatioFrameLayout) view.findViewById(R.id.notification_video_thumbnail_layout);
        this.f = (FrameLayout) view.findViewById(R.id.button);
        this.q = view.findViewById(R.id.contextual_menu_anchor);
        this.g = (ImageView) view.findViewById(R.id.new_content_indicator);
        flu.a(view);
        this.m = new akoj(aaas, (akou) flu, (akok) this);
    }

    public final boolean a(View view) {
        apxu apxu = this.p;
        if (apxu != null) {
            this.l.a(apxu, null);
        }
        this.g.setVisibility(4);
        if (this.u != null) {
            this.s.b().a(hgh.a(hgh.b(this.u.j))).a();
        }
        return false;
    }

    public final View K_() {
        return this.k.a();
    }

    public final void b() {
        this.g.setVisibility(0);
    }

    public final void c() {
        this.g.setVisibility(4);
    }

    public final void a(akpb akpb) {
        this.m.a();
        this.f.removeAllViews();
        eps eps = this.t;
        if (eps != null) {
            eps.a(akpb);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        View a;
        ajxm ajxm = (ajxm) obj;
        this.u = ajxm;
        this.m.a(akor.a, ajxm.e, akor.b());
        aruh aruh = null;
        akor.a.a(ajxm.h, null);
        xpr.a(this.a, ajqy.a(ajxm.c));
        xpr.a(this.b, ajqy.a(ajxm.i));
        xpr.a(this.c, ajqy.a(ajxm.d));
        this.h.a(this.e, ajxm.b);
        boolean a2 = aklb.a(ajxm.b);
        xpr.a(this.e, a2);
        float g = aklb.g(ajxm.b);
        if (g != -1.0f) {
            this.i.a = g;
        }
        xpr.a(this.i, a2);
        this.h.a(this.d, ajxm.a);
        this.d.setVisibility(!aklb.a(ajxm.a) ? 8 : 0);
        this.p = ajxm.f;
        if (ajxm.l == 2) {
            bbme a3 = this.s.b(hgh.b(ajxm.j)).a(bbmt.a());
            Object kfu = new kfu(this);
            bbow.a(kfu, "onEvent is null");
            new bbro(a3, kfu).a();
        } else {
            c();
            this.s.b().a(ajxm.j);
        }
        auvr auvr = ajxm.g;
        if (auvr == null || (auvr.a & 1) == 0) {
            this.q.setVisibility(4);
        } else {
            akvo akvo = this.j;
            a = this.k.a();
            View view = this.q;
            auvn auvn = ajxm.g.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
            akvo.a(a, view, auvn, ajxm, akor.a);
        }
        if (ajzv.b(ajxm.k, aphg.class)) {
            aphg aphg = (aphg) ajzv.a(ajxm.k, aphg.class);
            if (this.t == null) {
                this.t = this.r.a(R.layout.wide_button);
            }
            this.t.a_(akor, aphg);
            this.f.removeAllViews();
            this.f.addView(this.t.b);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (akor.a("position", -1) == 1 && !this.n.getBoolean("com.google.android.libraries.youtube.notification.pref.seen_notification_inbox_tutorial", false)) {
            auvn auvn2 = ajxm.g.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            if (!auvn2.e) {
                fmx fmx = (fmx) this.o.get();
                auvn auvn3 = ajxm.g.b;
                if (auvn3 == null) {
                    auvn3 = auvn.l;
                }
                auvh auvh = auvn3.g;
                if (auvh == null) {
                    auvh = auvh.c;
                }
                if (auvh.a == 102716411) {
                    auvn3 = ajxm.g.b;
                    if (auvn3 == null) {
                        auvn3 = auvn.l;
                    }
                    auvh = auvn3.g;
                    if (auvh == null) {
                        auvh = auvh.c;
                    }
                    if (auvh.a == 102716411) {
                        aruh = (aruh) auvh.b;
                    } else {
                        aruh = aruh.j;
                    }
                }
                a = this.q;
                obj = ajxm.g.b;
                if (obj == null) {
                    obj = auvn.l;
                }
                fmx.a(aruh, a, obj, akor.a);
            }
        }
        this.k.a(akor);
    }
}
