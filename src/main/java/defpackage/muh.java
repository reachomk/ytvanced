package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.jar.MutedAutoplayIndicator;

/* renamed from: muh */
public final class muh extends lo {
    public final /* synthetic */ MutedAutoplayIndicator b;

    public muh(MutedAutoplayIndicator mutedAutoplayIndicator) {
        this.b = mutedAutoplayIndicator;
    }

    public final void a() {
        this.b.post(new muj(this));
    }
}
