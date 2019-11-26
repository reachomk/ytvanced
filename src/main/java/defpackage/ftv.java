package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import java.util.concurrent.Executor;

/* renamed from: ftv */
public final class ftv extends fwz {
    private final aaas g;

    public ftv(Context context, xci xci, aayi aayi, xoi xoi, aaas aaas, Executor executor) {
        aayi.getClass();
        fty fty = new fty(aayi);
        aayi.getClass();
        super(context, xci, aayi, xoi, fty, new ftx(aayi), executor);
        this.g = aaas;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return R.string.watch_history_clear_confirmation;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.string.watch_history_clear;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return R.string.watch_history_clear_done;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        this.g.a(((ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint) b).a, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final aans a(apxu apxu, Object obj) {
        return new dyg(apxu, obj);
    }
}
