package defpackage;

import android.os.ConditionVariable;

/* renamed from: adrv */
final /* synthetic */ class adrv implements Runnable {
    private final adrw a;
    private final boolean b;
    private final boolean c;
    private final ConditionVariable d;

    adrv(adrw adrw, boolean z, boolean z2, ConditionVariable conditionVariable) {
        this.a = adrw;
        this.b = z;
        this.c = z2;
        this.d = conditionVariable;
    }

    public final void run() {
        adrw adrw = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        ConditionVariable conditionVariable = this.d;
        adrw.a.y.a(z, z2);
        conditionVariable.open();
    }
}
