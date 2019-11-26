package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import defpackage.fbo;
import defpackage.xpr;

public class Mealbar extends CardView implements fbo {
    public TextView i;
    public TextView j;
    public Button k;
    public Button l;
    public ImageView m;

    public Mealbar(Context context) {
        super(context);
    }

    public Mealbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Mealbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (TextView) findViewById(R.id.mealbar_title);
        this.j = (TextView) findViewById(R.id.mealbar_message);
        this.k = (Button) findViewById(R.id.mealbar_action_button);
        this.l = (Button) findViewById(R.id.mealbar_dismiss_button);
        this.m = (ImageView) findViewById(R.id.mealbar_icon);
        View view = this.k;
        xpr.a(view, view.getBackground());
        if (VERSION.SDK_INT >= 21) {
            setStateListAnimator(null);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction(AccessibilityAction.ACTION_CLICK);
        }
    }

    public final void a() {
        CharSequence text = this.i.getText();
        if (!TextUtils.isEmpty(text) && TextUtils.getTrimmedLength(text) > 0) {
            String trim = text.toString().trim();
            Context context = getContext();
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setClassName(Mealbar.class.getName());
                obtain.setPackageName(context.getPackageName());
                obtain.getText().add(trim);
                obtain.setEnabled(true);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
