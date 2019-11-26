package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.preference.Preference;

/* renamed from: bdx */
public final class bdx implements OnClickListener {
    private final /* synthetic */ Preference a;

    public bdx(Preference preference) {
        this.a = preference;
    }

    public final void onClick(View view) {
        this.a.a(view);
    }
}
