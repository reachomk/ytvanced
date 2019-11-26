package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugForceInnertubeCapabilitiesActivity;

/* renamed from: jck */
public final class jck implements OnClickListener {
    private final /* synthetic */ DebugForceInnertubeCapabilitiesActivity a;

    public jck(DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity) {
        this.a = debugForceInnertubeCapabilitiesActivity;
    }

    public final void onClick(View view) {
        DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity = this.a;
        for (jcm jcm : debugForceInnertubeCapabilitiesActivity.o) {
            if (jcm.e) {
                for (jcq jcq : jcm.b) {
                    if (jcq.d) {
                        debugForceInnertubeCapabilitiesActivity.a(jcm, jcq);
                    }
                }
            }
        }
        debugForceInnertubeCapabilitiesActivity.o.clear();
        debugForceInnertubeCapabilitiesActivity.n.notifyDataSetChanged();
    }
}
