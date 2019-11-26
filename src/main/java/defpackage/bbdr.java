package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bbdr */
final class bbdr extends batx {
    public batv a;
    public final /* synthetic */ bbde b;

    public final void a(bass bass) {
        if (bass.a == basp.TRANSIENT_FAILURE || bass.a == basp.IDLE) {
            bbde bbde = this.b;
            bbde.h.b();
            bbde.h();
            bbde.i();
        }
    }

    public final void a(basp basp, baud baud) {
        amqw.a((Object) basp, (Object) "newState");
        amqw.a((Object) baud, (Object) "newPicker");
        this.b.a("updateBalancingState()");
        this.b.h.execute(new bbdw(this, baud, basp));
    }

    public final void a(baue baue, List list) {
        amqw.a(baue instanceof bbeb, (Object) "subchannel must have been returned from createSubchannel");
        this.b.a("updateSubchannelAddresses()");
        bbcm bbcm = ((bbeb) baue).a;
        amqw.a((Object) list, (Object) "newAddressGroups");
        bbcm.a(list, "newAddressGroups contains null entry");
        amqw.a(list.isEmpty() ^ 1, (Object) "newAddressGroups is empty");
        list = Collections.unmodifiableList(new ArrayList(list));
        try {
            bbek bbek;
            synchronized (bbcm.h) {
                SocketAddress b = bbcm.j.b();
                bbcw bbcw = bbcm.j;
                bbcw.a = list;
                bbcw.a();
                if (bbcm.s.a != basp.READY) {
                    if (bbcm.s.a == basp.CONNECTING) {
                    }
                    bbek = null;
                }
                bbcw bbcw2 = bbcm.j;
                for (int i = 0; i < bbcw2.a.size(); i++) {
                    int indexOf = ((batd) bbcw2.a.get(i)).a.indexOf(b);
                    if (indexOf != -1) {
                        bbcw2.b = i;
                        bbcw2.c = indexOf;
                        bbek = null;
                        break;
                    }
                }
                if (bbcm.s.a == basp.READY) {
                    bbek = bbcm.r;
                    bbcm.r = null;
                    bbcm.j.a();
                    bbcm.a(basp.IDLE);
                } else {
                    bbek = bbcm.q;
                    bbcm.q = null;
                    bbcm.j.a();
                    bbcm.c();
                }
            }
            bbcm.i.a();
            if (bbek != null) {
                bbek.a(bavx.j.a("InternalSubchannel closed transport due to address change"));
            }
        } catch (Throwable th) {
            bbcm.i.a();
        }
    }

    public final basa a() {
        return this.b.C;
    }

    /* synthetic */ bbdr(bbde bbde) {
        this.b = bbde;
    }
}
