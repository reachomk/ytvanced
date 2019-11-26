package defpackage;

import android.widget.EditText;

/* renamed from: wjr */
public final /* synthetic */ class wjr implements Runnable {
    private final EditText a;

    public wjr(EditText editText) {
        this.a = editText;
    }

    public final void run() {
        this.a.sendAccessibilityEvent(8);
    }
}
