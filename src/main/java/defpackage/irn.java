package defpackage;

import com.google.android.youtube.R;

/* renamed from: irn */
final /* synthetic */ class irn implements Runnable {
    private final irk a;

    irn(irk irk) {
        this.a = irk;
    }

    public final void run() {
        xpr.a(this.a.a.a, (int) R.string.delete_search_suggestion_error, 0);
    }
}
