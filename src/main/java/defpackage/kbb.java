package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: kbb */
public final class kbb extends akpl {
    public final aaas a;
    public final fna b;
    public ajta c;
    public boolean d;
    public kba e;
    public kba f;
    private final Context g;
    private final akvp h;
    private final akou i;
    private final akkq j;
    private final FrameLayout k;
    private final zyw l;
    private kba m;
    private final akoj n;

    public kbb(Context context, akkq akkq, flu flu, aaas aaas, akvp akvp, fna fna, zyw zyw) {
        this.g = context;
        this.i = flu;
        this.a = aaas;
        this.h = akvp;
        this.j = akkq;
        this.b = fna;
        this.l = zyw;
        this.n = new akoj(aaas, (akou) flu);
        this.k = new FrameLayout(context);
        this.k.setOnClickListener(this.n);
        this.i.a(this.k);
    }

    public final View K_() {
        return this.i.a();
    }

    public final void a(akpb akpb) {
        this.n.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
    public final /* synthetic */ void a(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.ajta) r11;
        r0 = r9.n;
        r1 = r10.a;
        r2 = r11.d;
        r3 = r10.b();
        r0.a(r1, r2, r3);
        r0 = r9.d;
        if (r0 != 0) goto L_0x017e;
    L_0x0013:
        r9.c = r11;
        r0 = r9.k;
        r0.removeAllViews();
        r0 = r9.g;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        r1 = 2;
        if (r0 != r1) goto L_0x003f;
    L_0x0029:
        r0 = r9.f;
        if (r0 != 0) goto L_0x003a;
    L_0x002d:
        r0 = new kba;
        r1 = r9.g;
        r2 = r9.j;
        r3 = r9.l;
        r0.<init>(r9, r1, r2, r3);
        r9.f = r0;
    L_0x003a:
        r0 = r9.f;
        r9.m = r0;
        goto L_0x0054;
    L_0x003f:
        r0 = r9.e;
        if (r0 != 0) goto L_0x0050;
    L_0x0043:
        r0 = new kba;
        r1 = r9.g;
        r2 = r9.j;
        r3 = r9.l;
        r0.<init>(r9, r1, r2, r3);
        r9.e = r0;
    L_0x0050:
        r0 = r9.e;
        r9.m = r0;
    L_0x0054:
        r0 = r9.m;
        r1 = r10.a;
        r2 = r0.g;
        r3 = r0.l;
        r3 = r3.c;
        r3 = r3.b;
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.h;
        r3 = r0.l;
        r3 = r3.c;
        r3 = r3.c;
        r3 = defpackage.ajqy.a(r3);
        defpackage.xpr.a(r2, r3);
        r2 = r0.l;
        r2 = r2.c;
        r2 = r2.a;
        if (r2 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0087;
    L_0x007f:
        r2 = r2.b;
        r2 = r2.size();
        if (r2 != 0) goto L_0x00a5;
    L_0x0087:
        r2 = r0.l;
        r3 = r2.c;
        r3 = r3.j;
        if (r3 == 0) goto L_0x00a5;
    L_0x008f:
        r4 = r0.f;
        r2 = r2.h;
        r3 = r3.b;
        r3 = defpackage.arwh.a(r3);
        if (r3 != 0) goto L_0x009d;
    L_0x009b:
        r3 = defpackage.arwh.UNKNOWN;
    L_0x009d:
        r2 = r2.a(r3);
        r4.setImageResource(r2);
        goto L_0x00b2;
    L_0x00a5:
        r2 = r0.b;
        r3 = r0.f;
        r4 = r0.l;
        r4 = r4.c;
        r4 = r4.a;
        r2.a(r3, r4);
    L_0x00b2:
        r2 = r0.l;
        r2 = r2.c;
        r2 = r2.g;
        r3 = 0;
        if (r2 == 0) goto L_0x00c1;
    L_0x00bb:
        r2 = r0.i;
        r2.setVisibility(r3);
        goto L_0x00c8;
    L_0x00c1:
        r2 = r0.i;
        r4 = 8;
        r2.setVisibility(r4);
    L_0x00c8:
        r2 = r0.l;
        r2 = r2.c;
        r2 = r2.f;
        r4 = 0;
        r5 = 1;
        if (r2 != 0) goto L_0x00d4;
    L_0x00d2:
        r2 = r4;
        goto L_0x00df;
    L_0x00d4:
        r6 = r2.a;
        r6 = r6 & r5;
        if (r6 == 0) goto L_0x00d2;
    L_0x00d9:
        r2 = r2.b;
        if (r2 != 0) goto L_0x00df;
    L_0x00dd:
        r2 = defpackage.aphg.s;
    L_0x00df:
        r6 = new java.util.HashMap;
        r6.<init>();
        r7 = r0.l;
        r7 = r7.c;
        r8 = "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag";
        r6.put(r8, r7);
        r7 = r0.j;
        r7.a(r2, r1, r6);
        r1 = r0.j;
        r1 = r1.f;
        if (r1 == 0) goto L_0x00fe;
    L_0x00f8:
        r1 = r0.c;
        r1.setPadding(r3, r3, r3, r3);
        goto L_0x0105;
    L_0x00fe:
        r1 = r0.c;
        r2 = r0.e;
        r1.setPadding(r2, r3, r2, r3);
    L_0x0105:
        r1 = r0.l;
        r1 = r1.g;
        r1 = defpackage.xss.b(r1);
        if (r1 == 0) goto L_0x011c;
    L_0x010f:
        r1 = r0.d;
        r1 = defpackage.foh.L(r1);
        if (r1 == 0) goto L_0x011c;
    L_0x0117:
        r1 = r0.k;
        r1.a(r3);
    L_0x011c:
        r1 = r0.a;
        r0 = r0.k;
        r1.setBackground(r0);
        r0 = r9.k;
        r1 = r9.m;
        r1 = r1.a;
        r0.addView(r1);
        r0 = defpackage.ajsz.a;
        r0 = r11.hasExtension(r0);
        if (r0 != 0) goto L_0x013b;
    L_0x0134:
        r0 = defpackage.ajsz.a;
        r1 = defpackage.aqga.c;
        r11.setExtension(r0, r1);
    L_0x013b:
        r0 = defpackage.ajsz.a;
        r0 = r11.getExtension(r0);
        r0 = (defpackage.aqga) r0;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0179;
    L_0x0147:
        r0 = defpackage.ajsz.a;
        r0 = r11.getExtension(r0);
        r0 = (defpackage.aqga) r0;
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.aqfz) r0;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.aqga) r1;
        r2 = r1.a;
        r2 = r2 | r5;
        r1.a = r2;
        r1.b = r5;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aqga) r0;
        r1 = defpackage.ajsz.a;
        r11.setExtension(r1, r0);
        r0 = r9.a;
        r11 = r11.e;
        r0.a(r11, r4);
    L_0x0179:
        r11 = r9.i;
        r11.a(r10);
    L_0x017e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbb.a(akor, java.lang.Object):void");
    }
}
