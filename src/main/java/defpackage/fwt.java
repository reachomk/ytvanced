package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* renamed from: fwt */
public final class fwt extends fwz {
    public fwt(Context context, xci xci, aayi aayi, xoi xoi, Executor executor) {
        aayi.getClass();
        fww fww = new fww(aayi);
        aayi.getClass();
        super(context, xci, aayi, xoi, fww, new fwv(aayi), executor);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return R.string.watch_history_resume_confirmation;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.string.watch_history_resume_confirmation_label;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return R.string.watch_history_resume_done;
    }

    /* Access modifiers changed, original: protected|final */
    public final aans a(apxu apxu, Object obj) {
        return new dyf(apxu, obj);
    }
}
