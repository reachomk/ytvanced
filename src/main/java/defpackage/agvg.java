package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agvg */
public final class agvg extends aaml {
    public final List a = new ArrayList();
    public long b;
    public long c;
    public int d;
    public float e;

    public agvg(aamd aamd, afpt afpt) {
        super("offline/playlist_sync_check", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = false;
        amqw.b(this.a.size() > 0);
        amqw.a(this.b >= 0);
        amqw.a(this.c >= 0);
        amqw.a(this.d >= 0);
        float f = this.e;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        atan atan = (atan) atao.h.createBuilder();
        long j = this.b;
        atan.copyOnWrite();
        atao atao = (atao) atan.instance;
        atao.a |= 2;
        atao.d = j;
        j = this.c;
        atan.copyOnWrite();
        atao = (atao) atan.instance;
        atao.a |= 4;
        atao.e = j;
        int i = this.d;
        atan.copyOnWrite();
        atao atao2 = (atao) atan.instance;
        atao2.a |= 8;
        atao2.f = i;
        float f = this.e;
        atan.copyOnWrite();
        atao2 = (atao) atan.instance;
        atao2.a |= 16;
        atao2.g = f;
        List list = this.a;
        atan.copyOnWrite();
        atao2 = (atao) atan.instance;
        if (!atao2.c.a()) {
            atao2.c = anxl.mutableCopy(atao2.c);
        }
        anvf.addAll(list, atao2.c);
        return atan;
    }
}
