package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ycd */
public final class ycd extends alir implements alfl {
    public alfi Z;
    public acvx aa;
    public aaas ab;
    public alpa ac;
    public aarh ad;
    private apxu af;
    private ImageView ag;
    private ImageView ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return R.layout.share_group_dialog;
    }

    public final void a(Activity activity) {
        super.a(activity);
        ((yck) ((xfc) activity).n()).a(this);
        this.Z.a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af = aaax.b(this.j.getByteArray("navigation_endpoint"));
        View a = super.a(layoutInflater, viewGroup, bundle);
        this.ag = (ImageView) a.findViewById(R.id.close_button);
        this.ah = (ImageView) a.findViewById(R.id.icon);
        this.ai = (TextView) a.findViewById(R.id.title);
        this.aj = (TextView) a.findViewById(R.id.body);
        this.ak = (TextView) a.findViewById(R.id.share_button);
        this.ag.setOnClickListener(new ycg(this));
        this.ak.setOnClickListener(new ycf(this));
        a.findViewById(R.id.retry_button).setOnClickListener(new yci(this));
        return a;
    }

    public final void J_() {
        super.J_();
        this.Z.b(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final aleg a(alpo alpo, alel alel) {
        return new xzj(alpo, alel, this.aa, this.ab);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    public final void a(defpackage.alei r7) {
        /*
        r6 = this;
        r0 = r6.af;
        r1 = 0;
        if (r0 == 0) goto L_0x006e;
    L_0x0005:
        r2 = com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand.shareGroupCommand;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x006e;
    L_0x0019:
        r0 = r6.af;
        r2 = com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand.shareGroupCommand;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0031;
    L_0x002e:
        r0 = r2.b;
        goto L_0x0035;
    L_0x0031:
        r0 = r2.a(r0);
    L_0x0035:
        r0 = (com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand) r0;
        r0 = r0.a;
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x006e;
    L_0x003d:
        r0 = r6.af;
        r2 = com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand.shareGroupCommand;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0055;
    L_0x0052:
        r0 = r2.b;
        goto L_0x0059;
    L_0x0055:
        r0 = r2.a(r0);
    L_0x0059:
        r0 = (com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand) r0;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0061;
    L_0x005f:
        r0 = defpackage.axak.a;
    L_0x0061:
        r0 = defpackage.ajzv.a(r0);
        r2 = defpackage.akak.class;
        r0 = defpackage.ajzv.a(r0, r2);
        r0 = (defpackage.akak) r0;
        goto L_0x006f;
    L_0x006e:
        r0 = r1;
    L_0x006f:
        if (r0 != 0) goto L_0x00eb;
    L_0x0071:
        r0 = r6.af;
        if (r0 == 0) goto L_0x00ea;
    L_0x0075:
        r2 = com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand.shareGroupCommand;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x008b;
    L_0x0088:
        r0 = r2.b;
        goto L_0x008f;
    L_0x008b:
        r0 = r2.a(r0);
    L_0x008f:
        r0 = (com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand) r0;
        r0 = r0.d;
        if (r0 == 0) goto L_0x00ea;
    L_0x0095:
        r0 = r6.ad;
        r2 = r6.af;
        r3 = com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand.shareGroupCommand;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r4 = r3.d;
        r2 = r2.b(r4);
        if (r2 != 0) goto L_0x00af;
    L_0x00ac:
        r2 = r3.b;
        goto L_0x00b3;
    L_0x00af:
        r2 = r3.a(r2);
    L_0x00b3:
        r2 = (com.google.protos.youtube.api.innertube.ShareGroupCommandOuterClass$ShareGroupCommand) r2;
        r2 = r2.c;
        r3 = r6.af;
        r4 = r3.a;
        r4 = r4 & 1;
        if (r4 != 0) goto L_0x00c0;
    L_0x00bf:
        goto L_0x00c6;
    L_0x00c0:
        r1 = r3.b;
        r1 = r1.d();
    L_0x00c6:
        r3 = new ych;
        r3.<init>(r7);
        r7 = new aatv;
        r4 = r0.c;
        r5 = r0.d;
        r5 = r5.c();
        r7.<init>(r4, r5, r2);
        r7.a(r1);
        r1 = defpackage.asrd.d;
        r2 = r0.g;
        r4 = defpackage.aaso.a;
        r5 = defpackage.aasr.a;
        r0 = r0.a(r1, r2, r4, r5);
        r0.a(r7, r3);
    L_0x00ea:
        return;
    L_0x00eb:
        r7.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycd.a(alei):void");
    }

    public final void aa() {
        f();
    }

    private final void a(ImageView imageView, arwf arwf) {
        alpa alpa = this.ac;
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        int a2 = alpa.a(a);
        if (a2 != 0) {
            imageView.setImageResource(a2);
        } else {
            imageView.setImageDrawable(null);
        }
    }
}
