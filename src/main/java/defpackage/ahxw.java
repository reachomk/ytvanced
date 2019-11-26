package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity;

/* renamed from: ahxw */
public final class ahxw implements OnClickListener {
    private final /* synthetic */ VrWelcomeActivity a;

    public ahxw(VrWelcomeActivity vrWelcomeActivity) {
        this.a = vrWelcomeActivity;
    }

    public final void onClick(View view) {
        this.a.g.edit().putBoolean("com.google.android.libraries.youtube.player.pref.vr_mode_first_time_use", false).apply();
        this.a.finish();
    }
}
