package com.google.android.apps.youtube.app;

import android.os.Bundle;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.youtube.R;
import defpackage.acku;
import defpackage.ackw;
import defpackage.alck;
import defpackage.dnu;
import defpackage.dnw;
import defpackage.fbp;
import defpackage.fmu;
import defpackage.xse;

public class MainLiveCreationActivity extends LiveCreationActivity {
    private dnu aa;
    public fbp g;
    public alck h;

    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        super.onCreate(bundle);
        this.h.b(findViewById(16908290));
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        ((dnu) n()).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.bottom_ui_container);
        this.g.a((BottomUiContainer) viewStub.inflate());
    }

    public final /* synthetic */ acku m() {
        return (dnu) n();
    }

    public final /* synthetic */ Object n() {
        if (this.aa == null) {
            this.aa = ((dnw) xse.a(getApplication())).a(new ackw(this));
        }
        return this.aa;
    }
}
