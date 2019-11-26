package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: fbz */
public final class fbz {
    public YouTubeTextView a;
    public HatsSurvey b;
    private HatsContainer c;
    private HatsHorizontalSurvey d;

    private fbz() {
    }

    public final HatsHorizontalSurvey a() {
        if (this.d == null) {
            this.d = (HatsHorizontalSurvey) a(R.layout.hats_horizontal_survey);
        }
        return this.d;
    }

    public final View a(int i) {
        return LayoutInflater.from(this.c.getContext()).inflate(i, this.c.a, false);
    }

    public /* synthetic */ fbz(HatsContainer hatsContainer) {
        this.c = hatsContainer;
    }
}
