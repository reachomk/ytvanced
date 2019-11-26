package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: kca */
public final class kca implements akot, jnb, jni {
    public final aaas a;
    public axec b;
    private final ViewGroup c;
    private final ImageView d = ((ImageView) this.c.findViewById(R.id.channel_avatar));
    private final View e = this.c.findViewById(R.id.channel_status);
    private final GradientDrawable f = ((GradientDrawable) this.e.getBackground());
    private final Context g;
    private final akkq h;
    private final akvp i;
    private final YouTubeTextView j = ((YouTubeTextView) this.c.findViewById(R.id.channel_title));
    private final YouTubeTextView k = ((YouTubeTextView) this.c.findViewById(R.id.channel_count));
    private final YouTubeTextView l = ((YouTubeTextView) this.c.findViewById(R.id.channel_avatar_text));
    private final akko m;
    private final ImageView n = ((ImageView) this.c.findViewById(R.id.selected_avatar_shim));
    private final fmx o;
    private jnf p;
    private boolean q;
    private ColorDrawable r;
    private Drawable s;

    public kca(Context context, ViewGroup viewGroup, akkq akkq, akvp akvp, aaas aaas, fmx fmx) {
        this.g = (Context) amqw.a((Object) context);
        this.h = (akkq) amqw.a((Object) akkq);
        this.i = (akvp) amqw.a((Object) akvp);
        this.a = (aaas) amqw.a((Object) aaas);
        this.o = (fmx) amqw.a((Object) fmx);
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_avatar, viewGroup, false);
        ImageView imageView = this.n;
        if (this.s == null) {
            Resources resources = context.getResources();
            this.s = new ColorDrawable(xwe.a(context, R.attr.ytStaticBlue, 0));
            this.s.setAlpha(resources.getInteger(R.integer.section_list_drawer_selected_avatar_color_alpha));
        }
        imageView.setBackground(this.s);
        this.m = akkq.a().g().a((int) R.drawable.missing_avatar).a();
    }

    public final View K_() {
        return this.c;
    }

    private final void a(boolean z) {
        if (z) {
            axec axec = this.b;
            if ((axec.a & 2048) != 0) {
                ImageView imageView = this.n;
                akvp akvp = this.i;
                arwf arwf = axec.l;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a));
                this.n.setVisibility(0);
                return;
            }
        }
        this.n.setVisibility(8);
    }

    public final void a(akpb akpb) {
        this.c.setOnClickListener(null);
        this.b = null;
        jnf jnf = this.p;
        if (jnf != null) {
            jnf.b(this);
            this.p = null;
        }
    }

    public final void a(axec axec, boolean z) {
        if (axec != null && axec.equals(this.b)) {
            if (!(this.q && z)) {
                this.c.setSelected(z);
            }
            a(z);
        }
    }

    public final void a(float f) {
        this.j.setAlpha(f);
        this.k.setAlpha(f);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        CharSequence charSequence;
        obj = (axec) obj;
        this.q = akor.a("SECTION_LIST_DRAWER_COMPACT_MODE", false);
        this.b = (axec) amqw.a(obj);
        jnc jnc = (jnc) akor.a("avatar_selection_controller");
        if (jnc != null) {
            jnc.a.put(obj, this);
        }
        arml arml = null;
        akor.a.a(obj.i.d(), null);
        this.h.a(this.d, obj.b == 1 ? (aygk) obj.c : aygk.f, this.m);
        this.l.setVisibility(8);
        CharSequence charSequence2 = "";
        if (!(obj.b == 2 ? (String) obj.c : charSequence2).isEmpty()) {
            if (!aklb.a(obj.b == 1 ? (aygk) obj.c : aygk.f)) {
                this.h.a(this.d);
                this.l.setVisibility(0);
                YouTubeTextView youTubeTextView = this.l;
                if (obj.b == 2) {
                    charSequence2 = (String) obj.c;
                }
                youTubeTextView.setText(charSequence2);
                ImageView imageView = this.d;
                Context context = this.g;
                if (this.r == null) {
                    this.r = new ColorDrawable(xwe.a(context, R.attr.ytGeneralBackgroundC, 0));
                }
                imageView.setImageDrawable(this.r);
            }
        }
        a(obj.k);
        ViewGroup viewGroup = this.c;
        aodx aodx = obj.j;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) == 0) {
            charSequence = null;
        } else {
            aodx = obj.j;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        }
        viewGroup.setContentDescription(charSequence);
        View view = this.e;
        GradientDrawable gradientDrawable = this.f;
        int a = apna.a(obj.f);
        if (a == 0) {
            a = 1;
        }
        kae.a(view, gradientDrawable, a, this.g.getResources());
        if (this.q) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            arml arml2;
            TextView textView = this.j;
            if ((obj.a & 8) != 0) {
                arml2 = obj.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            xpr.a(textView, ajqy.a(arml2));
            textView = this.k;
            if ((obj.a & 16) != 0) {
                arml = obj.h;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            xpr.a(textView, ajqy.a(arml));
        }
        this.c.setOnClickListener(new kcd(this, akor, obj));
        this.p = (jnf) akor.a("drawer_expansion_state_controller");
        jnf jnf = this.p;
        if (jnf != null) {
            jnf.a(this);
            a(this.p.b());
        }
        if (!this.q) {
            this.c.setSelected(obj.k);
        }
        axea axea = obj.m;
        if (axea == null) {
            axea = axea.c;
        }
        if (axea.a == 102716411) {
            aruh aruh;
            fmx fmx = this.o;
            axea axea2 = obj.m;
            if (axea2 == null) {
                axea2 = axea.c;
            }
            if (axea2.a == 102716411) {
                aruh = (aruh) axea2.b;
            } else {
                aruh = aruh.j;
            }
            fmx.a(aruh, this.d, obj, akor.a);
        }
    }
}
