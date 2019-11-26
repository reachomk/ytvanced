package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: almr */
public final class almr implements akot {
    public final EditText a = ((EditText) this.b.findViewById(R.id.message_input));
    private final View b;
    private final akle c;

    public almr(Context context, akkq akkq, almv almv) {
        amqw.a((Object) context);
        amqw.a((Object) akkq);
        amqw.a((Object) almv);
        this.b = View.inflate(context, R.layout.message_input_section, null);
        this.c = new akle(akkq, (ImageView) this.b.findViewById(R.id.sharer_thumbnail));
        this.a.addTextChangedListener(new almq(almv));
        this.a.setOnFocusChangeListener(new almt(this, almv));
        alpf.a(this.b, true);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        ayky ayky = (ayky) obj;
        akle akle = this.c;
        aygk aygk = ayky.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akle.a(aygk);
        EditText editText = this.a;
        if ((ayky.a & 4) != 0) {
            arml = ayky.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        editText.setHint(ajqy.a(arml));
        this.a.setFilters(new InputFilter[]{new LengthFilter((int) Math.min(2147483647L, ayky.e))});
    }
}
