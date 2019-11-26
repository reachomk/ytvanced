package defpackage;

import android.net.Uri;

/* renamed from: abhp */
public final class abhp extends aaml {
    private final Uri a;
    private final String b;

    public abhp(aamd aamd, afpt afpt, Uri uri, String str) {
        super("navigation/resolve_url", aamd, afpt);
        g();
        this.a = (Uri) amqw.a((Object) uri);
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.a.toString());
    }

    public final String a() {
        afkr k = k();
        k.a("uri", this.a.toString());
        return k.a();
    }

    public final /* synthetic */ anzd c() {
        asyz asyz = (asyz) asza.f.createBuilder();
        String uri = this.a.toString();
        asyz.copyOnWrite();
        asza asza = (asza) asyz.instance;
        if (uri != null) {
            asza.a |= 2;
            asza.c = uri;
            uri = this.b;
            if (uri != null) {
                asyz.copyOnWrite();
                asza = (asza) asyz.instance;
                asza.a |= 4;
                asza.d = uri;
            }
            return asyz;
        }
        throw new NullPointerException();
    }
}
