package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;

/* renamed from: mky */
public final /* synthetic */ class mky implements OnCheckedChangeListener {
    private final WatchBreakFrequencyPickerPreference a;

    public mky(WatchBreakFrequencyPickerPreference watchBreakFrequencyPickerPreference) {
        this.a = watchBreakFrequencyPickerPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a(z);
    }
}
