package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: koq */
final /* synthetic */ class koq implements Runnable {
    private final View a;
    private final RecyclerView b;

    koq(View view, RecyclerView recyclerView) {
        this.a = view;
        this.b = recyclerView;
    }

    public final void run() {
        View view = this.a;
        RecyclerView recyclerView = this.b;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        recyclerView.offsetDescendantRectToMyCoords(view, rect);
        recyclerView.a(0, rect.top);
    }
}
