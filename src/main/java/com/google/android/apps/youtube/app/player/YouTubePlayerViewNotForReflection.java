package com.google.android.apps.youtube.app.player;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.abe;
import defpackage.afjw;
import defpackage.aiub;
import defpackage.amqw;
import defpackage.ejc;
import defpackage.ejd;
import defpackage.ekl;
import defpackage.els;

public class YouTubePlayerViewNotForReflection extends ekl implements ejc {
    private ejd c;
    private els d;

    public YouTubePlayerViewNotForReflection(Context context) {
        this(context, null);
    }

    public void extractSmartClipData(int i, int i2, int i3, int i4) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public YouTubePlayerViewNotForReflection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = ejd.NONE;
        abe.b((View) this, 2);
    }

    public final void requestLayout() {
        super.requestLayout();
        View view = this.i;
        if (view != null) {
            view.forceLayout();
        }
    }

    public final void a(els els) {
        if (this.d != els) {
            this.d = els;
            requestLayout();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, Rect rect, int i, int i2) {
        if (a(view)) {
            this.d.a(view, i, i2);
        } else {
            super.a(view, rect, i, i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, Rect rect, int i, int i2, int i3, int i4) {
        if (a(view)) {
            this.d.a(view, i, i2, i3, i4);
        } else {
            super.a(view, rect, i, i2, i3, i4);
        }
    }

    private final boolean a(View view) {
        return (view != this.i || this.c.k() || this.d == null) ? false : true;
    }

    public final void a(aiub... aiubArr) {
        throw new IllegalStateException("Adding overlays to the YouTubePlayerView is no longer supported.");
    }

    public final void a(ejd ejd, ejd ejd2) {
        amqw.a((Object) ejd2);
        if (ejd2 != this.c) {
            this.c = ejd2;
            afjw afjw = this.b;
            if (afjw.p() && !afjw.b.o().j && ejd2.e()) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
        }
    }
}
