package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: yjo */
public final class yjo extends fi {
    public akkq Z;
    public yrq aa;
    public boolean ab;
    private yrk ac;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((yjp) xse.a(p())).a(new yjs()).a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_bottom_sheet, viewGroup, false);
        yrq yrq = this.aa;
        yrk yrk = r7;
        yrk yrk2 = new yrk((Context) yrq.a((Context) yrq.a.get(), 1), (ywk) yrq.a((ywk) yrq.b.get(), 2), (xoi) yrq.a((xoi) yrq.c.get(), 3), (Handler) yrq.a((Handler) yrq.d.get(), 4), (yrn) yrq.a(new yjn(this), 5), (String) yrq.a(this.j.getString("key"), 6), (yyp) yrq.a(new yyp(inflate, this.Z), 7), (yyi) yrq.a(new yyi(), 8));
        this.ac = yrk;
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        this.ac.bk_();
    }

    public final void i() {
        super.i();
        this.ac.bl_();
        this.ac = null;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.ab = true;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ab = true;
    }
}
