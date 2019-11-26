package defpackage;

import android.util.Log;

/* renamed from: uw */
final class uw implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ yf c;
    private final /* synthetic */ ut d;

    uw(ut utVar, vd vdVar, String str, yf yfVar) {
        this.d = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = yfVar;
    }

    public final void run() {
        ub ubVar = (ub) this.d.a.d.get(this.a.a());
        if (ubVar == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getMediaItem for callback that isn't registered id=");
            stringBuilder.append(this.b);
            Log.w("MBServiceCompat", stringBuilder.toString());
            return;
        }
        tv tvVar = this.d.a;
        String str = this.b;
        tx txVar = new tx(str, this.c);
        tvVar.e = ubVar;
        tv.c(txVar);
        tvVar.e = null;
        if (!txVar.a()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onLoadItem must call detach() or sendResult() before returning for id=");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }
}
