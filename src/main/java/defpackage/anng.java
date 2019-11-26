package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: anng */
final class anng extends pub {
    private final /* synthetic */ ryl a;
    private final /* synthetic */ annh b;

    anng(annh annh, ryl ryl) {
        this.b = annh;
        this.a = ryl;
    }

    public final void a(Status status) {
        if (this.a.b(null)) {
            if (status.b()) {
                this.b.a.b.a(null);
                return;
            }
            this.b.a.b.a(anms.a(status, "Indexing error, please try again."));
        }
    }
}
