package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;

/* renamed from: zfp */
public final class zfp extends nf {
    public akkl a;
    public zen b;
    private zfw c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((zfs) xse.a(M_())).a(this);
        if (bundle != null) {
            this.b = (zen) bundle.getParcelable("category_selection");
        }
        this.c = new zfw(p(), this.b.b, this.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.audio_swap_category_selection_view, viewGroup, false);
        ((GridView) inflate.findViewById(R.id.audio_swap_category_selection_view)).setAdapter((ListAdapter) amqw.a(this.c));
        return inflate;
    }

    public final void e(Bundle bundle) {
        bundle.putParcelable("category_selection", this.b);
    }
}
