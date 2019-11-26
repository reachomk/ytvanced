package defpackage;

import android.net.Uri;

/* renamed from: afni */
public final class afni extends afnp implements afnx {
    private static Long c(xho xho) {
        afnp.b(xho);
        String a = xho.d().a("Content-Length");
        if (a != null) {
            try {
                return Long.valueOf(Long.parseLong(a));
            } catch (NumberFormatException e) {
                throw new xwd(e);
            }
        }
        throw new xwd("Missing content length header");
    }

    public final /* synthetic */ Object b(Object obj) {
        obj = (Uri) obj;
        amqw.a(obj);
        String uri = obj.toString();
        xhg h = xhc.h();
        h.a = "HEAD";
        h.b = uri;
        return h.a();
    }
}
