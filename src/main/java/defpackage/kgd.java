package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;

/* renamed from: kgd */
public final class kgd extends akpl {
    private final flu a;
    private final FrameLayout b;
    private final akpb c;
    private akot d;
    private final TextView e = ((TextView) this.b.findViewById(R.id.no_uploads_text));
    private final LayoutParams f = new LayoutParams(-1, -1);
    private final LayoutParams g = new LayoutParams(-1, -2);

    public kgd(Context context, flu flu, akpb akpb) {
        this.a = (flu) amqw.a((Object) flu);
        amqw.a((Object) context);
        amqw.a((Object) akpb);
        this.c = akpb;
        this.b = (FrameLayout) View.inflate(context, R.layout.pending_uploads_item, null);
        flu.a(this.b);
    }

    public final View K_() {
        return this.a.b;
    }

    public final void a(akpb akpb) {
        akot akot = this.d;
        if (akot != null) {
            this.b.removeView(akot.K_());
            akoz.a(this.d, akpb);
            this.d = null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        avvc avvc = (avvc) obj;
        TextView textView = this.e;
        if ((avvc.a & 2) != 0) {
            arml = avvc.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        anxp anxp = avvc.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = avvc.c;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
            anxp2.a(access$0002);
            obj = anxp2.h.b(access$0002.d);
            if (obj == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(obj);
            }
            obj = (apaj) obj;
            this.d = akoz.a(this.c, obj, this.b);
            akot akot = this.d;
            if (akot != null) {
                akoz.a(akot.K_(), this.d, this.c.a(obj));
                this.d.a_(akor, obj);
                this.b.addView(this.d.K_());
                this.b.setLayoutParams(this.f);
                this.b.setVisibility(0);
            }
        } else {
            this.b.setLayoutParams(this.g);
        }
        this.a.a(akor);
    }
}
