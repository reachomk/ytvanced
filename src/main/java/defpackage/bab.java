package defpackage;

import android.widget.SeekBar;

/* renamed from: bab */
final class bab extends bbe {
    private final /* synthetic */ azl a;

    bab(azl azl) {
        this.a = azl;
    }

    public final void b(bbs bbs) {
        this.a.a(false);
    }

    public final void c(bbb bbb, bbs bbs) {
        this.a.a(true);
    }

    public final void c(bbs bbs) {
        SeekBar seekBar = (SeekBar) this.a.z.get(bbs);
        int i = bbs.o;
        if (seekBar != null && this.a.u != bbs) {
            seekBar.setProgress(i);
        }
    }
}
