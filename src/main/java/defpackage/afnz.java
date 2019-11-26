package defpackage;

import android.net.Uri;

/* renamed from: afnz */
public final class afnz implements afnx {
    private final String a;

    public afnz(String str) {
        this.a = (String) amqw.a((Object) str);
    }

    public final /* synthetic */ Object b(Object obj) {
        obj = (Uri) obj;
        amqw.a(obj);
        xhg h = xhc.h();
        h.a = this.a;
        h.b = obj.toString();
        return h.a();
    }

    static {
        afnz afnz = new afnz("GET");
    }
}
