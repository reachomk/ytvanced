package defpackage;

import com.google.protos.youtube.api.innertube.HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
import java.util.Map;

/* renamed from: zyi */
public final class zyi implements aaap {
    private final xci a;

    public zyi(xci xci) {
        this.a = xci;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.hideItemSectionVideosByIdCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand = (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand) b;
        if ((hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.a & 1) != 0) {
            this.a.d(new zyp(null, (amqv) amqw.a(new zyl(hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand))));
        }
    }
}
