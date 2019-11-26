package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: absj */
public final class absj extends nd implements abrt {
    public abrq Z;
    public abrf aa;
    private Activity ab;
    private int ac;

    public static absj a(apxu apxu, abrc abrc) {
        absj absj = new absj();
        absj.f(absj.b(apxu, abrc));
        return absj;
    }

    public final void a(Activity activity) {
        super.a(activity);
        this.ab = activity;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((absl) xse.a(this.ab)).a(this);
        a(1, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.live_chat_purchase_dialog, viewGroup);
        inflate.setOnClickListener(new absi(this));
        j(this.j);
        return inflate;
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.requestWindowFeature(1);
        if (a.getWindow() != null) {
            a.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return a;
    }

    public final void W_() {
        super.W_();
        W();
        this.Z.a(this);
        Window window = this.ab.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                this.ac = attributes.softInputMode;
            }
        }
        d(32);
    }

    public final void N_() {
        super.N_();
        this.Z.b(this);
        this.aa.a();
        d(this.ac);
    }

    public final void a() {
        W();
    }

    public final void j(Bundle bundle) {
        nt s = s();
        String str;
        or a;
        if (bundle.get("picker_panel") != null) {
            str = "purchase_menu_fragment";
            if (s.a(str) == null) {
                a = s.a();
                abso abso = new abso();
                abso.f(bundle);
                a.b(R.id.content_container, abso, str).a();
                s.b();
            }
        } else if (bundle.get("navigation_endpoint") != null) {
            str = "purchase_flow_fragment";
            if (s.a(str) == null) {
                a = s.a();
                absk absk = new absk();
                absk.f(bundle);
                a.b(R.id.content_container, absk, str).f().a();
                s.b();
            }
        }
    }

    public static Bundle b(apxu apxu, abrc abrc) {
        Bundle bundle = new Bundle();
        if (apxu != null) {
            bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        }
        if (abrc != null) {
            bundle.putParcelable("picker_panel", abrc);
        }
        return bundle;
    }

    private final void W() {
        Window window = this.c.getWindow();
        if (window != null) {
            window.setLayout(this.Z.a, -2);
            window.setGravity(this.Z.b);
        }
    }

    private final void d(int i) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(i);
            }
        }
    }
}
