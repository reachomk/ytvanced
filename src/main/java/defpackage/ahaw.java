package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahaw */
final class ahaw {
    public final Context a;
    public final AlertDialog b;
    public final TextView c = ((TextView) this.h.findViewById(R.id.dialog_title));
    public final TextView d = ((TextView) this.h.findViewById(R.id.dialog_message));
    public final ImageView e = ((ImageView) this.h.findViewById(R.id.icon));
    public final View f = this.h.findViewById(R.id.dialog_header);
    public final View g = this.h.findViewById(R.id.content_separator);
    private final View h;

    ahaw(Context context, Builder builder) {
        this.a = context;
        this.h = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, null);
        this.b = builder.setView(this.h).create();
    }

    public final void a() {
        if (this.b.isShowing()) {
            this.b.dismiss();
        }
    }
}
