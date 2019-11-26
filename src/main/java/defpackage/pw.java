package defpackage;

import android.os.Bundle;
import android.os.Looper;

/* renamed from: pw */
public final class pw extends ap implements rg {
    public final int h = 54321;
    public final Bundle i = null;
    public final rh j;
    public pz k;
    private af l;

    pw(rh rhVar) {
        this.j = rhVar;
        rhVar = this.j;
        if (rhVar.d == null) {
            rhVar.d = this;
            rhVar.c = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        rh rhVar = this.j;
        rhVar.f = true;
        rhVar.h = false;
        rhVar.g = false;
        rhVar.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        rh rhVar = this.j;
        rhVar.f = false;
        rhVar.f();
    }

    /* Access modifiers changed, original: final */
    public final rh a(af afVar, pu puVar) {
        pz pzVar = new pz(puVar);
        a(afVar, pzVar);
        ar arVar = this.k;
        if (arVar != null) {
            a(arVar);
        }
        this.l = afVar;
        this.k = pzVar;
        return this.j;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        af afVar = this.l;
        pz pzVar = this.k;
        if (afVar != null && pzVar != null) {
            super.a((ar) pzVar);
            a(afVar, pzVar);
        }
    }

    public final void a(ar arVar) {
        super.a(arVar);
        this.l = null;
        this.k = null;
    }

    /* Access modifiers changed, original: final */
    public final rh e() {
        this.j.b();
        this.j.g = true;
        ar arVar = this.k;
        if (arVar != null) {
            a(arVar);
            if (arVar.b) {
                arVar.a.a();
            }
        }
        rh rhVar = this.j;
        Object obj = rhVar.d;
        if (obj == null) {
            throw new IllegalStateException("No listener register");
        } else if (obj == this) {
            rhVar.d = null;
            rhVar.h = true;
            rhVar.f = false;
            rhVar.g = false;
            rhVar.i = false;
            rhVar.j = false;
            return null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(obj);
        } else {
            b(obj);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.h);
        stringBuilder.append(" : ");
        Class cls = this.j.getClass();
        stringBuilder.append(cls.getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(cls)));
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
