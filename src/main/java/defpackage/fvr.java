package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: fvr */
public final class fvr extends fwz {
    public fvr(Context context, xci xci, aayi aayi, xoi xoi, Executor executor) {
        aayi.getClass();
        fvu fvu = new fvu(aayi);
        aayi.getClass();
        super(context, xci, aayi, xoi, fvu, new fvt(aayi), executor);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return R.string.watch_history_pause_confirmation;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.string.watch_history_pause_confirmation_label;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return R.string.watch_history_pause_done;
    }

    /* Access modifiers changed, original: protected|final */
    public final aans a(apxu apxu, Object obj) {
        return new dyf(apxu, obj);
    }
}
