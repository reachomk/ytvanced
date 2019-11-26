package defpackage;

import com.google.protos.youtube.api.innertube.AdsDebounceCommandOuterClass$AdsDebounceCommand;
import java.util.Map;

/* renamed from: dwg */
public final class dwg implements aaap {
    private final vod a;
    private final aaas b;

    public dwg(vod vod, aaas aaas) {
        this.a = (vod) amqw.a((Object) vod);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(AdsDebounceCommandOuterClass$AdsDebounceCommand.adsDebounceCommand);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = (AdsDebounceCommandOuterClass$AdsDebounceCommand) b;
                if (!this.a.a(xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"))) {
                    aaas aaas = this.b;
                    apxu = adsDebounceCommandOuterClass$AdsDebounceCommand.b;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, map);
                }
            }
        }
    }
}
