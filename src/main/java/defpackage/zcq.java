package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ConversationPendingChatMembersRendererOuterClass;

/* renamed from: zcq */
public final class zcq {
    public final aaas a;
    public final zcp b;
    public final int c;
    public boolean d;
    public boolean e;
    public aqmu f;
    private final akvp g;

    public zcq(zcp zcp, aaas aaas, zay zay, Context context) {
        amqw.a((Object) context);
        this.a = (aaas) amqw.a((Object) aaas);
        this.g = (akvp) amqw.a((Object) zay);
        this.b = (zcp) amqw.a((Object) zcp);
        this.c = xwe.a(context, 16842806, -16777216);
    }

    public final void a(axak axak) {
        aqmu aqmu = null;
        this.f = null;
        if (axak == null) {
            this.b.a(false);
            return;
        }
        anxr access$000 = anxl.checkIsLite(ConversationPendingChatMembersRendererOuterClass.conversationPendingChatMembersRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            anxr access$0002 = anxl.checkIsLite(ConversationPendingChatMembersRendererOuterClass.conversationPendingChatMembersRenderer);
            axak.a(access$0002);
            Object b = axak.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aqmu = (aqmu) b;
        }
        this.f = aqmu;
        a();
    }

    public final void a() {
        if (this.f == null || this.e) {
            this.b.a(false);
            return;
        }
        arml arml;
        this.b.a(true);
        zcp zcp = this.b;
        akvp akvp = this.g;
        arwf arwf = this.f.d;
        if (arwf == null) {
            arwf = arwf.c;
        }
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        zcp.a(akvp.a(a));
        zcp = this.b;
        aqmu aqmu = this.f;
        if ((1 & aqmu.a) != 0) {
            arml = aqmu.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        zcp.a(ajqy.a(arml));
        this.b.b(zcq.a(zcq.a(this.f), this.d));
    }

    public static CharSequence a(aphv aphv, boolean z) {
        arml arml = null;
        if (aphv == null) {
            return null;
        }
        CharSequence a;
        if (z) {
            if ((aphv.a & 4096) != 0) {
                arml = aphv.k;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a = ajqy.a(arml);
        } else {
            if ((aphv.a & 64) != 0) {
                arml = aphv.e;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a = ajqy.a(arml);
        }
        return a;
    }

    public static aphv a(aqmu aqmu) {
        if ((aqmu.a & 2) != 0) {
            aphj aphj = aqmu.c;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 2) != 0) {
                aphj aphj2 = aqmu.c;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphv aphv = aphj2.c;
                if (aphv == null) {
                    aphv = aphv.s;
                }
                return aphv;
            }
        }
        return null;
    }
}
