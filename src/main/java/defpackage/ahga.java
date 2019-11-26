package defpackage;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: ahga */
public final class ahga implements OnAudioFocusChangeListener {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ ahfv c;
    public int d = 1;

    public final void onAudioFocusChange(int i) {
        ahfv ahfv = this.c;
        if (!ahfv.b.k) {
            ahfz ahfz;
            if (i != -3) {
                boolean z = true;
                if (i == -2 || i == -1) {
                    ahfz ahfz2 = ahfv.g;
                    if (ahfz2 != null) {
                        if (!(ahfz2.c() && i == -2)) {
                            z = false;
                        }
                        this.a = z;
                        this.c.g.b();
                    }
                    this.c.i = 0;
                    return;
                } else if (i == 1 || i == 2 || i == 3) {
                    ahfv.i = 1;
                    ahfz = ahfv.g;
                    if (ahfz != null) {
                        ahfz.a(1.0f);
                    }
                    if (this.a) {
                        if (this.c.b.i || a()) {
                            this.a = false;
                            this.b = false;
                            ahfz = this.c.g;
                            if (ahfz != null) {
                                ahfz.a();
                            }
                        } else {
                            this.b = true;
                            return;
                        }
                    }
                }
            }
            ahfz = ahfv.g;
            if (ahfz != null) {
                ahfz.a(0.1f);
                this.c.i = 2;
            }
        }
    }

    public final boolean a() {
        return this.d != 1;
    }

    /* synthetic */ ahga(ahfv ahfv) {
        this.c = ahfv;
    }
}
