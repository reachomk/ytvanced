package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CancelTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fxu */
public final class fxu implements aaap {
    public final aaas a;
    public final Map b = new HashMap();
    private final Handler c;

    public fxu(Context context, aaas aaas) {
        this.a = aaas;
        this.c = new Handler(context.getMainLooper());
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint);
        apxu.a(access$000);
        Object b;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = (TimeDelayedEndpoint$CreateTimeDelayedEndpoint) b;
            fxt fxt = new fxt(this, timeDelayedEndpoint$CreateTimeDelayedEndpoint, map, timeDelayedEndpoint$CreateTimeDelayedEndpoint.b);
            if ((timeDelayedEndpoint$CreateTimeDelayedEndpoint.a & 1) != 0) {
                this.b.put(timeDelayedEndpoint$CreateTimeDelayedEndpoint.b, fxt);
            }
            this.c.postDelayed(fxt, (long) timeDelayedEndpoint$CreateTimeDelayedEndpoint.c);
            return;
        }
        anxr access$0002 = anxl.checkIsLite(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint);
        apxu.a(access$0002);
        if (apxu.h.a(access$0002.d)) {
            access$0002 = anxl.checkIsLite(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint);
            apxu.a(access$0002);
            b = apxu.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = (TimeDelayedEndpoint$CancelTimeDelayedEndpoint) b;
            if ((timeDelayedEndpoint$CancelTimeDelayedEndpoint.a & 1) != 0) {
                Runnable runnable = (Runnable) this.b.remove(timeDelayedEndpoint$CancelTimeDelayedEndpoint.b);
                if (runnable != null) {
                    this.c.removeCallbacks(runnable);
                }
            }
        }
    }
}
