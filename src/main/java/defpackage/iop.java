package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

/* renamed from: iop */
public final /* synthetic */ class iop implements OnClickListener {
    private final NavigationDropdownView a;

    public iop(NavigationDropdownView navigationDropdownView) {
        this.a = navigationDropdownView;
    }

    public final void onClick(View view) {
        this.a.c(true);
    }
}
