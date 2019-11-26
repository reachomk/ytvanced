package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acka */
public final /* synthetic */ class acka implements OnClickListener {
    private final LiveCreationActivity a;
    private final aceo b;

    public acka(LiveCreationActivity liveCreationActivity, aceo aceo) {
        this.a = liveCreationActivity;
        this.b = aceo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LiveCreationActivity liveCreationActivity = this.a;
        liveCreationActivity.J = this.b;
        liveCreationActivity.a(acef.a(), liveCreationActivity.J);
        liveCreationActivity.V = false;
        liveCreationActivity.r();
        String str = liveCreationActivity.J.r;
        aclk aclk;
        if ("LIVE_STREAM_FRAGMENT".equals(str)) {
            aclk = liveCreationActivity.m;
            aclk.a = true;
            aclk.b = true;
            aclk.e();
        } else if ("CHOOSE_THUMBNAIL_FRAGMENT".equals(str) || "EDIT_THUMBNAIL_FRAGMENT_NAME".equals(str)) {
            aclk = liveCreationActivity.m;
            aclk.a = true;
            aclk.e();
            liveCreationActivity.v();
        } else if ("PRE_STREAM_FRAGMENT".equals(str)) {
            liveCreationActivity.q();
        }
        liveCreationActivity.X.post(liveCreationActivity.Y);
        liveCreationActivity.e(Boolean.TRUE.equals(liveCreationActivity.J.d.f));
    }
}
