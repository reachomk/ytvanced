package defpackage;

import com.google.protos.youtube.api.innertube.RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand;
import java.util.Map;

/* renamed from: zti */
public final class zti implements aaap {
    public final aaas a;
    private final zts b;

    public zti(aaas aaas, zts zts) {
        this.a = aaas;
        this.b = zts;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.refreshAccountLinkButtonCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.refreshAccountLinkButtonCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand = (RefreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand) b;
            zts zts = this.b;
            String str = refreshAccountLinkButtonCommandOuterClass$RefreshAccountLinkButtonCommand.b;
            zts.a.a(new ztw(zts.c, zts.d.c(), zts.d.h(), zts.d.g(), str), new ztl(this, map));
        }
    }
}
