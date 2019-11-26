package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abxg */
public final class abxg {
    public final abru a;
    public boolean b;
    public final View c;
    public final TextView d = ((TextView) this.c.findViewById(R.id.message));
    public final TextView e = ((TextView) this.c.findViewById(R.id.sub_message));

    public abxg(abru abru, View view) {
        this.a = abru;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.empty_state_message_stub);
        viewStub.setLayoutResource(abru.a(7));
        viewStub.inflate();
        this.c = view.findViewById(R.id.empty_state_message);
    }

    public final void a(boolean z) {
        View view = this.c;
        int i = 8;
        if (this.b && z) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
