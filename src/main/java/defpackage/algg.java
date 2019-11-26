package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: algg */
final class algg {
    public final View a;
    public final aloz b;
    public final EditText c;
    public final ImageView d;
    public final View e;
    public final /* synthetic */ alge f;

    algg(alge alge, View view) {
        this.f = alge;
        this.a = view;
        this.b = new aloz(alge.a, (ImageView) view.findViewById(R.id.sharer_thumbnail));
        this.c = (EditText) view.findViewById(R.id.message_input);
        this.d = (ImageView) view.findViewById(R.id.inline_send_button);
        this.e = view.findViewById(R.id.message_input_shadow);
        this.c.addTextChangedListener(new algl(this));
        this.c.setOnFocusChangeListener(new algj(this));
        this.d.setOnClickListener(new algi(this));
    }
}
