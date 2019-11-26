package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: wgv */
public final class wgv extends apk {
    private final int a;

    public wgv(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_margin);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (RecyclerView.e(view) != -1) {
            int i = ((anm) recyclerView.n).a;
            int i2 = ((ano) view.getLayoutParams()).a;
            rect.set(i2 != 0 ? this.a / 2 : 0, 0, i2 != i + -1 ? this.a / 2 : 0, this.a);
        }
    }
}
