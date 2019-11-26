package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: alkb */
public final class alkb extends nd {
    public xwb Z;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((alkd) xse.a(p())).a(this);
        a(2, this.Z.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.scan_code, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.a(new alka(this));
        toolbar.c((int) R.string.accessibility_back);
        return inflate;
    }
}
