package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;

/* renamed from: xzi */
public final class xzi implements afsw, xcp, yaa {
    public final acvx a;
    public final apxu b;
    public final xci c;
    public final xyl d;
    public boolean e;
    public boolean f;
    private final xzh g;
    private final aarh h;
    private ajuz i;

    public xzi(xci xci, xzh xzh, aarh aarh, acvx acvx, apxu apxu, xyl xyl) {
        Object obj;
        this.g = (xzh) amqw.a((Object) xzh);
        this.h = (aarh) amqw.a((Object) aarh);
        this.a = (acvx) amqw.a((Object) acvx);
        this.b = (apxu) amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint);
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        access$000 = anxl.checkIsLite(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint = (ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint) obj;
        amqw.b((conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.a & 2) != 0);
        this.c = (xci) amqw.a((Object) xci);
        this.d = (xyl) amqw.a((Object) xyl);
        this.d.b = this;
        xci.a((Object) this);
        this.e = false;
        this.f = false;
        String str = conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.b;
        if (TextUtils.isEmpty(str)) {
            a(null);
        } else {
            a((ajuz) abmi.a(str, new ajuz()));
        }
    }

    public final void a(bqn bqn) {
        if (!this.f) {
            this.g.a(this.i, 3);
        }
    }

    public final void a(String str) {
        this.g.b(str);
    }

    public final void a() {
        ajuz ajuz = this.i;
        if (ajuz != null) {
            this.g.a(ajuz, 2);
            this.a.a(this.i.b);
            return;
        }
        b();
    }

    private final void b() {
        this.g.a(this.i, 1);
        apxu apxu = this.b;
        anxr access$000 = anxl.checkIsLite(ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint = (ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint) b;
        aarh aarh = this.h;
        aarh.a(ajuz.class, aarh.b, aaru.a).a(new aatr(aarh.c, aarh.d.c(), conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.c, conversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.d), (afsw) this);
    }

    private final void a(ajuz ajuz) {
        this.i = ajuz;
        if (this.e) {
            a();
        }
    }

    private final void c() {
        this.i = null;
        b();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ybf.class, ybi.class};
        } else if (i == 0) {
            c();
            return null;
        } else if (i == 1) {
            c();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
