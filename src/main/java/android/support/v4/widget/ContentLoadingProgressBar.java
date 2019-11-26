package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import defpackage.acw;
import defpackage.acy;

public class ContentLoadingProgressBar extends ProgressBar {
    public long a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new acw(this);
        this.f = new acy(this);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    private final void c() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    /* JADX WARNING: Missing block: B:17:0x0034, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = 1;
        r10.d = r0;	 Catch:{ all -> 0x0035 }
        r1 = r10.f;	 Catch:{ all -> 0x0035 }
        r10.removeCallbacks(r1);	 Catch:{ all -> 0x0035 }
        r1 = 0;
        r10.c = r1;	 Catch:{ all -> 0x0035 }
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0035 }
        r3 = r10.a;	 Catch:{ all -> 0x0035 }
        r1 = r1 - r3;
        r5 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x002e;
    L_0x0019:
        r7 = -1;
        r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x002e;
    L_0x0020:
        r3 = r10.b;	 Catch:{ all -> 0x0035 }
        if (r3 != 0) goto L_0x0033;
    L_0x0024:
        r3 = r10.e;	 Catch:{ all -> 0x0035 }
        r5 = r5 - r1;
        r10.postDelayed(r3, r5);	 Catch:{ all -> 0x0035 }
        r10.b = r0;	 Catch:{ all -> 0x0035 }
        monitor-exit(r10);
        return;
    L_0x002e:
        r0 = 8;
        r10.setVisibility(r0);	 Catch:{ all -> 0x0035 }
    L_0x0033:
        monitor-exit(r10);
        return;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ContentLoadingProgressBar.a():void");
    }

    public final synchronized void b() {
        this.a = -1;
        this.d = false;
        removeCallbacks(this.e);
        this.b = false;
        if (!this.c) {
            postDelayed(this.f, 500);
            this.c = true;
        }
    }
}
