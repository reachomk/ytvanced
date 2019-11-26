package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import defpackage.bcud;
import defpackage.jjf;
import defpackage.kym;
import defpackage.xse;

public class MainRtlAwareViewPager extends RtlAwareViewPager {
    public bcud j;

    public MainRtlAwareViewPager(Context context) {
        super(context);
        d();
    }

    public MainRtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private final void d() {
        ((jjf) xse.b(getContext())).a(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && canScrollHorizontally(-1)) {
            this.j.e_(new kym());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
