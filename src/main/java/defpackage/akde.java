package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;

/* renamed from: akde */
public final class akde implements akot {
    public akda a;
    private cpq b;
    private final Context c;
    private final akei d;
    private bbmz e;
    private boolean f;
    private LayoutParams g;

    public akde(Context context, akei akei) {
        this.c = context;
        this.d = akei;
    }

    public final View K_() {
        if (this.b == null) {
            this.b = new cpq(this.c);
        }
        return this.b;
    }

    /* renamed from: a */
    public final void a_(akor akor, swo swo) {
        a(akor, swo, false);
    }

    public final void a(akor akor, swo swo, boolean z) {
        View view = (cpq) K_();
        view.setTag(R.id.elements_navigation_args, akor.b());
        Object a = akor.a("PresenterPreparerContextDecoratorKey");
        if (akor.a("ElementPresenterMatchParentHeight", false)) {
            this.g = this.b.getLayoutParams();
            this.b.setLayoutParams(new LayoutParams(-1, -1));
        }
        if (a instanceof akcz) {
            view.a(((akcz) a).b());
            this.f = false;
            return;
        }
        cmg cmg = view.v;
        swk a2 = swk.i().a(view).a(z).a();
        akda akda = this.a;
        boolean z2 = akda != null && akda.a.f;
        bbmz bbmz = this.e;
        if (bbmz != null) {
            bbmz.bK_();
        }
        this.e = new bbmz();
        akei akei = this.d;
        acvx acvx = akor.a;
        Object obj = this.a;
        if (obj == null) {
            obj = swo;
        }
        cmy a3 = ComponentTree.a(cmg, akei.a(cmg, a2, swo, akeg.a(acvx, obj), this.e, z2));
        a3.c = z;
        view.a(a3.a());
        this.f = true;
    }

    public final void a(akpb akpb) {
        cpq cpq = this.b;
        if (cpq != null) {
            if (this.f) {
                ComponentTree componentTree = cpq.t;
                if (componentTree != null) {
                    componentTree.i();
                    cpq.t = null;
                    cpq.D = "release_CT";
                }
            }
            this.b.o();
            this.b.a(null);
            this.b.setTag(R.id.elements_navigation_args, null);
            LayoutParams layoutParams = this.g;
            if (layoutParams != null) {
                this.b.setLayoutParams(layoutParams);
                this.g = null;
            }
        }
        bbmz bbmz = this.e;
        if (bbmz != null) {
            bbmz.bK_();
            this.e = null;
        }
    }
}
