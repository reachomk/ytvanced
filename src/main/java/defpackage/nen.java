package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.ConditionVariable;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nen */
public final class nen extends nag {
    public final nex a;
    public final Context b;
    public ney c;
    public SurfaceHolder d;
    private final Handler e;

    public nen(nex nex, Context context, Handler handler) {
        this.a = (nex) amqw.a((Object) nex, (Object) "listener cannot be null");
        this.b = (Context) amqw.a((Object) context, (Object) "context cannot be null");
        this.e = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void d() {
        this.a.f();
        ney ney = this.c;
        if (ney != null) {
            ney.a = null;
            ney.b = null;
            this.c = null;
        }
        this.d = null;
    }

    public final void a(ISurfaceHolderService iSurfaceHolderService) {
        this.e.post(new neq(this, iSurfaceHolderService));
    }

    public final void a(boolean z) {
        this.e.post(new nep(this, z));
    }

    public final Rect b() {
        AtomicReference atomicReference = new AtomicReference();
        ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post(new nes(this, atomicReference, conditionVariable));
        conditionVariable.block();
        return (Rect) atomicReference.get();
    }

    public final boolean a() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post(new ner(this, atomicBoolean, conditionVariable));
        conditionVariable.block();
        return atomicBoolean.get();
    }

    public final void a(int i, int i2) {
        this.e.post(new neu(this, i, i2));
    }

    public final void a(int i) {
        this.e.post(new net(this, i));
    }

    public final void c() {
        this.e.post(new new(this));
    }

    public final void b(int i) {
        this.e.post(new nev(this, i));
    }
}
