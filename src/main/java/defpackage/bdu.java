package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import androidx.preference.DropDownPreference;

/* renamed from: bdu */
public final class bdu implements OnItemSelectedListener {
    private final /* synthetic */ DropDownPreference a;

    public bdu(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.a.b[i].toString();
            if (!charSequence.equals(this.a.c)) {
                DropDownPreference dropDownPreference = this.a;
                i = TextUtils.equals(dropDownPreference.c, charSequence) ^ 1;
                if (i != 0 || !dropDownPreference.d) {
                    dropDownPreference.c = charSequence;
                    dropDownPreference.d = true;
                    if (i != 0) {
                        dropDownPreference.b();
                    }
                }
            }
        }
    }
}
