package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.RoundedLinearLayout;
import defpackage.xss;
import defpackage.xwn;

public class ConversationRoundedLinearLayout extends RoundedLinearLayout {
    public float a;
    private float b;
    private boolean c;
    private boolean d;
    private int e = 1;

    public ConversationRoundedLinearLayout(Context context) {
        super(context);
    }

    public ConversationRoundedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = (float) context.obtainStyledAttributes(attributeSet, xwn.a).getDimensionPixelSize(xwn.b, xss.a(context.getResources().getDisplayMetrics(), 4));
        this.e = 2;
        this.a = 1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a() {
        float f;
        if (this.e == 2 && this.c) {
            f = this.b;
        } else {
            f = super.a();
        }
        return f * this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final float b() {
        float f;
        if (this.e == 2 && this.d) {
            f = this.b;
        } else {
            f = super.b();
        }
        return f * this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final float c() {
        float f;
        if (this.e == 3 && this.c) {
            f = this.b;
        } else {
            f = super.c();
        }
        return f * this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final float d() {
        float f;
        if (this.e == 3 && this.d) {
            f = this.b;
        } else {
            f = super.d();
        }
        return f * this.a;
    }

    public final void a(boolean z, boolean z2, int i) {
        this.c = z;
        this.d = z2;
        this.e = i;
        a(getMeasuredWidth(), getMeasuredHeight());
    }
}
