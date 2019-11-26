package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.preference.SwitchPreference;

/* renamed from: beg */
public final class beg implements OnCheckedChangeListener {
    private final /* synthetic */ SwitchPreference a;

    public beg(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(z);
    }
}
