package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand;
import java.util.Map;

/* renamed from: fxa */
public final class fxa implements aaap {
    public final void a(apxu apxu, Map map) {
        Object obj = map.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (obj instanceof klf) {
            klf klf = (klf) obj;
            anxr access$000 = anxl.checkIsLite(UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.updateAccountLinkButtonCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand = (UpdateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand) b;
            if ((updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.a & 1) != 0) {
                anxp anxp = updateAccountLinkButtonCommandOuterClass$UpdateAccountLinkButtonCommand.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.toggleButtonRenderer);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphv aphv = (aphv) b;
                anxl anxl = ((axpi) klf.d).f;
                if (anxl == null) {
                    anxl = aphj.d;
                }
                aphm aphm = (aphm) ((anxo) anxl.toBuilder());
                aphm.a(aphv);
                aphj aphj = (aphj) ((anxl) aphm.build());
                axph axph = (axph) ((anxo) ((axpi) klf.d).toBuilder());
                axph.copyOnWrite();
                axpi axpi = (axpi) axph.instance;
                if (aphj != null) {
                    axpi.f = aphj;
                    axpi.a |= 32;
                    klf.d = (anxl) axph.build();
                    klf.a((axpi) klf.d);
                    return;
                }
                throw new NullPointerException();
            }
        }
    }
}
