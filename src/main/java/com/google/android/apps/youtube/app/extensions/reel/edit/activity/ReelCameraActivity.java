package com.google.android.apps.youtube.app.extensions.reel.edit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.youtube.R;
import defpackage.acvx;
import defpackage.acwa;
import defpackage.acxj;
import defpackage.aej;
import defpackage.anxa;
import defpackage.anxl;
import defpackage.anyg;
import defpackage.apxu;
import defpackage.fmu;
import defpackage.gbb;
import defpackage.gbc;
import defpackage.gcl;
import defpackage.gcs;
import defpackage.nf;
import defpackage.or;
import defpackage.xey;
import defpackage.xfc;
import defpackage.xse;

public class ReelCameraActivity extends aej implements acwa, gcs, xfc {
    public gcl g;
    public acxj h;
    private apxu i;
    private gbc j;

    public final void l() {
    }

    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        p().a(this);
        this.h.a(bundle != null ? bundle.getBundle("BUNDLE_INTERACTION_BUNDLE") : null, o());
        super.onCreate(bundle);
        setContentView((int) R.layout.reel_camera_activity);
        nf a = f().a((int) R.id.reel_creation_container);
        if (a instanceof gcl) {
            this.g = (gcl) a;
            this.g.ak = this;
            return;
        }
        this.g = gcl.a(o(), false, false);
        this.g.ak = this;
        or a2 = f().a();
        a2.b(R.id.reel_creation_container, this.g);
        a2.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", this.h.e());
    }

    private final apxu o() {
        if (this.i == null) {
            Intent intent = getIntent();
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
                if (byteArrayExtra != null) {
                    try {
                        this.i = (apxu) anxl.parseFrom(apxu.d, byteArrayExtra, anxa.c());
                    } catch (anyg unused) {
                    }
                }
            }
        }
        return this.i;
    }

    public final void onBackPressed() {
        if (!this.g.ai.a()) {
            super.onBackPressed();
        }
    }

    private final gbc p() {
        if (this.j == null) {
            this.j = ((gbb) xse.a(getApplication())).a(new xey(this));
        }
        return this.j;
    }

    public final acvx t() {
        return this.h;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.g.ai.a(i)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.g.ai.b(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.g.ai.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void m() {
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        if (isFinishing()) {
            setRequestedOrientation(-1);
        }
        super.onPause();
    }

    public final /* synthetic */ Object n() {
        return p();
    }
}
