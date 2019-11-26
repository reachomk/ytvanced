package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;

/* renamed from: uut */
public final class uut extends uul {
    public uuu b;
    public uvm c;
    public uur d;
    public uvd e;
    public uvp f;
    public acwa g;
    private FrameLayout h;
    private akpb i;
    private akor j;
    private boolean k = true;
    private boolean l;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        ((uux) xse.a(getActivity())).a(this);
        aknw aknw = new aknw();
        aknw.a(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, new uuw(this));
        aknw.a(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, new uuv(this));
        aknw.a(uvl.class, new uuy(this));
        this.i = aknw;
        this.j = new akor();
        this.j.a(this.g.t());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            this.h = new FrameLayout(getActivity());
            this.h.setLayoutParams(new LayoutParams(-2, -2));
        } else if (frameLayout.getParent() != null) {
            ((ViewGroup) this.h.getParent()).removeView(this.h);
        }
        return this.h;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.l = true;
    }

    public final void onDestroyView() {
        if (this.l) {
            Dialog dialog = this.a;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.l = false;
            }
        }
        super.onDestroyView();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.k) {
            this.b.a(5);
        }
        this.f.b();
    }

    public final void b() {
        this.k = false;
        a();
    }

    public final void c() {
        if (this.h.getChildCount() > 0) {
            View childAt = this.h.getChildAt(0);
            this.h.removeAllViews();
            this.i.a(childAt);
        }
    }

    public final void a(Object obj) {
        akot a = akoz.a(this.i, obj, this.h);
        a.a_(this.j, obj);
        akoz.a(a.K_(), a, this.i.a(obj));
        this.h.addView(a.K_());
    }

    static {
        uut.class.getCanonicalName();
    }
}
