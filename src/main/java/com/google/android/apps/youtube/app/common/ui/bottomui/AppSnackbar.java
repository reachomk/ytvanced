package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import defpackage.fbo;

public class AppSnackbar extends Snackbar implements fbo {
    public AppSnackbar(Context context) {
        super(context);
    }

    public AppSnackbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppSnackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a() {
        Snackbar.a((Snackbar) this);
    }
}
