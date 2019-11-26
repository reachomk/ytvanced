package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ndk */
final /* synthetic */ class ndk implements bcvt {
    private final msh a;
    private final ViewGroup b;

    ndk(msh msh, ViewGroup viewGroup) {
        this.a = msh;
        this.b = viewGroup;
    }

    public final Object a(Object obj, Object obj2) {
        return new ndi((Context) obj, this.a, this.b, (mvb) obj2);
    }
}
