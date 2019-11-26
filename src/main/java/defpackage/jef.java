package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: jef */
final /* synthetic */ class jef implements OnClickListener {
    private final jed a;
    private final aldg b;

    jef(jed jed, aldg aldg) {
        this.a = jed;
        this.b = aldg;
    }

    public final void onClick(View view) {
        jed jed = this.a;
        aldg aldg = this.b;
        axgk axgk = jed.d;
        if (axgk != null && aldg.c(axgk)) {
            axgq b = aldg.b(jed.d);
            AlertDialog alertDialog = null;
            View inflate = LayoutInflater.from(jed.a).inflate(R.layout.setting_boolean_select_range_dialog, null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dialog_title);
            arml arml = b.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.lower_bound_view_stub);
            ViewStub viewStub2 = (ViewStub) inflate.findViewById(R.id.upper_bound_view_stub);
            List a = jfe.a(b);
            if (a.size() == 2) {
                if (viewStub != null) {
                    jed.a(viewStub, (axha) a.get(0), true);
                }
                if (viewStub2 != null) {
                    jed.a(viewStub2, (axha) a.get(1), false);
                }
                Builder view2 = new Builder(jed.a).setNegativeButton(R.string.cancel, null).setView(inflate);
                view2.setPositiveButton(R.string.done, new jeo(jed, b));
                alertDialog = view2.create();
            }
            if (alertDialog != null) {
                alertDialog.show();
            }
        }
    }
}
