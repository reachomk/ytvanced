package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;
import java.util.Arrays;

/* renamed from: agkb */
public final class agkb implements OnClickListener {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    public agkb(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    public final void onClick(View view) {
        agud agud = (agud) this.a.h;
        ((agui) agud.a.get()).b = 2;
        agud.b = true;
        ((agui) agud.a.get()).a = Arrays.asList(new avpb[]{avpb.OFFLINE_REFRESH_ACTION_REFRESH_PLAYER_RESPONSE});
        agud.b = true;
    }
}
