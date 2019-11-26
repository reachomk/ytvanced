package defpackage;

import com.google.protos.youtube.api.innertube.ProfileCardCommandOuterClass$ProfileCardCommand;
import java.util.Map;

/* renamed from: dqm */
public final class dqm implements aaap {
    private final drp a;

    public dqm(drp drp) {
        this.a = drp;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(ProfileCardCommandOuterClass$ProfileCardCommand.profileCardCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = (ProfileCardCommandOuterClass$ProfileCardCommand) obj;
        if (profileCardCommandOuterClass$ProfileCardCommand.b.isEmpty()) {
            xtl.c("Profile card command resolver get empty requet");
        } else {
            this.a.a(profileCardCommandOuterClass$ProfileCardCommand.b, profileCardCommandOuterClass$ProfileCardCommand.c, apxu);
        }
    }
}
