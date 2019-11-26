package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahau */
final class ahau {
    public final Context a;
    public final aaas b;
    public final AlertDialog c;
    public final TextView d = ((TextView) this.i.findViewById(R.id.dialog_title));
    public final TextView e = ((TextView) this.i.findViewById(R.id.dialog_message));
    public acvx f;
    public aphg g;
    public aphg h;
    private final View i;

    ahau(Context context, Builder builder, aaas aaas) {
        this.a = context;
        this.b = aaas;
        this.i = LayoutInflater.from(context).inflate(R.layout.upsell_dialog, null);
        this.c = builder.setView(this.i).create();
    }
}
