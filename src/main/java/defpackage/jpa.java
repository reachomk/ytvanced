package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: jpa */
public final class jpa implements fjk, fjm {
    public final Activity a;
    public final acwa b;
    public final fjo c;
    public final fag d;
    public final jpp e;
    public final jpn f;
    public final hdk g;
    public final fab h;
    public final jpt i;
    public final ezt j;
    public ezz k;
    public jpm l;
    public fak m;
    public apxu n;
    public byte[] o;
    public final boolean p;
    public boolean q;
    public boolean r;
    public int s = 1;
    private final fag t;
    private final fjg u;
    private final zzf v;
    private final zzl w;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Missing block: B:10:0x003b, code skipped:
            if (r3.ae == false) goto L_0x003d;
     */
    public jpa(android.app.Activity r1, defpackage.acwa r2, defpackage.fjo r3, defpackage.fag r4, defpackage.fag r5, defpackage.jpp r6, defpackage.jpn r7, defpackage.hdk r8, defpackage.fjg r9, defpackage.fab r10, defpackage.zzf r11, defpackage.zyw r12, defpackage.zzl r13, defpackage.jpt r14, defpackage.ezt r15) {
        /*
        r0 = this;
        r0.<init>();
        r0.a = r1;
        r0.b = r2;
        r0.c = r3;
        r0.d = r4;
        r0.t = r5;
        r0.v = r11;
        r0.u = r9;
        r0.e = r6;
        r0.f = r7;
        r0.g = r8;
        r0.h = r10;
        r2 = 1;
        r0.s = r2;
        r0.w = r13;
        r0.i = r14;
        r3 = defpackage.foh.y(r12);
        r4 = 0;
        if (r3 == 0) goto L_0x003f;
    L_0x0027:
        r3 = defpackage.foh.z(r12);
        if (r3 != 0) goto L_0x003f;
    L_0x002d:
        r3 = r12.a();
        if (r3 == 0) goto L_0x003d;
    L_0x0033:
        r3 = r3.e;
        if (r3 != 0) goto L_0x0039;
    L_0x0037:
        r3 = defpackage.aulu.bw;
    L_0x0039:
        r3 = r3.ae;
        if (r3 != 0) goto L_0x003f;
    L_0x003d:
        r3 = 1;
        goto L_0x0040;
    L_0x003f:
        r3 = 0;
    L_0x0040:
        r0.p = r3;
        r0.j = r15;
        r0.q = r4;
        r1 = r1.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.screenWidthDp;
        r3 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        if (r1 >= r3) goto L_0x0055;
    L_0x0054:
        goto L_0x0056;
    L_0x0055:
        r2 = 0;
    L_0x0056:
        r0.r = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpa.<init>(android.app.Activity, acwa, fjo, fag, fag, jpp, jpn, hdk, fjg, fab, zzf, zyw, zzl, jpt, ezt):void");
    }

    public final void a(fjl fjl) {
        a(this.u.a());
    }

    public final void a(fja fja) {
        if (!fja.C) {
            a(fiw.a(fja));
        }
    }

    private final void a(fiw fiw) {
        Class cls = null;
        apxu a = fiw != null ? fiw.a() : null;
        if (fiw != null) {
            cls = fiw.a;
        }
        fja c = c();
        if ((c == null || !c.ac()) && !fix.a(a)) {
            String b = fix.b(a);
            if ((b != null && ("FEhistory".equals(b) || "FEmy_videos".equals(b) || "FEpurchases".equals(b) || b.indexOf("VL") == 0)) || cls == hrt.class || cls == hki.class) {
                this.s = 3;
                return;
            } else {
                this.s = 1;
                return;
            }
        }
        this.s = 2;
    }

    public final fag a() {
        if (b() != 3) {
            return this.d;
        }
        return this.t;
    }

    public final int b() {
        int i = this.s;
        if (i != 2) {
            if (i == 3) {
                return 3;
            }
        } else if (this.k != null) {
            return 2;
        }
        return 1;
    }

    public final faf a(faf faf) {
        View a = this.i.a(LayoutInflater.from(this.a));
        a((ImageView) a.findViewById(R.id.youtube_logo));
        this.i.a(a, this.n);
        faf.b = a;
        return faf;
    }

    public final void a(ImageView imageView) {
        Drawable a;
        String a2 = foh.a(this.w, this.a);
        if (this.r) {
            a = ra.a(this.a, (int) R.drawable.yt_icon_header);
        } else if (!this.q) {
            a = xwe.d(this.a, R.attr.ytWordmarkHeader);
        } else if (a2.equals(this.a.getString(R.string.unlimited_brand_name_red))) {
            a = ra.a(this.a, (int) R.drawable.ytr_wordmark_header);
        } else {
            a = xwe.d(this.a, R.attr.ytPremiumWordmarkHeader);
        }
        imageView.setImageDrawable(a);
        if (this.q) {
            imageView.setContentDescription(a2);
        }
    }

    public final fja c() {
        fja b = this.u.b();
        if (b != null) {
            if (this.v.r() && b.v()) {
                return b;
            }
            if (!this.v.r() && b.u()) {
                return b;
            }
        }
        return null;
    }
}
