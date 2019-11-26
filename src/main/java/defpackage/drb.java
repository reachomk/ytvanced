package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: drb */
public final class drb implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.name));

    public drb(Context context, uyd uyd) {
        this.a = LayoutInflater.from(context).inflate(R.layout.add_account_item, null);
        amqw.a((Object) uyd);
        this.a.setOnClickListener(new dra(uyd));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.b.setText(R.string.account_switcher_add_account);
    }
}
