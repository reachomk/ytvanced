package defpackage;

import android.util.Log;

/* renamed from: vb */
final class vb implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ String b;
    private final /* synthetic */ yf c;
    private final /* synthetic */ ut d;

    vb(ut utVar, vd vdVar, String str, yf yfVar) {
        this.d = utVar;
        this.a = vdVar;
        this.b = str;
        this.c = yfVar;
    }

    public final void run() {
        ub ubVar = (ub) this.d.a.d.get(this.a.a());
        if (ubVar == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("search for callback that isn't registered query=");
            stringBuilder.append(this.b);
            Log.w("MBServiceCompat", stringBuilder.toString());
            return;
        }
        tv tvVar = this.d.a;
        String str = this.b;
        tw twVar = new tw(str, this.c);
        tvVar.e = ubVar;
        twVar.e = 4;
        twVar.b(null);
        tvVar.e = null;
        if (!twVar.a()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onSearch must call detach() or sendResult() before returning for query=");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }
}
