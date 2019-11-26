package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatAction.ForceLiveChatContinuationCommand;
import java.util.Map;

/* renamed from: abpl */
public final class abpl implements aaap {
    private final bcaa a;

    public abpl(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ForceLiveChatContinuationCommand.forceLiveChatContinuationCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ForceLiveChatContinuationCommand.forceLiveChatContinuationCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            abpo abpo = (abpo) this.a.get();
            boolean z = ((ForceLiveChatContinuationCommand) b).b;
            if (!abpo.k) {
                return;
            }
            if (z) {
                abpo.j.b();
            } else {
                abpo.j.s();
            }
        }
    }
}
