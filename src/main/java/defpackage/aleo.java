package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import com.google.protos.youtube.api.innertube.FindEmailUserEndpointOuterClass$FindEmailUserEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aleo */
public final class aleo implements alhu, alib {
    public final aaas a;
    public final aler b;
    public final acvx c;
    public aolz d;
    public aphg e;
    public String f = "";
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    private boolean k;

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    public aleo(defpackage.aler r5, defpackage.apxu r6, defpackage.aaas r7, defpackage.acvx r8) {
        /*
        r4 = this;
        r4.<init>();
        r0 = defpackage.amqw.a(r5);
        r0 = (defpackage.aler) r0;
        r4.b = r0;
        r7 = defpackage.amqw.a(r7);
        r7 = (defpackage.aaas) r7;
        r4.a = r7;
        r7 = defpackage.amqw.a(r8);
        r7 = (defpackage.acvx) r7;
        r4.c = r7;
        r7 = "";
        r4.f = r7;
        r7 = defpackage.acwl.a;
        r0 = 0;
        r8.a(r7, r6, r0);
        r7 = com.google.protos.youtube.api.innertube.AddByEmailEndpointOuterClass$AddByEmailEndpoint.addByEmailEndpoint;
        r7 = defpackage.anxl.checkIsLite(r7);
        r6.a(r7);
        r1 = r6.h;
        r7 = r7.d;
        r7 = r1.a(r7);
        if (r7 == 0) goto L_0x0057;
    L_0x0038:
        r7 = com.google.protos.youtube.api.innertube.AddByEmailEndpointOuterClass$AddByEmailEndpoint.addByEmailEndpoint;
        r7 = defpackage.anxl.checkIsLite(r7);
        r6.a(r7);
        r6 = r6.h;
        r1 = r7.d;
        r6 = r6.b(r1);
        if (r6 != 0) goto L_0x004e;
    L_0x004b:
        r6 = r7.b;
        goto L_0x0052;
    L_0x004e:
        r6 = r7.a(r6);
    L_0x0052:
        r6 = (com.google.protos.youtube.api.innertube.AddByEmailEndpointOuterClass$AddByEmailEndpoint) r6;
        r6 = r6.b;
        goto L_0x0058;
    L_0x0057:
        r6 = r0;
    L_0x0058:
        r7 = android.text.TextUtils.isEmpty(r6);
        if (r7 == 0) goto L_0x0060;
    L_0x005e:
        r6 = r0;
        goto L_0x006c;
    L_0x0060:
        r7 = defpackage.arzt.e;
        r7 = r7.getParserForType();
        r6 = defpackage.abmi.b(r6, r7);
        r6 = (defpackage.arzt) r6;
    L_0x006c:
        r7 = 0;
        if (r6 == 0) goto L_0x00cf;
    L_0x006f:
        r1 = r6.d;
        r1 = r1.d();
        r8.a(r1);
        r1 = r6.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0085;
    L_0x007e:
        r6 = r6.c;
        if (r6 != 0) goto L_0x0086;
    L_0x0082:
        r6 = defpackage.axak.a;
        goto L_0x0086;
    L_0x0085:
        r6 = r0;
    L_0x0086:
        r6 = defpackage.ajzv.a(r6);
        r1 = defpackage.akab.class;
        r6 = defpackage.ajzv.a(r6, r1);
        r6 = (defpackage.akab) r6;
        if (r6 == 0) goto L_0x00cf;
    L_0x0094:
        r1 = r6.f;
        if (r1 == 0) goto L_0x00a4;
    L_0x0098:
        r2 = r1.a;
        r3 = 128619045; // 0x7aa9225 float:2.5664653E-34 double:6.35462515E-316;
        if (r2 != r3) goto L_0x00a4;
    L_0x009f:
        r1 = r1.b;
        r1 = (defpackage.aomx) r1;
        goto L_0x00a5;
    L_0x00a4:
        r1 = r0;
    L_0x00a5:
        r6 = r6.b;
        if (r6 == 0) goto L_0x00d0;
    L_0x00a9:
        r2 = r6.length;
        if (r2 <= 0) goto L_0x00d0;
    L_0x00ac:
        r6 = r6[r7];
        r6 = r6.w;
        r2 = r6.k;
        if (r2 != 0) goto L_0x00b6;
    L_0x00b4:
        r2 = defpackage.aphj.d;
    L_0x00b6:
        r2 = r2.a;
        r2 = r2 & 1;
        if (r2 != 0) goto L_0x00be;
    L_0x00bc:
        r2 = r0;
        goto L_0x00ca;
    L_0x00be:
        r2 = r6.k;
        if (r2 != 0) goto L_0x00c4;
    L_0x00c2:
        r2 = defpackage.aphj.d;
    L_0x00c4:
        r2 = r2.b;
        if (r2 != 0) goto L_0x00ca;
    L_0x00c8:
        r2 = defpackage.aphg.s;
    L_0x00ca:
        r4.e = r2;
        r4.d = r6;
        goto L_0x00d0;
    L_0x00cf:
        r1 = r0;
    L_0x00d0:
        r6 = r4.d;
        r2 = 8;
        if (r6 != 0) goto L_0x00e8;
    L_0x00d6:
        r5 = (defpackage.alit) r5;
        r6 = r5.ah;
        r6.setVisibility(r2);
        r6 = r5.ai;
        r6.setVisibility(r2);
        r5 = r5.aj;
        r5.setVisibility(r7);
        return;
    L_0x00e8:
        if (r1 != 0) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00fd;
    L_0x00eb:
        r3 = r5;
        r3 = (defpackage.alit) r3;
        r3 = r3.ad;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00f6;
    L_0x00f4:
        r1 = defpackage.arml.f;
    L_0x00f6:
        r1 = defpackage.ajqy.a(r1);
        r3.a(r1);
    L_0x00fd:
        r5 = (defpackage.alit) r5;
        r1 = r5.ae;
        r3 = r6.a;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x010e;
    L_0x0107:
        r3 = r6.b;
        if (r3 != 0) goto L_0x010f;
    L_0x010b:
        r3 = defpackage.arml.f;
        goto L_0x010f;
    L_0x010e:
        r3 = r0;
    L_0x010f:
        r3 = defpackage.ajqy.a(r3);
        r1.setText(r3);
        r1 = r5.af;
        r3 = r6.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x0125;
    L_0x011e:
        r3 = r6.c;
        if (r3 != 0) goto L_0x0126;
    L_0x0122:
        r3 = defpackage.arml.f;
        goto L_0x0126;
    L_0x0125:
        r3 = r0;
    L_0x0126:
        r3 = defpackage.ajqy.a(r3);
        r1.setText(r3);
        r1 = r6.k;
        if (r1 != 0) goto L_0x0133;
    L_0x0131:
        r1 = defpackage.aphj.d;
    L_0x0133:
        r1 = r1.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x015c;
    L_0x0139:
        r6 = r6.k;
        if (r6 != 0) goto L_0x013f;
    L_0x013d:
        r6 = defpackage.aphj.d;
    L_0x013f:
        r6 = r6.b;
        if (r6 != 0) goto L_0x0145;
    L_0x0143:
        r6 = defpackage.aphg.s;
    L_0x0145:
        r1 = r5.ag;
        r3 = r6.a;
        r3 = r3 & 128;
        if (r3 == 0) goto L_0x0154;
    L_0x014d:
        r6 = r6.g;
        if (r6 != 0) goto L_0x0155;
    L_0x0151:
        r6 = defpackage.arml.f;
        goto L_0x0155;
    L_0x0154:
        r6 = r0;
    L_0x0155:
        r6 = defpackage.ajqy.a(r6);
        r1.setText(r6);
    L_0x015c:
        r6 = r5.ah;
        r6.setVisibility(r7);
        r6 = r5.ai;
        r6.setVisibility(r7);
        r5 = r5.aj;
        r5.setVisibility(r2);
        r5 = r4.d;
        r5 = r5.l;
        r5 = r5.d();
        r8.a(r5, r0);
        r5 = r4.e;
        r5 = r5.r;
        r5 = r5.d();
        r8.a(r5, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aleo.<init>(aler, apxu, aaas, acvx):void");
    }

    public final void a(asof asof) {
        this.k = false;
        if (asof.c) {
            arml arml = null;
            if (TextUtils.equals(this.f, (asof.a & 16) != 0 ? asof.e : null)) {
                aygk aygk;
                aler aler = this.b;
                int i = asof.a;
                String str = (i & 32) != 0 ? asof.f : null;
                if ((i & 64) != 0) {
                    aygk = asof.g;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                } else {
                    aygk = null;
                }
                aler.a(str, aygk);
                aolz aolz;
                if (asof.d) {
                    aler aler2 = this.b;
                    aolz = this.d;
                    if ((aolz.a & 8) != 0) {
                        arml = aolz.e;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    aler2.a(ajqy.a(arml));
                    this.j = true;
                    a(false);
                    return;
                }
                arml arml2;
                String str2;
                aler aler3 = this.b;
                aolz = this.d;
                if ((aolz.a & 4) != 0) {
                    arml2 = aolz.d;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                aler3.a(ajqy.a(arml2));
                if ((asof.a & 128) != 0) {
                    str2 = asof.h;
                }
                this.g = str2;
                return;
            }
        }
        if (this.h) {
            this.h = false;
            d();
        }
    }

    public final void a() {
        this.k = false;
        this.b.a();
        if (this.h) {
            this.h = false;
            d();
        }
    }

    public final void b() {
        this.b.dismiss();
    }

    public final void c() {
        boolean z = false;
        this.i = false;
        if (Patterns.EMAIL_ADDRESS.matcher(this.f).matches() && !this.j) {
            z = true;
        }
        a(z);
        this.b.a();
    }

    public final void d() {
        aolz aolz = this.d;
        if ((aolz.a & 128) != 0) {
            anxp anxp = aolz.i;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(FindEmailUserEndpointOuterClass$FindEmailUserEndpoint.findEmailUserEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                if (this.d.j && this.k) {
                    this.h = true;
                    return;
                }
                Map hashMap = new HashMap();
                hashMap.put("find_email_user_email", this.f);
                hashMap.put("find_email_user_listener", this);
                this.k = true;
                aaas aaas = this.a;
                apxu apxu = this.d.i;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }

    public final void a(boolean z) {
        aphg aphg = this.e;
        if (aphg != null) {
            arml arml = null;
            if (this.i) {
                aler aler = this.b;
                aolz aolz = this.d;
                if ((aolz.a & 64) != 0) {
                    arml = aolz.h;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                aler.a(false, ajqy.a(arml), false);
            } else {
                aler aler2 = this.b;
                if ((aphg.a & 128) != 0) {
                    arml = aphg.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                aler2.a(z, ajqy.a(arml), true);
            }
        }
    }
}
