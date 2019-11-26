package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: euw */
public final class euw extends nd implements DialogInterface {
    public aldn Z;
    private aldj aa;
    private aldm ab;

    public final void cancel() {
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((euv) xse.a(p())).a(this);
        j(null);
        aldm aldm = this.ab;
        if (aldm == null) {
            dismiss();
            return;
        }
        aldn aldn = this.Z;
        this.aa = new aldj((Context) aldn.a((Context) aldn.a.get(), 1), (aaas) aldn.a((aaas) aldn.b.get(), 2), (aldt) aldn.a((aldt) aldn.c.get(), 3), (aldx) aldn.a((aldx) aldn.d.get(), 4), (akpe) aldn.a((akpe) aldn.e.get(), 5), (DialogInterface) aldn.a(this, 6), (aldm) aldn.a(aldm, 7));
    }

    public final Dialog a(Bundle bundle) {
        j(bundle);
        Builder builder = new Builder(p());
        aldj aldj = this.aa;
        int i = 0;
        if (aldj == null) {
            xpr.a(p(), (int) R.string.common_error_generic, 0);
            dismiss();
            return builder.create();
        }
        if (aldj.h != null) {
            CharSequence charSequence;
            CharSequence charSequence2;
            aldj.i = LayoutInflater.from(aldj.a).inflate(R.layout.subscription_notification_options_fragment, null, false);
            akph akph = new akph();
            RecyclerView recyclerView = (RecyclerView) aldj.i.findViewById(R.id.options_list);
            akph.a(axxt.class, aldj.e);
            aldj.j = aldj.g.a(akph);
            aldj.j.a(aldj.d);
            recyclerView.a(aldj.j);
            Context context = aldj.a;
            recyclerView.a(new aldk());
            aldj.k = new akpk();
            aldj.j.a(aldj.k);
            aldj.m = aldj.i.findViewById(R.id.divider);
            aldj.n = (RecyclerView) aldj.i.findViewById(R.id.secondary_options_list);
            recyclerView = aldj.n;
            akph.a(axxv.class, aldj.f);
            apa a = aldj.g.a(akph);
            recyclerView.a(a);
            context = aldj.a;
            recyclerView.a(new aldk());
            aldj.l = new akpk();
            a.a(aldj.l);
            a.a(aldj.d);
            for (Object add : aldj.h.c()) {
                aldj.k.add(add);
            }
            int i2 = aldj.h.a.c.size() != 0 ? 0 : 8;
            aldj.m.setVisibility(i2);
            aldj.n.setVisibility(i2);
            axxv[] d = aldj.h.d();
            int length = d.length;
            while (i < length) {
                aldj.l.add(d[i]);
                i++;
            }
            View view = aldj.i;
            aldm aldm = aldj.h;
            aodx aodx = aldm.a.j;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) == 0) {
                charSequence = null;
            } else {
                aodx aodx2 = aldm.a.j;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv = aodx2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                charSequence = aodv.b;
            }
            view.setContentDescription(charSequence);
            view = aldj.i;
            aldj.a();
            builder.setView(aldj.i);
            axxl axxl = aldj.h.a;
            if (axxl == null) {
                charSequence2 = null;
            } else {
                arml arml;
                if ((axxl.a & 8) != 0) {
                    arml = axxl.e;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                charSequence2 = ajqy.a(arml);
            }
            builder.setTitle(charSequence2);
            if (aldj.h.a() != null) {
                builder.setPositiveButton(aldj.h.a(), new aldl(aldj));
            }
            if (aldj.h.b() != null) {
                builder.setNegativeButton(aldj.h.b(), null);
            }
        }
        return builder.create();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        aldm aldm = this.ab;
        bundle.putByteArray("primary", aldm.d.toByteArray());
        bundle.putStringArrayList("secondary", new ArrayList(aldm.e));
        bundle.putByteArray("initial_primary", aldm.b.toByteArray());
        bundle.putStringArrayList("initial_secondary", new ArrayList(aldm.c));
        axxt axxt = aldm.f;
        if (axxt != null) {
            bundle.putByteArray("optimistic_primary", axxt.toByteArray());
        }
        Set set = aldm.g;
        if (set != null) {
            bundle.putStringArrayList("optimistic_secondary", new ArrayList(set));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.aa.a();
    }

