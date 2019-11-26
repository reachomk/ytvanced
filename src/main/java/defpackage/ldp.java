package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* renamed from: ldp */
public final class ldp implements leg {
    private final Context a;
    private final bapu b;
    private final akde c;
    private final acvx d;
    private final aoox e;
    private arbs f;
    private swo g;
    private ViewGroup h;

    public ldp(Context context, akde akde, bapu bapu, acvx acvx, aoox aoox) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (bapu) amqw.a((Object) bapu);
        this.c = (akde) amqw.a((Object) akde);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = (aoox) amqw.a((Object) aoox);
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
        return this.h;
    }

    public final void b() {
        acvx acvx = this.d;
        anxp anxp = this.e.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        acvx.a(((arbs) b).f.d());
        if (this.g == null) {
            d();
            anxp anxp2 = this.e.b;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp2.a(access$0002);
            if (anxp2.h.a(access$0002.d)) {
                anxp2 = this.e.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
                anxp2.a(access$0002);
                Object b2 = anxp2.h.b(access$0002.d);
                if (b2 == null) {
                    b2 = access$0002.b;
                } else {
                    b2 = access$0002.a(b2);
                }
                this.f = (arbs) b2;
                this.h.setVisibility(0);
                this.g = ((akdk) this.b.get()).b(this.f);
                akor akor = new akor();
                akor.a(new HashMap());
                akor.a(this.d);
                this.h.addView(this.c.K_());
                this.c.a_(akor, this.g);
                return;
            }
            this.h.setVisibility(8);
        }
    }

    private final void d() {
        if (this.h == null) {
            this.h = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_elements_header, null, false);
        }
    }
}
