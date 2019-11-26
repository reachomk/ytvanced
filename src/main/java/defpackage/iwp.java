package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: iwp */
public final class iwp extends akpl {
    private final Context a;
    private final iwt b;
    private final FrameLayout c;
    private iwo d;
    private iwo e;

    public iwp(Context context, aaas aaas, akkq akkq, alax alax, akzb akzb, akvp akvp, est est, eur eur) {
        this.a = context;
        this.b = new iwt(context, aaas, akkq, alax, akzb, akvp, est, eur);
        this.c = new FrameLayout(context);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        iwo iwo = this.d;
        if (iwo != null) {
            iwo.a(akpb);
        }
        iwo = this.e;
        if (iwo != null) {
            iwo.a(akpb);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        iwo iwo;
        aziq aziq = (aziq) obj;
        if (xss.b(this.a)) {
            if (this.e == null) {
                this.e = this.b.a(this.c, 2);
            }
            iwo = this.e;
        } else {
            if (this.d == null) {
                this.d = this.b.a(this.c, 1);
            }
            iwo = this.d;
        }
        this.c.removeAllViews();
        this.c.addView(iwo.a);
        iwo.a_(akor, aziq);
    }
}
