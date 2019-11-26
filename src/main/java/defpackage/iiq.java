package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iiq */
public final class iiq implements akot, esu {
    public apxu a = null;
    private final Context b;
    private final acvx c;
    private final akkq d;
    private final View e;
    private final ijg f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final eso k;

    iiq(Context context, ViewGroup viewGroup, acvx acvx, akkq akkq, aaas aaas, est est, eur eur, boolean z) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (acvx) amqw.a((Object) acvx);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = LayoutInflater.from(context).inflate(!z ? R.layout.metadata_highlights_channel_container : R.layout.metadata_highlights_channel_container_performance, viewGroup, false);
        if (z) {
            View findViewById = this.e.findViewById(R.id.channel_container);
            if (findViewById instanceof ijg) {
                this.f = (ijg) findViewById;
            } else {
                this.f = null;
            }
        } else {
            this.f = (ijg) this.e.findViewById(R.id.channel_container);
        }
        this.g = (ImageView) this.e.findViewById(R.id.channel_avatar);
        this.h = (TextView) this.e.findViewById(R.id.channel_title);
        this.i = (TextView) this.e.findViewById(R.id.channel_subscribers);
        this.j = (TextView) this.e.findViewById(R.id.subscribe_button);
        this.k = est.a(this.j, eur.a(this.e.findViewById(R.id.subscription_notification_view)));
        this.k.a(new esr(eso.a, R.attr.ytOverlayTextSecondary, R.attr.ytOverlayTextSecondary, (byte) 0), new esr(eso.b, R.attr.ytOverlayTextPrimary, R.attr.ytOverlayTextPrimary, (byte) 0));
        this.e.setOnClickListener(new iip(this, aaas));
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.k.e.remove(this);
        this.k.a();
    }

    public final void a(boolean z, boolean z2) {
        a(z);
    }

    private final void a(boolean z) {
        if (z) {
            this.j.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background_subscribed);
        } else {
            this.j.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A:{SYNTHETIC, RETURN} */
    public final /* synthetic */ void a_(defpackage.akor r5, java.lang.Object r6) {
        /*
        r4 = this;
        r6 = (defpackage.arns) r6;
        r0 = r4.k;
        r0.a(r4);
        r0 = r4.f;
        r1 = 1;
        if (r0 == 0) goto L_0x0026;
    L_0x000c:
        r0 = "ITEM_COUNT";
        r5 = r5.a(r0);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r5 <= r1) goto L_0x001e;
    L_0x001a:
        r5 = 2132017496; // 0x7f140158 float:1.9673272E38 double:1.053356601E-314;
        goto L_0x0021;
    L_0x001e:
        r5 = 2132017492; // 0x7f140154 float:1.9673264E38 double:1.053356599E-314;
    L_0x0021:
        r0 = r4.f;
        r0.a(r5);
    L_0x0026:
        r5 = r4.c;
        r0 = new acvs;
        r2 = r6.g;
        r0.<init>(r2);
        r2 = 0;
        r5.a(r0, r2);
        r5 = r6.a;
        r5 = r5 & 8;
        if (r5 == 0) goto L_0x0040;
    L_0x0039:
        r5 = r6.e;
        if (r5 != 0) goto L_0x0041;
    L_0x003d:
        r5 = defpackage.apxu.d;
        goto L_0x0041;
    L_0x0040:
        r5 = r2;
    L_0x0041:
        r4.a = r5;
        r5 = r4.h;
        r0 = r6.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0052;
    L_0x004b:
        r0 = r6.c;
        if (r0 != 0) goto L_0x0053;
    L_0x004f:
        r0 = defpackage.arml.f;
        goto L_0x0053;
    L_0x0052:
        r0 = r2;
    L_0x0053:
        r0 = defpackage.ajqy.a(r0);
        r5.setText(r0);
        r5 = r4.i;
        r0 = r6.a;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x0069;
    L_0x0062:
        r0 = r6.d;
        if (r0 != 0) goto L_0x006a;
    L_0x0066:
        r0 = defpackage.arml.f;
        goto L_0x006a;
    L_0x0069:
        r0 = r2;
    L_0x006a:
        r0 = defpackage.ajqy.a(r0);
        defpackage.xpr.a(r5, r0);
        r5 = r6.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x0093;
    L_0x0076:
        r5 = r6.b;
        if (r5 != 0) goto L_0x007c;
    L_0x007a:
        r5 = defpackage.aygk.f;
    L_0x007c:
        r5 = r5.b;
        r5 = r5.size();
        if (r5 > 0) goto L_0x0085;
    L_0x0084:
        goto L_0x0093;
    L_0x0085:
        r5 = r4.d;
        r0 = r4.g;
        r3 = r6.b;
        if (r3 != 0) goto L_0x008f;
    L_0x008d:
        r3 = defpackage.aygk.f;
    L_0x008f:
        r5.a(r0, r3);
        goto L_0x00a2;
    L_0x0093:
        r5 = r4.d;
        r0 = r4.g;
        r5.a(r0);
        r5 = r4.g;
        r0 = 2130838770; // 0x7f0204f2 float:1.7282532E38 double:1.052774233E-314;
        r5.setImageResource(r0);
    L_0x00a2:
        r5 = r4.g;
        r0 = r6.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00ac;
    L_0x00ab:
        r1 = 0;
    L_0x00ac:
        r5.setEnabled(r1);
        r5 = r4.k;
        r0 = r4.c;
        r5.a(r2, r0);
        r5 = r6.f;
        if (r5 != 0) goto L_0x00bc;
    L_0x00ba:
        r5 = defpackage.axak.a;
    L_0x00bc:
        r0 = com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass.subscribeButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r0 = r0.d;
        r5 = r5.a(r0);
        if (r5 != 0) goto L_0x00d0;
    L_0x00cf:
        goto L_0x0127;
    L_0x00d0:
        r5 = r6.f;
        if (r5 != 0) goto L_0x00d6;
    L_0x00d4:
        r5 = defpackage.axak.a;
    L_0x00d6:
        r0 = com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass.subscribeButtonRenderer;
        r0 = defpackage.anxl.checkIsLite(r0);
        r5.a(r0);
        r5 = r5.h;
        r1 = r0.d;
        r5 = r5.b(r1);
        if (r5 != 0) goto L_0x00ec;
    L_0x00e9:
        r5 = r0.b;
        goto L_0x00f0;
    L_0x00ec:
        r5 = r0.a(r5);
    L_0x00f0:
        r5 = (defpackage.axwa) r5;
        r0 = r5.q;
        if (r0 == 0) goto L_0x0127;
    L_0x00f6:
        r5 = r5.toBuilder();
        r5 = (defpackage.anxo) r5;
        r5 = (defpackage.axwd) r5;
        r0 = r4.b;
        r1 = r6.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x010c;
    L_0x0106:
        r2 = r6.c;
        if (r2 != 0) goto L_0x010c;
    L_0x010a:
        r2 = defpackage.arml.f;
    L_0x010c:
        r6 = defpackage.ajqy.a(r2);
        defpackage.evj.b(r0, r5, r6);
        r5 = r5.build();
        r5 = (defpackage.anxl) r5;
        r5 = (defpackage.axwa) r5;
        r6 = r4.k;
        r0 = r4.c;
        r6.a(r5, r0);
        r5 = r5.o;
        r4.a(r5);
    L_0x0127:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iiq.a_(akor, java.lang.Object):void");
    }
}
