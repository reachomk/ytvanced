package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.abe;
import defpackage.xnn;

public class YouTubeButton extends YouTubeTextView {
    private static final xnn a = new xnn();

    public YouTubeButton(Context context) {
        super(context);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public YouTubeButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private final void a() {
        abe.a((View) this, a);
    }
}
