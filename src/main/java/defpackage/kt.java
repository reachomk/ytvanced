package defpackage;

import android.widget.AutoCompleteTextView.OnDismissListener;

/* renamed from: kt */
final class kt implements OnDismissListener {
    private final /* synthetic */ kk a;

    kt(kk kkVar) {
        this.a = kkVar;
    }

    public final void onDismiss() {
        kk kkVar = this.a;
        kkVar.b = true;
        kkVar.c = System.currentTimeMillis();
        this.a.i.setChecked(false);
    }
}
