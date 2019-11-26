package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.preference.CheckBoxPreference;

/* renamed from: bdt */
public final class bdt implements OnCheckedChangeListener {
    private final /* synthetic */ CheckBoxPreference a;

    public bdt(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(z);
    }
}
