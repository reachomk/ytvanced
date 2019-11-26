package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.youtube.R;
import defpackage.xnm;

public class OfflineDialogOptionView extends xnm {
    private RadioButton a;

    public OfflineDialogOptionView(Context context) {
        super(context);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        this.a = (RadioButton) findViewById(R.id.radio_button);
        this.a.setImportantForAccessibility(2);
        super.onFinishInflate();
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        RadioButton radioButton = this.a;
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
    }
}
