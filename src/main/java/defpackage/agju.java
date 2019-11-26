package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAutoOfflineActivity;

/* renamed from: agju */
public final /* synthetic */ class agju implements OnClickListener {
    private final DebugOfflineAutoOfflineActivity a;

    public agju(DebugOfflineAutoOfflineActivity debugOfflineAutoOfflineActivity) {
        this.a = debugOfflineAutoOfflineActivity;
    }

    public final void onClick(View view) {
        Context context = this.a;
        context.b.a(context.c.c(), 10, 1);
        xpr.a(context, (CharSequence) "Immediate auto offline scheduled to run 10 seconds from now.", 1);
    }
}
