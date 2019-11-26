package defpackage;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;
import java.util.Locale;

/* renamed from: acsq */
public final class acsq implements OnSeekBarChangeListener {
    private final /* synthetic */ TextView a;
    private final /* synthetic */ DeveloperPanel b;

    public acsq(DeveloperPanel developerPanel, TextView textView) {
        this.b = developerPanel;
        this.a = textView;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.a.setText(String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(this.b.b(i))}));
    }
}
