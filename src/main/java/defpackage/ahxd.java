package defpackage;

import com.google.protos.youtube.api.innertube.EnterVrModeCommandOuterClass$EnterVrModeCommand;
import java.util.Map;

/* renamed from: ahxd */
public final class ahxd implements aaap {
    private final ahxc a;

    public ahxd(ahxc ahxc) {
        this.a = (ahxc) amqw.a((Object) ahxc);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(EnterVrModeCommandOuterClass$EnterVrModeCommand.enterVrModeCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            this.a.c();
            return;
        }
        throw new aabf("Expected a EnterVrModeCommand, but did not find one.");
    }
}
