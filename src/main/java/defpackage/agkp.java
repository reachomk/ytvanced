package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;

/* renamed from: agkp */
public final /* synthetic */ class agkp implements OnClickListener {
    private final DebugOfflineStreamsActivity a;

    public agkp(DebugOfflineStreamsActivity debugOfflineStreamsActivity) {
        this.a = debugOfflineStreamsActivity;
    }

    public final void onClick(View view) {
        new agkr(this.a).execute(new Void[0]);
    }
}
