package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aia */
public final class aia extends MenuInflater {
    public static final Class[] a;
    private static final Class[] e;
    public final Object[] b;
    public final Context c;
    public Object d;
    private final Object[] f = this.b;

    public aia(Context context) {
        super(context);
        this.c = context;
        this.b = new Object[]{context};
    }

    public final void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (menu instanceof tc) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (XmlPullParserException e) {
                throw new InflateException(str, e);
            } catch (IOException e2) {
                throw new InflateException(str, e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f2  */
    private final void a(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r18;
        r2 = new aic;
        r3 = r19;
        r2.<init>(r0, r3);
        r3 = r17.getEventType();
    L_0x000f:
        r4 = 2;
        r5 = "menu";
        r6 = 1;
        if (r3 != r4) goto L_0x003b;
    L_0x0015:
        r3 = r17.getName();
        r7 = r3.equals(r5);
        if (r7 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r17.next();
        goto L_0x0041;
    L_0x0024:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Expecting menu, got ";
        r2.append(r4);
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x003b:
        r3 = r17.next();
        if (r3 != r6) goto L_0x0252;
    L_0x0041:
        r7 = 0;
        r8 = 0;
        r9 = r3;
        r11 = r7;
        r3 = 0;
        r10 = 0;
    L_0x0047:
        if (r3 != 0) goto L_0x0251;
    L_0x0049:
        if (r9 == r6) goto L_0x0249;
    L_0x004b:
        r12 = "item";
        r13 = "group";
        if (r9 == r4) goto L_0x00ad;
    L_0x0051:
        r14 = 3;
        if (r9 == r14) goto L_0x0058;
    L_0x0054:
        r12 = r17;
        goto L_0x0242;
    L_0x0058:
        r9 = r17.getName();
        if (r10 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x006b;
    L_0x005f:
        r14 = r9.equals(r11);
        if (r14 == 0) goto L_0x006b;
    L_0x0065:
        r12 = r17;
        r11 = r7;
        r10 = 0;
        goto L_0x0242;
    L_0x006b:
        r13 = r9.equals(r13);
        if (r13 == 0) goto L_0x0075;
    L_0x0071:
        r2.a();
        goto L_0x0054;
    L_0x0075:
        r12 = r9.equals(r12);
        if (r12 != 0) goto L_0x0087;
    L_0x007b:
        r9 = r9.equals(r5);
        if (r9 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0054;
    L_0x0082:
        r12 = r17;
        r3 = 1;
        goto L_0x0242;
    L_0x0087:
        r9 = r2.h;
        if (r9 != 0) goto L_0x0054;
    L_0x008b:
        r9 = r2.A;
        if (r9 == 0) goto L_0x0099;
    L_0x008f:
        r9 = r9.e();
        if (r9 == 0) goto L_0x0099;
    L_0x0095:
        r2.b();
        goto L_0x0054;
    L_0x0099:
        r2.h = r6;
        r9 = r2.a;
        r12 = r2.b;
        r13 = r2.i;
        r14 = r2.j;
        r15 = r2.k;
        r9 = r9.add(r12, r13, r14, r15);
        r2.a(r9);
        goto L_0x0054;
    L_0x00ad:
        if (r10 != 0) goto L_0x0054;
    L_0x00af:
        r9 = r17.getName();
        r13 = r9.equals(r13);
        if (r13 != 0) goto L_0x0203;
    L_0x00b9:
        r12 = r9.equals(r12);
        if (r12 != 0) goto L_0x00d6;
    L_0x00bf:
        r12 = r9.equals(r5);
        if (r12 == 0) goto L_0x00d0;
    L_0x00c5:
        r9 = r2.b();
        r12 = r17;
        r0.a(r12, r1, r9);
        goto L_0x0242;
    L_0x00d0:
        r12 = r17;
        r11 = r9;
        r10 = 1;
        goto L_0x0242;
    L_0x00d6:
        r12 = r17;
        r9 = r2.F;
        r9 = r9.c;
        r13 = defpackage.afy.bd;
        r9 = defpackage.arz.a(r9, r1, r13);
        r13 = defpackage.afy.bn;
        r13 = r9.f(r13, r8);
        r2.i = r13;
        r13 = defpackage.afy.bo;
        r14 = r2.c;
        r13 = r9.a(r13, r14);
        r14 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r13 = r13 & r14;
        r14 = defpackage.afy.br;
        r15 = r2.d;
        r14 = r9.a(r14, r15);
        r14 = (char) r14;
        r13 = r13 | r14;
        r2.j = r13;
        r13 = defpackage.afy.bs;
        r13 = r9.c(r13);
        r2.k = r13;
        r13 = defpackage.afy.bt;
        r13 = r9.c(r13);
        r2.l = r13;
        r13 = defpackage.afy.bm;
        r13 = r9.f(r13, r8);
        r2.m = r13;
        r13 = defpackage.afy.bi;
        r13 = r9.d(r13);
        r13 = defpackage.aic.a(r13);
        r2.n = r13;
        r13 = defpackage.afy.bh;
        r14 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r13 = r9.a(r13, r14);
        r2.o = r13;
        r13 = defpackage.afy.bp;
        r13 = r9.d(r13);
        r13 = defpackage.aic.a(r13);
        r2.p = r13;
        r13 = defpackage.afy.by;
        r13 = r9.a(r13, r14);
        r2.q = r13;
        r13 = defpackage.afy.bj;
        r13 = r9.h(r13);
        if (r13 == 0) goto L_0x0154;
    L_0x014b:
        r13 = defpackage.afy.bj;
        r13 = r9.a(r13, r8);
        r2.r = r13;
        goto L_0x0158;
    L_0x0154:
        r13 = r2.e;
        r2.r = r13;
    L_0x0158:
        r13 = defpackage.afy.bk;
        r13 = r9.a(r13, r8);
        r2.s = r13;
        r13 = defpackage.afy.bu;
        r14 = r2.f;
        r13 = r9.a(r13, r14);
        r2.t = r13;
        r13 = defpackage.afy.bl;
        r14 = r2.g;
        r13 = r9.a(r13, r14);
        r2.u = r13;
        r13 = defpackage.afy.bz;
        r14 = -1;
        r13 = r9.a(r13, r14);
        r2.v = r13;
        r13 = defpackage.afy.bq;
        r13 = r9.d(r13);
        r2.z = r13;
        r13 = defpackage.afy.be;
        r13 = r9.f(r13, r8);
        r2.w = r13;
        r13 = defpackage.afy.bg;
        r13 = r9.d(r13);
        r2.x = r13;
        r13 = defpackage.afy.bf;
        r13 = r9.d(r13);
        r2.y = r13;
        r13 = r2.y;
        if (r13 == 0) goto L_0x01bf;
    L_0x01a1:
        r15 = r2.w;
        if (r15 != 0) goto L_0x01b8;
    L_0x01a5:
        r15 = r2.x;
        if (r15 != 0) goto L_0x01b8;
    L_0x01a9:
        r15 = e;
        r4 = r2.F;
        r4 = r4.f;
        r4 = r2.a(r13, r15, r4);
        r4 = (defpackage.aal) r4;
        r2.A = r4;
        goto L_0x01c1;
    L_0x01b8:
        r4 = "SupportMenuInflater";
        r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        android.util.Log.w(r4, r13);
    L_0x01bf:
        r2.A = r7;
    L_0x01c1:
        r4 = defpackage.afy.bv;
        r4 = r9.c(r4);
        r2.B = r4;
        r4 = defpackage.afy.bA;
        r4 = r9.c(r4);
        r2.C = r4;
        r4 = defpackage.afy.bx;
        r4 = r9.h(r4);
        if (r4 == 0) goto L_0x01e8;
    L_0x01d9:
        r4 = defpackage.afy.bx;
        r4 = r9.a(r4, r14);
        r13 = r2.E;
        r4 = defpackage.amu.a(r4, r13);
        r2.E = r4;
        goto L_0x01ea;
    L_0x01e8:
        r2.E = r7;
    L_0x01ea:
        r4 = defpackage.afy.bw;
        r4 = r9.h(r4);
        if (r4 == 0) goto L_0x01fb;
    L_0x01f2:
        r4 = defpackage.afy.bw;
        r4 = r9.f(r4);
        r2.D = r4;
        goto L_0x01fd;
    L_0x01fb:
        r2.D = r7;
    L_0x01fd:
        r9.a();
        r2.h = r8;
        goto L_0x0242;
    L_0x0203:
        r12 = r17;
        r4 = r2.F;
        r4 = r4.c;
        r9 = defpackage.afy.aW;
        r4 = r4.obtainStyledAttributes(r1, r9);
        r9 = defpackage.afy.aZ;
        r9 = r4.getResourceId(r9, r8);
        r2.b = r9;
        r9 = defpackage.afy.ba;
        r9 = r4.getInt(r9, r8);
        r2.c = r9;
        r9 = defpackage.afy.bb;
        r9 = r4.getInt(r9, r8);
        r2.d = r9;
        r9 = defpackage.afy.aX;
        r9 = r4.getInt(r9, r8);
        r2.e = r9;
        r9 = defpackage.afy.bc;
        r9 = r4.getBoolean(r9, r6);
        r2.f = r9;
        r9 = defpackage.afy.aY;
        r9 = r4.getBoolean(r9, r6);
        r2.g = r9;
        r4.recycle();
    L_0x0242:
        r9 = r17.next();
        r4 = 2;
        goto L_0x0047;
    L_0x0249:
        r1 = new java.lang.RuntimeException;
        r2 = "Unexpected end of document";
        r1.<init>(r2);
        throw r1;
    L_0x0251:
        return;
    L_0x0252:
        r12 = r17;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aia.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public final Object a(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : a(((ContextWrapper) obj).getBaseContext());
    }

    static {
        Class[] clsArr = new Class[]{Context.class};
        a = clsArr;
        e = clsArr;
    }
}
