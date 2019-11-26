package defpackage;

import android.os.RemoteException;
import android.view.View;

/* renamed from: dgt */
public final class dgt extends pdp {
    public dgt(pcl pcl) {
        CharSequence a;
        CharSequence c;
        String str = "";
        CharSequence charSequence = null;
        try {
            a = ((rpc) pcl).a.a();
        } catch (RemoteException e) {
            qml.a(str, e);
            a = null;
        }
        this.a = a.toString();
        rpc rpc = (rpc) pcl;
        this.b = rpc.b;
        try {
            c = ((rpc) pcl).a.c();
        } catch (RemoteException e2) {
            qml.a(str, e2);
            c = null;
        }
        this.c = c.toString();
        rop rop = rpc.c;
        if (rop != null) {
            this.d = rop;
        }
        try {
            c = ((rpc) pcl).a.e();
        } catch (RemoteException e22) {
            qml.a(str, e22);
            c = null;
        }
        this.e = c.toString();
        try {
            charSequence = ((rpc) pcl).a.f();
        } catch (RemoteException e222) {
            qml.a(str, e222);
        }
        this.f = charSequence.toString();
        a();
        b();
        try {
            if (((rpc) pcl).a.g() != null) {
                ((rpc) pcl).d.a(((rpc) pcl).a.g());
            }
        } catch (RemoteException e3) {
            qml.a("Exception occurred while getting video controller", e3);
        }
        this.l = rpc.d;
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
