package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.accessibility.CaptioningManager;

/* renamed from: akjn */
public final class akjn extends sxt {
    public final CaptioningManager a;
    private final AudioManager b;
    private final akdy c;
    private final bbmi d;

    public akjn(Context context, akdy akdy) {
        this.b = (AudioManager) context.getSystemService("audio");
        this.a = (CaptioningManager) context.getSystemService("captioning");
        this.c = akdy;
        this.d = bbmi.a(new akjq(this, context, akdy));
    }

    public final bbmi a() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] b() {
        return c();
    }

    public final byte[] c() {
        CaptioningManager captioningManager = this.a;
        int i = 0;
        boolean isEnabled = captioningManager != null ? captioningManager.isEnabled() : false;
        akdy akdy = this.c;
        if (akdy != null) {
            isEnabled = isEnabled || akdy.a();
        }
        azsl azsl = (azsl) azsi.d.createBuilder();
        AudioManager audioManager = this.b;
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
        }
        azsl.copyOnWrite();
        azsi azsi = (azsi) azsl.instance;
        azsi.a = 1 | azsi.a;
        azsi.b = i;
        azsl.copyOnWrite();
        azsi azsi2 = (azsi) azsl.instance;
        azsi2.a |= 2;
        azsi2.c = isEnabled;
        return ((azsi) ((anxl) azsl.build())).toByteArray();
    }
}
