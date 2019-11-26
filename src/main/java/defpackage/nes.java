package defpackage;

import android.os.ConditionVariable;
import android.view.SurfaceHolder;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nes */
final /* synthetic */ class nes implements Runnable {
    private final nen a;
    private final AtomicReference b;
    private final ConditionVariable c;

    nes(nen nen, AtomicReference atomicReference, ConditionVariable conditionVariable) {
        this.a = nen;
        this.b = atomicReference;
        this.c = conditionVariable;
    }

    public final void run() {
        nen nen = this.a;
        AtomicReference atomicReference = this.b;
        ConditionVariable conditionVariable = this.c;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            atomicReference.set(surfaceHolder.getSurfaceFrame());
        }
        conditionVariable.open();
    }
}
