package defpackage;

import android.util.Log;

/* renamed from: pvg */
final class pvg extends pvt {
    private final /* synthetic */ puy b;
    private final /* synthetic */ qtd c;

    pvg(pvr pvr, puy puy, qtd qtd) {
        this.b = puy;
        this.c = qtd;
        super(pvr);
    }

    public final void a() {
        puy puy = this.b;
        qtd qtd = this.c;
        if (puy.b(0)) {
            psa psa = qtd.a;
            if (psa.b()) {
                pzs pzs = qtd.b;
                psa = pzs.a;
                if (psa.b()) {
                    puy.g = true;
                    puy.h = pzs.a();
                    puy.i = pzs.b;
                    puy.j = pzs.c;
                    puy.e();
                    return;
                }
                String valueOf = String.valueOf(psa);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("GoogleApiClientConnecting", stringBuilder.toString(), new Exception());
                puy.b(psa);
            } else if (puy.a(psa)) {
                puy.f();
                puy.e();
            } else {
                puy.b(psa);
            }
        }
    }
}
