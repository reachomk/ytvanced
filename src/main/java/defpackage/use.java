package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;

/* renamed from: use */
final class use implements OnClickListener {
    private final /* synthetic */ Spinner a;

    use(Spinner spinner) {
        this.a = spinner;
    }

    public final void onClick(View view) {
        this.a.performClick();
    }
}
