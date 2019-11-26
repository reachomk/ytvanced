package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: qf */
public final class qf {
    private final int a;
    private final CharSequence b;
    private final PendingIntent c;
    private boolean d = true;
    private final Bundle e;
    private boolean f = true;

    public qf(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.a = i;
        this.b = qg.f(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.d = true;
        this.f = true;
    }

    public final qc a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        qt[] qtVarArr = null;
        qt[] qtVarArr2 = !arrayList.isEmpty() ? (qt[]) arrayList.toArray(new qt[arrayList.size()]) : null;
        if (!arrayList2.isEmpty()) {
            qtVarArr = (qt[]) arrayList2.toArray(new qt[arrayList2.size()]);
        }
        return new qc(this.a, this.b, this.c, this.e, qtVarArr, qtVarArr2, this.d, this.f);
    }
}
