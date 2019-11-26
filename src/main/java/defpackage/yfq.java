package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: yfq */
final class yfq implements OnClickListener {
    private final /* synthetic */ yfh a;

    yfq(yfh yfh) {
        this.a = yfh;
    }

    public final void onClick(View view) {
        this.a.a(false);
        this.a.a();
        aqnz aqnz = this.a.j;
        aqnz aqnz2 = null;
        aqny aqny = aqnz != null ? (aqny) ((anxo) aqnz.toBuilder()) : null;
        yfh yfh = this.a;
        yfh.l.a(aqny, yfh.g.matcher(yfh.d.getText()).matches() ^ 1);
        yfh = this.a;
        if (aqny != null) {
            aqnz2 = (aqnz) ((anxl) aqny.build());
        }
        yfh.j = aqnz2;
    }
}
