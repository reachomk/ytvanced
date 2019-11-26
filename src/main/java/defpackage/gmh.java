package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

/* renamed from: gmh */
final class gmh extends ans {
    private final /* synthetic */ gmd a;

    public gmh(gmd gmd, Context context) {
        this.a = gmd;
        super(0, false);
        gmd.m = 117.46f / ((float) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth());
    }

    public final void a(RecyclerView recyclerView, int i) {
        aqc gmk = new gmk(this.a, recyclerView.getContext());
        gmk.b = i;
        a(gmk);
    }
}
