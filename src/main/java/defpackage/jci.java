package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugForceInnertubeCapabilitiesActivity;

/* renamed from: jci */
public final class jci implements OnClickListener {
    private final /* synthetic */ DebugForceInnertubeCapabilitiesActivity a;

    public jci(DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity) {
        this.a = debugForceInnertubeCapabilitiesActivity;
    }

    public final void onClick(View view) {
        DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity = this.a;
        jcu jcu = debugForceInnertubeCapabilitiesActivity.l;
        jcu.b.edit().putBoolean("debugForceInnertubeCapabilityEnable", debugForceInnertubeCapabilitiesActivity.m.isChecked()).commit();
        this.a.n();
    }
}
