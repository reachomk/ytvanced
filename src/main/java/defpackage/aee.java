package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: aee */
final class aee implements OnItemClickListener {
    private final /* synthetic */ AlertController a;
    private final /* synthetic */ aeb b;

    aee(aeb aeb, AlertController alertController) {
        this.b = aeb;
        this.a = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.o.onClick(this.a.b, i);
        if (!this.b.s) {
            this.a.b.dismiss();
        }
    }
}
