package defpackage;

import java.util.Collection;
import java.util.Locale;

/* renamed from: zdu */
final class zdu implements afsw {
    private final Collection a;
    private final zdw b;
    private final /* synthetic */ zdr c;

    public zdu(zdr zdr, Collection collection, zdw zdw) {
        this.c = zdr;
        this.a = collection;
        this.b = zdw;
    }

    public zdu(zdr zdr) {
        this(zdr, null, null);
    }

    public final void a(bqn bqn) {
        xtl.c(String.format(Locale.US, "GetDataSyncNodesResponse: %s", new Object[]{bqn.getMessage()}));
        zdw zdw = this.b;
        if (zdw != null && this.a != null) {
            zdw.a(new zdt(true));
        }
    }
}
