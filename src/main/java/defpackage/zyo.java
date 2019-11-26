package defpackage;

import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import java.util.Map;

/* renamed from: zyo */
public final class zyo implements aaap {
    private final aaas a;

    public zyo(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        for (apxu a : ((CommandExecutorCommandOuterClass$CommandExecutorCommand) r3).a) {
            this.a.a(a, map);
        }
    }
}
