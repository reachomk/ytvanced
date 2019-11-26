package com.google.android.libraries.youtube.player.features.gl.vr;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.ahxw;
import defpackage.wwz;

public class VrWelcomeActivity extends aej {
    public SharedPreferences g;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vr_welcome_activity);
        ((TextView) findViewById(R.id.link)).setMovementMethod(LinkMovementMethod.getInstance());
        this.g = ((wwz) getApplication()).i().ox();
        findViewById(R.id.continue_button).setOnClickListener(new ahxw(this));
    }
}
