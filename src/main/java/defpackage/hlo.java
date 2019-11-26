package defpackage;

import android.content.res.Resources;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hlo */
public final class hlo {
    public final OfflineArrowView a;
    private final Resources b;

    hlo(OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        this.a = offlineArrowView;
        this.b = offlineArrowView.getResources();
        offlineArrowView.setOnClickListener(onClickListener);
    }

    public final void a() {
        this.a.setVisibility(8);
    }

    public final void b() {
        c();
        this.a.b();
        this.a.e();
    }

    public final void a(int i) {
        c();
        this.a.d();
        this.a.e();
        b(i);
    }

    public final void b(int i) {
        this.a.setContentDescription(this.b.getString(i));
    }

    public final void c() {
        this.a.setVisibility(0);
        this.a.setEnabled(true);
    }
}
