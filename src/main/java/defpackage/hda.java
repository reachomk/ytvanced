package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: hda */
public final class hda extends nd implements OnClickListener {
    public aeag Z;
    public acvx aa;
    public aeab ab;
    private boolean ac = true;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((hcz) xse.a(p())).a(this);
        this.aa.a(acwl.x, apxu.d, null);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_assisted_tv_sign_in_dialog, viewGroup, false);
        inflate.findViewById(R.id.sign_in_button).setOnClickListener(this);
        inflate.findViewById(R.id.floaty_close_button).setOnClickListener(this);
        this.aa.b(acwc.MDX_ASSISTED_TV_SIGN_IN_DIALOG, null);
        this.aa.b(acwc.MDX_ASSISTED_TV_SIGN_IN_DIALOG_SIGN_IN_BUTTON, null);
        this.aa.b(acwc.MDX_ASSISTED_TV_SIGN_IN_DIALOG_CANCEL_BUTTON, null);
        return inflate;
    }

    public final void W_() {
        super.W_();
        this.c.getWindow().setLayout(q().getDimensionPixelSize(R.dimen.mdx_assisted_tv_sign_in_dialog_width), -2);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ac) {
            aeal aeal = this.Z.d;
            if (!(aeal == null || aeal.c.isEmpty())) {
                this.ab.a(this.Z.d.c, "canceled");
            }
            this.Z.a();
        }
        this.ac = true;
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.sign_in_button) {
            this.aa.a(3, new acvs(acwc.MDX_ASSISTED_TV_SIGN_IN_DIALOG_SIGN_IN_BUTTON), null);
            aeal aeal = this.Z.d;
            if (!(aeal == null || aeal.c.isEmpty())) {
                this.ac = false;
                this.Z.b();
            }
            f();
        } else if (id == R.id.floaty_close_button) {
            this.aa.a(3, new acvs(acwc.MDX_ASSISTED_TV_SIGN_IN_DIALOG_CANCEL_BUTTON), null);
            this.ac = true;
            f();
        }
    }

    static {
        hda.class.getSimpleName();
    }
}
