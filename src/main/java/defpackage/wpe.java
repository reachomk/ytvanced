package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: wpe */
final class wpe implements OnSeekBarChangeListener {
    private final /* synthetic */ woy a;

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        woy woy = this.a;
        woy.k = i;
        woy.a();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* synthetic */ wpe(woy woy) {
        this.a = woy;
    }
}
