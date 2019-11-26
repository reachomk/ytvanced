package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jcy */
public final class jcy implements OnClickListener {
    private final /* synthetic */ DebugOnlineAdActivity a;

    public jcy(DebugOnlineAdActivity debugOnlineAdActivity) {
        this.a = debugOnlineAdActivity;
    }

    public final void onClick(View view) {
        DebugOnlineAdActivity debugOnlineAdActivity = this.a;
        debugOnlineAdActivity.l.a(debugOnlineAdActivity.o.isChecked());
        this.a.u();
        if (this.a.o.isChecked()) {
            Context context = this.a;
            if (!context.n) {
                xpr.a(context, (CharSequence) "Restart YouTube app for changes to take effect", 1);
            }
        }
    }
}
