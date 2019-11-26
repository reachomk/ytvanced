package defpackage;

import android.content.Context;
import android.text.Spanned;

/* renamed from: abtw */
public abstract class abtw extends abtu {
    private final acvs i = new acvs(acwc.PDG_LIVE_CHAT_TICKER_PAID_MESSAGE);

    public abtw(Context context, acwa acwa, aaas aaas) {
        super(context, acwa, aaas);
    }

    /* Access modifiers changed, original: protected|final */
    public final acvs e() {
        return this.i;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ aygk h(Object obj) {
        aygk aygk = ((augz) obj).h;
        return aygk == null ? aygk.f : aygk;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int g(Object obj) {
        return ((augz) obj).e;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Spanned f(Object obj) {
        arml arml;
        augz augz = (augz) obj;
        if ((augz.a & 2) != 0) {
            arml = augz.c;
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
        apxu apxu = ((augz) obj).k;
        return apxu == null ? apxu.d : apxu;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int d(Object obj) {
        return ((augz) obj).g;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ int c(Object obj) {
        return ((augz) obj).f;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ long b(Object obj) {
        return ((long) ((augz) obj).i) * 1000;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ long a(Object obj) {
        return ((long) ((augz) obj).j) * 1000;
    }
}
