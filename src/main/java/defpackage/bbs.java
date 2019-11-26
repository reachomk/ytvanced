package defpackage;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bbs */
public final class bbs {
    public final bbp a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q = -1;
    public Bundle r;
    public bau s;
    public List t = new ArrayList();
    private IntentSender u;
    private bam v;

    bbs(bbp bbp, String str, String str2) {
        this.a = bbp;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        bbb.e();
        return bbb.a.b() == this;
    }

    public final boolean b() {
        bbb.e();
        return bbb.a.a() == this;
    }

    public final boolean a(baz baz) {
        if (baz != null) {
            bbb.e();
            ArrayList arrayList = this.j;
            if (arrayList == null) {
                return false;
            }
            baz.b();
            int size = baz.b.size();
            if (size == 0) {
                return false;
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                if (intentFilter != null) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (intentFilter.hasCategory((String) baz.b.get(i2))) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final boolean a(String str) {
        bbb.e();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) this.j.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (b() || this.m == 3) {
            return true;
        }
        if (TextUtils.equals(h().b.a(), "android") && a("android.media.intent.category.LIVE_AUDIO") && !a("android.media.intent.category.LIVE_VIDEO")) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return this.v != null && this.g;
    }

    public final void a(int i) {
        bbb.e();
        bbf bbf = bbb.a;
        i = Math.min(this.p, Math.max(0, i));
        if (this == bbf.k) {
            bay bay = bbf.l;
            if (bay != null) {
                bay.b(i);
                return;
            }
        }
        if (!bbf.m.isEmpty()) {
            bay bay2 = (bay) bbf.m.get(this.c);
            if (bay2 != null) {
                bay2.b(i);
            }
        }
    }

    public final void b(int i) {
        bbb.e();
        if (i != 0) {
            bbf bbf = bbb.a;
            if (this == bbf.k) {
                bay bay = bbf.l;
                if (bay != null) {
                    bay.c(i);
                }
            }
        }
    }

    public final void e() {
        bbb.e();
        bbb.a.a(this);
    }

    public final boolean f() {
        return g().size() > 0;
    }

    public final List g() {
        return Collections.unmodifiableList(this.t);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        if (f()) {
            stringBuilder = new StringBuilder(super.toString());
            stringBuilder.append('[');
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(this.t.get(i));
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouter.RouteInfo{ uniqueId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", name=");
        stringBuilder.append(this.d);
        stringBuilder.append(", description=");
        stringBuilder.append(this.e);
        stringBuilder.append(", iconUri=");
        stringBuilder.append(this.f);
        stringBuilder.append(", enabled=");
        stringBuilder.append(this.g);
        stringBuilder.append(", connectionState=");
        stringBuilder.append(this.h);
        stringBuilder.append(", canDisconnect=");
        stringBuilder.append(this.i);
        stringBuilder.append(", playbackType=");
        stringBuilder.append(this.k);
        stringBuilder.append(", playbackStream=");
        stringBuilder.append(this.l);
        stringBuilder.append(", deviceType=");
        stringBuilder.append(this.m);
        stringBuilder.append(", volumeHandling=");
        stringBuilder.append(this.n);
        stringBuilder.append(", volume=");
        stringBuilder.append(this.o);
        stringBuilder.append(", volumeMax=");
        stringBuilder.append(this.p);
        stringBuilder.append(", presentationDisplayId=");
        stringBuilder.append(this.q);
        stringBuilder.append(", extras=");
        stringBuilder.append(this.r);
        stringBuilder.append(", settingsIntent=");
        stringBuilder.append(this.u);
        stringBuilder.append(", providerPackageName=");
        stringBuilder.append(this.a.a());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:50:0x00df, code skipped:
            if (r4.hasNext() == false) goto L_0x00f1;
     */
    public final int a(defpackage.bam r12) {
        /*
        r11 = this;
        r0 = r11.v;
        r1 = 0;
        if (r0 == r12) goto L_0x020e;
    L_0x0005:
        r11.v = r12;
        if (r12 == 0) goto L_0x020c;
    L_0x0009:
        r0 = r11.d;
        r2 = r12.c();
        r0 = java.util.Objects.equals(r0, r2);
        r2 = 1;
        if (r0 != 0) goto L_0x001e;
    L_0x0016:
        r0 = r12.c();
        r11.d = r0;
        r0 = 1;
        goto L_0x001f;
    L_0x001e:
        r0 = 0;
    L_0x001f:
        r3 = r11.e;
        r4 = r12.d();
        r3 = java.util.Objects.equals(r3, r4);
        if (r3 != 0) goto L_0x0032;
    L_0x002b:
        r0 = r12.d();
        r11.e = r0;
        r0 = 1;
    L_0x0032:
        r3 = r11.f;
        r4 = r12.e();
        r3 = java.util.Objects.equals(r3, r4);
        if (r3 != 0) goto L_0x0045;
    L_0x003e:
        r0 = r12.e();
        r11.f = r0;
        r0 = 1;
    L_0x0045:
        r3 = r11.g;
        r4 = r12.f();
        if (r3 == r4) goto L_0x0054;
    L_0x004d:
        r0 = r12.f();
        r11.g = r0;
        r0 = 1;
    L_0x0054:
        r3 = r11.h;
        r4 = r12.g();
        if (r3 == r4) goto L_0x0063;
    L_0x005c:
        r0 = r12.g();
        r11.h = r0;
        r0 = 1;
    L_0x0063:
        r3 = r11.j;
        r4 = r12.j();
        if (r3 != r4) goto L_0x006d;
    L_0x006b:
        goto L_0x00f1;
    L_0x006d:
        if (r3 == 0) goto L_0x00e2;
    L_0x006f:
        if (r4 != 0) goto L_0x0073;
    L_0x0071:
        goto L_0x00e2;
    L_0x0073:
        r3 = r3.listIterator();
        r4 = r4.listIterator();
    L_0x007b:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x00d5;
    L_0x0081:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x00d5;
    L_0x0087:
        r5 = r3.next();
        r5 = (android.content.IntentFilter) r5;
        r6 = r4.next();
        r6 = (android.content.IntentFilter) r6;
        if (r5 == r6) goto L_0x007b;
    L_0x0095:
        if (r5 == 0) goto L_0x00e2;
    L_0x0097:
        if (r6 == 0) goto L_0x00e2;
    L_0x0099:
        r7 = r5.countActions();
        r8 = r6.countActions();
        if (r7 != r8) goto L_0x00e2;
    L_0x00a3:
        r8 = 0;
    L_0x00a4:
        if (r8 >= r7) goto L_0x00b7;
    L_0x00a6:
        r9 = r5.getAction(r8);
        r10 = r6.getAction(r8);
        r9 = r9.equals(r10);
        if (r9 == 0) goto L_0x00e2;
    L_0x00b4:
        r8 = r8 + 1;
        goto L_0x00a4;
    L_0x00b7:
        r7 = r5.countCategories();
        r8 = r6.countCategories();
        if (r7 != r8) goto L_0x00e2;
    L_0x00c1:
        r8 = 0;
    L_0x00c2:
        if (r8 >= r7) goto L_0x007b;
    L_0x00c4:
        r9 = r5.getCategory(r8);
        r10 = r6.getCategory(r8);
        r9 = r9.equals(r10);
        if (r9 == 0) goto L_0x00e2;
    L_0x00d2:
        r8 = r8 + 1;
        goto L_0x00c2;
    L_0x00d5:
        r3 = r3.hasNext();
        if (r3 != 0) goto L_0x00e2;
    L_0x00db:
        r3 = r4.hasNext();
        if (r3 != 0) goto L_0x00e2;
    L_0x00e1:
        goto L_0x00f1;
    L_0x00e2:
        r0 = r11.j;
        r0.clear();
        r0 = r11.j;
        r3 = r12.j();
        r0.addAll(r3);
        r0 = 1;
    L_0x00f1:
        r3 = r11.k;
        r4 = r12.k();
        if (r3 == r4) goto L_0x0100;
    L_0x00f9:
        r0 = r12.k();
        r11.k = r0;
        r0 = 1;
    L_0x0100:
        r3 = r11.l;
        r4 = r12.l();
        if (r3 == r4) goto L_0x010f;
    L_0x0108:
        r0 = r12.l();
        r11.l = r0;
        r0 = 1;
    L_0x010f:
        r3 = r11.m;
        r4 = r12.m();
        if (r3 == r4) goto L_0x011e;
    L_0x0117:
        r0 = r12.m();
        r11.m = r0;
        r0 = 1;
    L_0x011e:
        r3 = r11.n;
        r4 = r12.p();
        r5 = 3;
        if (r3 == r4) goto L_0x012e;
    L_0x0127:
        r0 = r12.p();
        r11.n = r0;
        r0 = 3;
    L_0x012e:
        r3 = r11.o;
        r4 = r12.n();
        if (r3 == r4) goto L_0x013d;
    L_0x0136:
        r0 = r12.n();
        r11.o = r0;
        r0 = 3;
    L_0x013d:
        r3 = r11.p;
        r4 = r12.o();
        if (r3 == r4) goto L_0x014c;
    L_0x0145:
        r0 = r12.o();
        r11.p = r0;
        r0 = 3;
    L_0x014c:
        r3 = r11.q;
        r4 = r12.q();
        if (r3 == r4) goto L_0x015c;
    L_0x0154:
        r3 = r12.q();
        r11.q = r3;
        r0 = r0 | 5;
    L_0x015c:
        r3 = r11.r;
        r4 = r12.r();
        r3 = java.util.Objects.equals(r3, r4);
        if (r3 != 0) goto L_0x0170;
    L_0x0168:
        r3 = r12.r();
        r11.r = r3;
        r0 = r0 | 1;
    L_0x0170:
        r3 = r11.u;
        r4 = r12.i();
        r3 = java.util.Objects.equals(r3, r4);
        if (r3 != 0) goto L_0x0184;
    L_0x017c:
        r3 = r12.i();
        r11.u = r3;
        r0 = r0 | 1;
    L_0x0184:
        r3 = r11.i;
        r4 = r12.h();
        if (r3 == r4) goto L_0x0194;
    L_0x018c:
        r3 = r12.h();
        r11.i = r3;
        r0 = r0 | 5;
    L_0x0194:
        r12 = r12.b();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r12.size();
        r5 = r11.t;
        r5 = r5.size();
        if (r4 != r5) goto L_0x01ab;
    L_0x01a9:
        r4 = 0;
        goto L_0x01ac;
    L_0x01ab:
        r4 = 1;
    L_0x01ac:
        r12 = r12.iterator();
    L_0x01b0:
        r5 = r12.hasNext();
        if (r5 == 0) goto L_0x0204;
    L_0x01b6:
        r5 = r12.next();
        r5 = (java.lang.String) r5;
        r6 = defpackage.bbb.a;
        r7 = r11.a;
        r7 = r7.b();
        r7 = r7.flattenToShortString();
        r6 = r6.d;
        r8 = new zz;
        r8.<init>(r7, r5);
        r5 = r6.get(r8);
        r5 = (java.lang.String) r5;
        r6 = defpackage.bbb.a;
        r6 = r6.c;
        r7 = r6.size();
        r8 = 0;
    L_0x01de:
        if (r8 >= r7) goto L_0x01f1;
    L_0x01e0:
        r9 = r6.get(r8);
        r9 = (defpackage.bbs) r9;
        r8 = r8 + 1;
        r10 = r9.c;
        r10 = r10.equals(r5);
        if (r10 == 0) goto L_0x01de;
    L_0x01f0:
        goto L_0x01f2;
    L_0x01f1:
        r9 = 0;
    L_0x01f2:
        if (r9 == 0) goto L_0x01b0;
    L_0x01f4:
        r3.add(r9);
        if (r4 != 0) goto L_0x01b0;
    L_0x01f9:
        r5 = r11.t;
        r5 = r5.contains(r9);
        if (r5 == 0) goto L_0x0202;
    L_0x0201:
        goto L_0x01b0;
    L_0x0202:
        r4 = 1;
        goto L_0x01b0;
    L_0x0204:
        if (r4 != 0) goto L_0x0207;
    L_0x0206:
        goto L_0x020d;
    L_0x0207:
        r11.t = r3;
        r12 = r0 | 1;
        return r12;
    L_0x020c:
        r0 = 0;
    L_0x020d:
        return r0;
    L_0x020e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbs.a(bam):int");
    }

    public final ban h() {
        bbp bbp = this.a;
        bbb.e();
        return bbp.a;
    }
}
