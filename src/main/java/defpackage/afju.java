package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: afju */
public abstract class afju extends afjz {
    public Surface a;
    public aewz b;
    public ofb c;

    public afju(Context context) {
        super(context);
    }

    public void a(boolean z) {
    }

    public void d() {
    }

    public SurfaceHolder l() {
        return null;
    }

    public Surface k() {
        return this.a;
    }

    public final aewz g() {
        return this.b;
    }

    public final ofb h() {
        return this.c;
    }

    public final boolean n() {
        return (this.a == null && this.b == null && this.c == null) ? false : true;
    }
}
