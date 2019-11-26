package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lss */
final /* synthetic */ class lss implements OnClickListener {
    private final lsp a;
    private final ltx b;

    lss(lsp lsp, ltx ltx) {
        this.a = lsp;
        this.b = ltx;
    }

    public final void onClick(View view) {
        this.a.a(this.b.a(4) ^ 1, true);
    }
}