    /* JADX WARNING: Missing block: B:43:0x00e5, code skipped:
            if (r11 == null) goto L_0x00e7;
     */
    private final void j(android.os.Bundle r11) {
        /*
        r10 = this;
        r0 = "optimistic_secondary";
        r1 = "optimistic_primary";
        r2 = r10.j;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r2 == 0) goto L_0x0112;
    L_0x0008:
        r3 = new aldm;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r4 = r3.a;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r4 != 0) goto L_0x002b;
    L_0x0011:
        r4 = "model";
        r2 = r2.getByteArray(r4);	 Catch:{ anyg -> 0x010a }
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x010a }
        r5 = defpackage.axxl.k;	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.anxl.parseFrom(r5, r2, r4);	 Catch:{ anyg -> 0x010a }
        r2 = (defpackage.axxl) r2;	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.amqw.a(r2);	 Catch:{ anyg -> 0x010a }
        r2 = (defpackage.axxl) r2;	 Catch:{ anyg -> 0x010a }
        r3.a = r2;	 Catch:{ anyg -> 0x010a }
    L_0x002b:
        if (r11 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x009c;
    L_0x002e:
        r2 = new java.util.HashSet;	 Catch:{ anyg -> 0x010a }
        r2.<init>();	 Catch:{ anyg -> 0x010a }
        r3.e = r2;	 Catch:{ anyg -> 0x010a }
        r2 = "primary";
        r2 = r11.getByteArray(r2);	 Catch:{ anyg -> 0x010a }
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x010a }
        r5 = defpackage.axxt.i;	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.anxl.parseFrom(r5, r2, r4);	 Catch:{ anyg -> 0x010a }
        r2 = (defpackage.axxt) r2;	 Catch:{ anyg -> 0x010a }
        r3.d = r2;	 Catch:{ anyg -> 0x010a }
        r2 = r3.e;	 Catch:{ anyg -> 0x010a }
        r4 = "secondary";
        r4 = r11.getStringArrayList(r4);	 Catch:{ anyg -> 0x010a }
        r2.addAll(r4);	 Catch:{ anyg -> 0x010a }
        r2 = "initial_primary";
        r2 = r11.getByteArray(r2);	 Catch:{ anyg -> 0x010a }
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x010a }
        r5 = defpackage.axxt.i;	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.anxl.parseFrom(r5, r2, r4);	 Catch:{ anyg -> 0x010a }
        r2 = (defpackage.axxt) r2;	 Catch:{ anyg -> 0x010a }
        r3.b = r2;	 Catch:{ anyg -> 0x010a }
        r2 = "initial_secondary";
        r2 = r11.getStringArrayList(r2);	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.amuw.a(r2);	 Catch:{ anyg -> 0x010a }
        r3.c = r2;	 Catch:{ anyg -> 0x010a }
        r2 = r11.containsKey(r1);	 Catch:{ anyg -> 0x010a }
        if (r2 == 0) goto L_0x008c;
    L_0x007a:
        r1 = r11.getByteArray(r1);	 Catch:{ anyg -> 0x010a }
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x010a }
        r4 = defpackage.axxt.i;	 Catch:{ anyg -> 0x010a }
        r1 = defpackage.anxl.parseFrom(r4, r1, r2);	 Catch:{ anyg -> 0x010a }
        r1 = (defpackage.axxt) r1;	 Catch:{ anyg -> 0x010a }
        r3.f = r1;	 Catch:{ anyg -> 0x010a }
    L_0x008c:
        r1 = r11.containsKey(r0);	 Catch:{ anyg -> 0x010a }
        if (r1 == 0) goto L_0x009c;
    L_0x0092:
        r0 = r11.getStringArrayList(r0);	 Catch:{ anyg -> 0x010a }
        r0 = defpackage.amuw.a(r0);	 Catch:{ anyg -> 0x010a }
        r3.g = r0;	 Catch:{ anyg -> 0x010a }
    L_0x009c:
        r0 = r3.c();	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r1 = r0.length;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r2 = 0;
        r4 = 0;
    L_0x00a3:
        if (r4 >= r1) goto L_0x00b3;
    L_0x00a5:
        r5 = r0[r4];	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r11 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00b0;
    L_0x00aa:
        r6 = r5.e;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r6 == 0) goto L_0x00b0;
    L_0x00ae:
        r3.d = r5;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00b0:
        r4 = r4 + 1;
        goto L_0x00a3;
    L_0x00b3:
        r0 = r3.d;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r0 == 0) goto L_0x0102;
    L_0x00b7:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r0 != 0) goto L_0x00c2;
    L_0x00bb:
        r0 = new java.util.HashSet;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r3.e = r0;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00c2:
        r0 = r3.d();	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r1 = r0.length;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00c7:
        if (r2 >= r1) goto L_0x00e0;
    L_0x00c9:
        r4 = r0[r2];	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r11 == 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00dd;
    L_0x00ce:
        r5 = r4.e;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r7 = 1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x00dd;
    L_0x00d6:
        r5 = r3.e;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r4 = r4.f;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r5.add(r4);	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00dd:
        r2 = r2 + 1;
        goto L_0x00c7;
    L_0x00e0:
        r0 = r3.b;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r0 != 0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e7;
    L_0x00e5:
        if (r11 != 0) goto L_0x00eb;
    L_0x00e7:
        r11 = r3.d;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r3.b = r11;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00eb:
        r11 = r3.c;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        if (r11 != 0) goto L_0x00f7;
    L_0x00ef:
        r11 = r3.e;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r11 = defpackage.amuw.a(r11);	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r3.c = r11;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x00f7:
        r10.ab = r3;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r11 = r10.aa;
        if (r11 == 0) goto L_0x0101;
    L_0x00fd:
        r0 = r10.ab;
        r11.h = r0;
    L_0x0101:
        return;
    L_0x0102:
        r11 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r0 = "SubscriptionNotificationOptionsRenderer does not have a currently selected option.";
        r11.<init>(r0);	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        throw r11;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x010a:
        r11 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r0 = "SubscriptionNotificationOptionsDialogModel was not able to be built correctly.";
        r11.<init>(r0);	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        throw r11;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x0112:
        r11 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        r0 = "SubscriptionNotificationOptionsRenderer or Bundle containing renderer not provided.";
        r11.<init>(r0);	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
        throw r11;	 Catch:{ IllegalStateException -> 0x011e, IllegalArgumentException -> 0x011a }
    L_0x011a:
        r10.dismiss();
        return;
    L_0x011e:
        r10.dismiss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euw.j(android.os.Bundle):void");
    }
}
