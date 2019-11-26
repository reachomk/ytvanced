package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: llk */
class llk implements lmh {
    public boolean b;

    protected llk(String str) {
        ffs ffs = new ffs(str);
    }

    public int a(RecyclerView recyclerView, MotionEvent motionEvent) {
        throw null;
    }

    public void a(View view, int i, int i2) {
    }

    public boolean a(View view, float f, float f2) {
        return false;
    }

    public int b(RecyclerView recyclerView, MotionEvent motionEvent) {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (!this.b) {
            this.b = true;
        }
    }

    public void a() {
        this.b = false;
    }

    protected static boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return (actionMasked == 3 || actionMasked == 1) ? false : true;
    }
}
