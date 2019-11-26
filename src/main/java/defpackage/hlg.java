package defpackage;

import android.content.res.Resources;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* renamed from: hlg */
public class hlg {
    public final Resources a;
    public final OfflineArrowView b;

    protected hlg(OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        this.b = (OfflineArrowView) amqw.a((Object) offlineArrowView);
        this.b.setOnClickListener(onClickListener);
        this.a = offlineArrowView.getResources();
    }

    public final void a() {
        d();
        OfflineArrowView offlineArrowView = this.b;
        offlineArrowView.a(offlineArrowView.c);
        this.b.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        d();
        this.b.b();
        this.b.e();
    }

    public final void c() {
        d();
        this.b.c();
        OfflineArrowView offlineArrowView = this.b;
        offlineArrowView.a.setVisibility(8);
        offlineArrowView.b.setVisibility(0);
        this.b.setEnabled(false);
        this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_cancel));
    }

    public final void d() {
        this.b.setVisibility(0);
        this.b.setEnabled(true);
    }

    public final void a(boolean z) {
        this.b.setContentDescription(this.a.getString(!z ? R.string.accessibility_offline_button_cannot_save : R.string.accessibility_offline_button_save));
    }
}
