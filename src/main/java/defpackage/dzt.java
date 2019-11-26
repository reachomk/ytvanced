package defpackage;

import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import java.util.Map;

/* renamed from: dzt */
public final class dzt implements aaap {
    private final xpa a;

    public dzt(xpa xpa) {
        this.a = xpa;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            this.a.a();
            return;
        }
        throw new aabf("Expected a ShowNoConnectionBarCommand, but did not find one.");
    }
}
