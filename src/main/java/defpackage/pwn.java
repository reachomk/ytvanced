package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: pwn */
public final class pwn extends qsv implements pte, pth {
    private static psq h = rxx.a;
    public final Context a;
    public final Handler b;
    public final psq c;
    public final Set d;
    public final pyp e;
    public rxy f;
    public pwo g;

    public pwn(Context context, Handler handler, pyp pyp) {
        psq psq = h;
        this.a = context;
        this.b = handler;
        this.e = (pyp) pzr.a((Object) pyp, (Object) "ClientSettings must not be null");
        this.d = pyp.b;
        this.c = psq;
    }

    public final void a(Bundle bundle) {
        this.f.a(this);
    }

    public final void a(int i) {
        this.f.e();
    }

    public final void a(psa psa) {
        this.g.b(psa);
    }

    public final void a(qtd qtd) {
        this.b.post(new pwp(this, qtd));
    }
}
