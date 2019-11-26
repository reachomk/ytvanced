package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;

/* renamed from: acsp */
public final class acsp implements OnClickListener {
    private final /* synthetic */ DeveloperPanel a;

    public acsp(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    public final void onClick(View view) {
        this.a.setVisibility(8);
    }
}
