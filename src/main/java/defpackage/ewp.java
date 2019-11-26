package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: ewp */
public final class ewp extends akpl {
    private final akkq a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.title)));
    private final TextView f = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.subtitle)));
    private final akyy g;
    private final far h;
    private final akoj i;

    public ewp(Activity activity, akkq akkq, aaas aaas, akzb akzb, ViewGroup viewGroup) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (CardView) LayoutInflater.from(activity).inflate(R.layout.movie_card, viewGroup, false);
        this.g = akzb.a((TextView) this.b.findViewById(R.id.offer_button));
        this.c = (ImageView) amqw.a((ImageView) this.b.findViewById(R.id.thumbnail));
        this.d = (TextView) this.b.findViewById(R.id.duration);
        this.i = new akoj(aaas, this.b);
        ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.standalone_ypc_badge);
        this.h = viewStub != null ? new far(viewStub, 1) : null;
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.i.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    public final /* synthetic */ void a(defpackage.akor r6, java.lang.Object r7) {
        /*
        r5 = this;
        r7 = (defpackage.avcx) r7;
        r0 = r5.i;
        r1 = r6.a;
        r2 = r7.a;
        r2 = r2 & 8;
        r3 = 0;
        if (r2 == 0) goto L_0x0014;
    L_0x000d:
        r2 = r7.e;
        if (r2 != 0) goto L_0x0015;
    L_0x0011:
        r2 = defpackage.apxu.d;
        goto L_0x0015;
    L_0x0014:
        r2 = r3;
    L_0x0015:
        r4 = r6.b();
        r0.a(r1, r2, r4);
        r0 = r7.b;
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r0 = defpackage.aygk.f;
    L_0x0022:
        r1 = r5.a;
        r2 = r5.c;
        r1.a(r2, r0);
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0052;
    L_0x002c:
        r1 = r0.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0052;
    L_0x0032:
        r1 = r0.d;
        if (r1 != 0) goto L_0x0038;
    L_0x0036:
        r1 = defpackage.aodx.c;
    L_0x0038:
        r1 = r1.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r1 = r5.c;
        r0 = r0.d;
        if (r0 != 0) goto L_0x0046;
    L_0x0044:
        r0 = defpackage.aodx.c;
    L_0x0046:
        r0 = r0.b;
        if (r0 != 0) goto L_0x004c;
    L_0x004a:
        r0 = defpackage.aodv.c;
    L_0x004c:
        r0 = r0.b;
        r1.setContentDescription(r0);
        goto L_0x0057;
    L_0x0052:
        r0 = r5.c;
        r0.setContentDescription(r3);
    L_0x0057:
        r0 = r7.h;
        if (r0 != 0) goto L_0x005d;
    L_0x005b:
        r0 = defpackage.arml.f;
    L_0x005d:
        r1 = r5.d;
        if (r1 == 0) goto L_0x0071;
    L_0x0061:
        r2 = defpackage.ajqy.a(r0);
        r1.setText(r2);
        r1 = r5.d;
        r0 = defpackage.ajqy.b(r0);
        r1.setContentDescription(r0);
    L_0x0071:
        r0 = r5.e;
        r1 = r7.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0080;
    L_0x0079:
        r1 = r7.c;
        if (r1 != 0) goto L_0x0081;
    L_0x007d:
        r1 = defpackage.arml.f;
        goto L_0x0081;
    L_0x0080:
        r1 = r3;
    L_0x0081:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r5.f;
        r1 = r7.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x0097;
    L_0x0090:
        r1 = r7.d;
        if (r1 != 0) goto L_0x0098;
    L_0x0094:
        r1 = defpackage.arml.f;
        goto L_0x0098;
    L_0x0097:
        r1 = r3;
    L_0x0098:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r7.f;
        if (r0 != 0) goto L_0x00a5;
    L_0x00a3:
        r0 = defpackage.avcv.c;
    L_0x00a5:
        r0 = r0.a;
        r1 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r0 == r1) goto L_0x00ae;
    L_0x00ac:
        r0 = r3;
        goto L_0x00bf;
    L_0x00ae:
        r0 = r7.f;
        if (r0 != 0) goto L_0x00b4;
    L_0x00b2:
        r0 = defpackage.avcv.c;
    L_0x00b4:
        r2 = r0.a;
        if (r2 != r1) goto L_0x00bd;
    L_0x00b8:
        r0 = r0.b;
        r0 = (defpackage.aphg) r0;
        goto L_0x00bf;
    L_0x00bd:
        r0 = defpackage.aphg.s;
    L_0x00bf:
        if (r0 == 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00e1;
    L_0x00c2:
        r1 = r5.h;
        if (r1 == 0) goto L_0x00e1;
    L_0x00c6:
        r1 = r7.a;
        r1 = r1 & 32;
        if (r1 == 0) goto L_0x00e1;
    L_0x00cc:
        r7 = r7.g;
        if (r7 != 0) goto L_0x00d2;
    L_0x00d0:
        r7 = defpackage.avct.c;
    L_0x00d2:
        r1 = r7.a;
        r2 = 91394106; // 0x572903a float:1.14052756E-35 double:4.5154688E-316;
        if (r1 != r2) goto L_0x00df;
    L_0x00d9:
        r7 = r7.b;
        r3 = r7;
        r3 = (defpackage.aped) r3;
        goto L_0x00e1;
    L_0x00df:
        r3 = defpackage.aped.g;
    L_0x00e1:
        r7 = r5.g;
        r6 = r6.a;
        r7.a(r0, r6);
        r6 = r5.h;
        r6.a(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewp.a(akor, java.lang.Object):void");
    }
}
