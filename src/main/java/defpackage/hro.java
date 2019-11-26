package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hro */
public final class hro implements xcp {
    public final Context a;
    public final xci b;
    public final hng c;
    public final ejv d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final OnGlobalLayoutListener h = hsu.a(this.e, this.g);
    public final hnj i = new hrn(this);
    public final eka j = new hrq(this);
    public awlq k;
    public String l;
    private final zyw m;
    private final bcaa n;
    private final hmj o;

    public hro(Context context, zyw zyw, xci xci, bcaa bcaa, hmj hmj, hng hng, ejv ejv, View view) {
        this.a = context;
        this.m = zyw;
        this.b = xci;
        this.n = bcaa;
        this.o = hmj;
        this.c = hng;
        this.d = ejv;
        this.e = (TextView) view.findViewById(R.id.author);
        this.f = (TextView) view.findViewById(R.id.details);
        this.g = (TextView) view.findViewById(R.id.overflow_video_size_bytes);
    }

    private final void a(agld agld) {
        Object b;
        String a = agld.a.a();
        awlq awlq = this.k;
        anxr access$000 = anxl.checkIsLite(awlk.b);
        awlq.a(access$000);
        if (awlq.h.a(access$000.d)) {
            awlq = this.k;
            access$000 = anxl.checkIsLite(awlk.b);
            awlq.a(access$000);
            b = awlq.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
        } else {
            b = null;
        }
        if (a.equals(b)) {
            a();
        }
    }

    private final void a(agle agle) {
        Object b;
        String str = agle.a;
        awlq awlq = this.k;
        anxr access$000 = anxl.checkIsLite(awlk.b);
        awlq.a(access$000);
        if (awlq.h.a(access$000.d)) {
            awlq = this.k;
            access$000 = anxl.checkIsLite(awlk.b);
            awlq.a(access$000);
            b = awlq.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
        } else {
            b = null;
        }
        if (str.equals(b)) {
            a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARNING: Missing block: B:19:0x0073, code skipped:
            if (((defpackage.agwc) r7.n.get()).b().n().a(r4) != null) goto L_0x0039;
     */
    public final void a() {
        /*
        r7 = this;
        r0 = r7.l;
        r0 = defpackage.amqu.a(r0);
        if (r0 != 0) goto L_0x013a;
    L_0x0008:
        r0 = r7.n;
        r0 = r0.get();
        r0 = (defpackage.agwc) r0;
        r0 = r0.b();
        r0 = r0.k();
        r1 = r7.l;
        r0 = r0.a(r1);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r3 = r0.u();
        r4 = defpackage.agqs.PLAYABLE;
        if (r3 == r4) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r3 = 1;
        goto L_0x002e;
    L_0x002d:
        r3 = 0;
    L_0x002e:
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r4 = r0.u();
        r5 = defpackage.agqs.DELETED;
        if (r4 != r5) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r1 = 0;
        goto L_0x0076;
    L_0x003b:
        r4 = r7.k;
        r5 = defpackage.awlk.b;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r6 = r5.d;
        r4 = r4.b(r6);
        if (r4 != 0) goto L_0x0053;
    L_0x0050:
        r4 = r5.b;
        goto L_0x0057;
    L_0x0053:
        r4 = r5.a(r4);
    L_0x0057:
        r4 = (java.lang.String) r4;
        r5 = defpackage.amqu.a(r4);
        if (r5 != 0) goto L_0x0076;
    L_0x005f:
        r5 = r7.n;
        r5 = r5.get();
        r5 = (defpackage.agwc) r5;
        r5 = r5.b();
        r5 = r5.n();
        r4 = r5.a(r4);
        if (r4 == 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0039;
    L_0x0076:
        if (r3 != 0) goto L_0x00c7;
    L_0x0078:
        if (r1 != 0) goto L_0x00c7;
    L_0x007a:
        r1 = r7.o;
        r1 = r1.a(r2, r0);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = 0;
    L_0x0086:
        r5 = r1.b;
        r6 = r5.length;
        if (r4 >= r6) goto L_0x009f;
    L_0x008b:
        r5 = r5[r4];
        r3.append(r5);
        r5 = r1.b;
        r5 = r5.length;
        r5 = r5 + -1;
        if (r4 >= r5) goto L_0x009c;
    L_0x0097:
        r5 = 10;
        r3.append(r5);
    L_0x009c:
        r4 = r4 + 1;
        goto L_0x0086;
    L_0x009f:
        r4 = r7.f;
        r3 = r3.toString();
        defpackage.xpr.a(r4, r3);
        r3 = r7.f;
        r4 = r1.b;
        r4 = r4.length;
        r3.setMaxLines(r4);
        r3 = r7.f;
        r4 = r7.a;
        r1 = r1.a;
        r1 = defpackage.xwe.a(r4, r1, r2);
        r3.setTextColor(r1);
        r1 = r7.f;
        r3 = r1.getTypeface();
        r1.setTypeface(r3, r2);
        goto L_0x00cc;
    L_0x00c7:
        r1 = r7.f;
        defpackage.xpr.a(r1, r2);
    L_0x00cc:
        r1 = r7.f;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x00df;
    L_0x00d4:
        r0 = r7.e;
        defpackage.xpr.a(r0, r2);
        r0 = r7.g;
        defpackage.xpr.a(r0, r2);
        goto L_0x013a;
    L_0x00df:
        r1 = 0;
        if (r0 == 0) goto L_0x011e;
    L_0x00e2:
        r3 = r7.m;
        r3 = defpackage.foh.u(r3);
        if (r3 == 0) goto L_0x011e;
    L_0x00ea:
        r3 = r0.n();
        if (r3 != 0) goto L_0x00f1;
    L_0x00f0:
        goto L_0x011e;
    L_0x00f1:
        r2 = r7.e;
        r3 = r7.a;
        r4 = r7.k;
        r5 = r4.a;
        r5 = r5 & 16;
        if (r5 == 0) goto L_0x0103;
    L_0x00fd:
        r1 = r4.f;
        if (r1 != 0) goto L_0x0103;
    L_0x0101:
        r1 = defpackage.arml.f;
    L_0x0103:
        r1 = defpackage.ajqy.a(r1);
        r4 = r0.h();
        r0 = defpackage.hsu.a(r3, r1, r4);
        r2.setText(r0);
        r0 = r7.e;
        r0 = r0.getViewTreeObserver();
        r1 = r7.h;
        r0.addOnGlobalLayoutListener(r1);
        return;
    L_0x011e:
        r0 = r7.e;
        r3 = r7.k;
        r4 = r3.a;
        r4 = r4 & 16;
        if (r4 == 0) goto L_0x012e;
    L_0x0128:
        r1 = r3.f;
        if (r1 != 0) goto L_0x012e;
    L_0x012c:
        r1 = defpackage.arml.f;
    L_0x012e:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r7.g;
        defpackage.xpr.a(r0, r2);
    L_0x013a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hro.a():void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        String str;
        switch (i) {
            case -1:
                clsArr = new Class[]{agkv.class, agkz.class, agle.class, agld.class, aglm.class, agll.class};
                break;
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                a((agle) obj);
                break;
            case 3:
                a((agld) obj);
                break;
            case 4:
                aglm aglm = (aglm) obj;
                str = this.l;
                if (str != null && str.equals(aglm.a.a())) {
                    a();
                    return null;
                }
            case 5:
                agll agll = (agll) obj;
                str = this.l;
                if (str != null && str.equals(agll.a)) {
                    a();
                    return null;
                }
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
