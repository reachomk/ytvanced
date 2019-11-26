package com.google.android.apps.youtube.app.vr;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.vr.ndk.base.DaydreamApi;
import defpackage.aej;
import defpackage.ahxt;
import defpackage.aizy;
import defpackage.fmu;
import defpackage.lcb;
import defpackage.xse;

public class LaunchYouTubeVrActivity extends aej {
    public aizy g;

    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        super.onCreate(bundle);
        View frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setSystemUiVisibility(3846);
        setContentView(frameLayout);
        ((lcb) xse.a(getApplicationContext())).a(this);
        DaydreamApi create = DaydreamApi.create(getApplicationContext());
        if (create != null) {
            ahxt.a(this, 2, create, this.g);
            create.close();
        }
    }
}
