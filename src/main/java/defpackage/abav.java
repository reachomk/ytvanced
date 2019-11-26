package defpackage;

import com.google.protos.youtube.api.innertube.ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand;
import java.util.Map;

/* renamed from: abav */
public final class abav implements aaap {
    public final abax a;
    private final abbj b;

    public abav(abbj abbj, abax abax) {
        this.b = (abbj) amqw.a((Object) abbj);
        this.a = (abax) amqw.a((Object) abax);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowSuperChatContractCommandOuterClass$ShowSuperChatContractCommand.showSuperChatContractCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            abbj abbj = this.b;
            afsw abau = new abau(this);
            aaml abbc = new abbc(abbj.c, abbj.d.c());
            abbc.g();
            ((aang) abbj.l.get()).a(abbc, abau);
        }
    }
}
