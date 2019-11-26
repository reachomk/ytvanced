package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* renamed from: ihr */
public final class ihr implements iha {
    private final bapu a;
    private final akde b;
    private final acvx c;
    private arbs d;
    private swo e;
    private ViewGroup f;
    private arbx g;

    public ihr(bapu bapu, akde akde, acvx acvx) {
        this.a = (bapu) amqw.a((Object) bapu);
        this.b = (akde) amqw.a((Object) akde);
        this.c = (acvx) amqw.a((Object) acvx);
    }

    public final void a(ihc ihc) {
    }

    public final void a(boolean z) {
    }

    public final void a(View view) {
        if (this.f == null) {
            this.f = (ViewGroup) xpr.a(view, (int) R.id.elements_ad_cta_overlay_stub, (int) R.id.elements_ad_cta_overlay);
            this.f.setVisibility(8);
        }
    }

    public final void a() {
        arbx arbx = this.g;
        if (arbx != null && this.f != null) {
            arbs arbs;
            anxp anxp = arbx.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.g.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arbs = (arbs) b;
            } else {
                arbs = null;
            }
            this.d = arbs;
            this.f.addView(this.b.K_());
        }
    }

    public final void b() {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f.setVisibility(8);
        }
        if (this.d != null) {
            this.b.a(null);
            this.d = null;
        }
        this.e = null;
        this.g = null;
    }

    public final void a(int i, boolean z) {
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            if (i != 2) {
                viewGroup.setVisibility(8);
            } else if (this.d == null) {
                viewGroup.setVisibility(8);
            } else if (this.e != null) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(0);
                akor akor = new akor();
                akor.a(new HashMap());
                akor.a(this.c);
                this.e = ((akdk) this.a.get()).b(this.d);
                this.b.a_(akor, this.e);
            }
        }
    }
}
