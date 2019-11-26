package defpackage;

import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;

/* renamed from: jyq */
final /* synthetic */ class jyq implements Runnable {
    private final jyi a;

    jyq(jyi jyi) {
        this.a = jyi;
    }

    public final void run() {
        jyi jyi = this.a;
        int p = jyi.r.p();
        int i = p + 1;
        int size = jyi.e.size() - 1;
        if (p >= 0) {
            SnappyRecyclerView snappyRecyclerView = jyi.q;
            if (i > size) {
                i = 0;
            }
            snappyRecyclerView.e(i);
        }
    }
}
