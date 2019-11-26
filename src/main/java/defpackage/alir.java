package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: alir */
public abstract class alir extends nd implements alpo {
    private View Z;
    private View aa;
    private View ab;
    public aleg ae;

    public abstract int W();

    public abstract aleg a(alpo alpo, alel alel);

    public abstract void a(alei alei);

    /* Access modifiers changed, original: protected */
    public void a(Object obj) {
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.getWindow().requestFeature(1);
        boolean z = false;
        View inflate = layoutInflater.inflate(W(), viewGroup, false);
        this.Z = inflate.findViewById(R.id.tristate_contents);
        this.aa = inflate.findViewById(R.id.tristate_loading);
        this.ab = inflate.findViewById(R.id.tristate_error);
        if (!(this.Z == null || this.aa == null || this.ab == null)) {
            z = true;
        }
        amqw.b(z);
        this.Z.setVisibility(4);
        this.aa.setVisibility(4);
        this.ab.setVisibility(4);
        this.ae = a((alpo) this, new aliq(this));
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        this.ae.a();
    }

    public final void i() {
        super.i();
        this.ae.b();
    }

    public final void a(Object obj, int i) {
        boolean z = true;
        if (i == 1) {
            this.Z.setVisibility(4);
            this.aa.setVisibility(0);
            this.ab.setVisibility(4);
        } else if (i != 2) {
            this.Z.setVisibility(4);
            this.aa.setVisibility(4);
            this.ab.setVisibility(0);
        } else {
            if (obj == null) {
                z = false;
            }
            amqw.a(z);
            this.Z.setVisibility(0);
            this.aa.setVisibility(4);
            this.ab.setVisibility(4);
            a(obj);
        }
    }
}
