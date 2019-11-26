package defpackage;

import android.widget.PopupWindow.OnDismissListener;

/* renamed from: gnt */
final /* synthetic */ class gnt implements OnDismissListener {
    private final gnu a;
    private final got b;

    gnt(gnu gnu, got got) {
        this.a = gnu;
        this.b = got;
    }

    public final void onDismiss() {
        gnu gnu = this.a;
        this.b.a(true);
        gnu.b.b();
    }
}
