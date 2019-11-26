package defpackage;

import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;

/* renamed from: zrj */
final /* synthetic */ class zrj implements Runnable {
    private final zrg a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    zrj(zrg zrg, boolean z, boolean z2, boolean z3) {
        this.a = zrg;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final void run() {
        zrg zrg = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        VideoTrimView ae = zrg.ae();
        int i = 8;
        if (ae != null) {
            ae.setVisibility(!z ? 8 : 0);
        }
        if (zrg.X() != null) {
            zrg.X().setVisibility(!z2 ? 4 : 0);
        }
        AudioTrackView ai = zrg.ai();
        if (ai != null) {
            if (z3) {
                i = 0;
            }
            ai.setVisibility(i);
        }
    }
}
