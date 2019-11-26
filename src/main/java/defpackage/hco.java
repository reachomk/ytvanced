package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: hco */
public final class hco implements adoi, xcp {
    public final bcaa a;
    public final adop b;
    public final adow c;
    public albg d;
    private final adiw e;
    private final Activity f;
    private final dvc g;
    private final bcaa h;

    public hco(adow adow, adiw adiw, Activity activity, dvc dvc, bcaa bcaa, adop adop, bcaa bcaa2) {
        this.c = adow;
        this.e = adiw;
        this.f = (Activity) amqw.a((Object) activity);
        this.g = dvc;
        this.a = (bcaa) amqw.a((Object) bcaa);
        this.b = (adop) amqw.a((Object) adop);
        this.h = (bcaa) amqw.a((Object) bcaa2);
    }

    public final adow a() {
        return this.c;
    }

    public final adiw b() {
        return this.e;
    }

    public final boolean c() {
        return (this.g.d() || this.g.f() || this.g.aH_()) ? false : true;
    }

    public final void a(Runnable runnable) {
        xak.a();
        adow adow = this.c;
        if (adow.g) {
            this.b.a(adow.h);
            runnable.run();
            return;
        }
        albc hcp = new hcp(this, runnable);
        Resources resources = this.f.getResources();
        ((albh) this.h.get()).b(((fck) ((fck) ((fck) ((fck) ((fck) ((fck) ((fck) ((fck) ((albh) this.h.get()).b()).d(resources.getText(R.string.cast_icon_mealbar_title))).c(resources.getText(R.string.cast_icon_mealbar_sub_title))).a(hcp)).a(resources.getText(R.string.cast_icon_mealbar_watch_on_tv_text), new hcn(this))).b(resources.getText(R.string.cast_icon_mealbar_dismiss_text), hcq.a)).d((int) R.drawable.mealbar_cast_icon)).c(false)).d());
    }

    public final void d() {
        ((albh) this.h.get()).a(this.d);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adht.class};
        } else if (i == 0) {
            adht adht = (adht) obj;
            if (adht.a() && adht.a) {
                d();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
