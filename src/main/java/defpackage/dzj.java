package defpackage;

import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import java.util.Map;

/* renamed from: dzj */
public final class dzj implements aaap {
    private final fjo a;

    public dzj(fjo fjo) {
        this.a = fjo;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(RefreshCommandOuterClass$RefreshCommand.refreshCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) b;
        if (refreshCommandOuterClass$RefreshCommand != null) {
            int a = awzg.a(refreshCommandOuterClass$RefreshCommand.b);
            if (a == 0) {
                a = 1;
            }
            if (a == 2) {
                this.a.f();
            } else if (a == 3) {
                this.a.g();
            }
        }
    }
}
