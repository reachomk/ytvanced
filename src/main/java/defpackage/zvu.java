package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: zvu */
final class zvu extends apk {
    private final /* synthetic */ Context a;

    zvu(Context context) {
        this.a = context;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (RecyclerView.e(view) > 0) {
            rect.top = this.a.getResources().getDimensionPixelSize(R.dimen.card_drawer_fs_spacing);
        }
    }
}
