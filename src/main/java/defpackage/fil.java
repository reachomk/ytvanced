package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: fil */
public final class fil extends fja {
    public static boolean a(fiw fiw) {
        return fiw.a == fil.class;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((fin) xse.a(p())).a(this);
        View inflate = layoutInflater.inflate(R.layout.startup_loading_view, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progressbar);
        findViewById.postDelayed(new fio(findViewById), 1000);
        return inflate;
    }
}
