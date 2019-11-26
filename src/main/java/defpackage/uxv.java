package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: uxv */
public final class uxv implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.name));
    private final ImageView c = ((ImageView) this.a.findViewById(R.id.thumbnail));

    public uxv(Context context, uyd uyd) {
        this.a = LayoutInflater.from(context).inflate(R.layout.manage_account_item, null);
        this.a.findViewById(R.id.byline).setVisibility(8);
        amqw.a((Object) uyd);
        this.a.setOnClickListener(new uxu(uyd));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.b.setText(R.string.account_switcher_add_account);
        this.c.setImageResource(R.drawable.quantum_ic_add_grey600_18);
    }
}
