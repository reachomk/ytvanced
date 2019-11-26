package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import java.util.Collection;

/* renamed from: yuh */
public final class yuh {
    public final aadw a;
    public final aaas b;
    public final ywr c;
    public final xsc d;
    public final yji e;
    private final Context f;

    public yuh(Context context, aadw aadw, aaas aaas, ywr ywr, xsc xsc, yji yji) {
        this.f = (Context) amqw.a((Object) context);
        this.a = (aadw) amqw.a((Object) aadw);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (ywr) amqw.a((Object) ywr);
        this.d = (xsc) amqw.a((Object) xsc);
        this.e = yji;
    }

    public final void a(String str) {
        aonk aonk = (aonk) AddToToastActionOuterClass$AddToToastAction.c.createBuilder();
        aonl aonl = (aonl) aonm.d.createBuilder();
        avlv avlv = (avlv) avls.g.createBuilder();
        avlv.a(ajqy.a(this.f.getString(R.string.copied)));
        aonl.copyOnWrite();
        aonm aonm = (aonm) aonl.instance;
        aonm.b = (avls) ((anxl) avlv.build());
        aonm.a |= 1;
        aonk.copyOnWrite();
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) aonk.instance;
        addToToastActionOuterClass$AddToToastAction.b = (aonm) ((anxl) aonl.build());
        addToToastActionOuterClass$AddToToastAction.a |= 1;
        AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction2 = (AddToToastActionOuterClass$AddToToastAction) ((anxl) aonk.build());
        aqpt aqpt = (aqpt) CopyTextEndpointOuterClass$CopyTextEndpoint.d.createBuilder();
        aqpt.copyOnWrite();
        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) aqpt.instance;
        if (str != null) {
            copyTextEndpointOuterClass$CopyTextEndpoint.a |= 1;
            copyTextEndpointOuterClass$CopyTextEndpoint.b = str;
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(AddToToastActionOuterClass$AddToToastAction.addToToastAction, addToToastActionOuterClass$AddToToastAction2);
            aqpt.copyOnWrite();
            CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint2 = (CopyTextEndpointOuterClass$CopyTextEndpoint) aqpt.instance;
            if (!copyTextEndpointOuterClass$CopyTextEndpoint2.c.a()) {
                copyTextEndpointOuterClass$CopyTextEndpoint2.c = anxl.mutableCopy(copyTextEndpointOuterClass$CopyTextEndpoint2.c);
            }
            copyTextEndpointOuterClass$CopyTextEndpoint2.c.add((apxu) ((anxl) apxx.build()));
            apxx apxx2 = (apxx) apxu.d.createBuilder();
            apxx2.a(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint, (CopyTextEndpointOuterClass$CopyTextEndpoint) ((anxl) aqpt.build()));
            this.b.a((apxu) ((anxl) apxx2.build()), null);
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
    public final void a(java.lang.String r6, defpackage.aqpp r7) {
        /*
        r5 = this;
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x00a8;
    L_0x0006:
        r0 = 0;
        if (r7 == 0) goto L_0x00a3;
    L_0x0009:
        r1 = r7.a;
        r2 = r1 & 2;
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00a3;
    L_0x0011:
        r1 = r1 & 1;
        if (r1 != 0) goto L_0x0017;
    L_0x0015:
        goto L_0x00a3;
    L_0x0017:
        r1 = r7.c;
        if (r1 != 0) goto L_0x001d;
    L_0x001b:
        r1 = defpackage.aqpn.c;
    L_0x001d:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0023;
    L_0x0021:
        r1 = defpackage.aryi.o;
    L_0x0023:
        r2 = r1.f;
        if (r2 != 0) goto L_0x0029;
    L_0x0027:
        r2 = defpackage.aryg.c;
    L_0x0029:
        r2 = r2.a;
        r2 = r2 & 1;
        if (r2 == 0) goto L_0x0048;
    L_0x002f:
        r2 = r1.f;
        if (r2 != 0) goto L_0x0035;
    L_0x0033:
        r2 = defpackage.aryg.c;
    L_0x0035:
        r2 = r2.b;
        if (r2 != 0) goto L_0x003b;
    L_0x0039:
        r2 = defpackage.arye.u;
    L_0x003b:
        r3 = r2.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x0048;
    L_0x0041:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0049;
    L_0x0045:
        r2 = defpackage.arml.f;
        goto L_0x0049;
    L_0x0048:
        r2 = r0;
    L_0x0049:
        r3 = r1.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x0056;
    L_0x004f:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0057;
    L_0x0053:
        r1 = defpackage.aygk.f;
        goto L_0x0057;
    L_0x0056:
        r1 = r0;
    L_0x0057:
        r3 = r7.b;
        if (r3 != 0) goto L_0x005d;
    L_0x005b:
        r3 = defpackage.apxu.d;
    L_0x005d:
        r4 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 == 0) goto L_0x00a0;
    L_0x0070:
        r7 = r7.b;
        if (r7 != 0) goto L_0x0076;
    L_0x0074:
        r7 = defpackage.apxu.d;
    L_0x0076:
        r3 = com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r7.a(r3);
        r7 = r7.h;
        r4 = r3.d;
        r7 = r7.b(r4);
        if (r7 != 0) goto L_0x008c;
    L_0x0089:
        r7 = r3.b;
        goto L_0x0090;
    L_0x008c:
        r7 = r3.a(r7);
    L_0x0090:
        r7 = (com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint) r7;
        r3 = r7.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x00a0;
    L_0x0098:
        r7 = r7.b;
        if (r7 != 0) goto L_0x009e;
    L_0x009c:
        r7 = defpackage.asfa.f;
    L_0x009e:
        r0 = r7.b;
    L_0x00a0:
        r7 = r0;
        r0 = r2;
        goto L_0x00a5;
    L_0x00a3:
        r7 = r0;
        r1 = r7;
    L_0x00a5:
        r5.a(r6, r0, r1, r7);
    L_0x00a8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuh.a(java.lang.String, aqpp):void");
    }

    public final void a(String str, arml arml, aygk aygk, String str2) {
        b(str).a(ykp.class).a(new yun(this, aygk, str2, arml)).c();
    }

    public final void a(String str, Collection collection) {
        asfd asfd = (asfd) asfa.f.createBuilder();
        for (ylf a : collection) {
            a.a(asfd);
        }
        asex asex = (asex) aseu.c.createBuilder();
        asex.a(str);
        aseu aseu = (aseu) ((anxl) asex.build());
        axfm axfm = (axfm) SendShareEndpoint$SendShareToConversationEndpoint.f.createBuilder();
        axfm.a(asfd);
        axfm.copyOnWrite();
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) axfm.instance;
        if (aseu != null) {
            sendShareEndpoint$SendShareToConversationEndpoint.c = aseu;
            sendShareEndpoint$SendShareToConversationEndpoint.a |= 2;
            SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint2 = (SendShareEndpoint$SendShareToConversationEndpoint) ((anxl) axfm.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint, sendShareEndpoint$SendShareToConversationEndpoint2);
            this.b.a((apxu) ((anxl) apxx.build()), null);
            return;
        }
        throw new NullPointerException();
    }

    public final bbme b(String str) {
        xvd.a(str);
        return this.a.b(yic.a("ChatReplyBox", str)).a(ykp.class);
    }
}
