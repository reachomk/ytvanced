package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: beh */
public final class beh implements OnCheckedChangeListener {
    private final /* synthetic */ SwitchPreferenceCompat a;

    public beh(SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(z);
    }
}
