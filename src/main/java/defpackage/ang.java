package defpackage;

import android.view.ViewParent;

/* renamed from: ang */
final class ang implements Runnable {
    private final /* synthetic */ and a;

    ang(and and) {
        this.a = and;
    }

    public final void run() {
        ViewParent parent = this.a.a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
