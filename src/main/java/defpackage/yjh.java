package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: yjh */
public final class yjh extends fi {
    public yoo Z;
    public boolean aa;
    private yoh ab;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((yjm) xse.a(p())).a(new yjl()).a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.chat_message_bottom_sheet, viewGroup, false);
        yoo yoo = this.Z;
        this.ab = new yoh((Context) yoo.a((Context) yoo.a.get(), 1), (ywk) yoo.a((ywk) yoo.b.get(), 2), (xoi) yoo.a((xoi) yoo.c.get(), 3), (Handler) yoo.a((Handler) yoo.d.get(), 4), (yol) yoo.a(new yjk(this), 5), (String) yoo.a(this.j.getString("key"), 6), (yxf) yoo.a(new yxf(inflate), 7));
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        this.ab.bk_();
    }

    public final void i() {
        super.i();
        this.ab.bl_();
        this.ab = null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.aa = true;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aa = true;
    }
}
