package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.share.ui.ConversationIconView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: aloi */
public final class aloi implements akot, allj {
    public final allh a;
    public String b;
    private final akkq c;
    private final View d;
    private final ConversationIconView e = ((ConversationIconView) this.d.findViewById(R.id.icon));
    private final TextView f = ((TextView) this.d.findViewById(R.id.text));
    private final float g;
    private final float h;
    private final acvx i;

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.a.b((allj) this);
    }

    public final void a(allh allh) {
        if (!TextUtils.isEmpty(this.b)) {
            boolean d = allh.d();
            boolean c = allh.c();
            boolean b = allh.b(this.b);
            this.d.setSelected(b);
            if (!d && (!c || b)) {
                this.d.setAlpha(this.g);
                return;
            }
            this.d.setAlpha(this.h);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        aqka aqka = (aqka) obj;
        if (aqka.d.isEmpty()) {
            this.b = aqka.c;
        } else {
            this.b = aqka.d;
        }
        ConversationIconView conversationIconView = this.e;
        List list = aqka.e;
        xnk xnk = this.c;
        if ((aqka.a & 8) != 0) {
            arml = aqka.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        conversationIconView.a(list, xnk, ajqy.a(arml));
        TextView textView = this.f;
        if ((aqka.a & 1) != 0) {
            arml2 = aqka.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        textView.setText(ajqy.a(arml2));
        this.a.a((allj) this);
        this.i.a(aqka.g.d(), null);
    }

    /* synthetic */ aloi(Context context, ViewGroup viewGroup, akkq akkq, allh allh, acvx acvx) {
        this.c = (akkq) amqw.a((Object) akkq);
        this.a = (allh) amqw.a((Object) allh);
        this.i = (acvx) amqw.a((Object) acvx);
        this.d = LayoutInflater.from(context).inflate(R.layout.sharing_group, viewGroup, false);
        this.d.setOnClickListener(new alol(this));
        this.g = this.d.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.h = typedValue.getFloat();
    }
}
