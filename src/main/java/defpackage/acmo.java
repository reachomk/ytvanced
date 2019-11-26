package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.io.File;
import java.util.Iterator;

/* renamed from: acmo */
public final class acmo extends nf implements acmm, ase, zpt {
    public File Z;
    public acmp a;
    private acmj aa;
    private MenuItem ab;
    public acvx b;
    public zpo c;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.lc_edit_thumbnail_fragment, viewGroup, false);
        ((acmq) xse.a(p())).a(this);
        this.b.a(acwl.T, null, null);
        if (bundle != null) {
            this.Z = (File) bundle.getSerializable("STATE_PREEXISTING_THUMBNAIL_FILE");
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.lc_crop_toolbar);
        toolbar.d((int) R.menu.lc_crop_toolbar_menu);
        toolbar.q = this;
        toolbar.a(new acmn(this));
        this.ab = toolbar.f().findItem(R.id.lc_crop_save_button);
        if (s().f().isEmpty()) {
            X();
        } else {
            Iterator it = s().f().iterator();
            Object next = it.next();
            if (it.hasNext()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected one element but was: <");
                stringBuilder.append(next);
                while (i < 4 && it.hasNext()) {
                    stringBuilder.append(", ");
                    stringBuilder.append(it.next());
                    i++;
                }
                if (it.hasNext()) {
                    stringBuilder.append(", ...");
                }
                stringBuilder.append('>');
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            nf nfVar = (nf) next;
            if (nfVar instanceof zpo) {
                this.c = (zpo) nfVar;
                X();
            } else if (nfVar instanceof acmj) {
                this.aa = (acmj) nfVar;
                Y();
            }
        }
        return inflate;
    }

    public final void e(Bundle bundle) {
        bundle.putSerializable("STATE_PREEXISTING_THUMBNAIL_FILE", this.Z);
    }

    public final void f() {
        acmj acmj = this.aa;
        if (acmj == null || !acmj.v()) {
            acmp acmp = this.a;
            if (acmp != null) {
                acmp.E();
                return;
            }
            return;
        }
        X();
    }

    public final void W() {
        amqw.a(this.c);
        File file = this.Z;
        zix zix = null;
        if (file != null && file.exists()) {
            zix = zix.i().a(2).a(a((int) R.string.lc_crop_image_preexisting_thumbnail_cd)).b(this.Z.getParent()).a(Uri.fromFile(this.Z)).b(this.Z.length()).c(0).d(Long.MAX_VALUE).b();
        }
        zpo zpo = this.c;
        zpo.ab = zix;
        if (zpo.b != null) {
            zpo.f();
        }
    }

    private final void X() {
        if (this.c == null) {
            this.c = zpo.d(1);
        }
        this.c.c = this;
        W();
        b(this.c);
        this.ab.setEnabled(false);
        this.ab.setVisible(false);
    }

    private final void Y() {
        ((acmj) amqw.a(this.aa)).a = this;
        b(this.aa);
        this.ab.setEnabled(true);
        this.ab.setVisible(true);
    }

    private final void b(nf nfVar) {
        amqw.a((Object) nfVar);
        or a = s().a();
        a.b(R.id.edit_thumbnail_fragment_container, nfVar);
        a.a();
    }

    public final void B() {
        super.B();
        aclo.b(p());
    }

    public final void a(zix zix) {
        Uri b = zix.b();
        acmj acmj = new acmj();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_INPUT_IMAGE", b);
        acmj.f(bundle);
        this.aa = acmj;
        Y();
    }

    public final void a() {
        X();
        xpr.a(p(), (int) R.string.lc_image_load_error, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5 A:{Catch:{ IOException -> 0x010e }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1 A:{Catch:{ IOException -> 0x010e }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A:{Catch:{ IOException -> 0x010e }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6 A:{Catch:{ IOException -> 0x010e }} */
    public final boolean a(android.view.MenuItem r13) {
        /*
        r12 = this;
        r13 = (defpackage.aja) r13;
        r13 = r13.a;
        r0 = 0;
        r1 = 2131758847; // 0x7f100eff float:1.914867E38 double:1.0532288115E-314;
        if (r13 != r1) goto L_0x0119;
    L_0x000a:
        r13 = r12.a;
        r1 = 1;
        if (r13 == 0) goto L_0x0118;
    L_0x000f:
        r2 = r12.aa;	 Catch:{ IOException -> 0x010e }
        r2 = r2.b;	 Catch:{ IOException -> 0x010e }
        r3 = r2.a;	 Catch:{ IOException -> 0x010e }
        if (r3 == 0) goto L_0x0019;
    L_0x0017:
        r3 = 1;
        goto L_0x001a;
    L_0x0019:
        r3 = 0;
    L_0x001a:
        defpackage.amqw.b(r3);	 Catch:{ IOException -> 0x010e }
        r3 = r2.a();	 Catch:{ IOException -> 0x010e }
        r4 = r3.width();	 Catch:{ IOException -> 0x010e }
        r5 = r3.height();	 Catch:{ IOException -> 0x010e }
        r6 = r2.f;	 Catch:{ IOException -> 0x010e }
        r6 = r6.first;	 Catch:{ IOException -> 0x010e }
        r6 = (java.lang.Integer) r6;	 Catch:{ IOException -> 0x010e }
        r6 = r6.intValue();	 Catch:{ IOException -> 0x010e }
        if (r4 > r6) goto L_0x006f;
    L_0x0035:
        r6 = r2.f;	 Catch:{ IOException -> 0x010e }
        r6 = r6.second;	 Catch:{ IOException -> 0x010e }
        r6 = (java.lang.Integer) r6;	 Catch:{ IOException -> 0x010e }
        r6 = r6.intValue();	 Catch:{ IOException -> 0x010e }
        if (r5 <= r6) goto L_0x0042;
    L_0x0041:
        goto L_0x006f;
    L_0x0042:
        r6 = r2.d;	 Catch:{ IOException -> 0x010e }
        if (r6 <= 0) goto L_0x0083;
    L_0x0046:
        r7 = r2.e;	 Catch:{ IOException -> 0x010e }
        if (r7 <= 0) goto L_0x0083;
    L_0x004a:
        r7 = r4 - r6;
        r7 = (double) r7;
        r9 = (double) r6;
        java.lang.Double.isNaN(r7);
        java.lang.Double.isNaN(r9);
        r7 = r7 / r9;
        r6 = java.lang.Math.abs(r7);	 Catch:{ IOException -> 0x010e }
        r8 = r2.d;	 Catch:{ IOException -> 0x010e }
        if (r8 > r4) goto L_0x006b;
    L_0x005d:
        r9 = r2.e;	 Catch:{ IOException -> 0x010e }
        if (r9 > r5) goto L_0x006b;
    L_0x0061:
        r9 = 4581421828802609152; // 0x3f947ae140000000 float:2.0 double:0.019999999552965164;
        r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r11 <= 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0083;
    L_0x006b:
        r5 = r2.e;	 Catch:{ IOException -> 0x010e }
        r4 = r8;
        goto L_0x0083;
    L_0x006f:
        r4 = r2.f;	 Catch:{ IOException -> 0x010e }
        r4 = r4.first;	 Catch:{ IOException -> 0x010e }
        r4 = (java.lang.Integer) r4;	 Catch:{ IOException -> 0x010e }
        r4 = r4.intValue();	 Catch:{ IOException -> 0x010e }
        r5 = r2.f;	 Catch:{ IOException -> 0x010e }
        r5 = r5.second;	 Catch:{ IOException -> 0x010e }
        r5 = (java.lang.Integer) r5;	 Catch:{ IOException -> 0x010e }
        r5 = r5.intValue();	 Catch:{ IOException -> 0x010e }
    L_0x0083:
        r6 = r2.b;	 Catch:{ IOException -> 0x010e }
        r6 = r6 * r5;
        r7 = r2.c;	 Catch:{ IOException -> 0x010e }
        r6 = r6 / r7;
        r4 = java.lang.Math.min(r4, r6);	 Catch:{ IOException -> 0x010e }
        r6 = r2.c;	 Catch:{ IOException -> 0x010e }
        r4 = r4 * r6;
        r6 = r2.b;	 Catch:{ IOException -> 0x010e }
        r4 = r4 / r6;
        r4 = java.lang.Math.min(r5, r4);	 Catch:{ IOException -> 0x010e }
        r5 = r2.b;	 Catch:{ IOException -> 0x010e }
        r6 = r2.c;	 Catch:{ IOException -> 0x010e }
        r5 = r5 * r4;
        r5 = r5 / r6;
        r6 = r3.left;	 Catch:{ IOException -> 0x010e }
        r7 = r3.top;	 Catch:{ IOException -> 0x010e }
        r8 = r3.left;	 Catch:{ IOException -> 0x010e }
        r8 = r8 + r5;
        r5 = r3.top;	 Catch:{ IOException -> 0x010e }
        r5 = r5 + r4;
        r3.set(r6, r7, r8, r5);	 Catch:{ IOException -> 0x010e }
        r4 = r3.left;	 Catch:{ IOException -> 0x010e }
        if (r4 >= 0) goto L_0x00b5;
    L_0x00b1:
        r4 = r3.left;	 Catch:{ IOException -> 0x010e }
        r4 = -r4;
        goto L_0x00d2;
    L_0x00b5:
        r4 = r3.right;	 Catch:{ IOException -> 0x010e }
        r5 = r2.f;	 Catch:{ IOException -> 0x010e }
        r5 = r5.first;	 Catch:{ IOException -> 0x010e }
        r5 = (java.lang.Integer) r5;	 Catch:{ IOException -> 0x010e }
        r5 = r5.intValue();	 Catch:{ IOException -> 0x010e }
        if (r4 <= r5) goto L_0x00d1;
    L_0x00c3:
        r4 = r2.f;	 Catch:{ IOException -> 0x010e }
        r4 = r4.first;	 Catch:{ IOException -> 0x010e }
        r4 = (java.lang.Integer) r4;	 Catch:{ IOException -> 0x010e }
        r4 = r4.intValue();	 Catch:{ IOException -> 0x010e }
        r5 = r3.right;	 Catch:{ IOException -> 0x010e }
        r4 = r4 - r5;
        goto L_0x00d2;
    L_0x00d1:
        r4 = 0;
    L_0x00d2:
        r5 = r3.top;	 Catch:{ IOException -> 0x010e }
        if (r5 >= 0) goto L_0x00da;
    L_0x00d6:
        r0 = r3.top;	 Catch:{ IOException -> 0x010e }
        r0 = -r0;
        goto L_0x00f5;
    L_0x00da:
        r5 = r3.bottom;	 Catch:{ IOException -> 0x010e }
        r6 = r2.f;	 Catch:{ IOException -> 0x010e }
        r6 = r6.second;	 Catch:{ IOException -> 0x010e }
        r6 = (java.lang.Integer) r6;	 Catch:{ IOException -> 0x010e }
        r6 = r6.intValue();	 Catch:{ IOException -> 0x010e }
        if (r5 <= r6) goto L_0x00f5;
    L_0x00e8:
        r0 = r2.f;	 Catch:{ IOException -> 0x010e }
        r0 = r0.second;	 Catch:{ IOException -> 0x010e }
        r0 = (java.lang.Integer) r0;	 Catch:{ IOException -> 0x010e }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x010e }
        r5 = r3.bottom;	 Catch:{ IOException -> 0x010e }
        r0 = r0 - r5;
    L_0x00f5:
        r3.offset(r4, r0);	 Catch:{ IOException -> 0x010e }
        r0 = r2.getContext();	 Catch:{ IOException -> 0x010e }
        r0 = r0.getContentResolver();	 Catch:{ IOException -> 0x010e }
        r4 = r2.a;	 Catch:{ IOException -> 0x010e }
        r5 = r2.d;	 Catch:{ IOException -> 0x010e }
        r2 = r2.e;	 Catch:{ IOException -> 0x010e }
        r0 = defpackage.akkv.a(r0, r4, r3, r5, r2);	 Catch:{ IOException -> 0x010e }
        r13.a(r0);	 Catch:{ IOException -> 0x010e }
        goto L_0x0118;
    L_0x010e:
        r13 = r12.p();
        r0 = 2131952589; // 0x7f1303cd float:1.9541625E38 double:1.053324533E-314;
        defpackage.xpr.a(r13, r0, r1);
    L_0x0118:
        return r1;
    L_0x0119:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmo.a(android.view.MenuItem):boolean");
    }
}
