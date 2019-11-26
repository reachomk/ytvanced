package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kgm */
final /* synthetic */ class kgm implements OnClickListener {
    private final kgn a;
    private final aizy b;

    kgm(kgn kgn, aizy aizy) {
        this.a = kgn;
        this.b = aizy;
    }

    public final void onClick(View view) {
        kgn kgn = this.a;
        aizy aizy = this.b;
        boolean isSelected = kgn.a.isSelected() ^ 1;
        if (aizy.C()) {
            aizy.f.a(isSelected);
        }
    }
}
