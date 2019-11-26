package com.google.android.apps.youtube.app.mdx.watch;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ado;
import defpackage.amqw;
import defpackage.hes;
import defpackage.het;
import defpackage.heu;
import defpackage.hev;
import defpackage.hew;
import defpackage.hex;
import defpackage.hez;
import defpackage.hfb;
import defpackage.xrn;
import defpackage.xse;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class MdxWatchDrawerLayout extends FrameLayout implements OnClickListener {
    public boolean a;
    public hex b;
    public ado c;
    public View d;
    public View e;
    public View f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final Set m;
    private View n;
    private View o;
    private View p;
    private View q;
    private View r;
    private boolean s;
    private Rect t;
    private hew u;
    private hew v;
    private hez w;

    public MdxWatchDrawerLayout(Context context) {
        this(context, null, 0);
    }

    public MdxWatchDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MdxWatchDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new CopyOnWriteArraySet();
        this.s = true;
        this.t = new Rect();
        ((hev) xse.b(context)).a(this);
        abe.a((View) this, new het(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = ado.a((ViewGroup) this, 10.0f, new hes(this));
        this.c.b = getResources().getDisplayMetrics().density * 400.0f;
        this.d = (View) amqw.a(findViewById(R.id.mdx_drawer));
        ViewStub viewStub = (ViewStub) amqw.a((ViewStub) findViewById(R.id.mdx_minibar_stub));
        if (this.a) {
            viewStub.setInflatedId(R.id.smart_remote_mdx_minibar);
            viewStub.setLayoutResource(R.layout.smart_remote_mdx_minibar);
        } else {
            viewStub.setInflatedId(R.id.default_mdx_minibar);
            viewStub.setLayoutResource(R.layout.default_mdx_minibar);
        }
        this.e = (View) amqw.a(viewStub.inflate());
        this.f = (View) amqw.a(findViewById(R.id.mdx_remote_queue));
        this.n = (View) amqw.a(findViewById(R.id.mdx_remote_queue_header));
        this.o = (View) amqw.a(findViewById(R.id.mdx_drawer_scrim));
        this.p = (View) amqw.a(findViewById(R.id.mdx_queue_header_content));
        this.q = (View) amqw.a(findViewById(R.id.minibar_toggle));
        this.r = (View) amqw.a(findViewById(R.id.queue_header_collapse));
        if (this.a) {
            this.q.setVisibility(8);
            this.r.setVisibility(0);
        } else {
            this.q.setVisibility(0);
            this.r.setVisibility(8);
        }
        this.e.setOnClickListener(this);
        this.n.setOnClickListener(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return (a(motionEvent) && this.c.a(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
        } else {
            this.c.a();
            return false;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j && !a(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        this.c.b(motionEvent);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    public final void a() {
        int measuredHeight = (getMeasuredHeight() - this.e.getMeasuredHeight()) - this.i;
        int i = this.h;
        if (i != measuredHeight) {
            i = (int) ((((float) this.g) / ((float) i)) * ((float) measuredHeight));
            this.h = measuredHeight;
            measuredHeight = this.e.getMeasuredHeight();
            int i2 = this.h - measuredHeight;
            int i3 = i2 + measuredHeight;
            this.u = new hew(this.e, i2, i3, 0.0f, 1.0f);
            i2 = (int) (((float) i2) - (((float) measuredHeight) * 0.9f));
            this.v = new hew(this.p, i2, i2 + measuredHeight, 1.0f, 0.0f);
            if (!this.a) {
                this.w = new hez(this.q, i2, i3);
            }
            a(i, false);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = (this.g + this.d.getMeasuredHeight()) + this.i;
        if (this.s) {
            a(!this.l ? this.h : 0, true);
            this.s = false;
            if (!this.l && xrn.c(getContext())) {
                a(true);
            }
        }
        this.d.layout(i, this.g, i3, measuredHeight);
        this.o.layout(i, i2, i3, i4);
    }

    public final void onClick(View view) {
        if (view == this.e || view == this.n) {
            a(this.g > this.h / 2 ? 0.0f : 1.0f);
        }
    }

    public final void computeScroll() {
        if (this.c.b()) {
            abe.e(this);
        }
    }

    private final boolean a(MotionEvent motionEvent) {
        return a(motionEvent, this.e) || a(motionEvent, this.n);
    }

    private final boolean a(MotionEvent motionEvent, View view) {
        return view.getGlobalVisibleRect(this.t) && this.t.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void b() {
        a(1.0f);
    }

    public final void a(heu heu) {
        this.m.add(heu);
    }

    public final void b(heu heu) {
        this.m.remove(heu);
    }

    public final float c() {
        return 1.0f - (((float) this.g) / ((float) this.h));
    }

    private final void a(float f) {
        int paddingTop = getPaddingTop();
        int i = this.h;
        ado ado = this.c;
        View view = this.d;
        if (ado.a(view, view.getLeft(), (int) (((float) paddingTop) + (f * ((float) i))))) {
            abe.e(this);
        }
    }

    public final void a(int i, boolean z) {
        if (z || i != this.g) {
            this.g = i;
            int i2 = 0;
            this.l = i == 0;
            this.u.a(i);
            this.v.a(this.g);
            this.e.setVisibility(!this.l ? 0 : 4);
            i = this.g;
            int i3 = this.h;
            View view = this.f;
            if (i == i3) {
                i2 = 4;
            }
            view.setVisibility(i2);
            if (!this.a) {
                this.w.a(this.g);
            }
            if (this.l) {
                this.q.setContentDescription(getResources().getText(R.string.mdx_remote_queue_header_description));
            } else if (i == i3) {
                this.q.setContentDescription(getResources().getText(R.string.mdx_minibar_toggle_description));
            }
            if (!abe.C(this)) {
                requestLayout();
            }
            if (!this.m.isEmpty()) {
                for (heu a : this.m) {
                    a.a(this);
                }
            }
        }
    }

    public final void a(boolean z) {
        ViewParent parentForAccessibility = getParentForAccessibility();
        if (parentForAccessibility instanceof AccessibilityLayerLayout) {
            ((AccessibilityLayerLayout) parentForAccessibility).a(z);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        hfb hfb = new hfb(super.onSaveInstanceState());
        hfb.a = this.l;
        return hfb;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        hfb hfb = (hfb) parcelable;
        super.onRestoreInstanceState(hfb.getSuperState());
        this.l = hfb.a;
    }
}
