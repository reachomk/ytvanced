package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ium */
public final class ium implements akok, akot {
    private final View a;
    private final aaas b;
    private final TextView c = ((TextView) this.a.findViewById(R.id.title));
    private final TextView d = ((TextView) this.a.findViewById(R.id.button));
    private final akoj e;
    private final akoj f;
    private arvh g;

    public ium(Context context, aaas aaas) {
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = View.inflate(context, R.layout.title_and_button_list_header, null);
        this.e = new akoj(aaas, this.c);
        this.f = new akoj(aaas, this.d, (akok) this);
    }

    public final View K_() {
        return this.a;
    }

    public final boolean a(View view) {
        axbm axbm = this.g.d;
        if (axbm == null) {
            axbm = axbm.c;
        }
        if (((axbm.a == 65153809 ? (aphg) axbm.b : aphg.s).a & 2048) != 0) {
            aphg aphg;
            aaas aaas = this.b;
            axbm axbm2 = this.g.d;
            if (axbm2 == null) {
                axbm2 = axbm.c;
            }
            if (axbm2.a == 65153809) {
                aphg = (aphg) axbm2.b;
            } else {
                aphg = aphg.s;
            }
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        return false;
    }

    public final void a(akpb akpb) {
        this.e.a();
        this.f.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    public final /* synthetic */ void a_(defpackage.akor r8, java.lang.Object r9) {
        /*
        r7 = this;
        r9 = (defpackage.arvh) r9;
        r0 = r7.e;
        r1 = r8.a;
        r2 = r9.a;
        r3 = 2;
        r2 = r2 & r3;
        r4 = 0;
        if (r2 == 0) goto L_0x0014;
    L_0x000d:
        r2 = r9.c;
        if (r2 != 0) goto L_0x0015;
    L_0x0011:
        r2 = defpackage.apxu.d;
        goto L_0x0015;
    L_0x0014:
        r2 = r4;
    L_0x0015:
        r5 = r8.b();
        r0.a(r1, r2, r5);
        r0 = r7.f;
        r1 = r8.a;
        r2 = r9.d;
        if (r2 != 0) goto L_0x0026;
    L_0x0024:
        r2 = defpackage.axbm.c;
    L_0x0026:
        r5 = r2.a;
        r6 = 65153809; // 0x3e22b11 float:1.3292974E-36 double:3.21902587E-316;
        if (r5 != r6) goto L_0x0032;
    L_0x002d:
        r2 = r2.b;
        r2 = (defpackage.aphg) r2;
        goto L_0x0034;
    L_0x0032:
        r2 = defpackage.aphg.s;
    L_0x0034:
        r2 = r2.a;
        r2 = r2 & 4096;
        if (r2 != 0) goto L_0x003c;
    L_0x003a:
        r2 = r4;
        goto L_0x0053;
    L_0x003c:
        r2 = r9.d;
        if (r2 != 0) goto L_0x0042;
    L_0x0040:
        r2 = defpackage.axbm.c;
    L_0x0042:
        r5 = r2.a;
        if (r5 != r6) goto L_0x004b;
    L_0x0046:
        r2 = r2.b;
        r2 = (defpackage.aphg) r2;
        goto L_0x004d;
    L_0x004b:
        r2 = defpackage.aphg.s;
    L_0x004d:
        r2 = r2.m;
        if (r2 != 0) goto L_0x0053;
    L_0x0051:
        r2 = defpackage.apxu.d;
    L_0x0053:
        r5 = r8.b();
        r0.a(r1, r2, r5);
        r0 = r7.d;
        r1 = 1;
        r0.setClickable(r1);
        r7.g = r9;
        r8 = r8.a;
        r0 = r9.f;
        r0 = r0.d();
        r8.a(r0, r4);
        r8 = r7.c;
        r0 = r9.a;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x007b;
    L_0x0074:
        r0 = r9.b;
        if (r0 != 0) goto L_0x007c;
    L_0x0078:
        r0 = defpackage.arml.f;
        goto L_0x007c;
    L_0x007b:
        r0 = r4;
    L_0x007c:
        r0 = defpackage.ajqy.a(r0);
        r8.setText(r0);
        r8 = r9.a;
        r0 = 8;
        r8 = r8 & r0;
        if (r8 == 0) goto L_0x00a4;
    L_0x008a:
        r8 = r9.e;
        if (r8 != 0) goto L_0x0090;
    L_0x008e:
        r8 = defpackage.arvj.c;
    L_0x0090:
        r8 = r8.b;
        r8 = defpackage.arvl.a(r8);
        if (r8 == 0) goto L_0x00a4;
    L_0x0098:
        if (r8 == r3) goto L_0x009b;
    L_0x009a:
        goto L_0x00a4;
    L_0x009b:
        r8 = r7.c;
        r1 = 2132018168; // 0x7f1403f8 float:1.9674635E38 double:1.053356933E-314;
        defpackage.adl.a(r8, r1);
        goto L_0x00ac;
    L_0x00a4:
        r8 = r7.c;
        r1 = 2132018167; // 0x7f1403f7 float:1.9674633E38 double:1.0533569326E-314;
        defpackage.adl.a(r8, r1);
    L_0x00ac:
        r8 = r9.a;
        r8 = r8 & 4;
        if (r8 != 0) goto L_0x00b8;
    L_0x00b2:
        r8 = r7.d;
        r8.setVisibility(r0);
        return;
    L_0x00b8:
        r8 = r7.d;
        r0 = 0;
        r8.setVisibility(r0);
        r8 = r7.d;
        r0 = r9.d;
        if (r0 != 0) goto L_0x00c6;
    L_0x00c4:
        r0 = defpackage.axbm.c;
    L_0x00c6:
        r1 = r0.a;
        if (r1 != r6) goto L_0x00cf;
    L_0x00ca:
        r0 = r0.b;
        r0 = (defpackage.aphg) r0;
        goto L_0x00d1;
    L_0x00cf:
        r0 = defpackage.aphg.s;
    L_0x00d1:
        r0 = r0.a;
        r0 = r0 & 128;
        if (r0 != 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00ef;
    L_0x00d8:
        r9 = r9.d;
        if (r9 != 0) goto L_0x00de;
    L_0x00dc:
        r9 = defpackage.axbm.c;
    L_0x00de:
        r0 = r9.a;
        if (r0 != r6) goto L_0x00e7;
    L_0x00e2:
        r9 = r9.b;
        r9 = (defpackage.aphg) r9;
        goto L_0x00e9;
    L_0x00e7:
        r9 = defpackage.aphg.s;
    L_0x00e9:
        r4 = r9.g;
        if (r4 != 0) goto L_0x00ef;
    L_0x00ed:
        r4 = defpackage.arml.f;
    L_0x00ef:
        r9 = defpackage.ajqy.a(r4);
        r8.setText(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ium.a_(akor, java.lang.Object):void");
    }
}
