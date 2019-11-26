package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.view.View;

/* renamed from: adx */
final class adx implements adh {
    private final /* synthetic */ View a;
    private final /* synthetic */ View b;

    adx(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        AlertController.a((View) nestedScrollView, this.a, this.b);
    }
}
