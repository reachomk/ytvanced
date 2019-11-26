package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: abso */
public final class abso extends absc implements abyb {
    public akvz b;
    private View c;

    public final void W() {
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((absr) xse.a(this.a)).a(this);
        this.b.a(auck.class);
        this.b.a(aufl.class);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj = ((abrc) this.j.getParcelable("picker_panel")).a;
        if (obj != null) {
            akot a = akoz.a((akpb) this.b.get(), obj, viewGroup);
            if (a != null) {
                akor akor = new akor();
                akor.a("listenerKey", (Object) this);
                a.a_(akor, obj);
                this.c = a.K_();
            }
        }
        return this.c;
    }

    public final void X() {
        f();
    }

    public final void Y() {
        Activity activity = this.a;
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    public final void Z() {
        nf nfVar = this.y;
        if (nfVar != null) {
            nt s = nfVar.s();
            if (s.e() > 0) {
                s.c();
            } else {
                f();
            }
        }
    }
}
