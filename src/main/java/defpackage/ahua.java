package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;

/* renamed from: ahua */
public final class ahua {
    public final ahtv a;
    public final ahpn b;
    public final ViewGroup c;
    public final Context d;
    public final ahry e;
    public final ahrt f;
    public final Resources g;

    ahua(ViewGroup viewGroup, Context context, ahry ahry, ahrt ahrt) {
        this.c = (ViewGroup) amqw.a((Object) viewGroup);
        this.e = (ahry) amqw.a((Object) ahry);
        this.d = (Context) amqw.a((Object) context);
        this.g = (Resources) amqw.a(context.getResources());
        this.f = (ahrt) amqw.a((Object) ahrt);
        this.b = (ahpn) ((ahpn) amqw.a(ahrt.d())).clone();
        this.a = new ahtv(ahry, ahrt);
    }
}
