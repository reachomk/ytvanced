package defpackage;

import java.net.URI;

/* renamed from: bbbl */
public final class bbbl extends bavh {
    public final String a() {
        return "dns";
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return 5;
    }

    public final /* synthetic */ bava a(URI uri, bauz bauz) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        Object obj = (String) amqw.a(uri.getPath(), (Object) "targetPath");
        amqw.a(obj.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", obj, (Object) uri);
        String substring = obj.substring(1);
        uri.getAuthority();
        return new bbbe(substring, bauz, bbby.l, amrj.a(), bavw.a(getClass().getClassLoader()));
    }
}
