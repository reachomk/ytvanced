package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: ahvz */
public final class ahvz implements ahoj, ajan, akus {
    public final acvx a;
    public ahwc b;
    public awfw[] c;
    private final Context d;
    private final ViewGroup e;
    private final akkq f;
    private final aaas g;

    public ahvz(acvx acvx, Context context, ViewGroup viewGroup, akkq akkq, aaas aaas) {
        this.a = (acvx) amqw.a((Object) acvx);
        this.d = (Context) amqw.a((Object) context);
        this.e = (ViewGroup) amqw.a((Object) viewGroup);
        this.f = (akkq) amqw.a((Object) akkq);
        this.g = (aaas) amqw.a((Object) aaas);
    }

    public final void a(ajth ajth) {
    }

    public final long e() {
        return 1;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().a(new ahvy(this), ahwb.a)};
    }

    public final void a(ahry ahry, ahrt ahrt) {
        this.b = new ahwc(this.d, ahrt, (ahpn) ahrt.d().clone(), this.f, this.e, this.g);
        ahwc ahwc = this.b;
        bcaa e = ahry.a.e();
        ahwa ahwa = ahwc.h;
        float a = ahwa.a(R.dimen.watch_next_item_width);
        float a2 = ahwa.a(R.dimen.watch_next_item_margin);
        a2 = ahsl.a((a + (a2 + a2)) * ((float) ahwc.i));
        ahwa ahwa2 = ahwc.h;
        float a3 = ahwa2.a(R.dimen.watch_next_item_width);
        float a4 = ahwa2.a(R.dimen.thumbnail_margin);
        float a5 = ahwa2.a(R.dimen.text_margin);
        float a6 = ahwa2.a(R.dimen.text_size_medium);
        float a7 = ahwa2.a(R.dimen.text_size_small);
        float a8 = ahwa2.a(R.dimen.watch_next_item_margin);
        a = ahwa2.a(R.dimen.watch_next_item_margin);
        a7 = ahsl.a((((a3 / 1.7777778f) + (a4 + a4)) + ((((a5 + a5) + a6) + a7) + a8)) + (a + a));
        ahwc.j = new ahpa(ahwc.e, ahwc.g, a2, a7, (ahpn) ahwc.f.clone(), e);
        ahwc.a(ahwc.j);
        ahwc.b(a2, a7);
        this.b.b(0.0f, -30.0f, 0.0f);
        ahrt.a(this.b);
        ahwc ahwc2 = this.b;
        ahrt.m = ahwc2;
        awfw[] awfwArr = this.c;
        if (awfwArr != null) {
            ahwc2.a(awfwArr);
        }
    }

    public final void bz_() {
        this.b = null;
    }
}
