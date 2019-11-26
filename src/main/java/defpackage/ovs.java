package defpackage;

import android.content.Context;

/* renamed from: ovs */
public final class ovs implements ovh {
    private final Context a;
    private final owt b;
    private final ovh c;

    public ovs(Context context, String str, owt owt) {
        ovu ovu = new ovu(str, owt);
        this.a = context.getApplicationContext();
        this.b = owt;
        this.c = ovu;
    }

    public final /* synthetic */ ovi a() {
        ovp ovp = new ovp(this.a, this.c.a());
        owt owt = this.b;
        if (owt != null) {
            ovp.a(owt);
        }
        return ovp;
    }
}
