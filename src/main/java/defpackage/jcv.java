package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jcv */
public final class jcv implements OnClickListener {
    private final /* synthetic */ DebugOnlineAdActivity a;

    public jcv(DebugOnlineAdActivity debugOnlineAdActivity) {
        this.a = debugOnlineAdActivity;
    }

    public final void onClick(View view) {
        this.a.l.b(true);
        this.a.r.add(new voh());
        this.a.r.notifyDataSetChanged();
    }
}
