package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: put */
final class put implements ptj {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ puq b;

    put(puq puq, BasePendingResult basePendingResult) {
        this.b = puq;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
