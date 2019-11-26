package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahwa */
public final class ahwa {
    public final aaas a;
    private final Context b;
    private final akkq c;
    private final ViewGroup d;

    ahwa(Context context, akkq akkq, ViewGroup viewGroup, aaas aaas) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        this.d = (ViewGroup) amqw.a((Object) viewGroup);
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final float a(int i) {
        return this.b.getResources().getDimension(i);
    }

    public final View b(int i) {
        return LayoutInflater.from(this.b).inflate(i, this.d, false);
    }

    public final void a(View view, aygk aygk, arml arml, arml arml2, apxu apxu) {
        this.c.a((ImageView) view.findViewById(R.id.thumbnail), aygk, this.c.a().g().b(false).a());
        ((TextView) view.findViewById(R.id.title)).setText(ajqy.a(arml));
        ((TextView) view.findViewById(R.id.metadata)).setText(ajqy.a(arml2));
        view.setOnClickListener(new ahwd(this, apxu));
    }
}
