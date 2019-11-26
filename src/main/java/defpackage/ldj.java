package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;

/* renamed from: ldj */
public final class ldj implements leg {
    public final aaas a;
    public final vod b;
    public final aoou c;
    private final Context d;
    private final akkq e;
    private final acvx f;
    private final ajqw g;
    private final epj h;
    private View i;
    private ImageView j;
    private View k;
    private TextView l;
    private View m;
    private View n;

    public ldj(Context context, akkq akkq, aaas aaas, vod vod, epj epj, acvx acvx, aoou aoou) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (akkq) amqw.a((Object) akkq);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (vod) amqw.a((Object) vod);
        this.f = (acvx) amqw.a((Object) acvx);
        this.c = (aoou) amqw.a((Object) aoou);
        this.h = (epj) amqw.a((Object) epj);
        ajqv a = ajqw.a();
        a.a = context;
        this.g = a.a();
    }

    public final void a(axqn axqn) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(lei lei) {
    }

    public final void a(lej lej) {
    }

    public final void a(lek lek) {
    }

    public final void a(boolean z) {
    }

    public final void b(CharSequence charSequence) {
    }

    public final void b(boolean z) {
    }

    public final boolean c() {
        return false;
    }

    public final View a() {
        d();
        return this.i;
    }

    public final void b() {
        arml arml;
        anxp anxp;
        anxr access$000;
        Object b;
        d();
        this.f.b(new acvs(this.c.j));
        Drawable background = this.i.getBackground();
        if (background != null && (background.getCurrent() instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
            gradientDrawable.setColor(this.c.b);
            this.i.setBackground(gradientDrawable);
        }
        aoou aoou = this.c;
        if ((aoou.a & 2) != 0) {
            akkq akkq = this.e;
            ImageView imageView = this.j;
            aygk aygk = aoou.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk, akko.h().a(true).a(new ldn()).a());
        } else {
            this.j.setVisibility(8);
        }
        xpr.a(this.k, this.c.d ^ 1);
        TextView textView = this.l;
        aoou aoou2 = this.c;
        if ((aoou2.a & 8) != 0) {
            arml = aoou2.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml, this.g));
        anxp anxp2 = this.c.f;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        anxp2.a(access$0002);
        if (anxp2.h.a(access$0002.d)) {
            eph a = this.h.a(new ldi(this), this.m);
            anxp = this.c.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            a.a((aohe) b);
        } else {
            this.m.setVisibility(8);
        }
        anxp2 = this.c.g;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$0002 = anxl.checkIsLite(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
        anxp2.a(access$0002);
        if (anxp2.h.a(access$0002.d)) {
            epn epn = new epn(this.n, this.e, new ldl(this));
            anxp = this.c.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            epn.a((aokt) b);
            return;
        }
        this.n.setVisibility(8);
    }

    private final void d() {
        if (this.i == null) {
            boolean z = false;
            this.i = LayoutInflater.from(this.d).inflate(R.layout.ad_compact_engagement_panel_header, null, false);
            this.i.setOnClickListener(new ldk(this));
            View view = this.i;
            if ((this.c.a & 64) != 0) {
                z = true;
            }
            view.setClickable(z);
            this.j = (ImageView) this.i.findViewById(R.id.primary_image);
            this.k = this.i.findViewById(R.id.ad_badge);
            this.l = (TextView) this.i.findViewById(R.id.primary_text);
            this.m = this.i.findViewById(R.id.cta_button);
            this.n = this.i.findViewById(R.id.close_button);
        }
    }
}
