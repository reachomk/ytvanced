package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: obm */
public final class obm {
    public final obo a;
    public int b;
    public float c = 1.0f;
    private final AudioManager d;
    private final obl e;

    public obm(Context context, obo obo) {
        this.d = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.a = obo;
        this.e = new obl(this);
        this.b = 0;
    }

    public final void a() {
        c();
    }

    public final int b() {
        if (this.b != 0) {
            c();
        }
        return 1;
    }

    public final void c() {
        if (this.b != 0) {
            if (ozp.a < 26) {
                this.d.abandonAudioFocus(this.e);
            }
            this.b = 0;
        }
    }
}
