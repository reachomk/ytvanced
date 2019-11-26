package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: akdd */
public final class akdd implements skm {
    private final Context a;
    private final bapu b;
    private final bbmz c = new bbmz();
    private ff d;

    public akdd(Context context, bapu bapu) {
        this.a = context;
        this.b = bapu;
    }

    public final void a() {
        ff ffVar = this.d;
        if (ffVar != null) {
            ffVar.dismiss();
            this.d = null;
            this.c.a();
        }
    }

    public final void a(azuj azuj, int i) {
        a();
        View cpq = new cpq(this.a);
        cpq.a(((akei) this.b.get()).a(cpq.v, swk.i().a(cpq).a(), azuj.toByteArray(), this.c));
        this.d = new ff(this.a);
        this.d.setContentView(cpq);
        if (i == 3) {
            this.d.getWindow().clearFlags(2);
            this.d.setCanceledOnTouchOutside(false);
        }
        this.d.show();
    }
}
