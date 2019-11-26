package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: rsk */
final class rsk extends rqu {
    private final /* synthetic */ ryl a;

    rsk(ryl ryl) {
        this.a = ryl;
    }

    public final void a(rqq rqq) {
        Status status = rqq.a;
        if (status == null) {
            this.a.b(new psx(new Status(8, "Got null status from location service")));
        } else if (status.f != 0) {
            this.a.b(pzu.a(status));
        } else {
            this.a.a(Boolean.valueOf(true));
        }
    }
}
