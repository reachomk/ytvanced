package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: unk */
final class unk implements uka {
    public final /* synthetic */ nlp a;
    public final /* synthetic */ nlp b;
    public final /* synthetic */ Looper c;
    private final Handler d = new unn(this);

    unk(nlp nlp, nlp nlp2, Looper looper) {
        this.a = nlp;
        this.b = nlp2;
        this.c = looper;
    }

    public final void a(ujx ujx) {
        Exception exception = ujx.a;
        if (exception != null) {
            String valueOf = String.valueOf(exception);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
            stringBuilder.append("Audioswap mixing ended with error: ");
            stringBuilder.append(valueOf);
            ujo.a(stringBuilder.toString());
        }
        this.d.sendEmptyMessage(1);
    }
}
