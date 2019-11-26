package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iqk */
abstract class iqk implements akww {
    public final Activity n;
    public final LoadingFrameLayout o;
    public final acvx p;
    public final zyw q;
    public final zzl r;
    public apxu s;
    public ajzz t = null;
    public axny u;
    public atgy v;
    public Bundle w;
    public String x;
    public iqn y;
    public avjf z;

    public iqk(LoadingFrameLayout loadingFrameLayout, Activity activity, acvx acvx, zyw zyw, zzl zzl) {
        this.o = loadingFrameLayout;
        this.n = activity;
        this.p = acvx;
        this.q = zyw;
        this.r = zzl;
    }

    public final /* bridge */ /* synthetic */ akyd E_() {
        throw null;
    }

    public abstract void a(Configuration configuration);

    public void a(iqn iqn) {
        throw null;
    }

    public abstract void a(String str);

    public abstract void b();

    public abstract boolean c();

    public String e() {
        throw null;
    }

    public axny g() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A:{Catch:{ anyg -> 0x0047 }} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A:{Catch:{ anyg -> 0x0047 }} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    public void b(android.os.Bundle r6) {
        /*
        r5 = this;
        r0 = "innertube_search_filters";
        r1 = "navigation_endpoint";
        r1 = r6.getByteArray(r1);
        r2 = "searchbox_stats";
        r2 = r6.getByteArray(r2);
        r3 = 0;
        if (r1 == 0) goto L_0x0016;
    L_0x0011:
        r1 = defpackage.aaax.b(r1);
        goto L_0x0017;
    L_0x0016:
        r1 = r3;
    L_0x0017:
        r5.s = r1;
        if (r2 == 0) goto L_0x002e;
    L_0x001b:
        r1 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0028 }
        r4 = defpackage.atgy.s;	 Catch:{ anyg -> 0x0028 }
        r1 = defpackage.anxl.parseFrom(r4, r2, r1);	 Catch:{ anyg -> 0x0028 }
        r1 = (defpackage.atgy) r1;	 Catch:{ anyg -> 0x0028 }
        goto L_0x002f;
    L_0x0028:
        r1 = move-exception;
        r2 = "InvalidProtocolBufferNanoException: ";
        defpackage.xtl.a(r2, r1);
    L_0x002e:
        r1 = r3;
    L_0x002f:
        r5.v = r1;
        r1 = r6.containsKey(r0);	 Catch:{ anyg -> 0x0047 }
        if (r1 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0049;
    L_0x0038:
        r1 = defpackage.axny.b;	 Catch:{ anyg -> 0x0047 }
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0047 }
        r0 = defpackage.aobp.a(r6, r0, r1, r2);	 Catch:{ anyg -> 0x0047 }
        r0 = (defpackage.axny) r0;	 Catch:{ anyg -> 0x0047 }
        r5.u = r0;	 Catch:{ anyg -> 0x0047 }
        goto L_0x0049;
    L_0x0047:
        r5.u = r3;
    L_0x0049:
        r0 = "navigation_endpoint_interaction_logging_extension";
        r0 = r6.getByteArray(r0);
        if (r0 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0072;
    L_0x0052:
        r1 = defpackage.avjf.h;
        r1 = r1.createBuilder();
        r1 = (defpackage.avjh) r1;
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0071 }
        r0 = r1.mergeFrom(r0, r2);	 Catch:{ anyg -> 0x0071 }
        r0 = (defpackage.anvi) r0;	 Catch:{ anyg -> 0x0071 }
        r0 = (defpackage.avjh) r0;	 Catch:{ anyg -> 0x0071 }
        r0 = r0.build();	 Catch:{ anyg -> 0x0071 }
        r0 = (defpackage.anxl) r0;	 Catch:{ anyg -> 0x0071 }
        r0 = (defpackage.avjf) r0;	 Catch:{ anyg -> 0x0071 }
        r5.z = r0;	 Catch:{ anyg -> 0x0071 }
        goto L_0x0072;
    L_0x0072:
        r0 = r5.z;
        if (r0 == 0) goto L_0x00ae;
    L_0x0076:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.avjh) r0;
        r1 = defpackage.acwc.MOBILE_BACK_BUTTON;
        r1 = r1.dU;
        r0.a(r1);
        r1 = "clone_csn";
        r1 = r6.getString(r1);
        if (r1 == 0) goto L_0x0091;
    L_0x008d:
        r0.b(r1);
        goto L_0x00a4;
    L_0x0091:
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.avjf) r1;
        r2 = r1.a;
        r2 = r2 & -33;
        r1.a = r2;
        r2 = defpackage.avjf.h;
        r2 = r2.e;
        r1.e = r2;
    L_0x00a4:
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.avjf) r0;
        r5.z = r0;
    L_0x00ae:
        r0 = "instance_controller_state";
        r1 = r6.getBundle(r0);
        if (r1 == 0) goto L_0x00bc;
    L_0x00b6:
        r6 = r6.getBundle(r0);
        r5.w = r6;
    L_0x00bc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqk.b(android.os.Bundle):void");
    }

    public void a(String str, axny axny) {
        if (!axny.equals(this.u)) {
            this.u = axny;
            this.t = null;
            a(str);
        }
    }

    public void a(Bundle bundle) {
        axny axny = this.u;
        if (axny != null) {
            bundle.putParcelable("innertube_search_filters", aobp.a(axny));
        }
        atgy atgy = this.v;
        if (atgy != null) {
            bundle.putByteArray("searchbox_stats", atgy.toByteArray());
        }
        apxu apxu = this.s;
        if (apxu != null) {
            bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        }
        bundle.putString("clone_csn", this.p.d());
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        for (axnu axnu : this.u.a) {
            int i = 0;
            while (i < axnu.b.size()) {
                axnw axnw = (axnw) axnu.b.get(i);
                int a = axoa.a(axnw.c);
                if (a != 0 && a == 3 && (axnu.c || i != 0)) {
                    arrayList.add(axnw.d);
                }
                i++;
            }
        }
        return arrayList;
    }

    public iqm d() {
        iqm iqm = new iqm();
        iqm.a = this.t;
        iqm.b = this.w;
        return iqm;
    }

    public void a(akyd akyd) {
        if (akyd instanceof iqm) {
            iqm iqm = (iqm) akyd;
            this.t = iqm.a;
            this.w = iqm.b;
        }
    }
}
