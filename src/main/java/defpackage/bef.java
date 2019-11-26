package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import androidx.preference.SeekBarPreference;

/* renamed from: bef */
public final class bef implements OnSeekBarChangeListener {
    private final /* synthetic */ SeekBarPreference a;

    public bef(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.a;
            if (seekBarPreference.k || !seekBarPreference.c) {
                seekBarPreference.a(seekBar);
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.c = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.a;
        if (progress + seekBarPreference.b != seekBarPreference.a) {
            seekBarPreference.a(seekBar);
        }
    }
}
