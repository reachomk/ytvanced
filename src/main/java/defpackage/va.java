package defpackage;

import android.os.Bundle;
import android.util.Log;

/* renamed from: va */
final class va implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ yf d;
    private final /* synthetic */ ut e;

    va(ut utVar, vd vdVar, String str, Bundle bundle, yf yfVar) {
        this.e = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = bundle;
        this.d = yfVar;
    }

    public final void run() {
        ub ubVar = (ub) this.e.a.d.get(this.a.a());
        if (ubVar == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sendCustomAction for callback that isn't registered action=");
            stringBuilder.append(this.b);
            stringBuilder.append(", extras=");
            stringBuilder.append(this.c);
            Log.w("MBServiceCompat", stringBuilder.toString());
            return;
        }
        tv tvVar = this.e.a;
        String str = this.b;
        Bundle bundle = this.c;
        tz tzVar = new tz(str, this.d);
        tvVar.e = ubVar;
        StringBuilder stringBuilder2;
        if (tzVar.c || tzVar.d) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            stringBuilder2.append(tzVar.b);
            throw new IllegalStateException(stringBuilder2.toString());
        }
        tzVar.d = true;
        tzVar.a.a(-1, null);
        tvVar.e = null;
        if (!tzVar.a()) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            stringBuilder2.append(str);
            stringBuilder2.append(" extras=");
            stringBuilder2.append(bundle);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }
}
