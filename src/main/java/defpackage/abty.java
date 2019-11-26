package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;

/* renamed from: abty */
public abstract class abty extends abtu {
    public abty(Context context, acwa acwa, aaas aaas) {
        super(context, acwa, aaas);
    }

    /* Access modifiers changed, original: protected|final */
    public final acvs e() {
        return null;
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ aygk h(Object obj) {
        aygk aygk = ((auhb) obj).h;
        return aygk == null ? aygk.f : aygk;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int g(Object obj) {
        return ((auhb) obj).e;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Spanned f(Object obj) {
        arml arml;
        auhb auhb = (auhb) obj;
        if ((auhb.a & 2) != 0) {
            arml = auhb.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ apxu e(Object obj) {
        apxu apxu = ((auhb) obj).k;
        return apxu == null ? apxu.d : apxu;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int d(Object obj) {
        return ((auhb) obj).g;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int c(Object obj) {
        return ((auhb) obj).f;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ long b(Object obj) {
        return ((long) ((auhb) obj).i) * 1000;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ long a(Object obj) {
        return ((long) ((auhb) obj).j) * 1000;
    }
}
