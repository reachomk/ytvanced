package defpackage;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: obl */
final class obl implements OnAudioFocusChangeListener {
    private final /* synthetic */ obm a;

    public final void onAudioFocusChange(int i) {
        if (i == -3) {
            this.a.b = 3;
        } else if (i == -2) {
            this.a.b = 2;
        } else if (i == -1) {
            this.a.b = -1;
        } else if (i != 1) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Unknown focus change type: ");
            stringBuilder.append(i);
            oyp.a("AudioFocusManager", stringBuilder.toString());
            return;
        } else {
            this.a.b = 1;
        }
        obm obm = this.a;
        int i2 = obm.b;
        if (i2 == -1) {
            obm.a.c(-1);
            this.a.c();
        } else if (i2 != 0) {
            if (i2 == 1) {
                obm.a.c(1);
            } else if (i2 == 2) {
                obm.a.c(0);
            } else if (i2 != 3) {
                StringBuilder stringBuilder2 = new StringBuilder(38);
                stringBuilder2.append("Unknown audio focus state: ");
                stringBuilder2.append(i2);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        obm = this.a;
        float f = obm.b == 3 ? 0.2f : 1.0f;
        if (obm.c != f) {
            obm.c = f;
            obm.a.c();
        }
    }

    /* synthetic */ obl(obm obm) {
        this.a = obm;
    }
}
