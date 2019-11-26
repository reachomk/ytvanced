package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: baa */
final class baa implements OnSeekBarChangeListener {
    public final /* synthetic */ azl a;
    private final Runnable b = new bad(this);

    baa(azl azl) {
        this.a = azl;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        azl azl = this.a;
        if (azl.u != null) {
            azl.s.removeCallbacks(this.b);
        }
        this.a.u = (bbs) seekBar.getTag();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.s.postDelayed(this.b, 500);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ((bbs) seekBar.getTag()).a(i);
        }
    }
}
