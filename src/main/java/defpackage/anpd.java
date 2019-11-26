package defpackage;

import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;

/* renamed from: anpd */
public final class anpd {
    public final Map a = new zj();

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized ryi a(String str, String str2, anpf anpf) {
        Pair pair = new Pair(str, str2);
        ryi ryi = (ryi) this.a.get(pair);
        if (ryi != null) {
            return ryi;
        }
        FirebaseInstanceId firebaseInstanceId = ((anqb) anpf).a;
        ryi = firebaseInstanceId.e.a(((anqb) anpf).b, ((anqb) anpf).c, ((anqb) anpf).d).b(anpv.a, new anpg(this, pair));
        this.a.put(pair, ryi);
        return ryi;
    }
}
