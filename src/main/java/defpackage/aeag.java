package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aeag */
public final class aeag implements adqi, xcp {
    public final addo a;
    public final xci b;
    public final adqf c;
    public aeal d;
    public aeal e;
    public final addr f;
    public final Context g;
    public aeao h;
    public aeam i;
    public aeak j;
    public boolean k;
    public int l = -1;
    public String m;
    public boolean n;
    private final acum o;
    private final Handler p;
    private final Set q = new HashSet();
    private final Set r = new HashSet();
    private boolean s = true;
    private boolean t = false;

    public aeag(addo addo, xci xci, acum acum, String str, adqf adqf, Context context) {
        this.a = addo;
        this.b = xci;
        this.o = acum;
        this.p = new Handler(Looper.getMainLooper());
        this.c = adqf;
        this.f = new aeaf(this, str);
        this.g = context;
    }

    public final void a(adqe adqe) {
    }

    public final void b(adqe adqe) {
    }

    public final void a() {
        xak.a();
        this.d = null;
        this.e = null;
    }

    public final void c(adqe adqe) {
        aeal aeal = this.d;
        if (aeal != null && aeal.f) {
            this.d = null;
        }
        aeal = this.e;
        if (aeal != null && aeal.f) {
            this.e = null;
        }
    }

    public final void a(aeal aeal) {
        this.d = aeal;
        String str = aeal.b;
        if (this.q.add(str)) {
            auqq auqq = (auqq) auqn.d.createBuilder();
            auqq.copyOnWrite();
            auqn auqn = (auqn) auqq.instance;
            auqn.a |= 1;
            auqn.b = 2;
            auqq.copyOnWrite();
            auqn = (auqn) auqq.instance;
            if (str != null) {
                auqn.a = 2 | auqn.a;
                auqn.c = str;
                auqn auqn2 = (auqn) ((anxl) auqq.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (auqn2 != null) {
                    asmw.c = auqn2;
                    asmw.b = 85;
                    this.o.a((asmw) ((anxl) asmz.build()));
                    if (aeal.h) {
                        this.p.removeCallbacks(new aeai(this));
                        this.p.post(new aeah(this));
                    } else {
                        this.b.d(new aeaj(aeal.i, aeal.c));
                        return;
                    }
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }

    public final boolean b() {
        xak.a();
        return a(false);
    }

    public final boolean a(boolean z) {
        if (this.j != null) {
            aeal aeal = this.d;
            if (aeal != null && (z || this.r.add(aeal.b))) {
                aeao aeao = this.h;
                if (aeao != null) {
                    aeao.d();
                }
                aeal aeal2 = this.d;
                this.s = aeal2.j;
                this.t = aeal2.k;
                Intent intent = new Intent(this.g, TvSignInActivity.class);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode", this.d.a);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId", this.d.c);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAppStatusUri", this.d.d);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountChooserUi", false);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.isMdxAssisted", this.d.k);
                this.j.a(intent);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (this.k) {
            aeao aeao = this.h;
            if (aeao != null) {
                int i = this.l;
                if (i == 1) {
                    aeam aeam = this.i;
                    if (aeam != null && this.s) {
                        aeam.a();
                    }
                    if (!this.t) {
                        this.h.a();
                    }
                } else if (i == 2) {
                    aeao.b();
                } else if (i == 3) {
                    aeao.c();
                } else if (i == 4) {
                    aeao.a(this.m);
                }
            }
            this.l = -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    public final java.lang.Class[] a(java.lang.Class r17, java.lang.Object r18, int r19) {
        /*
        r16 = this;
        r0 = r19;
        r1 = -1;
        r2 = 0;
        if (r0 == r1) goto L_0x005d;
    L_0x0006:
        if (r0 != 0) goto L_0x0042;
    L_0x0008:
        r0 = r18;
        r0 = (defpackage.adqa) r0;
        r1 = r0.b;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0036;
    L_0x0014:
        r1 = r0.c;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0036;
    L_0x001c:
        r1 = r0.a;
        if (r1 == 0) goto L_0x0036;
    L_0x0020:
        r15 = new aeal;
        r4 = r0.b;
        r5 = r0.c;
        r6 = r1.a;
        r7 = 0;
        r8 = 1;
        r9 = 1;
        r10 = 0;
        r11 = 0;
        r13 = 0;
        r14 = 1;
        r12 = "";
        r3 = r15;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        goto L_0x0037;
    L_0x0036:
        r15 = r2;
    L_0x0037:
        if (r15 != 0) goto L_0x003c;
    L_0x0039:
        r1 = r16;
        goto L_0x0067;
    L_0x003c:
        r1 = r16;
        r1.a(r15);
        return r2;
    L_0x0042:
        r1 = r16;
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = 32;
        r3.<init>(r4);
        r4 = "unsupported op code: ";
        r3.append(r4);
        r3.append(r0);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
    L_0x005d:
        r1 = r16;
        r0 = 1;
        r2 = new java.lang.Class[r0];
        r0 = 0;
        r3 = defpackage.adqa.class;
        r2[r0] = r3;
    L_0x0067:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeag.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    static {
        xtl.b("MDX.TvSignIn");
    }
}
