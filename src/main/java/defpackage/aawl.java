package defpackage;

import com.google.protos.youtube.api.innertube.AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aawl */
public final class aawl implements aaap {
    private final Executor a;
    private final aawm b;

    public aawl(Executor executor, aawm aawm) {
        this.a = executor;
        this.b = aawm;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand = (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand) obj;
            aawm aawm = this.b;
            aaml aawn = new aawn(aawm.c, aawm.d.c());
            obj = acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.b;
            if (obj == null) {
                obj = apqa.a;
            }
            aawn.a = (apqa) amqw.a(obj);
            aawn.a(apxu.b.d());
            aawm aawm2 = this.b;
            xan.a(aawm2.a.a(aawn, this.a), aniv.a, aawk.a);
            return;
        }
        throw new aabf("Could not find AcknowledgeChannelTouStrikeCommand");
    }

    static final /* synthetic */ void a(Throwable th) {
        xtl.a(aawl.class.getSimpleName(), th);
        afpc.a(2, afpf.innertube, "Error acknowledging channel TOU strike", th);
    }
}
