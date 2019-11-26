package defpackage;

import com.google.protos.youtube.api.innertube.ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
import java.util.Map;

/* renamed from: ikh */
public final class ikh implements aaap {
    public final aadw a;

    public ikh(aadw aadw) {
        this.a = aadw;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand) b;
            int i = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.a;
            if ((i & 1) != 0 && (i & 2) != 0) {
                String str = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.b;
                b = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.c;
                this.a.b(str).a(aveh.class).b(new ikk(b)).a(amul.a(b)).a(new ikj(this, str)).c();
            }
        }
    }
}
