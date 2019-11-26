package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.conversation.ui.TypingIndicatorView;
import com.google.android.youtube.R;

/* renamed from: yhm */
public final class yhm implements akot {
    private final akkq a;
    private final View b;
    private final ImageView c = ((ImageView) this.b.findViewById(R.id.avatar));
    private final TypingIndicatorView d = ((TypingIndicatorView) this.b.findViewById(R.id.typing_indicator));
    private String e;

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.e = null;
        this.a.a(this.c);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ycz ycz = (ycz) obj;
        if (!ycz.a.b.equals(this.e)) {
            aqop aqop = ycz.a;
            this.e = aqop.b;
            akkq akkq = this.a;
            ImageView imageView = this.c;
            aygk aygk = aqop.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        this.d.a(ycz.b);
    }

    /* synthetic */ yhm(Context context, akkq akkq, ViewGroup viewGroup) {
        this.b = LayoutInflater.from(context).inflate(R.layout.typing_status_item, viewGroup, false);
        this.a = (akkq) amqw.a((Object) akkq);
    }
}
