package defpackage;

import android.widget.EditText;

/* renamed from: abtg */
final class abtg implements Runnable {
    private final /* synthetic */ abta a;

    abtg(abta abta) {
        this.a = abta;
    }

    public final void run() {
        EditText editText = this.a.h;
        if (editText != null) {
            editText.setSelection(editText.length());
        }
    }
}
