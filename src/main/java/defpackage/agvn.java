package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agvn */
public final class agvn extends aaml {
    public final List a = new ArrayList();
    public long b;

    public agvn(aamd aamd, afpt afpt) {
        super("offline/offline_video_playback_position_sync", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.b >= 0);
    }

    public final /* synthetic */ anzd c() {
        avrk avrk = (avrk) avrl.e.createBuilder();
        List list = this.a;
        avrk.copyOnWrite();
        avrl avrl = (avrl) avrk.instance;
        if (!avrl.c.a()) {
            avrl.c = anxl.mutableCopy(avrl.c);
        }
        anvf.addAll(list, avrl.c);
        long j = this.b;
        avrk.copyOnWrite();
        avrl avrl2 = (avrl) avrk.instance;
        avrl2.a |= 2;
        avrl2.d = j;
        return avrk;
    }
}
