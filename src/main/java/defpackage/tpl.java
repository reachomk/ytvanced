package defpackage;

import android.util.Log;

/* renamed from: tpl */
final class tpl implements tex {
    private final /* synthetic */ tpj a;

    tpl(tpj tpj) {
        this.a = tpj;
    }

    public final /* synthetic */ void a(teu teu) {
        tew tew = (tew) teu;
        if (!tew.b()) {
            String valueOf = String.valueOf(tew);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 39);
            stringBuilder.append("herrevad logNetworkQualityData failed: ");
            stringBuilder.append(valueOf);
            Log.e("DefaultHerrevadReporter", stringBuilder.toString());
        }
        this.a.a.c();
    }
}
