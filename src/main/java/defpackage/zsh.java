package defpackage;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: zsh */
final class zsh implements OnCheckedChangeListener {
    private final /* synthetic */ aeh a;

    zsh(aeh aeh) {
        this.a = aeh;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button a = this.a.a(-1);
        if (a != null) {
            a.setEnabled(z ^ 1);
        }
    }
}
