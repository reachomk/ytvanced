package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: saj */
final class saj implements ptm {
    private final /* synthetic */ saf a;

    saj(saf saf) {
        this.a = saf;
    }

    public final /* synthetic */ void a(ptn ptn) {
        Status status = (Status) ptn;
        if (!status.b()) {
            saf saf = this.a;
            int i = status.f;
            saf.b();
        }
    }
}
