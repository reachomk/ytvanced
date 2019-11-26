package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: gkb */
public final class gkb implements OnSeekBarChangeListener {
    private final /* synthetic */ gju a;

    public gkb(gju gju) {
        this.a = gju;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.j.setTextSize(2, ((float) i) + 12.0f);
        this.a.c();
    }
}
