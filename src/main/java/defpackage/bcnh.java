package defpackage;

import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: bcnh */
final class bcnh implements Runnable {
    public final /* synthetic */ bcmw a;
    private final /* synthetic */ Map b;

    bcnh(bcmw bcmw, Map map) {
        this.a = bcmw;
        this.b = map;
    }

    public final void run() {
        bcmw bcmw = this.a;
        bcmw.p = URI.create(bcmw.m).resolve((String) ((List) this.b.get("location")).get(0)).toString();
        bcmw = this.a;
        bcmw.f.add(bcmw.p);
        this.a.a(2, 3, new bcnk(this));
    }
}
