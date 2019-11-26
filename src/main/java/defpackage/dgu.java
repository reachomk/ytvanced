package defpackage;

import android.os.RemoteException;
import android.view.View;

/* renamed from: dgu */
public final class dgu extends pdm {
    public dgu(pcj pcj) {
        CharSequence a;
        CharSequence c;
        String str = "";
        CharSequence charSequence = null;
        try {
            a = ((rox) pcj).a.a();
        } catch (RemoteException e) {
            qml.a(str, e);
            a = null;
        }
        this.a = a.toString();
        rox rox = (rox) pcj;
        this.b = rox.b;
        try {
            c = ((rox) pcj).a.c();
        } catch (RemoteException e2) {
            qml.a(str, e2);
            c = null;
        }
        this.c = c.toString();
        this.d = rox.c;
        try {
            charSequence = ((rox) pcj).a.e();
        } catch (RemoteException e3) {
            qml.a(str, e3);
        }
        this.e = charSequence.toString();
        if (pcj.a() != null) {
            this.f = pcj.a().doubleValue();
        }
        if (pcj.b() != null) {
            this.g = pcj.b().toString();
        }
        if (pcj.c() != null) {
            this.h = pcj.c().toString();
        }
        a();
        b();
        try {
            if (((rox) pcj).a.i() != null) {
                ((rox) pcj).d.a(((rox) pcj).a.i());
            }
        } catch (RemoteException e4) {
            qml.a("Exception occurred while getting video controller", e4);
        }
        this.l = ((rox) pcj).d;
    }

    public final void a(View view) {
        if (view instanceof pch) {
            pch.a();
        }
        if (((pck) pck.a.get(view)) != null) {
            pck.a();
        }
    }
}
