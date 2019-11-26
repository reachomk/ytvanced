package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jrk */
public final class jrk implements vcy {
    public final Activity a;
    public final waw b;
    public final vod c;
    public final vdg d;
    public aagw e;
    public aaha f;
    private final akkq g;
    private View h;
    private ImageView i;
    private TextView j;
    private View k;
    private TextView l;
    private TextView m;
    private wxc n;
    private wxc o;
    private RatingBar p;
    private RatingBar q;
    private ImageView r;
    private wxi s;
    private boolean t;

    public jrk(vcw vcw, vdg vdg) {
        Object obj = vcw.j;
        Object obj2 = vcw.k;
        Object obj3 = vcw.i;
        Object obj4 = vcw.l;
        this.a = (Activity) amqw.a(obj);
        this.g = (akkq) amqw.a(obj2);
        this.b = (waw) amqw.a(obj3);
        this.c = (vod) amqw.a(obj4);
        this.d = (vdg) amqw.a((Object) vdg);
    }

    public final void a(View view, akor akor) {
        View view2 = this.h;
        if (view2 == null || view2.getParent() != view) {
            b(view);
            this.h = xpr.a(view, (int) R.id.app_promotion_companion_card_stub, (int) R.id.app_promotion_companion_card);
            this.n = wxc.a(this.a, new jrl(this));
            this.o = wxc.a(this.a, new jrm(this));
            this.i = (ImageView) this.h.findViewById(R.id.app_thumbnail);
            this.j = (TextView) this.h.findViewById(R.id.app_name);
            this.p = (RatingBar) this.h.findViewById(R.id.rating_gray);
            this.q = (RatingBar) this.h.findViewById(R.id.rating_white);
            this.r = (ImageView) this.h.findViewById(R.id.rating_image);
            this.m = (TextView) this.h.findViewById(R.id.app_price);
            this.k = this.h.findViewById(R.id.action_button);
            this.l = (TextView) this.h.findViewById(R.id.ad_cta_button_text);
            this.k.setOnClickListener(new jrj(this));
        }
        this.l.setText(this.f.c);
        this.j.setText(this.e.d.a);
        this.m.setText(!TextUtils.isEmpty(this.e.d.c) ? this.e.d.c : "");
        this.q.setVisibility(8);
        if (this.e.d.d) {
            this.r.setVisibility(8);
            this.p.setVisibility(0);
            this.p.setRating(this.e.d.e);
        } else if (!c()) {
            this.r.setVisibility(8);
            this.p.setVisibility(8);
        }
        if (this.e.d.b == null) {
            a(null);
        } else {
            this.s = wxi.a(this.n);
            this.g.b(this.e.d.b, this.s);
        }
        this.h.setVisibility(0);
    }

    public final boolean a(aaga aaga, aakj aakj) {
        ajxu ajxu;
        aaha aaha = null;
        if (aakj != null) {
            ajxu = aakj.a;
        } else {
            ajxu = null;
        }
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (!(ajxp == null || ajxp.b == null)) {
                return false;
            }
        }
        if (!(aaga == null || aaga.af() == null)) {
            for (aagw aagw : aaga.af()) {
                if (aagw.a == 2 && aagw.d != null) {
                    break;
                }
            }
        }
        aagw aagw2 = null;
        if (!(aagw2 == null || aagw2.d == null)) {
            Activity activity = this.a;
            List h = this.d.h();
            Object obj = (wxk.a(activity, h) || wxk.b(activity, h)) ? 1 : null;
            for (aaha aaha2 : aagw2.b) {
                if (!TextUtils.isEmpty(aaha2.c)) {
                    int i = aaha2.a;
                    if (i == 4 && aaha2.b != null) {
                        aaha = aaha2;
                    }
                    if (obj == null) {
                        continue;
                    } else if (i == 19) {
                        if (!TextUtils.isEmpty(aagw2.d.h)) {
                            aaha = aaha2;
                            break;
                        }
                    }
                }
            }
            if (aaha != null) {
                if (aaga != null) {
                    afpf afpf = afpf.ad;
                    String valueOf = String.valueOf(aaga);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
                    stringBuilder.append("Loading app promo companion directly from VAST. Ad info: ");
                    stringBuilder.append(valueOf);
                    afpc.a(1, afpf, stringBuilder.toString());
                }
                this.e = aagw2;
                this.f = aaha;
                return true;
            }
        }
        return false;
    }

    public final void a() {
        this.t = true;
        d();
    }

    public final void a(View view) {
        this.t = false;
        this.c.b(this.e);
        this.e = null;
        this.f = null;
        wxi wxi = this.s;
        if (wxi != null) {
            wxi.a();
            this.s = null;
        }
        b(view);
        this.h = null;
    }

    private final void b(View view) {
        if (view != null) {
            xpr.a(view, (int) R.id.app_promotion_companion_card_stub, (int) R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.h != null) {
            this.i.setImageDrawable(null);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(4);
            this.r.setImageDrawable(null);
            this.h.setVisibility(8);
        }
    }

    public final void b() {
        d();
    }

    public final void a(Bitmap bitmap) {
        this.i.setImageBitmap(bitmap);
        if (c()) {
            this.s = wxi.a(this.o);
            this.g.b(this.e.d.g, this.s);
        }
    }

    private final boolean c() {
        aagw aagw = this.e;
        if (aagw != null) {
            aahe aahe = aagw.d;
            if (!(aahe.g == null || aahe.d)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Bitmap bitmap) {
        this.r.setImageBitmap(bitmap);
        this.r.setVisibility(bitmap != null ? 0 : 8);
    }

    private final void d() {
        if (this.t && this.e != null) {
            View view = this.h;
            if (view == null || view.getVisibility() != 0) {
                waw waw = this.b;
                aagw aagw = this.e;
                xak.a();
                if (waw.i != null) {
                    waw.i.a(aagw);
                }
                if (view == null) {
                    return;
                }
            }
            this.h.setVisibility(0);
        }
    }

    public final int a(vow vow, boolean z) {
        return (vow.b == vra.USER_SKIPPED && !z) ? 2 : 1;
    }
}
