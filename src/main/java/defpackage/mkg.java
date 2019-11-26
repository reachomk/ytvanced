package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.concurrent.TimeUnit;

/* renamed from: mkg */
final /* synthetic */ class mkg implements OnClickListener {
    private final mke a;
    private final euc b;
    private final aaas c;
    private final long d;

    mkg(mke mke, euc euc, aaas aaas, long j) {
        this.a = mke;
        this.b = euc;
        this.c = aaas;
        this.d = j;
    }

    public final void onClick(View view) {
        mke mke = this.a;
        euc euc = this.b;
        aaas aaas = this.c;
        long j = this.d;
        aaas.a(airn.a(euc.a(), euc.b(), euc.c(), (float) TimeUnit.MILLISECONDS.toSeconds(euc.d())), null);
        mke.a(j, euc.a(), true);
    }
}
