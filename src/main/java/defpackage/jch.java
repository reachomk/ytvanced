package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugForceInnertubeCapabilitiesActivity;

/* renamed from: jch */
public final class jch implements OnClickListener {
    private final /* synthetic */ DebugForceInnertubeCapabilitiesActivity a;

    public jch(DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity) {
        this.a = debugForceInnertubeCapabilitiesActivity;
    }

    public final void onClick(View view) {
        DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity = this.a;
        debugForceInnertubeCapabilitiesActivity.o.add(new jcm(debugForceInnertubeCapabilitiesActivity.p, debugForceInnertubeCapabilitiesActivity));
        debugForceInnertubeCapabilitiesActivity.n.notifyDataSetChanged();
    }
}
