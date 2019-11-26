package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kdd */
final class kdd extends aaj {
    kdd() {
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        view = (TextView) view.findViewById(R.id.title);
        aca.b(view.getText());
        abe.b(view, 2);
    }
}
