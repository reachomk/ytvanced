package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: absf */
public final class absf extends nd {
    public abbj Z;
    public Activity aa;
    public abxu ab;
    public View ac;
    public LinearLayout ad;
    private apxu ae;

    public final void a(Activity activity) {
        super.a(activity);
        this.aa = activity;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((absg) xse.a(this.aa)).a(this);
        if (this.ae == null) {
            bundle = this.j;
            if (bundle != null) {
                this.ae = aaax.b(bundle.getByteArray("navigation_endpoint"));
            } else {
                dismiss();
            }
        }
    }

    public final Dialog a(Bundle bundle) {
        View inflate = LayoutInflater.from(this.aa).inflate(R.layout.live_chat_item_context_menu_dialog, null);
        this.ac = inflate.findViewById(R.id.progress_bar);
        this.ad = (LinearLayout) inflate.findViewById(R.id.menu_container);
        abbj abbj = this.Z;
        abbj.g.a(abbj.a(this.ae), new abse(this));
        aeg aeg = new aeg(this.aa);
        aeg.a((int) R.string.live_chat_item_context_menu_title);
        aeg.a(inflate);
        aeg.a(true);
        return aeg.a();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!xss.b(this.aa) && configuration.orientation == 2) {
            dismiss();
        }
    }
}
