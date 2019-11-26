package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ydq */
public final class ydq implements akot {
    public apxu a;
    public apxu b;
    public apxu c;
    public aqin d;
    public ydu e;
    private final Context f;
    private final akvp g;
    private final View h;
    private final View i = this.h.findViewById(R.id.contact_menu_target);
    private final TextView j = ((TextView) this.h.findViewById(R.id.contact_display_name));
    private final TextView k = ((TextView) this.h.findViewById(R.id.note));
    private final aloz l;
    private final ImageView m;

    public ydq(Context context, akkq akkq, aaas aaas, alpa alpa, acvx acvx) {
        this.f = context;
        this.g = alpa;
        this.h = View.inflate(context, R.layout.connection_shelf_item, null);
        this.i.setOnClickListener(new ydp(this, aaas));
        this.l = new aloz(akkq, (ImageView) this.h.findViewById(R.id.contact_photo));
        this.m = (ImageView) this.h.findViewById(R.id.invite_button);
        this.m.setOnClickListener(new yds(this, aaas, acvx));
    }

    public final View K_() {
        return this.h;
    }

    public final void a(akpb akpb) {
        this.m.setVisibility(8);
        this.b = null;
        this.c = null;
    }

    public final void a(boolean z) {
        this.m.setEnabled(z);
        this.m.setColorFilter(xwe.a(this.f, !z ? R.attr.ytBrandBackgroundSecondary : R.attr.ytCallToAction, 0));
        this.m.setBackground(xwe.d(this.f, !z ? R.attr.connectionShelfInviteButtonDisabled : R.attr.connectionShelfInviteButtonEnabled));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    public final /* synthetic */ void a_(defpackage.akor r7, java.lang.Object r8) {
        /*
        r6 = this;
        r8 = (defpackage.aqin) r8;
        r0 = r8.f;
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        r0 = defpackage.arml.f;
    L_0x0008:
        r0 = defpackage.ajqy.a(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        r1 = r6.f;
        r1 = r1.getResources();
        r2 = 1;
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x0029;
    L_0x001a:
        r0 = 2131624726; // 0x7f0e0316 float:1.887664E38 double:1.053162547E-314;
        r0 = r1.getDimensionPixelSize(r0);
        r3 = 2131624724; // 0x7f0e0314 float:1.8876636E38 double:1.053162546E-314;
        r1 = r1.getDimensionPixelSize(r3);
        goto L_0x0037;
    L_0x0029:
        r0 = 2131624729; // 0x7f0e0319 float:1.8876646E38 double:1.0531625484E-314;
        r0 = r1.getDimensionPixelSize(r0);
        r3 = 2131624727; // 0x7f0e0317 float:1.8876642E38 double:1.0531625474E-314;
        r1 = r1.getDimensionPixelSize(r3);
    L_0x0037:
        r3 = r6.h;
        r4 = new android.view.ViewGroup$LayoutParams;
        r5 = -1;
        r4.<init>(r0, r5);
        r3.setLayoutParams(r4);
        r0 = r6.i;
        r3 = new android.widget.LinearLayout$LayoutParams;
        r3.<init>(r1, r1);
        r0.setLayoutParams(r3);
        r0 = 0;
        r1 = "ConnectionShelfItemParent";
        r7 = r7.b(r1, r0);
        r7 = (defpackage.ydu) r7;
        r6.e = r7;
        r7 = r6.e;
        r1 = new ydr;
        r1.<init>(r6);
        r7.a(r1);
        r6.d = r8;
        r7 = r6.e;
        r1 = 0;
        if (r7 != 0) goto L_0x006a;
    L_0x0068:
        r7 = 0;
        goto L_0x007b;
    L_0x006a:
        r3 = r8.a;
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x0072;
    L_0x006f:
        r3 = r8.b;
        goto L_0x0073;
    L_0x0072:
        r3 = r0;
    L_0x0073:
        r7 = r7.a(r3);
        if (r7 != 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0068;
    L_0x007a:
        r7 = 1;
    L_0x007b:
        r3 = r6.j;
        r4 = r8.a;
        r4 = r4 & 8;
        if (r4 == 0) goto L_0x008a;
    L_0x0083:
        r4 = r8.e;
        if (r4 != 0) goto L_0x008b;
    L_0x0087:
        r4 = defpackage.arml.f;
        goto L_0x008b;
    L_0x008a:
        r4 = r0;
    L_0x008b:
        r4 = defpackage.ajqy.a(r4);
        r3.setText(r4);
        r3 = r6.l;
        r4 = r8.a;
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x00a1;
    L_0x009a:
        r4 = r8.d;
        if (r4 != 0) goto L_0x00a2;
    L_0x009e:
        r4 = defpackage.aygk.f;
        goto L_0x00a2;
    L_0x00a1:
        r4 = r0;
    L_0x00a2:
        r3.a(r4);
        r3 = r8.a;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x00b2;
    L_0x00ab:
        r3 = r8.h;
        if (r3 != 0) goto L_0x00b3;
    L_0x00af:
        r3 = defpackage.apxu.d;
        goto L_0x00b3;
    L_0x00b2:
        r3 = r0;
    L_0x00b3:
        r6.a = r3;
        r3 = r6.k;
        r4 = r8.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x00c4;
    L_0x00bd:
        r4 = r8.f;
        if (r4 != 0) goto L_0x00c5;
    L_0x00c1:
        r4 = defpackage.arml.f;
        goto L_0x00c5;
    L_0x00c4:
        r4 = r0;
    L_0x00c5:
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r3, r4);
        r3 = r8.i;
        if (r3 != 0) goto L_0x00d2;
    L_0x00d0:
        r3 = defpackage.aphj.d;
    L_0x00d2:
        r3 = r3.a;
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x0138;
    L_0x00d7:
        r8 = r8.i;
        if (r8 != 0) goto L_0x00dd;
    L_0x00db:
        r8 = defpackage.aphj.d;
    L_0x00dd:
        r8 = r8.b;
        if (r8 != 0) goto L_0x00e3;
    L_0x00e1:
        r8 = defpackage.aphg.s;
    L_0x00e3:
        r3 = r8.a;
        r3 = r3 & 2048;
        if (r3 == 0) goto L_0x00f0;
    L_0x00e9:
        r3 = r8.l;
        if (r3 != 0) goto L_0x00f1;
    L_0x00ed:
        r3 = defpackage.apxu.d;
        goto L_0x00f1;
    L_0x00f0:
        r3 = r0;
    L_0x00f1:
        r6.b = r3;
        r3 = r8.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x0100;
    L_0x00f9:
        r3 = r8.m;
        if (r3 != 0) goto L_0x0101;
    L_0x00fd:
        r3 = defpackage.apxu.d;
        goto L_0x0101;
    L_0x0100:
        r3 = r0;
    L_0x0101:
        r6.c = r3;
        r3 = r6.g;
        r4 = r8.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x011c;
    L_0x010b:
        r8 = r8.e;
        if (r8 != 0) goto L_0x0111;
    L_0x010f:
        r8 = defpackage.arwf.c;
    L_0x0111:
        r8 = r8.b;
        r8 = defpackage.arwh.a(r8);
        if (r8 != 0) goto L_0x011e;
    L_0x0119:
        r8 = defpackage.arwh.UNKNOWN;
        goto L_0x011e;
    L_0x011c:
        r8 = defpackage.arwh.UNKNOWN;
    L_0x011e:
        r8 = r3.a(r8);
        if (r8 == 0) goto L_0x012a;
    L_0x0124:
        r0 = r6.m;
        r0.setImageResource(r8);
        goto L_0x012f;
    L_0x012a:
        r8 = r6.m;
        r8.setImageDrawable(r0);
    L_0x012f:
        r8 = r6.m;
        r8.setVisibility(r1);
        r7 = r7 ^ r2;
        r6.a(r7);
    L_0x0138:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydq.a_(akor, java.lang.Object):void");
    }
}
