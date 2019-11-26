package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iuy */
final class iuy extends aaj {
    iuy() {
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        view = (TextView) view.findViewById(R.id.title);
        aca.b(view.getText());
        abe.b(view, 2);
    }
}
