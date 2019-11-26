package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jeh */
final /* synthetic */ class jeh implements OnClickListener {
    private final jed a;
    private final axha b;
    private final List c;

    jeh(jed jed, axha axha, List list) {
        this.a = jed;
        this.b = axha;
        this.c = list;
    }

    public final void onClick(View view) {
        jed jed = this.a;
        axha axha = this.b;
        List list = this.c;
        Builder builder = new Builder(jed.a);
        builder.setCustomTitle(jfe.a(jed.a, axha));
        jfb jfb = new jfb(jed.a);
        jfb.a(jfe.a(jed.a, list));
        jfb.a(jfe.a(jed.a, list, jed.j));
        builder.setPositiveButton(R.string.done, new jek(jed, jfb));
        builder.setNegativeButton(R.string.cancel, jej.a);
        builder.setView(jfb);
        builder.create().show();
    }
}
