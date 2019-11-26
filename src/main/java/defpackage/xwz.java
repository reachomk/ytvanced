package defpackage;

import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand;
import com.google.protos.youtube.api.innertube.ConversationNewGroupRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreateGroupCommandOuterClass$CreateGroupCommand;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xwz */
public final class xwz implements afsw {
    public final xzc a;
    private final xxb b;
    private final apxu c;
    private final acvx d;
    private final aaas e;
    private final xhv f;
    private aphg g;
    private boolean h;

    public xwz(acvx acvx, aaas aaas, xhv xhv, xzc xzc, xxb xxb, apxu apxu) {
        this.d = acvx;
        this.e = aaas;
        this.f = xhv;
        this.a = xzc;
        this.b = (xxb) amqw.a((Object) xxb);
        this.c = (apxu) amqw.a((Object) apxu);
    }

    public final void a(int i) {
        this.b.d(i);
    }

    public final void a() {
        this.a.a(this);
        this.d.a(acwl.aq, this.c, null);
        apxu apxu = this.c;
        anxr access$000 = anxl.checkIsLite(ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand.conversationNewGroupCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand conversationNewGroupCommandOuterClass$ConversationNewGroupCommand = (ConversationNewGroupCommandOuterClass$ConversationNewGroupCommand) b;
        anxp anxp = conversationNewGroupCommandOuterClass$ConversationNewGroupCommand.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(ConversationNewGroupRendererOuterClass.conversationNewGroupRenderer);
        anxp.a(access$0002);
        amqw.b(anxp.h.a(access$0002.d));
        anxp anxp2 = conversationNewGroupCommandOuterClass$ConversationNewGroupCommand.b;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        access$000 = anxl.checkIsLite(ConversationNewGroupRendererOuterClass.conversationNewGroupRenderer);
        anxp2.a(access$000);
        b = anxp2.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aqmi aqmi = (aqmi) b;
        this.d.a(aqmi.h.d());
        xxb xxb = this.b;
        arml arml = aqmi.b;
        if (arml == null) {
            arml = arml.f;
        }
        xxb.a(ajqy.a(arml));
        xxb = this.b;
        arml = aqmi.c;
        if (arml == null) {
            arml = arml.f;
        }
        xxb.b(ajqy.a(arml));
        xxb = this.b;
        aygk aygk = aqmi.e;
        if (aygk == null) {
            aygk = aygk.f;
        }
        xxb.a(aygk);
        xxb = this.b;
        arml = aqmi.f;
        if (arml == null) {
            arml = arml.f;
        }
        xxb.c(ajqy.a(arml));
        xxb = this.b;
        arml = aqmi.d;
        if (arml == null) {
            arml = arml.f;
        }
        xxb.d(ajqy.a(arml));
        this.b.a(new xxc(this));
        c();
        anxp = aqmi.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d)) {
            anxp = aqmi.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            Object b2 = anxp.h.b(access$0002.d);
            if (b2 == null) {
                b2 = access$0002.b;
            } else {
                b2 = access$0002.a(b2);
            }
            this.g = (aphg) b2;
            xxb = this.b;
            arml = this.g.g;
            if (arml == null) {
                arml = arml.f;
            }
            xxb.e(ajqy.a(arml));
        }
        this.d.a(aqmi.h.d(), null);
    }

    public final void b() {
        if (!this.h) {
            aphg aphg = this.g;
            if ((aphg.a & 262144) != 0) {
                this.d.a(3, new acvs(aphg.r), null);
            }
            aphg = this.g;
            if (aphg != null && (aphg.a & 8192) != 0) {
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                hashMap.put("create_group_name", this.b.f().toString());
                this.h = true;
                aaas aaas = this.e;
                apxu apxu = this.g.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }

    public final void a(bqn bqn) {
        this.h = false;
        anxp anxp = this.g.n;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(CreateGroupCommandOuterClass$CreateGroupCommand.createGroupCommand);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.g.n;
            if (anxp == null) {
                anxp = apxu.d;
            }
            access$000 = anxl.checkIsLite(CreateGroupCommandOuterClass$CreateGroupCommand.createGroupCommand);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            this.e.a(((CreateGroupCommandOuterClass$CreateGroupCommand) b).a, null);
        }
    }

    public final void c() {
        this.b.a(this.f.c() ^ 1);
    }
}
