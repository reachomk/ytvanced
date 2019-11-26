package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vmq */
public class vmq implements vmr {
    public final Context a;
    public final xto b;
    public final String c;
    private final AtomicBoolean d;
    private final boolean e;
    private final byte[] f;

    public void a() {
    }

    public void a(Executor executor) {
    }

    public void b() {
    }

    public String c() {
        xak.b();
        try {
            tas tas = (tas) this.b.get();
            String a = a(tas, this.f);
            if (this.d.get()) {
                synchronized (this.d) {
                    if (this.d.get()) {
                        String a2 = a(tas, this.f);
                        this.d.set(false);
                        a = a2;
                    }
                }
            }
            if (TextUtils.isEmpty(a)) {
                return vmq.a(14);
            }
            return a;
        } catch (RemoteException unused) {
            return vmq.a(15);
        } catch (Throwable unused2) {
            return vmq.a(13);
        }
    }

    /* Access modifiers changed, original: protected */
    public int e() {
        return 0;
    }

    public final String d() {
        try {
            return ((tas) this.b.get()).a();
        } catch (RemoteException unused) {
            return "ms";
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (!this.e) {
            try {
                ((tas) this.b.get()).a(motionEvent);
            } catch (Exception unused) {
            }
        }
    }

    public final String a(String str) {
        if (this.e) {
            return "";
        }
        try {
            return ((tas) this.b.get()).a(this.a, str);
        } catch (RemoteException unused) {
            return vmq.a(15);
        }
    }

    private final String a(tas tas, byte[] bArr) {
        int e = e();
        if (e != 0) {
            return vmq.a(e);
        }
        String a;
        if (bArr != null) {
            a = tas.a(this.a, bArr);
        } else {
            a = tas.a(this.a);
        }
        return a;
    }

    public final String f() {
        return this.c;
    }

    private static String a(int i) {
        String valueOf = String.valueOf(String.format(Locale.ROOT, "%02d", new Object[]{Integer.valueOf(i)}));
        String str = "go/asr";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    /* JADX WARNING: Missing block: B:5:0x0032, code skipped:
            if (r0 != 3) goto L_0x007a;
     */
    vmq(android.content.Context r10, java.lang.String r11, defpackage.aoqb r12, java.lang.String r13, java.lang.String r14, defpackage.tar r15, boolean r16, boolean r17, int r18) {
        /*
        r9 = this;
        r7 = r9;
        r9.<init>();
        defpackage.amqw.a(r11);
        defpackage.amqw.a(r13);
        defpackage.amqw.a(r14);
        defpackage.amqw.a(r15);
        r0 = defpackage.amqw.a(r10);
        r0 = (android.content.Context) r0;
        r7.a = r0;
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r1 = r16;
        r0.<init>(r1);
        r7.d = r0;
        r0 = r17;
        r7.e = r0;
        r0 = r18 + -1;
        r1 = 0;
        if (r18 == 0) goto L_0x00a4;
    L_0x002a:
        r2 = 4;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        if (r0 == r5) goto L_0x0037;
    L_0x0030:
        if (r0 == r4) goto L_0x0035;
    L_0x0032:
        if (r0 == r3) goto L_0x0038;
    L_0x0034:
        goto L_0x007a;
    L_0x0035:
        r2 = 3;
        goto L_0x0038;
    L_0x0037:
        r2 = 2;
    L_0x0038:
        r0 = defpackage.dfk.c;
        r0 = r0.createBuilder();
        r0 = (defpackage.dfn) r0;
        r1 = defpackage.dfm.c;
        r1 = r1.createBuilder();
        r1 = (defpackage.dfp) r1;
        r1.copyOnWrite();
        r3 = r1.instance;
        r3 = (defpackage.dfm) r3;
        r4 = r3.a;
        r4 = r4 | r5;
        r3.a = r4;
        r2 = r2 + -1;
        r3.b = r2;
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.dfk) r2;
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.dfm) r1;
        r2.b = r1;
        r1 = r2.a;
        r1 = r1 | r5;
        r2.a = r1;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.dfk) r0;
        r1 = r0.toByteArray();
    L_0x007a:
        r7.f = r1;
        r0 = "a.";
        r1 = java.lang.String.valueOf(r11);
        r2 = r1.length();
        if (r2 != 0) goto L_0x008e;
    L_0x0088:
        r1 = new java.lang.String;
        r1.<init>(r0);
        goto L_0x0092;
    L_0x008e:
        r1 = r0.concat(r1);
    L_0x0092:
        r7.c = r1;
        r8 = new vmt;
        r2 = "GcoreAdShieldClient";
        r0 = r8;
        r1 = r9;
        r3 = r15;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r7.b = r8;
        return;
    L_0x00a4:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmq.<init>(android.content.Context, java.lang.String, aoqb, java.lang.String, java.lang.String, tar, boolean, boolean, int):void");
    }
}
