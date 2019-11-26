package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ahwc */
public final class ahwc extends ahnd implements ahpv, ahrz {
    public final Context e;
    public final ahpn f;
    public final ViewGroup g;
    public final ahwa h;
    public final int i = 4;
    public ahpa j;
    private final ahrt k;
    private final Handler m = new Handler(Looper.getMainLooper());
    private boolean n;

    ahwc(Context context, ahrt ahrt, ahpn ahpn, akkq akkq, ViewGroup viewGroup, aaas aaas) {
        super(new ahou(ahpn, 0.0f, 0.0f));
        amqw.a((Object) aaas);
        this.e = (Context) amqw.a((Object) context);
        this.k = (ahrt) amqw.a((Object) ahrt);
        this.f = (ahpn) amqw.a((Object) ahpn);
        this.g = (ViewGroup) amqw.a((Object) viewGroup);
        this.h = new ahwa(context, akkq, viewGroup, aaas);
        d();
    }

    public final boolean b(ahnj ahnj) {
        return false;
    }

    public final boolean c(ahnj ahnj) {
        return false;
    }

    public final boolean a(ahnj ahnj) {
        return f(ahnj);
    }

    public final void e(ahnj ahnj) {
        if (f(ahnj)) {
            ahpa ahpa = this.j;
            if (ahpa != null) {
                ahox a = this.a.a(ahnj);
                int i = this.i;
                if (ahpa.k != null && a != null && a.a()) {
                    int b = (int) (a.b() * ((float) i));
                    if (b < ahpa.k.getChildCount()) {
                        View childAt = ahpa.k.getChildAt(b);
                        if (childAt != null && childAt.isClickable()) {
                            Handler handler = ahpa.j;
                            childAt.getClass();
                            handler.post(new ahpe(childAt));
                        }
                    }
                }
            }
        }
    }

    public final void d(ahnj ahnj) {
        this.n = f(ahnj);
        if (!this.k.e() || this.k.h()) {
            c();
            this.j.n = !this.n ? 0.5f : 1.0f;
        } else {
            d();
        }
        super.d(ahnj);
    }

    /* Access modifiers changed, original: final */
    public final void a(awfw[] awfwArr) {
        this.m.post(new ahwf(this, awfwArr));
    }

    public final void c() {
        if (f()) {
            this.l = false;
        }
    }

    private final void d() {
        if (!f()) {
            this.l = true;
        }
    }

    public final boolean a() {
        return this.n;
    }
}
