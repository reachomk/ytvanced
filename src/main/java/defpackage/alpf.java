package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: alpf */
public final class alpf extends apk {
    private final Drawable a;

    public alpf(Drawable drawable) {
        this.a = (Drawable) amqw.a((Object) drawable);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (alpf.a(view)) {
            rect.bottom = this.a.getIntrinsicHeight();
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            if (alpf.a(childAt)) {
                this.a.setBounds(0, childAt.getBottom(), recyclerView.getWidth(), childAt.getBottom() + this.a.getIntrinsicHeight());
                this.a.draw(canvas);
            }
        }
    }

    private static boolean a(View view) {
        return view.getTag(R.id.share_panel_item_divider_required) != null;
    }

    public static void a(View view, boolean z) {
        amqw.a((Object) view);
        view.setTag(R.id.share_panel_item_divider_required, z ? Boolean.TRUE : null);
    }
}
