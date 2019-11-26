package defpackage;

import android.os.ConditionVariable;
import android.view.SurfaceHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ner */
final /* synthetic */ class ner implements Runnable {
    private final nen a;
    private final AtomicBoolean b;
    private final ConditionVariable c;

    ner(nen nen, AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
        this.a = nen;
        this.b = atomicBoolean;
        this.c = conditionVariable;
    }

    public final void run() {
        nen nen = this.a;
        AtomicBoolean atomicBoolean = this.b;
        ConditionVariable conditionVariable = this.c;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            atomicBoolean.set(surfaceHolder.isCreating());
        }
        conditionVariable.open();
    }
}
