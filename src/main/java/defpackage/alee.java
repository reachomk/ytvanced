package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: alee */
final class alee extends apk {
    private final int a;

    public alee(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.share_target_container_padding);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        rect.top = this.a;
        if (RecyclerView.e(view) == aqh.b() - 1) {
            rect.bottom = this.a;
        }
    }
}
