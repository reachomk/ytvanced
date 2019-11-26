package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;

/* renamed from: vuz */
public final class vuz {
    public final AdCountdownView a;
    private final boolean b = false;
    private boolean c;
    private int d;

    public vuz(AdCountdownView adCountdownView, akkq akkq) {
        this.a = (AdCountdownView) amqw.a((Object) adCountdownView);
        amqw.a((Object) akkq);
        adCountdownView.b = new vzn(adCountdownView.d, new akle(akkq.c(), adCountdownView.d), adCountdownView.getBackground(), adCountdownView.getAlpha());
        vyz vyz = adCountdownView.c;
        akle akle = new akle(akkq.c(), vyz.b);
        ImageView imageView = vyz.b;
        vyz.q = new vzn(imageView, akle, imageView.getBackground(), vyz.b.getAlpha());
        this.d = adCountdownView.getVisibility();
        a();
    }

    public final void a() {
        a(false);
        this.a.a();
    }

    public final void a(boolean z) {
        this.c = z;
        this.a.a(z);
        this.a.setVisibility(this.d);
    }

    public final void a(int i) {
        this.d = i;
        this.a.setVisibility(i);
    }
}
