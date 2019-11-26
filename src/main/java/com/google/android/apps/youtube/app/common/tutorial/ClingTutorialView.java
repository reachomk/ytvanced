package com.google.android.apps.youtube.app.common.tutorial;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.evt;
import defpackage.evw;

public class ClingTutorialView extends RelativeLayout implements OnClickListener, evw {
    public ClingView a;
    public TextView b;
    public evt c;
    public int d = 500;
    private View e;
    private LinearLayout f;

    public ClingTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.ok);
        this.e.setOnClickListener(this);
        this.a = (ClingView) findViewById(R.id.cling_view);
        this.a.c = this;
        this.b = (TextView) findViewById(R.id.text);
        this.f = (LinearLayout) findViewById(R.id.text_area);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.a().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            b();
        }
        return false;
    }

    public final void a() {
        setAnimation(null);
        setVisibility(8);
    }

    public final void onClick(View view) {
        if (view == this.e) {
            b();
        }
    }

    private final void b() {
        a();
        this.c.a();
    }

    public final void a(Rect rect) {
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        int i = rect.top;
        int measuredHeight = getMeasuredHeight() - rect.bottom;
        if (rect.top != rect.bottom && i < measuredHeight) {
            layoutParams.topMargin = rect.bottom;
        } else {
            layoutParams.topMargin = rect.top - this.f.getHeight();
        }
        this.f.setLayoutParams(layoutParams);
    }
}
