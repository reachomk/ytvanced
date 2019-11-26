package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: kas */
public final class kas extends akpl implements akon, jih {
    public final akoj a;
    public aqey b;
    public jif c;
    private final Context d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.title));
    private final TextView g = ((TextView) this.e.findViewById(R.id.subtitle));
    private final ImageView h = ((ImageView) this.e.findViewById(R.id.right_icon));
    private final TextView i = ((TextView) this.e.findViewById(R.id.activity_count_live_status));
    private final kau j;
    private final hqw k;
    private final akvp l;
    private final flu m;
    private final ejw n;
    private akor o;

    public kas(Context context, kax kax, hqz hqz, aaas aaas, akvp akvp, flu flu, ejw ejw) {
        kax kax2 = kax;
        hqz hqz2 = hqz;
        this.d = (Context) amqw.a((Object) context);
        this.m = flu;
        this.n = ejw;
        this.e = LayoutInflater.from(context).inflate(R.layout.compact_list_item, null);
        this.j = new kau((akkq) kax.a((akkq) kax2.a.get(), 1), (akvp) kax.a((akvp) kax2.b.get(), 2), (View) kax.a(this.e, 3));
        this.a = new akoj(aaas, this.e);
        this.k = new hqw((hpd) hqz.a((hpd) hqz2.a.get(), 1), (xci) hqz.a((xci) hqz2.b.get(), 2), (hls) hqz.a((hls) hqz2.c.get(), 3), (ahcd) hqz.a((ahcd) hqz2.d.get(), 4), (hmj) hqz.a((hmj) hqz2.e.get(), 5), hqz2.f, (View) hqz.a(this.e, 7), (akoj) hqz.a(this.a, 8));
        this.l = akvp;
        this.m.a(new kav(this));
        this.m.a(this.e);
    }

    public final View K_() {
        return this.m.b;
    }

    public final void a(akpb akpb) {
        this.n.b(this);
        this.a.a();
        hqw hqw = this.k;
        hqw.b.b(hqw);
        xpr.a(hqw.g, false);
        hqw.f.setTypeface(Typeface.DEFAULT);
        TextView textView = hqw.f;
        textView.setTextColor(xwe.a(textView.getContext(), R.attr.ytTextSecondary, 0));
        hqw.i = null;
        hqw.j = null;
        hqw.k = null;
        Future future = hqw.l;
        if (future != null) {
            future.cancel(false);
            hqw.l = null;
        }
        hqw.g.setClickable(true);
        jif jif = this.c;
        if (jif != null) {
            jif.a((jih) this);
        }
    }

    public final void a(Map map) {
        map.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", this.o);
    }

    public final void a(boolean z) {
        flt.a(this.d, this.o, this.m, z);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        int a;
        aqey aqey = (aqey) obj;
        this.o = akor;
        this.b = aqey;
        amqp a2 = jif.a(akor);
        apxu apxu = null;
        if (a2.a()) {
            this.c = (jif) a2.b();
            this.c.b(this, aqey);
        } else {
            this.c = null;
        }
        this.a.a(akor.a, aqey.b == 4 ? (apxu) aqey.c : null, akor.b(), this);
        if ((aqey.a & 1) != 0) {
            arml = aqey.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.f.setText(ajqy.a(arml));
        if ((aqey.a & 2) != 0) {
            arml = aqey.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a3 = ajqy.a(arml);
        if (a3 != null) {
            this.g.setText(a3);
        } else {
            this.g.setVisibility(8);
        }
        aqfa aqfa = aqey.j;
        if (aqfa == null) {
            aqfa = aqfa.f;
        }
        kau kau = this.j;
        CircularImageView circularImageView = kau.h;
        if (circularImageView != null) {
            circularImageView.setVisibility(8);
        }
        FrameLayout frameLayout = kau.i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageView imageView = kau.k;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TintableImageView tintableImageView = kau.l;
        if (tintableImageView != null) {
            tintableImageView.setVisibility(8);
        }
        ViewStub viewStub;
        if (kau.a(aqfa) != null) {
            if (kau.h == null) {
                viewStub = kau.c;
                if (viewStub != null) {
                    kau.h = (CircularImageView) viewStub.inflate();
                }
            }
            kau.h.setVisibility(0);
            kau.a.a(kau.h, kau.a(aqfa));
        } else if (kau.b(aqfa) != null) {
            if (kau.i == null) {
                viewStub = kau.d;
                if (viewStub != null) {
                    kau.i = (FrameLayout) viewStub.inflate();
                    kau.j = (ImageView) kau.i.findViewById(R.id.image_view);
                }
            }
            kau.i.setVisibility(0);
            kau.a.a(kau.j, kau.b(aqfa));
        } else if (kau.d(aqfa) != null) {
            if (kau.l == null) {
                viewStub = kau.f;
                if (viewStub != null) {
                    kau.l = (TintableImageView) viewStub.inflate();
                }
            }
            akvp akvp = kau.b;
            arwh a4 = arwh.a(kau.d(aqfa).b);
            if (a4 == null) {
                a4 = arwh.UNKNOWN;
            }
            a = akvp.a(a4);
            if (a == 0) {
                kau.l.setImageDrawable(null);
                kau.l.a(null);
            } else {
                kau.l.setImageResource(a);
                kau.l.a(kau.g);
            }
            kau.l.setVisibility(0);
        } else {
            if (kau.k == null) {
                viewStub = kau.e;
                if (viewStub != null) {
                    kau.k = (ImageView) viewStub.inflate();
                }
            }
            kau.k.setVisibility(0);
            if (kau.c(aqfa) != null) {
                kau.a.a(kau.k, kau.c(aqfa));
            } else {
                kau.a.a(kau.k);
                kau.k.setImageDrawable(null);
                kau.k.setBackgroundResource(R.color.grey);
            }
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        a = aqey.d;
        if (a == 20) {
            this.h.setVisibility(0);
            ImageView imageView2 = this.h;
            akvp akvp2 = this.l;
            arwh a5 = arwh.a((aqey.d == 20 ? (arwf) aqey.e : arwf.c).b);
            if (a5 == null) {
                a5 = arwh.UNKNOWN;
            }
            imageView2.setImageResource(akvp2.a(a5));
        } else if (a == 5) {
            arml arml2;
            this.i.setVisibility(0);
            TextView textView = this.i;
            if (aqey.d == 5) {
                arml2 = (arml) aqey.e;
            } else {
                arml2 = arml.f;
            }
            textView.setText(ajqy.a(arml2));
            this.i.setTextColor(xwe.a(this.d, R.attr.ytTextSecondary, 0));
        } else if (a == 6) {
            this.i.setVisibility(0);
            this.i.setText(ajqy.a(aqey.d == 6 ? (arml) aqey.e : null));
            this.i.setTextColor(xwe.a(this.d, R.attr.ytBrandRed, 0));
        }
        Object obj2 = this.k;
        aqes aqes = aqey.k;
        if (aqes == null) {
            aqes = aqes.c;
        }
        String str = (aqes.a == 135739232 ? (awhh) aqes.b : awhh.c).b;
        if (!str.isEmpty()) {
            obj2.i = aqey;
            obj2.j = str;
            if (((agwc) obj2.e.get()).b().n().a(obj2.j) != null && obj2.j.startsWith("BL")) {
                obj2.h.a(akor.a, ekc.a(obj2.j), akor.b(), null);
            }
            amqw.b(amqu.a(obj2.j) ^ 1);
            if ("PPSV".equals(obj2.j)) {
                obj2.k = obj2.c.a(4, null, obj2.g, new hqv(obj2));
                obj2.l = obj2.a.a(new hra(obj2));
                obj2.g.setClickable(false);
            } else {
                obj2.k = obj2.c.a(1, obj2.j, obj2.g, new hqy(obj2));
                obj2.l = obj2.a.a(obj2.j, new hqx(obj2));
                obj2.g.setClickable(true);
            }
            obj2.k.a();
            obj2.b.a(obj2);
        }
        ejw ejw = this.n;
        if (aqey.b == 4) {
            apxu = (apxu) aqey.c;
        }
        ejw.a(this, apxu);
        this.m.a(akor);
    }
}
