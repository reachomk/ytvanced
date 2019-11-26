package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wsn */
final /* synthetic */ class wsn implements OnClickListener {
    private final wsk a;
    private final nn b;
    private final aaas c;

    wsn(wsk wsk, nn nnVar, aaas aaas) {
        this.a = wsk;
        this.b = nnVar;
        this.c = aaas;
    }

    public final void onClick(View view) {
        wsk wsk = this.a;
        nn nnVar = this.b;
        aaas aaas = this.c;
        auvn auvn = wsk.b;
        if (auvn != null) {
            akyt.a(nnVar, auvn, aaas, null);
        }
    }
}
