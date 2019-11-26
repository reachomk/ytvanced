package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;

/* renamed from: acso */
public final class acso implements OnCheckedChangeListener {
    private final /* synthetic */ DeveloperPanel a;

    public acso(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        compoundButton.setChecked(false);
    }
}
