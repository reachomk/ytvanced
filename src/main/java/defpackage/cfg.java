package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cfg */
public final class cfg extends nf {
    private final Set Z = new HashSet();
    public final cel a;
    private cfg aa;
    public final cfe b = new cff(this);
    public brl c;

    public cfg() {
        cel cel = new cel();
        this.a = cel;
    }

    private final void f() {
        cfg cfg = this.aa;
        if (cfg != null) {
            cfg.Z.remove(this);
            this.aa = null;
        }
    }

    public final void a(Context context) {
        super.a(context);
        try {
            Activity p = p();
            f();
            this.aa = bqy.a((Context) p).e.a(p.f(), cez.a(p));
            if (!equals(this.aa)) {
                this.aa.Z.add(this);
            }
        } catch (IllegalStateException e) {
            String str = "SupportRMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public final void J_() {
        super.J_();
        f();
    }

    public final void W_() {
        super.W_();
        this.a.a();
    }

    public final void N_() {
        super.N_();
        this.a.b();
    }

    public final void X_() {
        super.X_();
        this.a.c();
        f();
    }

    public final String toString() {
        String nfVar = super.toString();
        Object obj = this.y;
        if (obj == null) {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(nfVar).length() + 9) + valueOf.length());
        stringBuilder.append(nfVar);
        stringBuilder.append("{parent=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
