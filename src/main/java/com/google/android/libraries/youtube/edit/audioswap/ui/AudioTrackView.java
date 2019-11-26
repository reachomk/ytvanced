package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.ra;
import defpackage.uja;
import defpackage.uje;
import defpackage.ujf;
import defpackage.ujh;
import defpackage.ujk;
import defpackage.upk;
import defpackage.zgd;
import defpackage.zgf;
import java.util.Set;

public class AudioTrackView extends FrameLayout implements uje, ujk {
    public final upk a;
    public final Paint b;
    public ujf c;
    public uja d;
    public zgd e;
    public zgf f;
    public boolean g = true;
    public boolean h = false;
    public acvx i;
    private final int j;
    private final int k;
    private final YouTubeTextView l;
    private Rect m;
    private int n;
    private long o;
    private int p;
    private float q;
    private ViewPropertyAnimator r;
    private boolean s;
    private boolean t = false;

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.l = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.audio_swap_audio_track_view, this, true).findViewById(R.id.audio_swap_audio_track_view_scroll_hint);
        this.a = new upk(context);
        this.k = ra.a(context, (int) R.drawable.ic_trim_handle).getIntrinsicWidth() / 2;
        float dimension = resources.getDimension(R.dimen.video_trim_view_container_border_width);
        this.b = new Paint();
        this.b.setColor(resources.getColor(R.color.video_trim_view_container_border));
        this.b.setStrokeWidth((float) ((int) dimension));
        setWillNotDraw(false);
    }

    public final void P_() {
    }

    public final void Q_() {
    }

    public final void a(ujf ujf, Set set) {
    }

    public final void b(ujf ujf, Set set) {
    }

    public final void a() {
        ujf ujf = this.c;
        if (ujf != null) {
            ujf.b((ujk) this);
            this.c = null;
        }
        uja uja = this.d;
        if (uja != null) {
            uja.b((uje) this);
        }
        zgd zgd = this.e;
        if (zgd != null) {
            zgd.setCallback(null);
            this.e = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.r = null;
        }
        this.a.a = null;
        requestLayout();
    }

    public final void o() {
        b();
        postInvalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }

    public final void a(ujf ujf, ujh ujh) {
        postInvalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    private final void b() {
        uja uja = this.d;
        if (uja != null) {
            int i = 0;
            int i2 = (uja.c || this.h) ? 0 : this.k;
            this.m = new Rect(getPaddingLeft() + i2, getPaddingTop(), (getWidth() - getPaddingRight()) - i2, getHeight() - getPaddingBottom());
            if (this.d.c) {
                i = this.k;
            }
            this.n = i;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != null) {
            zgd zgd = this.e;
            if (zgd != null) {
                zgd.a = this.n;
                zgd.setBounds(this.m);
                this.e.draw(canvas);
            }
            int width = this.m.width();
            int i = this.n;
            float f = (float) (width - (i + i));
            float a = ((float) (this.m.left + this.n)) + (this.d.a(this.c.j()) * f);
            float a2 = ((float) (this.m.left + this.n)) + (this.d.a(this.c.l()) * f);
            if (this.g) {
                this.a.setBounds(this.m);
                upk upk = this.a;
                upk.b = a;
                upk.c = a2;
                upk.draw(canvas);
            }
            canvas.drawLine(a, (float) this.m.top, a, (float) this.m.bottom, this.b);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0019, code skipped:
            if (r3 != 6) goto L_0x00cd;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r0 = 0;
        r1 = r12.getPointerId(r0);
        r2 = r12.getX(r0);
        r3 = r12.getActionMasked();
        r4 = 1;
        if (r3 == 0) goto L_0x00bb;
    L_0x0010:
        if (r3 == r4) goto L_0x00b3;
    L_0x0012:
        r12 = 2;
        if (r3 == r12) goto L_0x0022;
    L_0x0015:
        r12 = 3;
        if (r3 == r12) goto L_0x001d;
    L_0x0018:
        r12 = 6;
        if (r3 == r12) goto L_0x00b3;
    L_0x001b:
        goto L_0x00cd;
    L_0x001d:
        r11.c();
        goto L_0x00cd;
    L_0x0022:
        r12 = r11.p;
        if (r12 != r1) goto L_0x00cd;
    L_0x0026:
        r12 = r11.s;
        if (r12 != 0) goto L_0x003d;
    L_0x002a:
        r12 = r11.q;
        r12 = r12 - r2;
        r12 = java.lang.Math.abs(r12);
        r1 = r11.j;
        r1 = (float) r1;
        r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r12 <= 0) goto L_0x003d;
    L_0x0038:
        r11.s = r4;
        r11.a(r0);
    L_0x003d:
        r12 = r11.s;
        if (r12 == 0) goto L_0x00cd;
    L_0x0041:
        r12 = r11.q;
        r0 = r11.m;
        r0 = r0.width();
        r1 = r11.d;
        r2 = r2 - r12;
        r12 = (float) r0;
        r2 = r2 / r12;
        r0 = r1.a(r2);
        r2 = r11.o;
        r2 = r2 + r0;
        r12 = r11.f;
        r0 = r12.b;
        r5 = 0;
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r0 = r0.h();
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r7;
        goto L_0x0067;
    L_0x0066:
        r0 = r5;
    L_0x0067:
        r7 = r12.b();
        r12 = r12.c();
        r9 = (long) r12;
        r7 = r7 * r9;
        r0 = java.lang.Math.max(r7, r0);
        r12 = r11.c;
        r7 = r12.l();
        r12 = r11.c;
        r9 = r12.j();
        r7 = r7 - r9;
        r7 = r7 - r0;
        r0 = java.lang.Math.max(r7, r2);
        r0 = java.lang.Math.min(r5, r0);
        r12 = r11.c;
        r12.c(r0);
        r12 = r11.r;
        if (r12 != 0) goto L_0x00cd;
    L_0x0095:
        r12 = r11.l;
        r12 = r12.animate();
        r0 = 0;
        r12 = r12.alpha(r0);
        r0 = r11.getResources();
        r1 = 2131820553; // 0x7f110009 float:1.9273824E38 double:1.0532592983E-314;
        r0 = r0.getInteger(r1);
        r0 = (long) r0;
        r12 = r12.setDuration(r0);
        r11.r = r12;
        goto L_0x00cd;
    L_0x00b3:
        r12 = r11.p;
        if (r12 != r1) goto L_0x00cd;
    L_0x00b7:
        r11.c();
        goto L_0x00cd;
    L_0x00bb:
        r12 = r12.getPointerCount();
        if (r12 != r4) goto L_0x00cd;
    L_0x00c1:
        r12 = r11.c;
        r5 = r12.u();
        r11.o = r5;
        r11.p = r1;
        r11.q = r2;
    L_0x00cd:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z ^ 1);
        }
    }

    private final void c() {
        if (this.s) {
            this.s = false;
            acvx acvx = this.i;
            if (acvx != null) {
                if (!this.t) {
                    acvx.b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_WAVEFORM, null);
                    this.t = true;
                }
                this.i.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_WAVEFORM), null);
            }
        }
        a(true);
    }
}
