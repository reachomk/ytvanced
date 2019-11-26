package defpackage;

import com.google.protos.youtube.api.innertube.LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
import java.util.Set;

/* renamed from: abbj */
public final class abbj extends aanf implements aana {
    public final abbz a;
    public final aang b;
    public final aang g;
    public final aang h;
    public final aang i;
    public final aanl j;
    public final bcaa k;
    public final bcaa l;
    private final Set m;

    public abbj(aamn aamn, aamf aamf, aamd aamd, afpu afpu, xhf xhf, Set set) {
        super(aamd, afpu, xhf);
        this.m = set;
        this.a = new abbz(aamn, xhf);
        this.b = a(athq.d, aamf, abbi.a, abbl.a);
        this.g = a(asvd.d, aamf, abbr.a, abbq.a);
        this.h = a(asvj.d, aamf, abbt.a, abbs.a);
        this.i = a(asvz.d, aamf, abbv.a, abbu.a);
        this.j = a(ajvd.class, aamn, abbx.a);
        this.k = new abbw(this, aamf);
        this.l = new abbk(this, aamf);
    }

    public final abbd a() {
        return new abbd(this.c, this.d.c(), this.m);
    }

    public final abaz a(apxu apxu) {
        Object obj;
        abaz abaz = new abaz(this.c, this.d.c());
        anxr access$000 = anxl.checkIsLite(LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.liveChatItemContextMenuEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        abaz.a = ((LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint) obj).b;
        if ((apxu.a & 1) != 0) {
            abaz.a(apxu.b);
        } else {
            abaz.g();
        }
        return abaz;
    }

    public final abcc b(apxu apxu) {
        Object obj;
        abcc abcc = new abcc(this.c, this.d.c());
        anxr access$000 = anxl.checkIsLite(ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.moderateLiveChatEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        abcc.a = ((ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint) obj).b;
        if ((apxu.a & 1) != 0) {
            abcc.a(apxu.b);
        } else {
            abcc.g();
        }
        return abcc;
    }

    public final abcd c(apxu apxu) {
        Object obj;
        abcd abcd = new abcd(this.c, this.d.c());
        anxr access$000 = anxl.checkIsLite(ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.manageLiveChatUserEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        abcd.a = ((ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint) obj).b;
        abcd.a(apxu.b);
        return abcd;
    }

    public final abay d(apxu apxu) {
        Object obj;
        abay abay = new abay(this.c, this.d.c());
        anxr access$000 = anxl.checkIsLite(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        abay.a = ((LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint) obj).b;
        if ((apxu.a & 1) != 0) {
            abay.a(apxu.b);
        } else {
            abay.g();
        }
        return abay;
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.a.a((abbd) aaml, aand, afsw);
    }
}
