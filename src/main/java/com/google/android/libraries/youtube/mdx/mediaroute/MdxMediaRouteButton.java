package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.mediarouter.app.MediaRouteButton;
import defpackage.aajs;
import defpackage.aakj;
import defpackage.acwc;
import defpackage.adex;
import defpackage.adez;
import defpackage.adfh;
import defpackage.adgk;
import defpackage.adgl;
import defpackage.adgm;
import defpackage.aizy;
import defpackage.ajmq;
import defpackage.nn;
import defpackage.nt;
import defpackage.xak;
import defpackage.xcp;

public class MdxMediaRouteButton extends MediaRouteButton implements adez, xcp {
    public adgl c;
    public adfh d;
    private adgm e;

    public MdxMediaRouteButton(Context context) {
        super(context);
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(adgm adgm) {
        xak.a();
        this.e = adgm;
    }

    public final boolean performClick() {
        xak.a();
        adfh adfh = this.d;
        if (adfh != null) {
            adfh.a();
        }
        adgl adgl = this.c;
        if (adgl != null) {
            nt ntVar;
            Activity activity;
            Context context = getContext();
            while (true) {
                ntVar = null;
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity instanceof nn) {
                ntVar = ((nn) activity).f();
            }
            if (adgl.b) {
                ajmq p = ((aizy) adgl.a.get()).p();
                if (!(p == null || p.b() == null)) {
                    aakj b = p.b();
                    if (b.b().isEmpty() && b.l() != null) {
                        aajs aajs = b.c;
                        if (aajs != null && aajs.o()) {
                            new adgk().a(ntVar, "youtube.mdx.mediaroute.MdxSideloadedDialogFactory");
                            return true;
                        }
                    }
                }
            }
        }
        adgm adgm = this.e;
        if ((adgm == null || !adgm.a(getContext())) && !super.performClick()) {
            return false;
        }
        return true;
    }

    public final boolean performLongClick() {
        xak.a();
        adgm adgm = this.e;
        return (adgm != null && adgm.b(getContext())) || super.performLongClick();
    }

    public final acwc a() {
        xak.a();
        adgm adgm = this.e;
        return adgm != null ? adgm.a() : null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adex.class};
        } else if (i == 0) {
            super.performClick();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
