package defpackage;

import android.util.Log;

/* renamed from: pwp */
final class pwp implements Runnable {
    private final /* synthetic */ qtd a;
    private final /* synthetic */ pwn b;

    pwp(pwn pwn, qtd qtd) {
        this.b = pwn;
        this.a = qtd;
    }

    public final void run() {
        pwn pwn = this.b;
        qtd qtd = this.a;
        psa psa = qtd.a;
        if (psa.b()) {
            pzs pzs = qtd.b;
            psa = pzs.a;
            if (psa.b()) {
                pwn.g.a(pzs.a(), pwn.d);
            } else {
                String valueOf = String.valueOf(psa);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 48);
                stringBuilder.append("Sign-in succeeded with resolve account failure: ");
                stringBuilder.append(valueOf);
                Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
                pwn.g.b(psa);
                pwn.f.e();
                return;
            }
        }
        pwn.g.b(psa);
        pwn.f.e();
    }
}
