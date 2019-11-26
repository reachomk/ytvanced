package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* renamed from: scb */
final class scb implements OnSeekBarChangeListener {
    private final /* synthetic */ sbz a;

    scb(sbz sbz) {
        this.a = sbz;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        try {
            sbx sbx = this.a.j;
            if (sbx != null) {
                sbx.a(seekBar);
            }
        } catch (Exception e) {
            sdf.a(sbz.g, "Failed to complete seek", e);
            this.a.finish();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        try {
            sbx sbx = this.a.j;
            if (sbx != null) {
                sbx.d();
            }
        } catch (Exception e) {
            sdf.a(sbz.g, "Failed to start seek", e);
            this.a.finish();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.i.setText(sdh.a(i));
        try {
            sbx sbx = this.a.j;
        } catch (Exception e) {
            sdf.a(sbz.g, "Failed to set the progress result", e);
        }
    }
}
